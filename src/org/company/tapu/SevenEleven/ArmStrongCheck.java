package org.company.tapu.SevenEleven;

import java.util.Scanner;
import java.util.Stack;

public class ArmStrongCheck {
    public static void main(String [] args){
        Stack stack = new Stack();
        System.out.println("Enter a number to check ArmStrong");
        Scanner sc  = new Scanner(System.in);
        int number = sc.nextInt();
        int flag = checkArmstrong(number);
        if(flag == 1){
            System.out.print("Armstrong");
        }
        else{
            System.out.print("Not Armstrong");
        }
    }

    private static int checkArmstrong(int number) {
        int rem;
        int temp = number;
        int armstrong = 0;

        while(temp != 0){
            rem = temp % 10;
            armstrong += (rem)*(rem)*(rem);
            temp/=10;
        }
        if(number == armstrong){
            return 1;
        }else{
            return -1;
        }
    }
}
