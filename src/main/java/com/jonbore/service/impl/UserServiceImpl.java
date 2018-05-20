package com.jonbore.service.impl;

import com.jonbore.entity.User;
import com.jonbore.mapper.BaseMapper;
import com.jonbore.mapper.UserMapper;
import com.jonbore.service.UserService;
import com.jonbore.utils.EncryptUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author bo.zhou
 * @date 2018/5/20
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public BaseMapper<User> getMapper() {
        return userMapper;
    }

    @Override
    public String save(User entity) {
        entity.setPassword(EncryptUtil.encryptStr(entity.getPassword()));
        return super.save(entity);
    }

    @Override
    public boolean update(User entity) {
        User user = this.userMapper.findById(entity.getId());
        String input = EncryptUtil.encryptStr(entity.getPassword());
        if (user.getPassword().equals(entity.getPassword()) || user.getPassword().equals(input)) {
            entity.setPassword(null);
            return super.update(entity);
        }
        entity.setPassword(input);
        return super.update(entity);
    }
}
