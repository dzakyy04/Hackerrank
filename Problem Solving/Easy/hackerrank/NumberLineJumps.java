package hackerrank;

import java.util.*;

public class NumberLineJumps {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long x1 = sc.nextInt();
		long v1 = sc.nextInt();
		long x2 = sc.nextInt();
		long v2 = sc.nextInt();

		System.out.println(kangaroo(x1, v1, x2, v2));
	}
    public static String kangaroo(long x1, long v1, long x2, long v2) {
    	long i = 0;
    	while(i < 100000) {
    		if(x1 == x2) {
    			return "YES";
    		}
    		x1 += v1;
    		x2 += v2;
    		i++;
    	}
    	return "NO";
    }
}
