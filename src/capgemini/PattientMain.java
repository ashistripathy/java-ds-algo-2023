package capgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PattientMain {
    public static void main(String [] args){
        List<Pattient> pattients = new ArrayList<>();
        pattients.add(new Pattient("p1",20,"corona",10000));
        pattients.add(new Pattient("p2",26,"fever",6000));
        pattients.add(new Pattient("p3",29,"corona",8000));
        pattients.add(new Pattient("p4",23,"corona",13000));

        pattients.stream()
                .filter(p->p.getDisease().equals("corona"))
                .filter(p->p.getAge() < 25 )
                .map(p->p.getName())
                .forEach(System.out::println);

        double average = pattients.stream()
                .filter(p->p.getDisease().equals("corona"))
                .collect(Collectors.averagingDouble(Pattient::getAmount));
        System.out.println(average);

    }
}
