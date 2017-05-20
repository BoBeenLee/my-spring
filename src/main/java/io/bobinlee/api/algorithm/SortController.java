package io.bobinlee.api.algorithm;


import io.bobinlee.domain.algorithm.sort.SortService;
import io.bobinlee.domain.algorithm.sort.SortType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "소트 알고리즘", description = "소트 알고리즘", basePath = "/api/sort")
@RestController
@RequestMapping("/api/sort")
public class SortController {

    @Autowired
    private SortService sortService;

    @ApiOperation(value = "버블 소트", notes = "버블 소트")
    @RequestMapping("/bubble")
    public Integer[] bubbleSort(@RequestParam(required = false) Integer[] params) {
        return sortService.getSort(params, SortType.BUBBLE);
    }
}
