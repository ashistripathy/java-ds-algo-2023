package map;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListToMapExample {
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();

        person.add(new Person(1,"Ashis"));
        person.add(new Person(2,"Tapan"));
        person.add(new Person(3,"Soumya"));

        Map<Integer,Person> peopleMap = person.stream()
                .collect(Collectors.toMap(Person::getId,perso -> perso));
        System.out.println(peopleMap);
    }
}
