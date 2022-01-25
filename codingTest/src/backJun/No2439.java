package backJun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No2439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		<문제>
//		첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//		     *
//		    **
//		   ***
//		  ****
//		Scanner sc=new Scanner(System.in);
//		int N=sc.nextInt();
//		for(int i=0;i<N;i++) {
			//풀이1
//			for(int j=i+1;j<N;j++) { 
//				System.out.print(" ");
//			}
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
			
			//풀이2
//			for(int j=N-1;j>=0;j--) {//3210
//				System.out.print(i<j?" ":"*");
//			}
//			System.out.println();
//		}
		
		
		//풀이3
		//기본 스트링과 스캐너보다는 스트림과 스트링빌더를 쓰는 게 속도면에서 적합하다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    int cnt = Integer.parseInt(br.readLine());
	    StringBuilder sb = new StringBuilder();

	    for(int i=1; i<= cnt; i++){
	      for(int j= 1; j <= cnt; j++){
	        bw.write(j<=(cnt-i)?" ":"*");
	      }
	      bw.write("\n");
	    }
	    bw.flush();
	    bw.close();

	}

	

}
