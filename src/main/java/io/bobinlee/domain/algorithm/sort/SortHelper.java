package io.bobinlee.domain.algorithm.sort;

import java.util.List;

/**
 * Created by bobinlee on 2017. 5. 20..
 */
public class SortHelper {
    private SortHelper() {
    }

    public static <T extends Comparable<? super T>> void swap(List<T> params, int s, int p) {
        T tmp = params.get(p);
        params.set(p, params.get(s));
        params.set(s, tmp);
    }
}
