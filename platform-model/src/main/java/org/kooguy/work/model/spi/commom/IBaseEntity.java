package org.kooguy.work.model.spi.commom;

/**
 * @ClassName IBaseEntity
 * @Description BO类基础接口
 * @Author Administrator
 * @Date 2024/1/13 15:31
 */
public interface IBaseEntity {
    /**
     * 是否可用
     * @return
     */
    Boolean getEnable();
    /**
     * 是否删除
     * @return
     */
    Boolean getIsDelete();
}
