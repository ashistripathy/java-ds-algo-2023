package test.array;

import java.util.HashSet;
import java.util.Set;

/*Common Elements in two array*/
public class CommonElementInArray {
    public static void main(String [] args){
        String [] arr1 = {"Java","Interview","questions"};
        String [] arr2 = {"Java","Interview","questions","for"};

        Set<String> output = new HashSet<>();
        for(int i = 0; i <arr1.length;i++){
            for(int j = 0; j <arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    output.add(arr1[i]);
                }
            }
        }
        for(String s : output){
            System.out.println(s);
        }
    }
}
