package contest001;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = Integer.parseInt(sc.next());
		sc.close();
		if(m < 100) {
			System.out.println("00");
			return;
		}else if(100 <= m & m <= 5000) {
			if(m < 1000) {
				System.out.println("0" + String.valueOf(m / 100));
			}else {
				System.out.println(String.valueOf(m / 100));
			}
			return;
		}else if(6000 <= m & m <= 30000) {
			System.out.println(m / 1000 + 50);
			return;
		}else if(35000 <= m & m <= 70000) {
			System.out.println((m / 1000 - 30) / 5 + 80);
			return;
		}else if(70000 < m){
			System.out.println(89);
			return;
		}
	}

}
