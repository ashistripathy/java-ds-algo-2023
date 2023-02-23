package file;

import java.io.File;
import java.util.Scanner;

public class ReadFileFromScanner {
    public static void main(String [] args) throws Exception{
        File file = new File("C:\\Users\\Sonali\\BC_25456\\java-ds-algo-2023\\src\\emp_dept.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}