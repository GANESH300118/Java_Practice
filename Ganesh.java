import java.util.Scanner;

class Ganesh {
    Node head;

    class Node {
        int val;
        Node next;

        Node(int y) {
            this.val = y;
            this.next = null;
        }
    }

    Ganesh() {
        this.head = null;
    }

    public void insertAtEnd(int a) {
        Node newNode = new Node(a);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printList() {
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ganesh list = new Ganesh();
        System.out.println("Enter numbers to insert into the linked list (enter -1 to stop):");
        int n = sc.nextInt();
        while (n >0) {
            list.insertAtEnd(n);
            n = sc.nextInt();
        }
        System.out.println("The linked list is:");
        list.printList();
    }
}