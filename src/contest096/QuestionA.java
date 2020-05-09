package contest096;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		sc.close();

		if(a <= b) {
			System.out.println(a);
		}else {
			System.out.println(a - 1);
		}

	}
}
