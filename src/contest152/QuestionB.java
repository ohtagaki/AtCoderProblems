package contest152;

import java.util.Scanner;

public class QuestionB {
	/*
	a を b 回繰り返した文字列は a で始まり、b を a 回繰り返した文字列は b で始まるため、
	a < b ならば常に a を b 回繰り返した文字列の方が辞書順で小さいですし、
	a > b ならば常に b を a回繰り返した文字列の方が辞書順で小さいです。
	また、a = b なら二つの文字列が等しくなるのでどちらを出力しても同じになります
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		sc.close();

		StringBuffer sbA = new StringBuffer();
		StringBuffer sbB = new StringBuffer();
		for(int i = 0; i < b; i++) {
			String S = String.valueOf(a);
			sbA.append(S);
		}
		for(int i = 0; i < a; i++) {
			String S = String.valueOf(b);
			sbB.append(S);
		}
		String A = sbA.toString();
		String B = sbB.toString();
		if(a < b) {
			System.out.println(A);
		}else {
			System.out.println(B);
		}
	}
}
