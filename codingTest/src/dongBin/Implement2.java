package dongBin;

import java.util.*;
import java.io.*;

public class Implement2 {
	public static void main(String[] args) throws Exception{
		//4장 구현
		//시각
		//00시 00분 00초부터 N시 59분 59초까지 모든 시각에서 3이 하나라도 포함되는 모든 경우의 수 구하기
		int result = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int hour = Integer.parseInt(br.readLine());
		
		//방법 1. 3중 반복문 안에서 세기
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
	
	//방법 2. 함수 만들기
//	public static boolean check(int i, int j, int k) {
//		if( i % 10 == 3 || j % 10 == 3 || j / 10 == 3 || k % 10 == 3 || k / 10 == 3) {
//			return true;
//		}
//		return false;
//	}
}
