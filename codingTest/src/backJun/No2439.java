package backJun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No2439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		<����>
//		ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
//		     *
//		    **
//		   ***
//		  ****
//		Scanner sc=new Scanner(System.in);
//		int N=sc.nextInt();
//		for(int i=0;i<N;i++) {
			//Ǯ��1
//			for(int j=i+1;j<N;j++) { 
//				System.out.print(" ");
//			}
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
			
			//Ǯ��2
//			for(int j=N-1;j>=0;j--) {//3210
//				System.out.print(i<j?" ":"*");
//			}
//			System.out.println();
//		}
		
		
		//Ǯ��3
		//�⺻ ��Ʈ���� ��ĳ�ʺ��ٴ� ��Ʈ���� ��Ʈ�������� ���� �� �ӵ��鿡�� �����ϴ�.
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
