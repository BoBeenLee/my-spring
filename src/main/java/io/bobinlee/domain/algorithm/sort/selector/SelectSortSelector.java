package io.bobinlee.domain.algorithm.sort.selector;

import io.bobinlee.domain.algorithm.sort.SortHelper;
import io.bobinlee.domain.algorithm.sort.SortType;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static io.bobinlee.domain.algorithm.sort.SortType.SELECT;

@Component
public class SelectSortSelector implements SortSelector {

    @Override
    public <T extends Comparable<? super T>> Optional<T[]> sort(T[] params) {
        for (int i = 0; i < params.length; i++) {
            int maxIdx = 0;
            for (int j = 1; j < params.length - i; j++) {
                if (params[maxIdx].compareTo(params[j]) > 0) {
                    SortHelper.swap(params, maxIdx, j);
                }
            }
        }
        return Optional.of(params);
    }

    @Override
    public SortType getType() {
        return SELECT;
    }
}
