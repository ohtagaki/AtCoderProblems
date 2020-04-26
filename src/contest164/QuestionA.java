package contest164;

import java.util.Scanner;

public class QuestionA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		sc.close();
		if(S <= W) {
			System.out.println("unsafe");
		}else {
			System.out.println("safe");
		}


	}
}
