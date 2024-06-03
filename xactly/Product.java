package xactly;

public class Product {
    private int length;
    private int breadth;
    private int height;
    int quantity;

    public Product(int length, int breadth, int height, int quantity) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.quantity = quantity;
    }
    public int getVolume(){
        return  length*breadth*height;
    }
}
