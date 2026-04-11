/*
Test your understanding of Java 2D arrays by completing this short coding exercise.
Instructions
Inside the main() method, complete the following steps:
Declare and Initialize: Create a 2D integer array named myNumbers containing the following values:
Row 1: 4, 5, 6
Row 2: 7, 8, 9
Row 3: 1, 2, 3
Output: Use a nested loop (or Arrays.deepToString()) to print the array so it appears in the grid format shown above.
Expected Output
text
1 2 3 
3 4 5 
6 7 8


*/

public class J011_Multi_dimentional_Array {
    public static void main(String [] args){
        int [][] myNumbers = {
            {4,5,6},
            {7,8,9},
            {1,2,3}
        };

        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                System.out.print(myNumbers[row][col] + " ");
            }
            System.out.println("");
        }
    }
}
