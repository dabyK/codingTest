package backJun;

import java.util.Scanner;

public class No2292 {
	public static void main(String[] args) {
//		<����>
//		���� �׸��� ���� ���������� �̷���� ������ �ִ�. 
//		�׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�. 
//		���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//		���� ���, 13������ 3��, 58������ 5���� ������.

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		int a = 1;
		for (int i = 0; i > -1; i++) {
			a = a + (i * 6);
			if (n <= a) {
				result = i + 1;
				break;
			}
		}
		System.out.println(result);
	}
}
