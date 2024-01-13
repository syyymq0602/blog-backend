package org.kooguy.work.spi.user;

import org.kooguy.work.model.rest.user.UserBO;
import org.kooguy.work.model.spi.search.ISearchResults;
import org.kooguy.work.model.spi.search.user.IUserSearchCriteria;

/**
 * @ClassName IUserService
 * @Description 用户业务接口类
 * @Author Administrator
 * @Date 2024/1/9 23:48
 */
public interface IUserService {
    /**
     * 获取用户分页列表
     * @param searchCriteria 查询实体
     * @return 用户列表
     */
    ISearchResults<UserBO> searchUser(IUserSearchCriteria searchCriteria);
}
