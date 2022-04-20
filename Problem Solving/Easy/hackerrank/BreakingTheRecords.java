package hackerrank;

import java.util.Scanner;

public class BreakingTheRecords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int score[] = new int[n];
		for (int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
		}
		sc.close();
		int res[] = breakingRecords(score);
		for(int i = 0; i<res.length; i++) {
			System.out.print(res[i] + " ");
		}

	}
    public static int[] breakingRecords(int score[]) {
    	int max = score[0], min = score[0], maxCount = 0, minCount = 0;
    	for(int i = 0; i<score.length; i++) {
    		if(max < score[i]) {
    			max = score[i];
    			maxCount++;
    		}
    		
    		if(min > score[i]) {
    			min = score[i];
    			minCount++;
    		}
    	}
    	
    	int res[] = {maxCount, minCount};
    	return res;
    }
}
