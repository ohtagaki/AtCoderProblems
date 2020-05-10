package contest167;

import java.util.Scanner;

public class QuestionD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		Long K = Long.parseLong(sc.next());
		int[] A = new int[N];
		sc.close();
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
		}

	}

}
