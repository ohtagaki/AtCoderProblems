package contest151;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionB {
	/*
	「N 科目の平均点が M 点以上」というのは、「N 科目の合計点が N ∗ M 点以上」と同じです。
	よって、最後のテストで は N ∗ M − (A1 + . . . + AN−1) 点以上を取れば目標を達成できます。
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;
		for(int i = 0; i < N - 1; i++) {
			list.add(Integer.parseInt(sc.next()));
			sum += list.get(i);
		}
		sc.close();

		int border = N * M;
		if(border - sum <= K) {
			int ans = border - sum;
			if(ans < 0) {
				System.out.println(0);
			}else {
				System.out.println(ans);
			}
		}else {
			System.out.println(-1);
		}
	}

}
