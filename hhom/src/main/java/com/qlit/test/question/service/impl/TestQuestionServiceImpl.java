package com.qlit.test.question.service.impl;

import com.qlit.test.question.entity.TestQuestion;
import com.qlit.test.question.mapper.TestQuestionMapper;
import com.qlit.test.question.service.ITestQuestionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 测试题库 服务实现类
 * </p>
 *
 * @author 荔枝
 * @since 2023-03-03
 */
@Service
public class TestQuestionServiceImpl extends ServiceImpl<TestQuestionMapper, TestQuestion> implements ITestQuestionService {

}
