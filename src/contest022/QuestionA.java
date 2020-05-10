package contest022;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int S = Integer.parseInt(sc.next());
		int T = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int[] A = new int[N - 1];
		for(int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		int count = 0;
		if(S <= W && W <= T) {
			count++;
		}
		for(int i = 0; i < A.length; i++) {
			W += A[i];
			if(S <= W && W <= T) {
				count++;
			}
		}
		System.out.println(count);


	}

}
