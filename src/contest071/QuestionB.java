package contest071;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		ArrayList<String> set = new ArrayList<>();
		for(int i = 0; i < S.length(); i++) {
			set.add(S.substring(i, i + 1));
		}

		/*
		英小文字 26 種類のそれぞれについて，S の中に現れるかを記録する配列を持っておきます．
		この配列は最初すべて「現れない」(false) で初期化しておきます．S を 1 文字目から順に見ていって，
		出てきた文字それぞれについて，配列上でその文字に対応する位置を「現れる」(true) に更新します．
		S の最後の文字まで見終わった後には，この配列を見るだけである文字が S の中に現れるかわかるようになります
		*/

		/*
		for(char c='a'; c<='z'; c++) {
            if(!s.contains(Character.toString(c))) {
                System.out.println(c);
                System.exit(0);
            }
        }
		*/

		String ans = "z";
		String check = "abcdefghijklmnopqrstuvwxyz";
		for(int i = 0; i < check.length(); i++) {
			String tmp = check.substring(i, i + 1);
			if(set.contains(tmp)) {
				if(i == check.length() - 1) {
					System.out.println("None");
					return;
				}
				continue;
			}else {
				ans = tmp;
				break;
			}
		}
		System.out.println(ans);
	}
}
