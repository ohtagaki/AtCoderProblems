package contest146;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		sc.close();
		String ans = "";
		for(int i=0; i< S.length(); i++){
			//元の文字が何番目かを求めて、Nを足す
			//その数字を26で割る
			int count = (S.charAt(i)-'A' + N) % 26;
			//文字を追加
			ans = ans + String.valueOf((char)('A' + count));
		}

		System.out.println(ans);

	}

}
