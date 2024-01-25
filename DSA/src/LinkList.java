//import java.io.InputStream;

public class LinkList {
    static Node head = null;
    static Node tail = null;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;

            }
            n.next = node;
            tail = node;
        }

    }

    public void show() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
        // System.out.println(node.data);
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = head;
        if (index == 0 || index < 0) {
            insertAtStart(data);
        } else if (index <= size()) {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        } else {
            System.out.println("Index out of bound");
        }
    }

    public int size() {
        Node n = head;
        int count = 0;
        while (n.next != null) {
            n = n.next;
            count++;
        }
        return count + 1;
    }

    public void deleteAt(int index) {

        if (index == 0 || index < 0) {
            head = head.next;
        } else if (index <= size()) {
            Node n = head;
            Node temp = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            temp = n.next;
            n.next = temp.next;
        }
    }

}
