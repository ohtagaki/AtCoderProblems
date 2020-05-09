package contest099;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		//整数の桁数フォーマット
		//if(N < 1000) {
		//	System.out.println("ABC" + String.format("%03d", N));
		//}else {
		//	System.out.println("ABD" + String.format("%03d", N - 999));
		//}

		if(N < 1000) {
			System.out.println("ABC");
		}else {
			System.out.println("ABD");
		}
	}
}
