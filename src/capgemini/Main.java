package capgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String ... args){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("ABC",32,"Male","IT"));
        employees.add(new Employee("PQR",22,"Female","HR"));
        employees.add(new Employee("LMN",31,"Male","IT"));
        employees.add(new Employee("XYZ",29,"Female","HR"));

        employees.stream().map(Employee :: getDepartment).distinct().forEach(System.out::println);

        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
                .forEach((x,y)->{
                    System.out.println("Department " + x + " Count "+y);
                });
        employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)))
                .forEach((x,y)->{
                    System.out.println("Gender " + x + " average "+y);
                });
    }
}
