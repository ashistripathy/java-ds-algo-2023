package xactly;

public class Container {
    private int id;
    private int length;
    private int breadth;
    private int height;
    private String size;

    public Container(int id, int length, int breadth, int height, String size) {
        this.id = id;
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.size = size;
    }
    public int getVolume(){
        return  length*breadth*height;
    }

    @Override
    public String toString() {
        return size + " (ID: " + id + ")";
    }
}
