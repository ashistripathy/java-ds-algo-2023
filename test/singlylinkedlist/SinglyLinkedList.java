package test.singlylinkedlist;

import java.util.Scanner;

public class SinglyLinkedList {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    public SinglyLinkedList(){
        this.head = null;
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public boolean search(int target){
        Node current = head;
        while (current != null){
            if(current.data == target){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public boolean remove(int target){
        if(head == null){
            return false;
        }
        if(head.data == target){
            head = head.next;
            return true;
        }
        Node current = head;
        while (current.next != null && current.next.data != target){
            current = current.next;
        }
        if(current.next == null){
            return false;
        }
        current.next = current.next.next;
        return true;
    }
    public void display(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a element to search : ");
        int target = sc.nextInt();
        if(list.search(target)){
            System.out.println("Value "+target+" found in the list.");
        }else {
            System.out.println("Value "+target+" not found in the list.");
        }
        System.out.println("Enter a element to remove : ");
        int remElement = sc.nextInt();
        if(list.remove(remElement)){
            System.out.println("Value "+remElement+" removed from the list.");
        }else {
            System.out.println("Value "+remElement+" not found in the list.");
        }
        list.display();
    }
}
