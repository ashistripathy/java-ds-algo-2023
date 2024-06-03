package file;

import java.io.File;
import java.util.Scanner;

public class ReadingEntireFileWithoutDelimeter {
    public static void main(String [] args) throws Exception{
        File file = new File("C:\\Users\\Sonali\\BC_25456\\java-ds-algo-2023\\src\\Imptroubleshooting.txt");
        Scanner sc = new Scanner(file);

        sc.useDelimiter("\\Z");
        System.out.println(sc.next());
    }
}
