package dongBin;

import java.io.*;
import java.util.*;


public class Greedy2 {
	public static void main(String[] args) throws Exception{
		//3장 그리디
		//숫자카드게임
		//N행 M열 
		//각 행마다 가장 낮은 숫자를 선택할 때, 가장 높은 숫자를 고르기
		
		int result = 0;
		//1. 값 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		//2. 비교하기
		for (int i = 0; i < n; i++) {
			int min = 10001;
			String[] arr = br.readLine().split(" ");
			
			for (int j = 0; j < m; j++) {
				//2-1. 각 행의 최소값 구하기
				int check = Integer.parseInt(arr[j]);
				if (check < min) {
					min = check;
				}
			}
			
			//최소값 중 최대값 구하기
			result = result > min ? result : min;
		}
		
		System.out.println(result);
		
	}
	
	
}
