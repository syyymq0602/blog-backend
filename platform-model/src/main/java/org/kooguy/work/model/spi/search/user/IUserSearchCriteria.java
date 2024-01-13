package org.kooguy.work.model.spi.search.user;

import org.kooguy.work.model.spi.search.ISearchCriteria;

import java.time.LocalDateTime;

/**
 * @ClassName IUserSearchCriteria
 * @Description 用户搜索接口类
 * @Author Administrator
 * @Date 2024/1/10 23:00
 */
public interface IUserSearchCriteria extends ISearchCriteria {
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
     * 是否可用
     * @return
     */
    Boolean getEnable();
}
