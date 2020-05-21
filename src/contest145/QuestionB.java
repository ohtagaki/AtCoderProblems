package contest145;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		sc.close();

		/*
		N が偶数のとき, 0-indexed で, S の 0 文字目から始まる N/2 文字分の部分文字列と,
		S の N/2 文字目から始まる N/2 文字分の部分文字列が一致していれば答えは Yes であり,
		そうでなければ No です.
		*/
		if(S.substring(0, N / 2).equals(S.substring(N / 2, N ))) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
