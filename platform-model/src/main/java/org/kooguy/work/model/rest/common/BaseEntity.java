package org.kooguy.work.model.rest.common;

import lombok.Data;

/**
 * @ClassName BaseEntity
 * @Description BO类基础属性
 * @Author Administrator
 * @Date 2024/1/13 15:26
 */
@Data
public class BaseEntity {
    /**
     * 状态
     */
    private Boolean enable;
    /**
     * 是否删除
     */
    private Boolean isDelete;
}
