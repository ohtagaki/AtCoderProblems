package contest018;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		final int n = 3;
		int[] p1 = new int[n];
		int[] p2 = new int[n];
		for (int i = 0; i < n; i++) {
			p1[i] = p2[i] = sc.nextInt();
		}
		Arrays.sort(p2);

		for (int i = 0; i < n; i++) {
			int rank = Arrays.binarySearch(p2, p1[i]);
			rank = 3 - rank;
			System.out.println(rank);
		}

	}
}
