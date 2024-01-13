package org.kooguy.work.model.rest.search.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.kooguy.work.model.rest.search.SearchCriteria;
import org.kooguy.work.model.spi.search.user.IUserSearchCriteria;

/**
 * @ClassName UserSearchCriteria
 * @Description 用户搜索类
 * @Author Administrator
 * @Date 2024/1/10 23:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserSearchCriteria extends SearchCriteria implements IUserSearchCriteria {
    /**
     * ID标识
     */
    private String id;
    /**
     * 用户编码
     */
    private String userCode;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 状态
     */
    private Boolean enable;

    public UserSearchCriteria(Integer pageNumber, Integer pageSize) {
        super(pageNumber, pageSize);
    }
}
