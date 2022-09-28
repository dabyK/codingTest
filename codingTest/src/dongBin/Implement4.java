package dongBin;

import java.util.*;
import java.io.*;

public class Implement4 {
	//�� �̸� ����
	public static int[][] map = new int[50][50];
	
	//�湮 ���� ����� ���� �� ����
	public static int[][] visit = new int[50][50];
	
	// ��, ��, ��, �� ���� ����
    public static int dx[] = {-1, 0, 1, 0};
    public static int dy[] = {0, 1, 0, -1};
    
	public static void main(String[] args) throws Exception{
		//4�� ����
		//���Ӱ���
		//n*m�� ���簢�� ��, ��ǥ�� (A,B) A�� �������κ��� ĭ�� ����, B�� �������κ��� ĭ�� ����
		//ĳ���ʹ� �������� �� �� ������ �ٶ󺻴�.
		//�� ĭ�� ���� �Ǵ� �ٴ��̸� ĳ���ʹ� �ٴٿ� �� �� ����
		//ĳ������ ���ʹ������ üũ�Ѵ�.
		//���� ���⿡ ������ ���� ĭ�� �ִٸ� �������� ��ĭ ���� , ������ �ʾҴٸ� �������� ȸ�� �� �ٽ� üũ
		//�� ���� ��� ���ðų� �ٴٶ�� �ٶ󺸴� ĭ�� ������ ä �� ĭ �ڷ� �̵�, �ڰ� �ٴٶ�� ����
		//���� 0 �ٴ� 1 //����    �� 0 �� 1 �� 2 �� 3
		
		
		int result = 1; //ĳ���Ͱ� ó�� �湮�� ĭ���� ���Ƿ� 1�� �����ϱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//1. �� ũ�� �ޱ�
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		
		//2. ĳ���� ��ġ �ޱ�
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st2.nextToken()); //x
		int b = Integer.parseInt(st2.nextToken()); //y
		int d = Integer.parseInt(st2.nextToken()); //����
		//ĳ���� ��ġ ����
		visit[a][b] = 1;
		
		//3. �� �����
		for (int i = 0; i < n; i++) {
			String[] arr = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(arr[j]);
			}
		}
		
		//4. �ùķ��̼� ����
		
		int turn = 0; //ȸ�� Ƚ��
		while(true) {
			//4-1. �� ��ġ���� �������� ���� ������
			//����    �� 0 �� 1 �� 2 �� 3
			d -= 1;
	        if (d == -1) d = 3;
	        turn++;
	        
	        //4-2. �� �� �ִٸ� �� ĭ ������ ���� == ���� && ������������
	        int tmpx = a + dx[d];
	        int tmpy = b + dy[d];
	        if (map[tmpx][tmpy] == 0 && visit[tmpx][tmpy] == 0) {
	        	a = tmpx;
	        	b = tmpy;
	        	visit[a][b] = 1;
	        	result ++;
	        	turn = 0;
	        } else {
	        	//4-3. ���� ���Ѵٸ� 4���� �� �������� Ȯ��
	        	if(turn == 4) {
	        		//4���� �� �����ٸ� �ڷ� �� �� �ִ��� Ȯ��
	        		tmpx = a - dx[d];
	        		tmpy = b - dy[d];
	        		
	        		if(map[tmpx][tmpy] != 1) {
	        			//4-3-1. �ڷ� �� �� �ִٸ� �̵� == �ٴٰ� �ƴ϶��
	        			a = tmpx;
	        			b = tmpy;
	        		} else {
	        			//4-3-2. �ڰ� �ٴٶ�� ����
	        			break;
	        		}
	        		turn = 0;
	        	}
	        }
		}
		
		System.out.println(result);
		
	}
}
