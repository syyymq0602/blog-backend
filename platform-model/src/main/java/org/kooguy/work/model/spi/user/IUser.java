package org.kooguy.work.model.spi.user;

import org.kooguy.work.model.spi.commom.IBaseEntity;

import java.time.LocalDateTime;

/**
 * @ClassName IUser
 * @Description 用户业务实现类
 * @Author Administrator
 * @Date 2024/1/13 15:21
 */
public interface IUser extends IBaseEntity {
    /**
     * ID标识
     * @return
     */
    String getId();
    /**
     * 用户编码
     * @return
     */
    String getUserCode();
    /**
     * 用户名称
     * @return
     */
    String getUserName();
    /**
     * 性别
     * @return
     */
    Integer getGender();
    /**
     * 邮箱
     * @return
     */
    String getEmail();
    /**
     * 手机号码
     * @return
     */
    String getTelephone();
    /**
     * 登陆时间
     * @return
     */
    Integer getLoginTime();
    /**
     * 头像链接
     * @return
     */
    String getImageUrl();
    /**
     * 创建时间
     * @return
     */
    LocalDateTime getCreateTime();
    /**
     * 修改时间
     * @return
     */
    LocalDateTime getModifyTime();
}
