package contest014;

import java.util.Scanner;

public class QuestionA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		sc.close();

		int check = a % b;
		if(check == 0) {
			System.out.println(check);
		}else {
			System.out.println(b - check);
		}

	}
}
