package contest016;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		sc.close();

		int sum = A + B;
		int diff = A - B;

		//4通りの条件分岐
		if(sum == C && diff == C) {
			System.out.println("?");
		}else if(sum == C){
			System.out.println("+");
		}else if(diff == C) {
			System.out.println("-");
		}else {
			System.out.println("!");
		}
	}
}
