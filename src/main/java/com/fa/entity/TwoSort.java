package com.fa.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class TwoSort implements Serializable {
    /**
     * 主键id
     */
    private Integer twoSortId;

    /**
     * 二级分类名
     */
    private String twoSortName;

    private static final long serialVersionUID = 1L;

}

