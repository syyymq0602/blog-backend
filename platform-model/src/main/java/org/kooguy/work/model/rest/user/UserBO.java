package org.kooguy.work.model.rest.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.kooguy.work.model.rest.common.BaseEntity;
import org.kooguy.work.model.spi.user.IUser;

import java.time.LocalDateTime;

/**
 * @ClassName UserBO
 * @Description 用户业务映射类
 * @Author Administrator
 * @Date 2024/1/9 23:49
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserBO extends BaseEntity implements IUser {
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
     * 1:男
     * 0:女
     */
    private Integer gender;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 手机号码
     */
    private String telephone;
    /**
     * 登陆时间
     */
    private Integer loginTime;
    /**
     * 头像链接
     */
    private String imageUrl;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 修改时间
     */
    private LocalDateTime modifyTime;
}
