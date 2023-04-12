package adi.walmart;

public class DiagonalSumOfMatrix {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,0,0},
                {0,2,0},
                {0,0,3}
        };
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][i];
        }
        System.out.println("Sum of diagonal elements : " + sum);
    }
}
