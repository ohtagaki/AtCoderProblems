package contest155;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();
		boolean check = true;
		for(int i = 0; i < N; i++) {
			int num = list.get(i);
			//偶数かどうかcheck
			if(num % 2 == 0) {
				//3の倍数or5の倍数かどうかcheck
				if(num % 3 != 0 && num % 5 != 0) {
					//フラグをfalseに変更
					check = false;
					//ループ終了
					break;
				}else {
					continue;
				}
			}else {
				continue;
			}
		}
		if(check) {
			System.out.println("APPROVED");
		}else {
			System.out.println("DENIED");
		}
	}

}
