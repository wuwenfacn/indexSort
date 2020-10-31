package com.fa.mapper;

import com.fa.entity.OneSort;
import com.fa.entity.ThreeSort;
import com.fa.entity.TwoSort;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IndexSortMapper {
    List<OneSort> selectOneSort();
    List<TwoSort> selectTwoSort();
    List<ThreeSort> selectThreeSort();
}
