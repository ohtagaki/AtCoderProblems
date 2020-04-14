package contestApril12nd;

import java.io.IOException;
import java.util.Scanner;

public class QuestionD {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String end = sc.nextLine();
		String poland = sc.nextLine();
		sc.close();
		char[] list = new char[N];
		for(int i = 0; i < N; i++) {
			list[i] = poland.charAt(i - 1);
		}
		int count = 0;
	}
}
