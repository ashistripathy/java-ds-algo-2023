package stream;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeMain {
    public static void main(String [] args){
        List<Employee> employees = IntStream.range(0,10)
                .mapToObj(i -> new Employee(getRandomName(),getRandomAge(),getRandomSalary()))
                .collect(Collectors.toList());
        System.out.println(employees.toString());

        List<String> names = employees.stream().filter(emp -> emp.getSalary() > 3500)
                .sorted(Comparator.comparingInt(Employee::getAge))
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(names);
    }

    private static double getRandomSalary() {
        Random r = new Random();
        return r.nextInt(2001) + 3000;
    }

    private static int getRandomAge() {
        Random r = new Random();
        return r.nextInt(41) + 20;
    }

    private static String getRandomName() {
        Random r = new Random();
        String[] names = { "Alice", "Bob", "Charlie", "Dave", "Eve", "Frank", "Grace", "Henry", "Isaac", "Jack" };
        return names[r.nextInt(names.length)];
    }
}
