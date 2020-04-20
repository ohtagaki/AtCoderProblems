package contest081;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long[] A = new long[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		sc.close();

		int answer = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			int count = 0;
			while(A[i] % 2 == 0) {
				A[i] = A[i] / 2;
				count++;
			}
			if(answer >= count) {
				answer = count;
			}
		}
		System.out.println(answer);
	}
}
