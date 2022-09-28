package dongBin;

import java.util.*;
import java.io.*;

public class Implement1 {
	public static void main(String[] args) throws Exception{
		//4장 구현
		//상하좌우
		//N*N 크기의 정사각형 좌표 위 상하좌우 이동
		//계획서에 따라 이동
		//L 왼쪽 R 오른쪽 U 위 D 아래
		
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
		
		//또다른풀이
		// L, R, U, D에 따른 이동 방향 
//        int[] dx = {0, 0, -1, 1};
//        int[] dy = {-1, 1, 0, 0};
//        char[] moveTypes = {'L', 'R', 'U', 'D'};
//
//        // 이동 계획을 하나씩 확인
//        for (int i = 0; i < plans.length; i++) {
//            char plan = plans[i].charAt(0);
//            // 이동 후 좌표 구하기 
//            int nx = -1, ny = -1;
//            for (int j = 0; j < 4; j++) {
//                if (plan == moveTypes[j]) {
//                    nx = x + dx[j]; //x 좌표 이동
//                    ny = y + dy[j]; //y 좌표 이동
//                }
//            }
//            // 공간을 벗어나는 경우 무시 
//            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
//            // 이동 수행 
//            x = nx;
//            y = ny;
//        }
		
		
	}
	
}
