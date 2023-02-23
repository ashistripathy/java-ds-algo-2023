package linkedlist;

import java.util.ArrayList;

public class MiddleElementLinkedList {
    static class Node{
        int data;
        Node next;
    }
     static class NodeOperation {
        //function to add a new node
        public void pushNode(Node [] headRef, int dataVal){
            //Allocate node
            Node newNode = new Node();
            //put in the data
            newNode.data = dataVal;
            //Link the old list of the new node
            newNode.next = headRef[0];
            //move the head to point to the new node
            headRef[0] = newNode;
        }
    }
    public static void main(String [] args){
        Node [] head = new Node[1];
        NodeOperation temp = new NodeOperation();

        for(int i=6;i>0;i--){
            temp.pushNode(head,i);
        }

        ArrayList<Integer> v = new ArrayList<>();
        Node curr = head[0];

        while(curr!=null){
            v.add(curr.data);
            curr = curr.next;
        }
        System.out.println("Middle Element of the linked list is : ");
        System.out.println(v.get(v.size()/2));
    }
}
