package contest025;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = Integer.parseInt(sc.next());
		int a = s.length();
		sc.close();
		String[] array = new String[a * a];
		int count = 0;

		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				array[count]=(String.valueOf(s.charAt(i))) + (String.valueOf(s.charAt(j)));
				count++;
			}
		}
		System.out.println(array[n - 1]);
	}
}
