package pastThird;

import java.util.Scanner;

public class QuestionC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long A = Long.parseLong(sc.next());
		Long R = Long.parseLong(sc.next());
		Long N = Long.parseLong(sc.next());
		sc.close();

		long num = (long)(A * Math.floor(Math.pow(R, N -1)));
		if(num > Math.pow(10, 9)) {
			System.out.println("large");
		}else {
			System.out.println(num);
		}
	}

}
