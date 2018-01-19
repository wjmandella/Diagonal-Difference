import java.util.Scanner;

//My solution to the "Diagonal Difference" problem on HackerRank (with a few enhancements).
// https://www.hackerrank.com/challenges/diagonal-difference/problem

public class DiagonalDifferenceApp {
	
	static int diagonalDifference(int[][] a) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i<a.length; i++){
            for (int j = 0; j < a.length; j++) {
                if(i == j){
                    leftSum += a[i][j];
                }
            }            
        }
        
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if (i + j == (a.length - 1)){
                    rightSum += a[i][j];
                  }
            }
        }
        
        int diagonalDiff = Math.abs(leftSum-rightSum);
        return diagonalDiff;     
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        System.out.println("\nNow to enter the values of a "+n+" by "+n+" matrix");
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                System.out.print("Enter an integer for position "+ a_i + a_j + " of the matrix: ");
                a[a_i][a_j] = in.nextInt();
            }
        }
        System.out.println("\nHere's the matrix: ");
        displayMatrix(a);
        int result = diagonalDifference(a);
        System.out.println("\nThe difference of the sum of the two diagonals of the matrix is " + result + ".");
        in.close();
    }
    
    public static void displayMatrix(int [][] arr) {
    	for(int i = 0; i < arr.length; i++) {
    		for(int j = 0; j < arr.length; j++) {
    			System.out.print(arr[i][j] + " ");
    		}
    		System.out.println();
    	} 	
    }
}
