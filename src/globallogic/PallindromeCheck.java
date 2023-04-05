package globallogic;

import java.util.Scanner;

public class PallindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        sc.close();

        if(isPallindrome(number)){
            System.out.println(number + " is a pallindrome number");
        }else{
            System.out.println(number + " is not a pallindrome number");
        }
    }
    public static boolean isPallindrome(int number){
        int reversed = 0;
        int orginal = number;

        while(number != 0){
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        return orginal == number;
    }
}
