package contest029;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < 12; i++) {
			list.add(sc.next());
		}
		sc.close();

		int count = 0;
		//リストの各要素に'r'が含まれるかどうか確認
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).contains("r")) {
				count++;
			}else {
				continue;
			}
		}
		System.out.println(count);
	}

}
