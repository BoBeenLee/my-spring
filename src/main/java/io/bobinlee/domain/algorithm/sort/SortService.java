package io.bobinlee.domain.algorithm.sort;


import com.google.common.collect.Lists;
import io.bobinlee.domain.algorithm.sort.selector.SortSelector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SortService {

    @Autowired
    private List<SortSelector> sortSelectors;

    public <T extends Comparable<? super T>> T[] getSort(T[] params, SortType sortType) {
        for (SortSelector selector : sortSelectors) {
            if (selector.getType() == sortType) {
                return selector.sort(params).orElse((T[]) Lists.newArrayList().toArray());
            }
        }
        throw new IllegalArgumentException("not sorted");
    }
}
