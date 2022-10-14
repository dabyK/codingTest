package backJun;

import java.io.*;

public class No1769 {
	public static int cnt = 0;
	public static void main(String[] args) throws Exception{
		//น้มุ 1769น๘ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		
		easier(num);
		
	}
	
	public static void easier(String str) {
		if (str.length() < 2) {
			if ( Integer.parseInt(str) % 3 == 0) {
				System.out.println(cnt);
				System.out.println("YES");
				return;
			} else {
				System.out.println(cnt);
				System.out.println("NO");
				return;
			}
		}
		cnt++;
		int y = 0;
		 for(int i = 0; i < str.length(); i++) {
            y += str.charAt(i) - '0';
        }

		
		easier(String.valueOf(y));
	}
}
