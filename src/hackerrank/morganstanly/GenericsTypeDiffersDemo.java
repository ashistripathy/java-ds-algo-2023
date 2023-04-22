package hackerrank.morganstanly;

public class GenericsTypeDiffersDemo {
    public static void main(String[] args) {
        GenericsWithObjects<Integer> intObject = new GenericsWithObjects<Integer>(12);
        GenericsWithObjects<String> strObjects = new GenericsWithObjects<String>("StringGeneric");

        intObject.print();
        strObjects.print();
    }
}

