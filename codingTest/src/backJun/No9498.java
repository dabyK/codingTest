package backJun;

import java.util.Scanner;

public class No9498 {
	public static void main(String[] args) {
		
//		<����>
//		���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String result="";
		if(90<=n) {
			result="A";
		}else if(80<=n) {
			result="B";
		}else if(70<=n) {
			result="C";
		}else if(60<=n){
			result="D";
		}else {
			result="F";
		}
		System.out.println(result);
	}
}
