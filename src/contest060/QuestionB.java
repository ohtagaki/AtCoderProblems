package contest060;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		sc.close();


		/*
		 * 方針
		(k + B)A%B = (kA + BA)%B = kA%B に注目すると、
		この数列は周期的で、最初の B 個の要素を繰り返す数列になっている。
		よって、この問題は A から BA まで、愚直に B で割った余りを求めて調べれば良い
		*/

		int rest = A % B;
		boolean check = false;
		for(int i = 1; i <= B; i++) {
			int tmp = rest * i;
			if(tmp % B == C) {
				check = true;
				break;
			}else {
				continue;
			}
		}
		if(check) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
