package vn.yume.cv.util;

import java.util.concurrent.ConcurrentMap;

public final class Collections {
	public static <K, V> V putIfAbsent(ConcurrentMap<K, V> map, K key, V value) {
        final V result = map.putIfAbsent(key, value);
        return result != null ? result : value;
    }
}
