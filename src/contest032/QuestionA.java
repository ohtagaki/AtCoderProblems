package contest032;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int N = Integer.parseInt(sc.next());
		sc.close();

		for(int i = N; i <= 1000000001; i++) {
			if(i % a == 0 && i % b == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}
