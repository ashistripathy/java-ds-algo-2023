package generic;

public class ArrayMinMax<T extends Comparable<T>> {
    private T [] array;

    public ArrayMinMax(T[] array){
        this.array = array;
    }
    public T getMin(){
        T min = array[0];
        for(int i = 1 ; i < array.length; i++){
            if(array[i].compareTo(min) < 0){
                min = array[i];
            }
        }
        return min;
    }
    public T getMax(){
        T max = array[0];
        for(int i = 1 ; i < array.length; i++){
            if(array[i].compareTo(max) > 0){
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Integer[] intArray = {3, 6, 2, 8, 1, 9};
        ArrayMinMax<Integer> intMinMax = new ArrayMinMax<>(intArray);
        System.out.println("Minimum: " + intMinMax.getMin()); // Output: 1
        System.out.println("Maximum: " + intMinMax.getMax()); // Output: 9

        Double[] doubleArray = {3.5, 1.2, 7.8, 4.6, 2.9};
        ArrayMinMax<Double> doubleMinMax = new ArrayMinMax<>(doubleArray);
        System.out.println("Minimum: " + doubleMinMax.getMin()); // Output: 1.2
        System.out.println("Maximum: " + doubleMinMax.getMax()); // Output: 7.8

        String[] stringArray = {"Tapan","Sagar","Allha","Ashis","Bika","Nari","Rocky","Sudhansu"};
        ArrayMinMax<String> stringMinMax = new ArrayMinMax<>(stringArray);
        System.out.println("Minimum: "+ stringMinMax.getMin());
        System.out.println("Maximum: "+stringMinMax.getMax());
    }
}
