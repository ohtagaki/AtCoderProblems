package contest025;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		ArrayList<String> listS = new ArrayList<String>();
		ArrayList<Integer> listD = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			listS.add(sc.next());
			listD.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		int distance = 0;
		for(int i = 0; i < N; i++) {
			if(listS.get(i).equals("East")) {
				if(listD.get(i) < A) {
					distance += A;
				}else if(A <= listD.get(i) && listD.get(i) <= B) {
					distance += listD.get(i);
				}else {
					distance += B;
				}
			}else if(listS.get(i).equals("West")){
				if(listD.get(i) < A) {
					distance -= A;
				}else if(A <= listD.get(i) && listD.get(i) <= B) {
					distance -= listD.get(i);
				}else {
					distance -= B;
				}
			}
		}
		if(distance < 0) {
			int ans = Math.abs(distance);
			System.out.println("West " + ans );
		}else if(distance == 0) {
			System.out.println(0);
		}else {
			System.out.println("East " + distance);
		}

	}

}
