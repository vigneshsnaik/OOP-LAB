public class DLL {
    Node head = new Node();
    Node tail = new Node();

    DLL() {
        head.next = tail;
        tail.prev = head;
    }

    boolean isEmpty() {
        if (head.next == tail) {
            System.out.println("List Empty");
            return true;
        }
        return false;
    }

    void print() {
        Node temp = head;
        System.out.print("head");
        while (temp.next != tail) {
            temp = temp.next;
            System.out.print(" -> " + temp.data);
        }
        temp = tail;
        System.out.println(" -> tail");
        System.out.print("tail");
        while (temp.prev != head) {
            temp = temp.prev;
            System.out.print(" -> " + temp.data);
        }
        System.out.println(" -> head");
    }

    void append(int data) {
        Node n = new Node(data);
        n.prev = tail.prev;
        tail.prev.next = n;
        tail.prev = n;
        n.next = tail;
    }

    void insert(int pos, int data) {
        Node n = new Node(data);
        if (isEmpty()) {
            head.next = n;
            n.data = data;
            return;
        }
        int i = 1;
        Node temp = head;
        while (i < pos) {
            temp = temp.next;
            i++;
        }
        n.prev = temp.prev;
        n.next = temp;
        n.prev.next = n;
        n.prev = n;
    }

    void pop() {
        if (!isEmpty()) {
            tail.prev = tail.prev.prev;
            tail.prev.next = tail;
        }
    }

    void remove(int data) {
        Node temp = head;
        while (temp.next.data == data)
            temp = temp.next;
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.prev = null;
        temp.next = null;
    }

    void removeAt(int pos) {
        if (!isEmpty()) {
            int i = 0;
            Node temp = head;
            while (i <= pos) {
                temp = temp.next;
                i++;
            }
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.prev = null;
            temp.next = null;
        }
    }
}