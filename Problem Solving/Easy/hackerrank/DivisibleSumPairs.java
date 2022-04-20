package hackerrank;

import java.util.Scanner;

public class DivisibleSumPairs {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int arr[] = new int[n];
		int k = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(divisibleSumPairs(n, k, arr));
	}
	
    public static int divisibleSumPairs(int n, int k, int arr[]) {
    	int count = 0;
    	for(int i = 0; i<arr.length; i++) {
    		for(int j = 0; j<i; j++) {
    			if((arr[i] + arr[j]) % k == 0) {
    				count++;
    			}
    		}
    	}
    	return count;

    }

}
