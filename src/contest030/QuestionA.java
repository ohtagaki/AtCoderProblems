package contest030;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = Double.parseDouble(sc.next());
		double B = Double.parseDouble(sc.next());
		double C = Double.parseDouble(sc.next());
		double D = Double.parseDouble(sc.next());
		sc.close();

		double tk = B / A;
		double ao = D / C;

		//改行に注意
		if(tk == ao) {
			System.out.println("DRAW");
		}else if(tk < ao) {
			System.out.println("AOKI");
		}else {
			System.out.println("TAKAHASHI");
		}

	}
}
