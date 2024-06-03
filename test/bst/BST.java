package bst;

public class BST {
    private Node root;

    public BST() {
        root = null;
    }

    public void addContact(Contact contact) {
        Node newNode = new Node(contact);

        if (root == null) {
            root = newNode;
        } else {
            Node currentNode = root;
            while (true) {
                if (contact.getName().compareTo(currentNode.getContact().getName()) < 0) {
                    if (currentNode.getLeftChild() == null) {
                        currentNode.setLeftChild(newNode);
                        break;
                    } else {
                        currentNode = currentNode.getLeftChild();
                    }
                } else {
                    if (currentNode.getRightChild() == null) {
                        currentNode.setRightChild(newNode);
                        break;
                    } else {
                        currentNode = currentNode.getRightChild();
                    }
                }
            }
        }
    }

    public Contact findContact(String name) {
        Node currentNode = root;
        while (currentNode != null) {
            if (name.equals(currentNode.getContact().getName())) {
                return currentNode.getContact();
            } else if (name.compareTo(currentNode.getContact().getName()) < 0) {
                currentNode = currentNode.getLeftChild();
            } else {
                currentNode = currentNode.getRightChild();
            }
        }
        return null;
    }
}
