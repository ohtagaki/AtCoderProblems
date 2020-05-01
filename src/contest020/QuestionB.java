package contest020;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();

		//数値 → 文字列の変換
		//String.valueOfメソッド
		String n = String.valueOf(A) + String.valueOf(B);

		//文字列 → 数への変換
		int num = Integer.parseInt(n);
		System.out.println(num * 2);

	}
}
