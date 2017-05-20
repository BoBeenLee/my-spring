package io.bobinlee.domain.algorithm.sort.selector;

import io.bobinlee.domain.algorithm.sort.SortType;
import org.springframework.stereotype.Component;


@Component
public class BubbleSortSelector implements SortSelector {

    public void swap(Comparable[] params, int s, int p) {
        Comparable tmp = params[p];
        params[p] = params[s];
        params[s] = tmp;
    }

    @Override
    public <T extends Comparable<? super T>> T[] sort(T[] params) {
        for (int i = 0; i < params.length; i++) {
            for (int j = 0; j < params.length - i - 1; j++) {
                if (params[j].compareTo(params[j + 1]) > 0) {
                    swap(params, j, j + 1);
                }
            }
        }
        return params;
    }

    @Override
    public SortType getType() {
        return SortType.BUBBLE;
    }
}
