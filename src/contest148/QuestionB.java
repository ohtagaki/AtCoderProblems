package contest148;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		String T = sc.next();
		sc.close();

		//StringBufferによる文字列連結
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < N; i++) {
			sb.append(S.charAt(i));
			sb.append(T.charAt(i));
		}
		System.out.println(sb.toString());

	}

}
