package backJun;

import java.util.Scanner;

public class No10872 {

	public static void main(String[] args) {
//		<����>
//		N! �� ��͸� ���� ǥ���ϱ�
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		if(N==0) {
			System.out.println(1);
		}else {
			System.out.println(function(N));
		}
		
	}

	public static int function(int num) {
		if(num==1) {
			return 1;
		}
		return num*function(num-1);
	}
}
