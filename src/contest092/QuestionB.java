package contest092;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		//正の整数同士の除算の際はあまりが切り捨てられることに注意
		int count = X;
		for(int i = 0; i < list.size(); i++) {
			int cookie = 0;
			if(D % list.get(i) != 0) {
				cookie = D / list.get(i) + 1;
			}else {
				cookie = D / list.get(i);
			}
			count += cookie;
		}
		System.out.println(count);

	}

}
