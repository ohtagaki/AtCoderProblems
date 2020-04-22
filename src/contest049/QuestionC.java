package contest049;

import java.util.Scanner;

public class QuestionC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        int i = 0;
        StringBuffer st = new StringBuffer(s);
        String str = st.reverse().toString();
        boolean jugde = true;
        while(jugde) {
        	if(i == s.length()) {
        		break;
        	}else {
        		if(str.substring(i, i + 5).equals("esare") || str.substring(i, i + 5).equals("maerd")) {
            		i += 5;
            		continue;
        		}else if(str.substring(i, i + 6).equals("resare")) {
            		i += 6;
            		continue;
            	}else if(str.substring(i, i + 7).equals("remaerd")) {
            		i += 7;
            		continue;
            	}else {
            		jugde = false;
            		break;
            	}
        	}
        }

        if(jugde) {
        	System.out.println("YES");
        }else {
        	System.out.println("NO");
        }

	}

}
