package contest160;

import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		//3文字目と4文字目が等しいかチェック
		if(str.charAt(2) == str.charAt(3)) {
			//5文字目と6文字目が等しいかチェック
			if(str.charAt(4) == str.charAt(5)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else {
			System.out.println("No");
		}
	}
}
