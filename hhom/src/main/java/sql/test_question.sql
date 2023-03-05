
-- 测试题库
drop table if exists hhom.`test_question`;
-- 测试题库
create table if not exists hhom.`test_question`
(
    `question_id` INT not null auto_increment comment '题目题号' primary key,
    `question_type` VARCHAR(50) not null comment '题目类型',
    `question_content` TEXT not null comment '题目内容',
    `question_answer` TEXT not null comment '题目答案',
    `question_value` INT default 10 not null comment '题目分数',
    `quest_integral` smallint default 1 not null comment '题目积分',
    `create_time` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `update_time` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `is_deleted` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
) comment '测试题库';

