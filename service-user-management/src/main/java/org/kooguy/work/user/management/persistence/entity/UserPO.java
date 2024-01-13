package org.kooguy.work.user.management.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @ClassName UserPO
 * @Description 用户实体类
 * @Author Administrator
 * @Date 2024/1/9 23:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "TB_USER_INFO")
public class UserPO {
    /**
     * ID标识
     */
    @TableId(value = "ID")
    private String id;

    /**
     * 用户编码
     */
    @TableField(value = "USER_CODE")
    private String userCode;

    /**
     * 用户名称
     */
    @TableField(value = "USER_NAME")
    private String userName;

    /**
     * 性别
     * 1:男
     * 0:女
     */
    @TableField(value = "GENDER")
    private Integer gender;

    /**
     * 密码
     */
    @TableField(value = "PASSWORD")
    private String password;

    /**
     * 加密盐
     */
    @TableField(value = "SALT")
    private String salt;

    /**
     * 邮箱
     */
    @TableField(value = "EMAIL")
    private String email;

    /**
     * 手机号码
     */
    @TableField(value = "TELEPHONE")
    private String telephone;

    /**
     * 初始密码
     */
    @TableField(value = "INITIAL_PWD")
    private String initialPwd;

    /**
     * 初始密码状态
     * 1:可用
     * 0:禁用
     */
    @TableField(value = "USE_INITIAL_PWD")
    private Boolean useInitialPwd;

    /**
     * 密码状态 为0时锁住用户
     */
    @TableField(value = "PWD_STATUS")
    private Integer pwdStatus;

    /**
     * 密码锁定时间
     */
    @TableField(value = "PWD_LOCK_DATE")
    private LocalDateTime pwdLockDate;

    /**
     * 登陆时间
     */
    @TableField(value = "LOGIN_TIME")
    private Integer loginTime;

    /**
     * 头像链接
     */
    @TableField(value = "IMAGE_URL")
    private String imageUrl;

    /**
     * 创建时间
     */
    @TableField(value = "CREATE_TIME")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField(value = "MODIFY_TIME")
    private LocalDateTime modifyTime;

    /**
     * 用户状态
     */
    @TableField(value = "ENABLE")
    private Boolean enable;

    /**
     * 是否删除
     */
    @TableField(value = "IS_DELETE")
    private Boolean isDelete;
}
