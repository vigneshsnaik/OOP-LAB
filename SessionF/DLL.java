import java.util.Scanner;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DLL {
    Node head;

    DLL(Node head) {
        this.head = head;
    }

    boolean isEmpty() {
        if (head == null) {
            System.out.println("List Empty");
            return true;
        }
        return false;
    }

    void printlist() {
        if (!isEmpty()) {
            Node temp = head;
            System.out.print("[" + head.data);
            while (temp.next != null) {
                temp = temp.next;
                System.out.print("," + temp.data);
            }
            System.out.println("]\n");
        }
    }

    void insertAtEnd(int data) {
        if (isEmpty()) {
            System.out.println("Creating head");
            head = new Node(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node ptr = new Node(data);
            temp.next = ptr;
            ptr.prev = temp;
        }
    }

    void insertAtBegining(int data) {
        if (isEmpty()) {
            System.out.println("Creating head");
            head = new Node(data);

        } else {
            Node ptr = new Node(data);
            ptr.next = head;
            head.prev = ptr;
            head = ptr;
        }
    }

    void insert(int i, int data) {
        if (!isEmpty()) {
            int pos = 1;
            Node ptr = new Node(data);
            Node temp = head;
            while (pos < i) {
                temp = temp.next;
                pos++;
            }
            ptr.prev = temp.prev;
            ptr.next = temp;
            temp.prev.next = ptr;
            temp.prev = ptr;
        }
    }

    void deleteLastNode() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.prev = null;
            temp.prev.next = null;
        }

    }

    void deleteFirstNode() {
        head = head.next;
        head.prev = null;
    }

    void delete(int i) {
        if (!isEmpty()) {
            int pos = 1;
            Node temp = head;
            while (pos < i) {
                temp = temp.next;
                pos++;
            }
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.prev = null;
            temp.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL obj = new DLL(null);
        int choice, d;

        do {
            System.out.println("Enter the choice: ");
            System.out.println("1.Insert At End");
            System.out.println("2.Insert at Front");
            System.out.println("3.Insert at");
            System.out.println("4.Delete at");
            System.out.println("5.Print list");
            System.out.println("6.Delete the first");
            System.out.println("7.EXIT");

            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("enter the number");
                    int num = sc.nextInt();
                    obj.insertAtEnd(num);
                    break;
                }

                case 2: {
                    System.out.println("enter the number");
                    int num = sc.nextInt();
                    obj.insertAtBegining(num);
                    break;
                }

                case 3: {
                    System.out.println("enter the number");
                    int num = sc.nextInt();

                    System.out.println("enter index at which you want to insert");
                    d = sc.nextInt();

                    obj.insert(d, num);
                    break;
                }

                case 4: {
                    System.out.println("Enter the index at which you want to delete:");
                    int num = sc.nextInt();
                    obj.delete(num);
                    break;
                }
                case 5: {
                    obj.printlist();
                    break;
                }
                case 6: {
                    System.out.println("Enter the element you want to delete:");
                    obj.deleteFirstNode();
                    break;
                }
                case 7: {
                    System.out.println("Exiting...");
                    break;
                }
                default: {
                    System.out.println("please enter a valid choice");
                }

            }

        } while (choice < 7);

    }
}
