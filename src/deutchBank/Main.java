package deutchBank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String ... args) {
        // Create a list of Employee objects
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 1, 10),
                new Employee("Bob", 1, 20),
                new Employee("Charlie", 2, 15),
                new Employee("Dave", 2, 5)
        );

        // Find the employee with the maximum code commit count by name
        String name = "Bob";
        int maxCodeCommitCount = employees.stream()
                .filter(e -> e.getName().equals(name))
                .max(Comparator.comparingInt(Employee::getCodeCommitCount))
                .map(Employee::getCodeCommitCount)
                .orElse(0);

        System.out.println("Max code commit count for " + name + " is " + maxCodeCommitCount);
    }
}
