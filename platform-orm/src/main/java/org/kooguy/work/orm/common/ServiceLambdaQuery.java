package org.kooguy.work.orm.common;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @ClassName ServiceLambdaQuery
 * @Description 公共服务Lambda查询类
 * @Author Administrator
 * @Date 2024/1/13 15:45
 */
public class ServiceLambdaQuery<T> {

    /**
     * 返回查询工具
     * @return
     */
    public LambdaQueryWrapper<T> getLambdaQuery(){
        return new LambdaQueryWrapper<T>();
    }
}
