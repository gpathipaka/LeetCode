package LC.LC101;

public class MyHashMap {
    Node[] nodes;

    public MyHashMap() {
        nodes = new Node[1000];
    }

    public int get(int key) {
        int hashIndex = getHashIndex(key);
        Node prev = findNode(hashIndex, key);
        if(prev.next == null) {
            return -1;
        } else {
            return prev.next.value;
        }
    }

    public void put(int key, int value) {
        int hashIndex = getHashIndex(key);
        Node prev = findNode(hashIndex, key);
        if(prev.next == null) {
            prev.next = new Node(key, value);
        } else {
            prev.next.value = value;
        }
    }

    public void remove(int key) {
        int hashIndex = getHashIndex(key);
        Node prev = findNode(hashIndex, key);
        if(prev.next == null) {
            prev.next = prev.next.next;
        }
    }


    private int getHashIndex(int key) {
        return Integer.hashCode(key)%nodes.length;
    }

    private Node findNode(int hashIndex, int key) {
        Node prev = nodes[hashIndex];
        if(prev == null) {
            return nodes[hashIndex] = new Node(-1, -1);
        }
        while(prev.next != null && prev.next.key != key) {
            prev = prev.next;
        }
        return prev;
    }

    static class Node {
        int key, value;
        Node next;
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

}