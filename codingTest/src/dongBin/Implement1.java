package dongBin;

import java.util.*;
import java.io.*;

public class Implement1 {
	public static void main(String[] args) throws Exception{
		//4�� ����
		//�����¿�
		//N*N ũ���� ���簢�� ��ǥ �� �����¿� �̵�
		//��ȹ���� ���� �̵�
		//L ���� R ������ U �� D �Ʒ�
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int x = 1;
		int y = 1;
		
		String[] arr = br.readLine().split(" ");
		for (int i = 0; i < arr.length; i++) {
			switch(arr[i]) {
			case "L" : y = (y - 1 > 0) ?  y - 1 : y; break;
			case "R" : y = (y + 1 <= n) ? y + 1 : y; break;
			case "U" : x = (x - 1 > 0) ? x - 1 : x; break;
			case "D" : x = (x + 1 <= n) ? x + 1 : x; break;
			default : break;
			}
		}
		
		System.out.println(x + " " + y);
		
		//�Ǵٸ�Ǯ��
		// L, R, U, D�� ���� �̵� ���� 
//        int[] dx = {0, 0, -1, 1};
//        int[] dy = {-1, 1, 0, 0};
//        char[] moveTypes = {'L', 'R', 'U', 'D'};
//
//        // �̵� ��ȹ�� �ϳ��� Ȯ��
//        for (int i = 0; i < plans.length; i++) {
//            char plan = plans[i].charAt(0);
//            // �̵� �� ��ǥ ���ϱ� 
//            int nx = -1, ny = -1;
//            for (int j = 0; j < 4; j++) {
//                if (plan == moveTypes[j]) {
//                    nx = x + dx[j]; //x ��ǥ �̵�
//                    ny = y + dy[j]; //y ��ǥ �̵�
//                }
//            }
//            // ������ ����� ��� ���� 
//            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
//            // �̵� ���� 
//            x = nx;
//            y = ny;
//        }
		
		
	}
	
}
