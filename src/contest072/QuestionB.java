package contest072;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		StringBuffer sb = new StringBuffer();
		//1つ飛ばしでforループを回す
		for(int i = 0; i < S.length(); i += 2) {
			//1文字ずつ新しい文字列に格納
			sb.append(S.charAt(i));
		}
		System.out.println(sb.toString());
	}

}
