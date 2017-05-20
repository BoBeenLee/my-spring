package io.bobinlee.domain.algorithm.sort.selector;

import io.bobinlee.domain.algorithm.sort.SortHelper;
import io.bobinlee.domain.algorithm.sort.SortType;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static io.bobinlee.domain.algorithm.sort.SortType.SELECT;

@Component
public class SelectSortSelector implements SortSelector {

    @Override
    public <T extends Comparable<? super T>> Optional<List<T>> sort(List<T> params) {
        for (int i = 0; i < params.size(); i++) {
            int maxIdx = 0;
            for (int j = 1; j < params.size() - i; j++) {
                if (params.get(maxIdx).compareTo(params.get(j)) > 0) {
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
