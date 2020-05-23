package contest089;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		Set<String> hinaSet = new HashSet<>();
		for(int i = 0; i< N; i++) {
			hinaSet.add(sc.next());
		}
		sc.close();

		if(hinaSet.size() == 3) {
			System.out.println("Three");
		}else {
			System.out.println("Four");
		}

	}

}
