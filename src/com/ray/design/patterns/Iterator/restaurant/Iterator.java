package com.ray.design.patterns.Iterator.restaurant;

/**
 * 迭代器
 * Created by Ray on 2016/5/21.
 */
public interface Iterator<T> {

    /**
     *
     * @return 是否还有下一项
     */
    boolean hasNext();

    /**
     *
     * @return 获取下一项数据
     */
    T next();
}
