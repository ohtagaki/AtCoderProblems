package contest002;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String W = sc.next();
		StringBuffer sb = new StringBuffer();
		sc.close();

		for(int i = 0; i < W.length(); i++) {
			if(W.charAt(i) != 'a' & W.charAt(i) != 'i' & W.charAt(i) != 'u' & W.charAt(i) != 'e' &W.charAt(i) != 'o') {
				sb.append(W.charAt(i));
			}else {
				continue;
			}
		}
		System.out.println(sb.toString());
	}

}
