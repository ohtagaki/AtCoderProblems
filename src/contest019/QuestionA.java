package contest019;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		sc.close();

		if(a >= b && a >= c) {
			if(b >= c) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}
		}else if(b >= a && b >= c) {
			if(a >= c) {
				System.out.println(a);
			}else {
				System.out.println(c);
			}
		}else if(c >= a && c >= b) {
			if(a >= b) {
				System.out.println(a);
			}else {
				System.out.println(b);
			}
		}

	}
}
