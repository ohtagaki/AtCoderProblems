package contest139;

import java.util.Scanner;

public class QuestionB {

	/*
	方針：
	最初差込口を 1 口として、差込口が B 口未満である間、
	電源タップ 1 つと差込口 1 口を使って差込口を A 口増やすことを続ける
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();

		int ans = 0;
		int num = 1;
		while(num < B) {
			ans++;
			num = A * ans - (ans - 1);
		}
		System.out.println(ans);
	}

}
