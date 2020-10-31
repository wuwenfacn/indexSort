package com.fa.service.impl;

import com.fa.entity.OneSort;
import com.fa.entity.ThreeSort;
import com.fa.entity.TwoSort;
import com.fa.mapper.IndexSortMapper;
import com.fa.service.IndexSortService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class IndexSortServiceImpl implements IndexSortService {
    @Resource
    IndexSortMapper indexSortMapper;
    @Override
    public List<OneSort> selectOneSort() {
        return indexSortMapper.selectOneSort();
    }

    @Override
    public List<TwoSort> selectTwoSort() {
        return indexSortMapper.selectTwoSort();
    }

    @Override
    public List<ThreeSort> selectThreeSort() {
        return indexSortMapper.selectThreeSort();
    }
}
