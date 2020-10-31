package com.fa.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ThreeSort implements Serializable {
    /**
     * 主键id
     */
    private Integer threeSortId;

    /**
     * 三级分类名
     */
    private String threeSortName;

    private static final long serialVersionUID = 1L;

}
