package hackerrank;

import java.util.*;

public class GradingStudents {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		List<Integer> grade = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			grade.add(i, sc.nextInt());
		}

		List<Integer> res = gradingStudents(grade);
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}

	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> round = grades;
		for (int i = 0; i < grades.size(); i++) {
			if (grades.get(i) >= 38) {
				if (grades.get(i) % 5 >= 3) {
					round.set(i, grades.get(i) + (5 - grades.get(i) % 5));
				}
			}
		}

		return round;

	}

}
