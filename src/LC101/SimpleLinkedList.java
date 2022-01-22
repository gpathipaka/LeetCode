package LC101;

public class SimpleLinkedList {
    int count;
    Node head;
    public SimpleLinkedList() {
        this.head = new Node(-1);
        head.next = null;
    }

    public void addAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head.next;
        head.next = newNode;
        count++;
    }

    public void add(int data) {
        if(count == 0) {
         addAtHead(data);
         return;
        } else {
            Node curr = head.next;
            while (curr.next != null) {
                curr = curr.next;
            }
            Node newNode = new Node(data);
            newNode.next = null;
            curr.next = newNode;
            count++;
        }

    }

    public void removeAt(int index) {
        if(index < 0 || index > count) {
            return;
        }
        Node curr = head.next;
        int idx = 0;
        Node prev = curr;
        while(idx < index) {
            prev = curr;
            curr = curr.next;
            idx++;
        }
        if(curr.next == null) {
            prev.next = null;
        } else {
            prev.next = curr.next;
        }
        count--;
    }



    public void printElements() {
        if(count == 0)
            return;
        Node curr = head.next;
        while(curr != null) {
            System.out.println("Data " + curr.data);
            curr = curr.next;
        }
    }
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
