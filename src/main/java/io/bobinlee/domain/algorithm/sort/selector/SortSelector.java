package io.bobinlee.domain.algorithm.sort.selector;

import com.google.common.collect.Lists;
import io.bobinlee.domain.algorithm.sort.SortType;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

import static org.springframework.util.ObjectUtils.isEmpty;

public interface SortSelector {
    <T extends Comparable<? super T>> Optional<T[]> sort(T[] params);

    SortType getType();
}
