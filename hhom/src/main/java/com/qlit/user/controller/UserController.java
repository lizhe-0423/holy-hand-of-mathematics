package com.qlit.user.controller;


import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import cn.hutool.core.util.StrUtil;
import com.qlit.user.entity.User;
import com.qlit.user.service.impl.UserServiceImpl;
import io.swagger.annotations.ApiModel;
import lombok.val;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * <p>
 * 用户表信息 前端控制器
 * </p>
 *
 * @author 荔枝
 * @since 2023-03-03
 */
@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Resource
    UserServiceImpl userService;
    @RequestMapping ("/login")
    public SaResult userLoginPost(String username,String password){
        // 检查数据库中 有无此数据
        val user = new User();
        user.setUsername(username);
        user.setPassword(password);
        val selectUser = userService.selectUser(user);
        if (selectUser!=null){
            StpUtil.login(selectUser.getId());
            return SaResult.ok("登录成功");
        }else return SaResult.error("登录失败");
    }
}
