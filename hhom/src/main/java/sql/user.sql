drop table if exists hhom.user;
create table if not exists hhom.`user`
(
    `id` bigint not null comment '主键' primary key,
    `username` varchar(256) not null comment '用户名',
    `password` varchar(256) not null comment '密码',
    `id_card` varchar(256)  comment '身份证号',
    `real_name` varchar(256)  comment '真实姓名',
    `gender` varchar(256)  comment '性别',
    `address` varchar(256)  comment '地址',
    `phone` varchar(256)  comment '手机号',
    `role` varchar(256) default '0' not null comment '角色',
    `age` varchar(256)  comment '年龄',
    `integral` bigint  comment '积分',
    `user_status` varchar(256) default '0' not null comment '状态',
    `photo` varchar(256)  comment '头像',
    `introduction` varchar(256)  comment '简介',
    `college` varchar(256)  comment '学院',
    `update_time` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `create_time` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `is_deleted` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
    ) comment '用户表信息';
