package com.jonbore.service.impl;

import com.jonbore.entity.BaseEntity;
import com.jonbore.mapper.BaseMapper;
import com.jonbore.service.BaseService;
import com.jonbore.utils.EncryptUtil;

import java.util.Date;
import java.util.List;

/**
 * @author bo.zhou
 * @date 2018/5/20
 */
public class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {

    @Override
    public String save(T entity) {
        entity.setCreateDate(new Date());
        entity.setId(EncryptUtil.generationID());
        int result = this.getMapper().save(entity);
        if (result > 0) {
            return entity.getId();
        }
        return null;

    }

    @Override
    public boolean deleteById(String id) {
        int result = this.getMapper().deleteById(id);
        return result > 0;
    }

    @Override
    public boolean update(T entity) {
        entity.setUpdateDate(new Date());
        int result = this.getMapper().update(entity);
        return result > 0;
    }

    @Override
    public T findById(String id) {
        return this.getMapper().findById(id);
    }

    @Override
    public List<T> findAll() {
        return this.getMapper().findAll();
    }

    @Override
    public List<T> findByMap(T entity) {
        return this.getMapper().findByMap(entity);
    }

    public BaseMapper<T> getMapper() {
        return null;
    }
}
