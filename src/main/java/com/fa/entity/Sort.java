package com.fa.entity;

import lombok.Data;

import java.util.List;

@Data
public class Sort {
    private List<OneSort> oneSort;
    private List<TwoSort> twoSort;
    private List<ThreeSort> threeSort;
}
