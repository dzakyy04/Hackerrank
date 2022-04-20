package hackerrank;

import java.util.Scanner;

public class DiagonalDifference {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int sum = sc.nextInt();
		int[][] mat = new int[sum][sum];

		for (int i = 0; i < sum; i++) {
			for (int j = 0; j < sum; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(diagonalDifference(mat));
	}

    public static int diagonalDifference(int mat[][]) {
    	int a = 0, b = 0; 
    	for(int i = 0; i<mat.length; i++) {
    		for(int j = 0; j<mat.length; j++) {
    			if(i == j) {
    				a += mat[i][j];
    			}
    			
    			if(i+j == mat.length-1) {
    				b += mat[i][j];
    			}
    		}
    	}
    	
    	return Math.abs(a - b);

    }
}
