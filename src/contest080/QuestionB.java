package contest080;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		int sum = 0;
		int check = N;
		//自然数の各桁の和を計算
		while(N != 0) {
			//再右端の桁を得るために%10を利用する。
			sum += N % 10;
			//再右端の桁を取り除くためにn/=10を利用する。
			N /= 10;
		}

		if(check % sum == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
