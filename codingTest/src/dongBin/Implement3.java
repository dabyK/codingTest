package dongBin;

import java.util.*;
import java.io.*;

public class Implement3 {
	public static void main(String[] args) throws Exception{
		//4장 구현
		//왕실의 나이트
		
		//8*8의 체스판 위에 나이트가 서 있다. 나이트는 다음과 같은 방식으로 이동한다.
		//수평으로 두칸 이동 후 수직 한칸 이동 || 수직으로 두칸 이동 후 수평으로 한칸 이동
		//나이트의 위치가 주어졌을 때, 나이트가 이동할 수 있는 경우의 수 구하기
		
		//수평으로 -2, +2 > 수직 +1, -1
		//수직으로 +2, -2 > 수평 +1, -1
		//a 97 ~ h 104 
		int result = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String location = br.readLine();
		
		//좌표의 숫자화
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
	
	
	//또다른풀이 > 8가지 경우의 수에 대한 배열을 전부 생성
	//반복문을 한번만 돌면 된다는 장점이 있음
	
	// 나이트가 이동할 수 있는 8가지 방향 정의
//    int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
//    int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
//
//    // 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
//    int result = 0;
//    for (int i = 0; i < 8; i++) {
//        // 이동하고자 하는 위치 확인
//        int nextRow = row + dx[i];
//        int nextColumn = column + dy[i];
//        // 해당 위치로 이동이 가능하다면 카운트 증가
//        if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
//            result += 1;
//        }
//    }
}
