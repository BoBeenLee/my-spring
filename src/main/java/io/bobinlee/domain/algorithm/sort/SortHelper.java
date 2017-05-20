package io.bobinlee.domain.algorithm.sort;

/**
 * Created by bobinlee on 2017. 5. 20..
 */
public class SortHelper {
    private SortHelper() {
    }

    public static <T extends Comparable<? super T>> void swap(T[] params, int s, int p) {
        T tmp = params[p];
        params[p] = params[s];
        params[s] = tmp;
    }
}
