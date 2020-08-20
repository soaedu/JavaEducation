package java_regular.data.type.collections.type.maps.concurrent_hash_map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapMain {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        new WriterThread(map, "Writer-1", 1).start();
        new WriterThread(map, "Writer-2", 2).start();

        for (int i = 1; i <= 5; i++) {
            new ReaderThread(map, "Reader-" + i).start();
        }
    }
}
