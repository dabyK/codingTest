package backJun;

import java.util.Scanner;

public class No2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		<����>
//		9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		���� ���, ���� �ٸ� 9���� �ڿ���
//		3, 29, 38, 12, 57, 74, 40, 85, 61
//		�� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.
		int[] arr=new int[9];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<9;i++) {
			arr[i]=sc.nextInt();
		}
		int a=arr[0], b=1;
		for(int i=1;i<9;i++) {
			if(arr[i]>a) {
				a=arr[i];
				b=i+1;
			}
		}
		System.out.println(a);
		System.out.println(b);
	}

}
