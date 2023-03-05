package com.qlit.user.mapper;

import com.qlit.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表信息 Mapper 接口
 * </p>
 *
 * @author 荔枝
 * @since 2023-03-03
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
