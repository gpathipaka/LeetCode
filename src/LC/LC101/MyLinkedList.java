package LC.LC101;

public class MyLinkedList {
    Node head;
    Node tail;
    int count;

    public MyLinkedList() {
        head = new Node(-1);
        tail = new Node(-1);
        head.next = tail;
        tail.prev = head;
    }

    public int getValueAt(int index) {
        if(index < 0 || index > count) {
            return -1;
        }
        Node curr = head.next;
        int idx = 0;
        while(idx < index) {
            idx++;
            curr = curr.next;
        }
        return curr.data;
    }

    public void insertAt(int index, int data) {
        if(index < 0 || index > count ) {
            return;
        }
        if(index == 0) {
            addAtHead(data);
            return;
        }
        if(index == count) {
            addAtTail(data);
            return;
        }
        Node newNode = new Node(data);
        Node curr = head.next;
        int idx = 0;
        while(idx < index) {
            idx++;
            curr = curr.next;
        }
        newNode.next = curr;
        newNode.prev = curr.prev;
        curr.prev.next = newNode;
        curr.prev = newNode;
        count++;
    }

    public void addAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head.next;
        newNode.prev = head;
        head.next.prev = newNode;
        head.next = newNode;
        count++;
    }

    public void addAtTail(int data) {
        Node newNode = new Node(data);
        newNode.next = tail;
        newNode.prev = tail.prev;
        tail.prev.next = newNode;
        tail.prev = newNode;
        count++;
    }

    public void removeElementAt(int index) {
        if(index < 0 || index > count) {
            return;
        }
        int idx = 0;
        Node curr = head.next;
        Node prev = curr;
        while(idx < index) {
            idx++;
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        curr.next.prev = prev;
        count--;
    }

    public void printElements() {
        Node curr = head.next;
        while(curr.next != null) {
            System.out.println("Data " + curr.data);
            curr = curr.next;
        }
    }

    class Node {
        Node prev;
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public int size() {
        return count;
    }
}
