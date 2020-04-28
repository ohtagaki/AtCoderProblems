package contest140;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		//Nの3乗を出力
		System.out.println((int)Math.pow(N, 3));
	}
}
