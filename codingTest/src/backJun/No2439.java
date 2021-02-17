package backJun;

import java.util.Scanner;

public class No2439 {
	public static void main(String[] args) {
//		<문제>
//		첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//		     *
//		    **
//		   ***
//		  ****
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			//풀이1
//			for(int j=i+1;j<N;j++) { 
//				System.out.print(" ");
//			}
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
			
			//풀이2
			for(int j=N-1;j>=0;j--) {//3210
				System.out.print(i<j?" ":"*");
			}
			System.out.println();
		}

	}

	

}
