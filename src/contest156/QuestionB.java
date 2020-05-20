package contest156;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		sc.close();
		
		/*
		 N を K で割ったときの商で置き換える、という操作を N が 0 になるまで行ったとき、
		 操作を行った回数が N を K 進数で表したときの桁数になる
		*/
		int ans = 0;
		for(int i = 0; i < Math.pow(10, 9); i++) {
			double check = Math.pow(K, i);
			int num = (int) check;
			if(N > num) {
				continue;
			}else if(N == num) {
				ans = i + 1;
				break;
			}else {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}
