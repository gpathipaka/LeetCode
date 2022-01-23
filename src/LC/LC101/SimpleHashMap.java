package LC.LC101;

import java.util.Arrays;

public class SimpleHashMap {

    int[] map;

    public SimpleHashMap() {
        Arrays.fill(map, -1);
    }

    public void put(int key, int value) {
        map[key] = value;
    }
    public int get(int key) {
        return map[key];
    }

    public void remove(int key) {
        map[key] = -1;
    }
}
