package contest079;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		int a = N / 1000;
		int b = (N % 1000) / 100;
		int c = (N % 100) / 10;
		int d = (N % 100) % 10;

		if(a == b && b == c && c == d) {
			System.out.println("Yes");
		}else if(a == b && b == c) {
			System.out.println("Yes");
		}else if(b == c && c == d) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
