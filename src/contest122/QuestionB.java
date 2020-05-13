package contest122;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();


		int count = 0;
		for(int i = 0; i <= S.length(); i++) {
			int tmpCount = 0;
			for(int j = i + 1; j <= S.length(); j++) {
				//文字列を抽出
				String tmp = S.substring(i, j);
				//抽出した文字列の末尾がACGTのうちのいずれかどうかチェック
				int num = tmp.length() - 1;
				if(tmp.substring(num).equals("A") || tmp.substring(num).equals("C") || tmp.substring(num).equals("G") || tmp.substring(num).equals("T")) {
					tmpCount++;
				}else {
					break;
				}
			}
			if(count < tmpCount) count = tmpCount;
		}

		System.out.println(count);
	}
}
