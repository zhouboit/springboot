package com.jonbore.mapper;

import com.jonbore.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author bo.zhou
 * @date 2018/5/19
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
