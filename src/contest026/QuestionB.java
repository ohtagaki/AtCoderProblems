package contest026;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		//降順にソート
		Collections.sort(list, Collections.reverseOrder());
		double num = 0;
		for(int i = 0; i < list.size(); i++) {
			if(i % 2 == 0) {
				num += Math.pow(list.get(i), 2);
			}else {
				num -= Math.pow(list.get(i), 2);
			}
		}
		double ans = num * Math.PI;
		System.out.println(ans);
	}

}
