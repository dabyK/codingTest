package dongBin;

import java.util.*;
import java.io.*;

public class Implement3 {
	public static void main(String[] args) throws Exception{
		//4�� ����
		//�ս��� ����Ʈ
		
		//8*8�� ü���� ���� ����Ʈ�� �� �ִ�. ����Ʈ�� ������ ���� ������� �̵��Ѵ�.
		//�������� ��ĭ �̵� �� ���� ��ĭ �̵� || �������� ��ĭ �̵� �� �������� ��ĭ �̵�
		//����Ʈ�� ��ġ�� �־����� ��, ����Ʈ�� �̵��� �� �ִ� ����� �� ���ϱ�
		
		//�������� -2, +2 > ���� +1, -1
		//�������� +2, -2 > ���� +1, -1
		//a 97 ~ h 104 
		int result = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String location = br.readLine();
		
		//��ǥ�� ����ȭ
		int x = location.charAt(0) - 96;
		int y = location.charAt(1) - '0';
		result += check(x, y);
		result += check(y, x);
		
		System.out.println(result);
		
	}
	
	public static int check(int a, int b) {
		int result = 0;
		int[] first = {+2, -2};
		int[] second = {+1, -1};
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				a = a + first[i];
				b = b + second[j];
				if( a < 9 && a > 0 && b < 9 && b > 0) result++;
			}
		}
		
		return result;
	}
	
	
	//�Ǵٸ�Ǯ�� > 8���� ����� ���� ���� �迭�� ���� ����
	//�ݺ����� �ѹ��� ���� �ȴٴ� ������ ����
	
	// ����Ʈ�� �̵��� �� �ִ� 8���� ���� ����
//    int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
//    int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
//
//    // 8���� ���⿡ ���Ͽ� �� ��ġ�� �̵��� �������� Ȯ��
//    int result = 0;
//    for (int i = 0; i < 8; i++) {
//        // �̵��ϰ��� �ϴ� ��ġ Ȯ��
//        int nextRow = row + dx[i];
//        int nextColumn = column + dy[i];
//        // �ش� ��ġ�� �̵��� �����ϴٸ� ī��Ʈ ����
//        if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
//            result += 1;
//        }
//    }
}
