package dongBin;

import java.io.*;
import java.util.*;


public class Greedy2 {
	public static void main(String[] args) throws Exception{
		//3�� �׸���
		//����ī�����
		//N�� M�� 
		//�� �ึ�� ���� ���� ���ڸ� ������ ��, ���� ���� ���ڸ� ����
		
		int result = 0;
		//1. �� �Է¹ޱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		//2. ���ϱ�
		for (int i = 0; i < n; i++) {
			int min = 10001;
			String[] arr = br.readLine().split(" ");
			
			for (int j = 0; j < m; j++) {
				//2-1. �� ���� �ּҰ� ���ϱ�
				int check = Integer.parseInt(arr[j]);
				if (check < min) {
					min = check;
				}
			}
			
			//�ּҰ� �� �ִ밪 ���ϱ�
			result = result > min ? result : min;
		}
		
		System.out.print(result);
		
		//�� �ٸ� ���
//        for (int i = 0; i < n; i++) {
//            // ���� �ٿ��� '���� ���� ��' ã��
//            int min_value = 10001;
//            for (int j = 0; j < m; j++) {
//                int x = sc.nextInt();
//                min_value = Math.min(min_value, x);
//            }
//            // '���� ���� ��'�� �߿��� ���� ū �� ã��
//            result = Math.max(result, min_value);
//        }
    
	}
	
	
}
