package array;

public class SpiralMatrix {
    public static void main(String [] args){
        int n = 5;//size of matrix
        int [][] matrix = new int[n][n];

        int num =1;
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = n-1;
        int colEnd = n-1;

        while(num <= n*n){
            //traverse right(colStart - colEnd)
            for(int j = colStart; j<= colEnd; j++){
                matrix[rowStart][j] = num++;
            }
            rowStart++;
            //travesre down(rowStart-rowEnd)
            for(int i = rowStart; i<= rowEnd; i++){
                matrix[i][colEnd] = num++;
            }
            colEnd--;
            //traverse left (colEnd-colStart)
            for(int j = colEnd; j >= colStart; j--){
                matrix[rowEnd][j] = num++;
            }
            rowEnd--;
            //traverse up (rowEnd-rowStart)
            for(int i = rowEnd; i >= rowStart; i--){
                matrix[i][colStart] = num++;
            }
            colStart++;

        }
        //print Array
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
