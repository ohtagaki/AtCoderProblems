package contest043;

import java.util.Scanner;

public class QuestionB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		 StringBuilder sb = new StringBuilder();
		for(int i = 0; i < S.length(); i++) {
			if(S.substring(i, i + 1).equals("0")) {
				sb.append("0");
			}else if(S.substring(i, i + 1).equals("1")) {
				sb.append("1");
			}else {
				if(sb.length() != 0) {
					//文字列の末尾1文字を削除
					sb.setLength(sb.length()-1);
				}
			}
		}
		System.out.println(sb.toString());
	}
}
