package com.pettyfox.commons.type;


/**
 * 带主键的枚举
 *
 * @param <T>
 * @author Petty Fox
 */
public interface BaseEnum<T> {
    /**
     * 获取枚举的值
     *
     * @return 枚举的值
     */
    T getValue();

    /**
     * 枚举名称，在json序列号显示
     *
     * @return 枚举名
     */
    String getName();
}