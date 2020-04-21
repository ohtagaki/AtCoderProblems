package contest085;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] d = new int[N];
		for(int i = 0; i < N; i++) {
			d[i] = Integer.parseInt(sc.next());
		}
		sc.close();
	}

}
