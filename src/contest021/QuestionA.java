package contest021;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		int count = 0;
		ArrayList<Integer> list = new ArrayList<>();

		int M =  N;

		if(N % 2 != 0) {
			count++;
			M -= 1;
		}

		while(M != 0) {
			M -= 2;
			list.add(2);
			count++;
		}

		System.out.println(count);
		if( N % 2 == 1) {
			System.out.println(1);
		}
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
	    }

	}
}
