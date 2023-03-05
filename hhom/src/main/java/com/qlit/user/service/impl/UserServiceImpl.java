package com.qlit.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qlit.user.entity.User;
import com.qlit.user.mapper.UserMapper;
import com.qlit.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.val;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表信息 服务实现类
 * </p>
 *
 * @author 荔枝
 * @since 2023-03-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    // 查询用户 并 返回
    public User selectUser(User user){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", user.getUsername()).eq("password",user.getPassword());
        User query = getOne(queryWrapper);
        return query;
    }
}
