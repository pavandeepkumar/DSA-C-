public class Linklist {
    public static void displayr(Node head) {
        if (head == null)
            return;

        System.out.print(head.data + " ");
        displayr(head.next);
    }

    public static void displayreverse(Node head) {
        if (head == null)
            return;

        displayreverse(head.next);
        System.out.print(head.data + " ");
    }

    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(50);
        Node c = new Node(5);
        Node d = new Node(5);
        Node e = new Node(5);
        Node f = new Node(5);
        System.out.println("node: " + a);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        System.out.println();
        displayr(a);
        System.out.println();
        displayreverse(a);
        int length = length(a);
        System.out.println("length" + length);

    }
}

/**
 * InnerLinklist
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
