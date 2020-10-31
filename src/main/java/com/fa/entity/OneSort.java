package com.fa.entity;

import lombok.Data;

import java.io.Serializable;

/*create table one_sort
        (
        one_sort_id int auto_increment primary key comment '主键id',
        one_sort_name varchar(64) unique not null comment '一级分类名',
        delete_status int default 1 not null comment '删除的状态'
        )comment '一级分类表';
        create table two_sort
        (
        two_sort_id int auto_increment primary key comment '主键id',
        two_sort_name varchar(64) unique not null comment '二级分类名',
        delete_status int default 1 not null comment '删除的状态',
        one_sort_id int not null comment '一级分类表的外键'
        )comment '二级分类表';
        create table three_sort
        (
        three_sort_id int auto_increment primary key comment '主键id',
        three_sort_name varchar(64) unique not null comment '三级分类名',
        delete_status int default 1 not null comment '删除的状态',
        two_sort_id int not null comment '二级分类表的外键'
        )comment '三级分类表';*/

@Data
public class OneSort implements Serializable {
    /**
     * 主键id
     */
    private Integer oneSortId;

    /**
     * 一级分类名
     */
    private String oneSortName;

    private static final long serialVersionUID = 1L;

}

