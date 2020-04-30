package contest037;

import java.util.Scanner;

public class QuestionA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		sc.close();

		//AとBの値段の比較で条件分岐
		if((C < A) && (C < B)) {
			System.out.println(0);
		}else {
			if(A > B) {
				int ans = C / B;
				System.out.println(ans);
			}else {
				int ans = C / A;
				System.out.println(ans);
			}
		}
	}
}
