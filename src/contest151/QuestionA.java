package contest151;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		String com = "abcdefghijklmnopqrstuvwxyz";
		int num = com.indexOf(s);
		System.out.println(com.charAt(num+1));
	}

}
