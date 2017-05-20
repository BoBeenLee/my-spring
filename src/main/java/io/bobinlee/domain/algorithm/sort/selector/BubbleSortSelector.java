package io.bobinlee.domain.algorithm.sort.selector;

import io.bobinlee.domain.algorithm.sort.SortHelper;
import io.bobinlee.domain.algorithm.sort.SortType;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static org.springframework.util.ObjectUtils.isEmpty;


@Component
public class BubbleSortSelector implements SortSelector {
    @Override
    public <T extends Comparable<? super T>> Optional<List<T>> sort(List<T> params) {
        if (isEmpty(params)) {
            return Optional.empty();
        }
        for (int i = 0; i < params.size(); i++) {
            for (int j = 0; j < params.size() - i - 1; j++) {
                if (params.get(j).compareTo(params.get(j + 1)) > 0) {
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
