package org.company.tapu.globallogic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        int factorial = 1;
        for(int i = 2; i <= n; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
