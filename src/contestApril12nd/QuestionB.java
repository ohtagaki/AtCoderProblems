package contestApril12nd;

import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();
		Long total  = 0L;
		sc.close();
		for(int i = 1; i <= N; ++i){
	            if(i % 3 == 0 && i % 5 == 0){
	            	continue;
	            }else if(i % 3 == 0){
	                continue;
	            }else if(i % 5 == 0){
	            	continue;
	            }else{
	                total += i;
	            }
	     }
		System.out.println(total);
	}
}
