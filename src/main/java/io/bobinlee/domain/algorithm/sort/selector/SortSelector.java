package io.bobinlee.domain.algorithm.sort.selector;

import io.bobinlee.domain.algorithm.sort.SortType;

public interface SortSelector {
    <T extends Comparable<? super T>> T[] sort(T[] params);

    SortType getType();
}
