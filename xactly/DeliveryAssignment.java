package xactly;

import java.util.ArrayList;
import java.util.List;

public class DeliveryAssignment {
    public static void main(String[] args) {
        List<Container> containers = new ArrayList<>();
        containers.add(new Container(1,10,20,30,"SMALL"));
        containers.add(new Container(2,50,60,70,"MEDIUM"));
        containers.add(new Container(3,100,200,300,"LARGE"));

        List<Product> products = new ArrayList<>();
        products.add(new Product(5,5,5,10));
        products.add(new Product(20,20,20,2));
        products.add(new Product(30,30,30,3));

        assignOrdersToConatiners(containers,products);
    }
    public static void assignOrdersToConatiners(List<Container> containers,List<Product> products){
        int totalOrderVolume = calculateTotalOrderVolume(products);
        System.out.println("Total order volumne : "+ totalOrderVolume);

        for(Container container : containers){
            if(container.getVolume() >= totalOrderVolume){
                System.out.println("Assign the order to "+container);
                return;
            }
        }
        System.out.println("No single container can hold the entire order. consider splitting the order or using multiple container");
    }
    private static int calculateTotalOrderVolume(List<Product> products){
        int totalVolume = 0;
        for(Product product : products){
            totalVolume += product.getVolume() * product.quantity;
        }
        return totalVolume;
    }
}
