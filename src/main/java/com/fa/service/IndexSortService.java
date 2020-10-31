package com.fa.service;

import com.fa.entity.OneSort;
import com.fa.entity.ThreeSort;
import com.fa.entity.TwoSort;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IndexSortService {
    List<OneSort> selectOneSort();
    List<TwoSort> selectTwoSort();
    List<ThreeSort> selectThreeSort();
}
