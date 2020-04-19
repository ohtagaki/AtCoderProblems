package contest163;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContestE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();


	}

}
