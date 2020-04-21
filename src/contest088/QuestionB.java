package contest088;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		Arrays.sort(a);
		int count = 0;
		int alice = 0;
		int bob = 0;
		for(int i = N - 1; i >= 0; i--) {
			if(count % 2 == 0) {
				alice += a[i];
			}else {
				bob += a[i];
			}
			count++;
		}
		int ans = alice - bob;
		System.out.println(ans);
	}
}
