package dongBin;

import java.io.*;
import java.util.*;

public class Page92 {
	public static void main(String[] args) throws Exception{
		//3장 그리디
		//큰 수의 법칙
		//배열의 크기 N, 숫자가 더해지는 횟수 M, 법칙 수 K
		//특정 인덱스의 숫자는 K번까지 더해질 수 있다. 	
		int result = 0;
		
		//첫째줄 n m k / 둘째줄 배열
		//값 입력받기
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
	    
	    //배열 정렬하기
	    Arrays.sort(arr);
	    int first  = arr[n - 1]; //가장 큰 수
	    int second = arr[n - 2]; //가장 작은 수
	    
	    int cnt = 0;
	    for( int i = 0; i < m; i++ ) {
	    	if(cnt == k) { //k번만큼 더해졌다면, 두번째로 큰 수 더하고 리셋
	    		result += second;
	    		cnt = 0;
	    	} else { //가장 큰 수 더해주기
	    		result += first;
	    		cnt++;
	    	}
	    }
	    System.out.println(result);
	    
	    
	    //모범답안
//	    // 가장 큰 수가 더해지는 횟수 계산
//        int cnt = (m / (k + 1)) * k;
//        cnt += m % (k + 1);
//
//        int result = 0;
//        result += cnt * first; // 가장 큰 수 더하기
//        result += (m - cnt) * second; // 두 번째로 큰 수 더하기
	}
}
