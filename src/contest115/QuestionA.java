package contest115;

import java.util.Scanner;

public class QuestionA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = Integer.parseInt(sc.next());
		sc.close();
		
		if(D == 25) {
			System.out.println("Christmas");
		}else if(D == 24){
			System.out.println("Christmas Eve");
		}else if(D == 23) {
			System.out.println("Christmas Eve Eve");
		}else {
			System.out.println("Christmas Eve Eve Eve");
		}
	}
}
