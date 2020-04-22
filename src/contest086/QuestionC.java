package contest086;

import java.util.Scanner;

public class QuestionC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] t = new int[N + 1];
		int[] x = new int[N + 1];
		int[] y = new int[N + 1];
		t[0] = x[0] = y[0] = 0;
		for(int i = 0; i < N; i++) {
			t[i + 1] = Integer.parseInt(sc.next());
			x[i + 1] = Integer.parseInt(sc.next());
			y[i + 1] = Integer.parseInt(sc.next());
		}
		sc.close();
		boolean check = true;
		for(int i = 0; i < N; i++) {
			int time = t[i + 1] - t[i];
			int distance = Math.abs(x[i + 1] - x[i]) + Math.abs(y[i + 1] - y[i]);
			if(distance > time) {
				check = false;
			}
			//式の意味不明
			if(((distance^time)&1)==1) {
				check = false;
			}
		}
		if(check) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
	}
}
