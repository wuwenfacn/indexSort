package com.fa.controller;

import com.fa.entity.*;
import com.fa.service.IndexSortService;
import com.fa.utils.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/sort")
public class IndexSortController {
    @Resource
    IndexSortService indexSortService;
    @GetMapping("/onesort")
    @ResponseBody
    public ResponseEntity<List<OneSort>> oneSort(){
        List<OneSort> oneSorts = indexSortService.selectOneSort();
        if(oneSorts != null) {
            return ResponseEntity.success(oneSorts);
        }
        return ResponseEntity.error();
    }
    @GetMapping("/twosort")
    @ResponseBody
    public ResponseEntity<List<TwoSort>> twoSort(){
        List<TwoSort> twoSorts = indexSortService.selectTwoSort();
        if(twoSorts != null) {
            return ResponseEntity.success(twoSorts);
        }
        return ResponseEntity.error();
    }
    @GetMapping("/threesort")
    @ResponseBody
    public ResponseEntity<List<ThreeSort>> threeSort(){
        List<ThreeSort> threeSorts = indexSortService.selectThreeSort();
        if(threeSorts != null) {
            return ResponseEntity.success(threeSorts);
        }
        return ResponseEntity.error();
    }
    @GetMapping("/indexsort")
    @ResponseBody
    public ResponseEntity<Sort> indexSort(){
        Sort sort = new Sort();
        sort.setOneSort(indexSortService.selectOneSort());
        sort.setTwoSort(indexSortService.selectTwoSort());
        sort.setThreeSort(indexSortService.selectThreeSort());
        System.out.println(indexSortService.selectOneSort());
        System.out.println(indexSortService.selectTwoSort());
        System.out.println(indexSortService.selectThreeSort());
        return ResponseEntity.success(sort);
    }
}
