package contest085;

import java.util.Scanner;

public class QuestionC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		sc.close();

		int a = 0;
		double b = 0;
		double c = 0;
		int y = Y / 1000;
		int va = y - N;
		int count = 0;
		int value = va / 9 + 1;
		for(int i = 0; i < value; i++) {
			a = i;
			b = (va - 9 * a) / 4;
			//正の整数であるか判定
			if(b == Math.floor(b) && b >= 0) {
				c = y - 5 * b - 10 * a;
				//正の整数であるか判定
				if(c == Math.floor(c) && c >= 0) {
					//合計N枚であるかチェック
					if(a + b + c == N) {
						count++;
						break;
					}
				}
			}
		}
		if(count == 0) {
			System.out.println(-1 + " " + -1 + " " + -1);
		}else {
			System.out.println(a + " " + (int)Math.floor(b) + " " + (int)Math.floor(c));
		}
	}
}
