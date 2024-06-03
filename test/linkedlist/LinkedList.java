package test.linkedlist;

public class LinkedList {
    private static class Node{
        public int data;
        public Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    private Node head;
    public LinkedList(){
        head = null;
    }
    public void addToFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head=newNode;
    }
    public static void main(String [] args){
        LinkedList list = new LinkedList();
        list.addToFront(1);
        list.addToFront(2);
        list.addToFront(3);
        list.addToFront(4);
        list.addToFront(5);
        System.out.println(list.isCircular());
    }

    private boolean isCircular() {
        if(head == null){
            return false;
        }
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
