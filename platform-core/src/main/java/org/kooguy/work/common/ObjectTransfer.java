package org.kooguy.work.common;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ObjectTransfer
 * @Description 实体转换类
 * @Author Administrator
 * @Date 2024/1/13 16:38
 */
public class ObjectTransfer {

    /**
     * DTO转换工具
     * @param src 源对象
     * @param clazz 目标类型
     * @return
     * @param <T>
     */
    public static <T> T copyProperties(Object src, Class<T> clazz){
        if(src == null){
            return null;
        }
        T instance = null;
        try {
            instance = clazz.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(clazz.getName().concat("实例化失败"));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(clazz.getName().concat("构造参数使用范围有误"));
        } catch (InvocationTargetException e) {
            throw new RuntimeException(clazz.getName().concat("调用构造参数失败"));
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(clazz.getName().concat("无空构造参数"));
        }
        BeanUtils.copyProperties(src,instance);
        return instance;
    }

    /**
     * 将源对象列表转换为目标对象列表
     * @param src 源对象列表
     * @param clazz 目标对象类
     * @return
     * @param <T> 源类
     * @param <M> 目标类
     */
    public static <T,M> List<M> copyPropertiesExtra(List<T> src, Class<M> clazz){
        List<M> sourceList = new ArrayList<>();
        if(CollectionUtils.isEmpty(src)){
            return sourceList;
        }
        for (T item : src) {
            sourceList.add(copyProperties(item, clazz));
        }
        return sourceList;
    }
}
