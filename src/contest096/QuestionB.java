package contest096;

import java.util.Scanner;

public class QuestionB {

	/*
	よく考えてみると, この方法では操作で選ぶのはすべて 1 つの整数に限られます.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		sc.close();

		//一番大きい数を 2 倍することを K 回繰り返す
		for(int i = 1; i <= K; i++) {
			int tmp = Math.max(Math.max(A, B), C);
			if(tmp == A) {
				A *= 2;
			}else if(tmp == B) {
				B *= 2;
			}else {
				C *= 2;
			}
		}
		int sum = A + B + C;
		System.out.println(sum);
	}

}
