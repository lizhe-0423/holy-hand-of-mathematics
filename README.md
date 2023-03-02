# holy-hand-of-mathematics
数学圣手：在线答题教育平台

## 用户表

-- 用户表信息
~
create table if not exists hhom.`user`
(
`id` bigint not null comment '主键' primary key,
`username` varchar(256) not null comment '用户名',
`password` varchar(256) not null comment '密码',
`id_card` varchar(256) null comment '身份证号',
`real_name` varchar(256) not null comment '真实姓名',
`gender` varchar(256) not null comment '性别',
`address` varchar(256) not null comment '地址',
`phone` varchar(256) not null comment '手机号',
`role` varchar(256) default '0' not null comment '角色',
`age` varchar(256) not null comment '年龄',
`integral` bigint not null comment '积分',
`user_status` varchar(256) default '0' not null comment '状态',
`photo` varchar(256) not null comment '头像',
`introduction` varchar(256) not null comment '简介',
`college` varchar(256) not null comment '学院',
`update_time` datetime default 'CURRENT_TIMESTAMP' not null on update CURRENT_TIMESTAMP comment '更新时间',
`create_time` datetime default 'CURRENT_TIMESTAMP' not null comment '创建时间',
`is_deleted` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
) comment '用户表信息';
~
## 功能
1. 用户登录注册 唯一id uuid/雪花算法
2. 用户表中积分 是 答题pk 中 增加 积分 
3. 角色用来区分 未来 vip 用户 和 普通用户
4. 排行榜 根据 学院 / 积分 筛选用户 实现排行榜功能

## 题库表

-- 测试题库
~
create table if not exists hhom.`test_question`
(
`question_id` INT not null auto_increment comment '题目题号' primary key,
`question_type` VARCHAR(50) not null comment '题目类型',
`question_content` TEXT not null comment '题目内容',
`question_answer` TEXT not null comment '题目答案',
`question_value` INT default '10' not null comment '题目分数',
`quest_integral` smallint default 1 not null comment '题目积分'
) comment '测试题库';
~

## 功能
1. 答题根据答案 筛选是否正确
2. pk 每对一道题目 用于增加一积分
3. pk 每次答题完 根据 字段题目分数 分出 win 胜利者
4. 待定
