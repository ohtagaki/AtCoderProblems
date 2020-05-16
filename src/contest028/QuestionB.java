package contest028;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;
		int countE = 0;
		int countF = 0;
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == 'A') {
				countA++;
			}else if(S.charAt(i) == 'B') {
				countB++;
			}else if(S.charAt(i) == 'C') {
				countC++;
			}else if(S.charAt(i) == 'D') {
				countD++;
			}else if(S.charAt(i) == 'E') {
				countE++;
			}else if(S.charAt(i) == 'F') {
				countF++;
			}
		}
		System.out.println(countA + " " + countB + " " + countC + " " + countD + " " + countE + " " + countF);
	}

}
