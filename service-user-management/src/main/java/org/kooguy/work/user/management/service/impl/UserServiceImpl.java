package org.kooguy.work.user.management.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.kooguy.work.common.ObjectTransfer;
import org.kooguy.work.model.rest.search.SearchResults;
import org.kooguy.work.model.rest.user.UserBO;
import org.kooguy.work.model.spi.exception.BlogException;
import org.kooguy.work.model.spi.search.ISearchResults;
import org.kooguy.work.model.spi.search.user.IUserSearchCriteria;
import org.kooguy.work.spi.user.IUserService;
import org.kooguy.work.user.management.persistence.entity.UserPO;
import org.kooguy.work.user.management.persistence.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName UserServiceImpl
 * @Description 用户业务实现类
 * @Author Administrator
 * @Date 2024/1/9 23:47
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, UserPO> implements IUserService {

    @PostConstruct
    public void initTest(){
        List<UserPO> userPOList = baseMapper.selectList(null);
        if(CollectionUtils.isEmpty(userPOList)){
            UserPO po = new UserPO();
            po.setId(UUID.randomUUID().toString());
            po.setUserCode("admin");
            po.setUserName("管理员");
            po.setGender(1);
            po.setTelephone("18118111881");
            po.setEmail("121@qq.com");
            po.setInitialPwd("123456");
            po.setCreateTime(LocalDateTime.now());
            po.setModifyTime(LocalDateTime.now());
            po.setEnable(true);
            po.setIsDelete(false);
            po.setPwdStatus(1);
            baseMapper.insert(po);
        }
    }

    /**
     * 获取用户分页列表
     * @param searchCriteria 查询实体
     * @return 用户列表
     * @throws BlogException 异常
     */
    @Override
    public ISearchResults<UserBO> searchUser(IUserSearchCriteria searchCriteria) {
        long pageNum = searchCriteria.getPageNumber() == null ? 1 : searchCriteria.getPageNumber();
        long pageSize = searchCriteria.getPageSize() == null ? 10 : searchCriteria.getPageSize();
        LambdaQueryWrapper<UserPO> query = new LambdaQueryWrapper<>();
        query.eq(
                StringUtils.isNotEmpty(searchCriteria.getId()),
                UserPO::getId,
                searchCriteria.getId());
        query.eq(
                StringUtils.isNotEmpty(searchCriteria.getUserCode()),
                UserPO::getUserCode,
                searchCriteria.getUserCode());
        query.like(
                StringUtils.isNotEmpty(searchCriteria.getUserName()),
                UserPO::getUserName,
                searchCriteria.getUserName());
        query.eq(
                searchCriteria.getGender() != null,
                UserPO::getGender,
                searchCriteria.getGender());
        query.eq(
                searchCriteria.getEnable() != null,
                UserPO::getEnable,
                searchCriteria.getEnable());
        query.eq(UserPO::getIsDelete, false);
        query.orderByAsc(UserPO::getModifyTime);
        Page<UserPO> userPOPage = baseMapper.selectPage(new Page<>(pageNum, pageSize), query);
        if(CollectionUtils.isNotEmpty(userPOPage.getRecords())){
            List<UserBO> userBOList = ObjectTransfer.copyPropertiesExtra(userPOPage.getRecords(), UserBO.class);
            return new SearchResults<>(Lists.newArrayList(userBOList));
        }
        return new SearchResults<>(Lists.newArrayList());
    }
}
