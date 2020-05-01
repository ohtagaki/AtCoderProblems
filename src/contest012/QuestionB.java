package contest012;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();
		int h = N /3600;
		int m = (N % 3600) / 60;
		int s = (N % 3600) % 60;

		// 三項演算子を使用して条件分岐
		String hh =(h >= 10) ? String.valueOf(h) : "0" + String.valueOf(h) ;
		String mm =(m >= 10) ? String.valueOf(m) : "0" + String.valueOf(m) ;
		String ss =(s >= 10) ? String.valueOf(s) : "0" + String.valueOf(s) ;
		System.out.println(hh + ":" + mm + ":" + ss );
	}

}
