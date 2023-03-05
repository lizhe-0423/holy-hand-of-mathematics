package com.qlit.test.question.mapper;

import com.qlit.test.question.entity.TestQuestion;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 测试题库 Mapper 接口
 * </p>
 *
 * @author 荔枝
 * @since 2023-03-03
 */
@Mapper
public interface TestQuestionMapper extends BaseMapper<TestQuestion> {

}
