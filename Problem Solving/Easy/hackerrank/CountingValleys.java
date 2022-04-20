package hackerrank;

import java.util.Scanner;

public class CountingValleys {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int steps = sc.nextInt();
		String path = sc.next().substring(0, steps);

		sc.close();
		System.out.println(countingValleys(steps, path));

	}

	public static int countingValleys(int steps, String path) {
        int valleyCount = 0;
        int altitude = 0;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') {
                altitude++;
            } else {
                altitude--;
            }

            if (path.charAt(i) == 'U' && altitude == 0) {
                valleyCount++;
            }
        }

        return valleyCount;

	}

}
