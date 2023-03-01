package SevenEleven;

import java.util.Arrays;
import java.util.List;

public class BinarySrch {
    public static void main(String [] args){
        //Declaring Array of a sorted array
        int [] list = {1,2,4,5,7};
        //setting a target element to search
        int target = 7;
        //a function to return the index no of the element if found else return -1
        int flag = binSearch(list,target);
        System.out.print(flag);
    }

    private static int binSearch(int [] list, int target) {
        //Declaring a left index initalize with 0
        int left = 0;
        //Declaring a right index of arraly length - 1
        int right = list.length-1;
        //while loop to iterate the array values based on the below logic
        while(left <= right){
           //finding the middle index
            int middle = (left+right)/2;
            //checking whether the searching element is smaller than the element placed at middle
            if(target < list[middle]){
                //decreasing the right index pointer value by if the above condition works
                right = middle -1;
                //checking whether the searching element is greater than the element placed at middle
            }else if(target > list[middle]){
                //if present increasing the left index counter
                left = middle + 1;
            }else{
                //neither the searched element is smaller or greater than search element and present at the middle index
                return middle;
            }
        }
        //case where element is not found
        return -1;
    }
}
