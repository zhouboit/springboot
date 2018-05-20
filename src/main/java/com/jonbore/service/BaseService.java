package com.jonbore.service;

import com.jonbore.entity.BaseEntity;

import java.util.List;
import java.util.Map;

/**
 * @author bo.zhou
 * @date 2018/5/20
 */
public interface BaseService<T extends BaseEntity> {

    /**
     * 新增记录
     *
     * @param entity
     * @return in value
     */
    String save(T entity);

    /**
     * 删除记录
     *
     * @param id
     * @return int value
     */
    boolean deleteById(String id);

    /**
     * 更具ID更新记录
     *
     * @param entity
     * @return int value
     */
    boolean update(T entity);

    /**
     * 根据ID查询记录
     *
     * @param id
     * @return T
     */
    T findById(String id);

    /**
     * 查询所有记录
     *
     * @return List<T>
     */
    List<T> findAll();

    /**
     * 更具条件查询
     *
     * @param entity
     * @return List<T>
     */
    List<T> findByMap(T entity);
}
