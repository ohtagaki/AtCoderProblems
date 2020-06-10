package contest015;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		int sum = 0;
		int count = 0;
		for(int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(sc.next());
			if(tmp != 0) count++;
			sum += tmp;
		}
		sc.close();

		int ave = sum / count;
		if(sum % count == 0) {
			System.out.println(ave);
		}else {
			System.out.println(ave + 1);
		}
	}

}
