package org.kooguy.work.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.kooguy.work.model.rest.ApiResult;
import org.kooguy.work.model.rest.common.Constants;
import org.kooguy.work.model.rest.search.user.UserSearchCriteria;
import org.kooguy.work.model.rest.user.UserBO;
import org.kooguy.work.model.spi.search.ISearchResults;
import org.kooguy.work.model.spi.search.user.IUserSearchCriteria;
import org.kooguy.work.spi.user.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RequestMapping(value = "/user")
@RestController
@Api(tags = "用户业务接口")
public class UserController {

    @Resource
    private IUserService userService;

    /**
     * 根据条件查询用户信息
     * @param id 标识ID
     * @param userCode 用户编码
     * @param userName 用户名称
     * @param gender 用户性别
     * @param enable 是否可用
     * @param pageNum 页码
     * @param pageSize 页面大小
     * @return 用户信息分页列表
     */
    @GetMapping("/page")
    @ApiOperation(value = "用户分页查询", notes = "用户分页查询")
    public ApiResult userPage(
        @ApiParam(name = "ID标识", value = "ID标识", required = false) @RequestParam(value = "ID标识", required = false) String id,
        @ApiParam(name = "用户编码", value = "用户编码", required = false) @RequestParam(value = "ID标识", required = false) String userCode,
        @ApiParam(name = "用户名称", value = "用户名称", required = false) @RequestParam(value = "用户名称", required = false) String userName,
        @ApiParam(name = "用户性别", value = "用户性别", required = false) @RequestParam(value = "用户性别", required = false) Integer gender,
        @ApiParam(name = "是否可用", value = "是否可用", required = false) @RequestParam(value = "是否可用", required = false) Boolean enable,
        @ApiParam(name = "页码", value = "页码", required = false) @RequestParam(value = "页码", required = false) Integer pageNum,
        @ApiParam(name = "页面大小", value = "页面大小", required = false) @RequestParam(value = "页面大小", required = false) Integer pageSize
    ){
        IUserSearchCriteria searchCriteria = buildUserSearchCriteria(id, userCode, userName, gender, enable, pageNum, pageSize);
        ISearchResults<UserBO> searchResults = userService.searchUser(new UserSearchCriteria());
        return new ApiResult()
                .success(200, "用户分页查询成功")
                .addData(Constants.RESULT, searchResults);
    }

    /**
     * 构建用户查询类
     * @param id 标识ID
     * @param userCode 用户编码
     * @param userName 用户名称
     * @param gender 用户性别
     * @param enable 是否可用
     * @param pageNum 页码
     * @param pageSize 页面大小
     * @return 用户查询条件
     */
    private IUserSearchCriteria buildUserSearchCriteria(String id, String userCode, String userName, Integer gender, Boolean enable, Integer pageNum, Integer pageSize) {
        UserSearchCriteria searchCriteria = new UserSearchCriteria();
        searchCriteria.setId(id);
        searchCriteria.setUserCode(userCode);
        searchCriteria.setUserName(userName);
        searchCriteria.setGender(gender);
        searchCriteria.setEnable(enable);
        searchCriteria.setPageSize(pageSize);
        searchCriteria.setPageNumber(pageNum);
        return searchCriteria;
    }
}
