package contest060;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		sc.close();

		//先頭文字と最後の文字を切り出し、同じ文字かどうか比較
		boolean one = B.substring(0, 1).equals(A.substring(A.length() - 1, A.length()));
		boolean two = C.substring(0, 1).equals(B.substring(B.length() - 1, B.length()));
		if(one && two) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
