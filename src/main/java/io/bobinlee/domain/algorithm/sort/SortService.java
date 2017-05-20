package io.bobinlee.domain.algorithm.sort;


import io.bobinlee.domain.algorithm.sort.selector.SortSelector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SortService{

    @Autowired
    private List<SortSelector> sortSelectors;

    public <T extends Comparable<? super T>> T[] getSort(T[] params, SortType sortType) {
        for(SortSelector selector : sortSelectors) {
            if(selector.getType() == sortType) {
                return selector.sort(params);
            }
        }
        return null;
    }
}
