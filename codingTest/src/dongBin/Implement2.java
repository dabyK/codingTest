package dongBin;

import java.util.*;
import java.io.*;

public class Implement2 {
	public static void main(String[] args) throws Exception{
		//4�� ����
		//�ð�
		//00�� 00�� 00�ʺ��� N�� 59�� 59�ʱ��� ��� �ð����� 3�� �ϳ��� ���ԵǴ� ��� ����� �� ���ϱ�
		int result = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int hour = Integer.parseInt(br.readLine());
		
		//��� 1. 3�� �ݺ��� �ȿ��� ����
		for(int i = 0; i <= hour; i++) {
			for(int j = 0; j < 60; j++) {
				for(int k = 0; k < 60; k++) {
					if( i % 10 == 3 || j % 10 == 3 || j / 10 == 3 || k % 10 == 3 || k / 10 == 3 ) {
						result++; 
					}
				}
			}
		}
		
		System.out.println(result);
		
	}
	
	//��� 2. �Լ� �����
//	public static boolean check(int i, int j, int k) {
//		if( i % 10 == 3 || j % 10 == 3 || j / 10 == 3 || k % 10 == 3 || k / 10 == 3) {
//			return true;
//		}
//		return false;
//	}
}
