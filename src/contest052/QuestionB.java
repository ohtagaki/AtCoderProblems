package contest052;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		sc.close();

		/*
		整数 ans = 0 を用意して、x の値を変更する度に ans と x の max を ans に代入すると答えが求まります
		*/
		int max = 0;
		int tmp = 0;
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == 'I') {
				tmp++;
			}else if(S.charAt(i) == 'D') {
				tmp--;
			}
			max = Math.max(max, tmp);
		}
		System.out.println(max);
	}

}
