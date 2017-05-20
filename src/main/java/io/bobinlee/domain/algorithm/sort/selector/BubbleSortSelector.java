package io.bobinlee.domain.algorithm.sort.selector;

import io.bobinlee.domain.algorithm.sort.SortHelper;
import io.bobinlee.domain.algorithm.sort.SortType;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static org.springframework.util.ObjectUtils.isEmpty;


@Component
public class BubbleSortSelector implements SortSelector {
    @Override
    public <T extends Comparable<? super T>> Optional<T[]> sort(T[] params) {
        if (isEmpty(params)) {
            return Optional.empty();
        }
        for (int i = 0; i < params.length; i++) {
            for (int j = 0; j < params.length - i - 1; j++) {
                if (params[j].compareTo(params[j + 1]) > 0) {
                    SortHelper.swap(params, j, j + 1);
                }
            }
        }
        return Optional.of(params);
    }

    @Override
    public SortType getType() {
        return SortType.BUBBLE;
    }
}