package contest149;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//StringBufferクラスを用いた文字列連結
		StringBuffer S = new StringBuffer(sc.next());
		StringBuffer T = new StringBuffer(sc.next());
		sc.close();
		System.out.println(T.append(S));

	}
}
