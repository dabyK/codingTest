package dongBin;

import java.io.*;
import java.util.*;

public class Page92 {
	public static void main(String[] args) throws Exception{
		//3�� �׸���
		//ū ���� ��Ģ
		//�迭�� ũ�� N, ���ڰ� �������� Ƚ�� M, ��Ģ �� K
		//Ư�� �ε����� ���ڴ� K������ ������ �� �ִ�. 	
		int result = 0;
		
		//ù°�� n m k / ��°�� �迭
		//�� �Է¹ޱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	    int n = Integer.parseInt(st.nextToken());
	    int m = Integer.parseInt(st.nextToken());
	    int k = Integer.parseInt(st.nextToken());
	    
	    int[] arr = new int[n];
	    StringTokenizer arrSt = new StringTokenizer(br.readLine());
	    for( int i = 0; i < n; i++ ) {
	    	arr[i] = Integer.parseInt(arrSt.nextToken());
	    }
	    
	    //�迭 �����ϱ�
	    Arrays.sort(arr);
	    int first  = arr[n - 1]; //���� ū ��
	    int second = arr[n - 2]; //���� ���� ��
	    
	    int cnt = 0;
	    for( int i = 0; i < m; i++ ) {
	    	if(cnt == k) { //k����ŭ �������ٸ�, �ι�°�� ū �� ���ϰ� ����
	    		result += second;
	    		cnt = 0;
	    	} else { //���� ū �� �����ֱ�
	    		result += first;
	    		cnt++;
	    	}
	    }
	    System.out.println(result);
	    
	    
	    //������
//	    // ���� ū ���� �������� Ƚ�� ���
//        int cnt = (m / (k + 1)) * k;
//        cnt += m % (k + 1);
//
//        int result = 0;
//        result += cnt * first; // ���� ū �� ���ϱ�
//        result += (m - cnt) * second; // �� ��°�� ū �� ���ϱ�
	}
}
