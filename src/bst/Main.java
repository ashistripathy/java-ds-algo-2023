package bst;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.addContact(new Contact("Alice", "123-456-7890"));
        bst.addContact(new Contact("Bob", "234-567-8901"));
        bst.addContact(new Contact("Charlie", "345-678-9012"));
        bst.addContact(new Contact("David", "456-789-0123"));

        Contact alice = bst.findContact("Alice");
        if (alice != null) {
            System.out.println(alice.getName() + ": " + alice.getPhoneNumber());
        } else {
            System.out.println("Contact not found.");
        }

        Contact eve = bst.findContact("Eve");
        if (eve != null) {
            System.out.println(eve.getName() + ": " + eve.getPhoneNumber());
        } else {
            System.out.println("Contact not found.");
        }
    }
}
