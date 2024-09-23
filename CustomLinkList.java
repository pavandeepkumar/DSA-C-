public class CustomLinkList {
    public static void main(String[] args) {
        LinkList l = new LinkList();
        l.insertAtEnd(5);
        l.insertAtEnd(34);
        l.display();
    }
}

class LinkList {
    Node head;
    Node tail;

    void insertAtEnd(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.head + " ");
            temp = temp.next;
        }
    }
}

class Node {
    int head;
    Node next;

    Node(int head) {
        this.head = head;
    }
}