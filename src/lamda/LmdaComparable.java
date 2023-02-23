package lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LmdaComparable {
    public static void main(String [] args){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(111,"Ashis",30000.00));
        employeeList.add(new Employee(112,"Rajesh",40000.00));
        employeeList.add(new Employee(113,"Adi",50000.00));
        employeeList.add(new Employee(114,"Dhansu",60000.00));
        System.out.println("**Comparable implementation using lamda expression**");
        Collections.sort(employeeList,(e1,e2)->{
            return e1.name.compareTo(e2.name);
        });
        for(Employee e: employeeList){
            System.out.println(e.id + " " + e.name + " "+ e.salary);
        }
        System.out.println("**Comparator implementation using lamda expression**");
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)o1.salary - (int)o2.salary;
            }
        });
        for(Employee e: employeeList){
            System.out.println(e.id + " " + e.name + " "+ e.salary);
        }
    }
}
