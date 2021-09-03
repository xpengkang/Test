package lru;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU<K,V> extends LinkedHashMap<K,V> {


    private static final int MAX_ENTRIES = 5;

    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > MAX_ENTRIES;
    }

    LRU() {
        super(MAX_ENTRIES, 0.75f, true);
    }

    public static void main(String[] args) {
        LRU<Integer, String> cache = new LRU<>();
        cache.put(1, "a");
        cache.put(2, "b");
        cache.put(3, "c");
        cache.get(1);
        cache.put(4, "d");
        System.out.println(cache.keySet());
    }

}
