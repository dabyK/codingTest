package backJun;

import java.util.Scanner;

public class No2439 {
	public static void main(String[] args) {
//		<����>
//		ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
//		     *
//		    **
//		   ***
//		  ****
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			//Ǯ��1
//			for(int j=i+1;j<N;j++) { 
//				System.out.print(" ");
//			}
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
			
			//Ǯ��2
			for(int j=N-1;j>=0;j--) {//3210
				System.out.print(i<j?" ":"*");
			}
			System.out.println();
		}

	}

	

}
