package backJun;

import java.util.Scanner;

public class No9655 {

	public static void main(String[] args) {
		
//		<����>
//		�� ������ �� ���̼� ���� ��մ� �����̴�.
//		Ź�� ���� �� N���� �ִ�. ����̿� â���̴� ���� �����ư��鼭 ���� ��������, ���� 1�� �Ǵ� 3�� ������ �� �ִ�. 
//		������ ���� �������� ����� ������ �̱�� �ȴ�.
//		�� ����� �Ϻ��ϰ� ������ ���� ��, �̱�� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ������ ����̰� ���� �����Ѵ�.
//		����̰� ������ �̱�� SK��, â���̰� ������ �̱�� CY�� ����Ѵ�.
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int result=N/3;
		result+=N%3;
		System.out.println(result%2==0?"CY":"SK");
		
		//�ٵ� �׳� �־��� ���� Ȧ���� �����, ¦���� â���̰� �¸���

	}

}
