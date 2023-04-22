package generic;

public class GenericMax {
    public static <T extends Comparable<T>> T max(T [] array){
        T max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i].compareTo(max) > 0){
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Integer[] intArray = { 3, 6, 2, 8, 4 };
        Double[] doubleArray = { 3.2, 6.7, 2.4, 8.9, 4.1 };
        String[] stringArray = { "apple", "banana", "orange", "pear", "kiwi" };

        System.out.println("Max integer: " + GenericMax.max(intArray));
        System.out.println("Max double: " + GenericMax.max(doubleArray));
        System.out.println("Max string: " + GenericMax.max(stringArray));
    }

}
