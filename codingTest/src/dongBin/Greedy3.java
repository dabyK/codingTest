package dongBin;

import java.io.*;
import java.util.*;

public class Greedy3 {
	public static void main(String[] args) throws Exception{
		//3�� �׸���
		//1�� �� ������
		// n-1, n/k �� �ݺ������� �����Ͽ� n�� 1�� �Ǵ� ������ �ּ� Ƚ�� ���ϱ�
		// n/k�� ��������� ���� ����
		int result = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
//		//n�� k�� �������ٸ� ������, �ƴ϶�� 1 ����
//		while(n > 1) {
//			if (n % k == 0) {
//				n /= k;
//			} else {
//				n -= 1;
//			}
//			result++;
//		}
//		
//		System.out.println(result);
		
		//�׷��� ���ڰ� Ŀ���� �̷��� ����� ��ȿ�����̸� ������ ������ �� �� ����.
		//n�� k�� ������ �������� ���� �� ������, 1�� ���� �� �� �����⸦ �����ϱ�
		while (true) {
            // n�� k�� ������ �������� ���� �� �������� 1�� ����
			// > n - ����������� ���� ū �� �� �ϸ� 1�� �� �� ������ Ȯ�� ����
            int target = (n / k) * k;
            result += (n - target);
            n = target;
            // N�� K���� ���� �� (�� �̻� ���� �� ���� ��) �ݺ��� Ż��
            if (n < k) break;
            // K�� ������
            result += 1;
            n /= k;
        }
		
		// ���������� ���� ���� ���Ͽ� 1�� ����
        result += (n - 1);
        System.out.println(result);
	}
}
