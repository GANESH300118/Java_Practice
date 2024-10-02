class LL{
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int y){
            this.data = y;
            this.next = null;
        }
    }
    public void insertAtEnd(int ele){
        Node newNode = new Node(ele);
        if(this.head == null){
            this.head = newNode;
        }
        else{
            Node temp = this.head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void deleteSpe(int ele){
        Node curr = this.head, prev = null;
        while(curr != null){
            if(curr.data == ele) break;
            prev = curr;
            curr = curr.next;
        }
        if(curr != null){
            if(prev == null){
                this.head = this.head.next;
                curr.next = null;
            } 
            else{
                prev.next = curr.next;
                curr.next = null;
            }
        }
    }
    public void printLL(){
        Node temp = this.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class P1 {
    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insertAtEnd(10);
        list1.insertAtEnd(11);
        list1.insertAtEnd(2);
        list1.insertAtEnd(5);
        list1.insertAtEnd(7);
        list1.insertAtEnd(94);
        list1.insertAtEnd(81);
        list1.printLL();
        list1.deleteSpe(2);
        list1.printLL();
    }
}