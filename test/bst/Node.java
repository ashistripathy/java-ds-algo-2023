package bst;

public class Node {
    private Contact contact;
    private Node leftChild;
    private Node rightChild;

    public Node(Contact contact) {
        this.contact = contact;
    }

    public Contact getContact() {
        return contact;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}

