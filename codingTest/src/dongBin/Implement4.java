package dongBin;

import java.util.*;
import java.io.*;

public class Implement4 {
	//맵 미리 생성
	public static int[][] map = new int[50][50];
	
	//방문 여부 기록을 위한 맵 생성
	public static int[][] visit = new int[50][50];
	
	// 북, 동, 남, 서 방향 정의
    public static int dx[] = {-1, 0, 1, 0};
    public static int dy[] = {0, 1, 0, -1};
    
	public static void main(String[] args) throws Exception{
		//4장 구현
		//게임개발
		//n*m의 직사각형 맵, 좌표는 (A,B) A는 북쪽으로부터 칸의 개수, B는 서쪽으로부터 칸의 개수
		//캐릭터는 동서남북 중 한 방향을 바라본다.
		//각 칸은 육지 또는 바다이며 캐릭터는 바다에 갈 수 없다
		//캐릭터의 왼쪽방향부터 체크한다.
		//왼쪽 방향에 가보지 않은 칸이 있다면 왼쪽으로 한칸 전진 , 가보지 않았다면 왼쪽으로 회전 후 다시 체크
		//네 방향 모두 가봤거나 바다라면 바라보는 칸을 유지한 채 한 칸 뒤로 이동, 뒤가 바다라면 종료
		//육지 0 바다 1 //방향    북 0 동 1 남 2 서 3
		
		
		int result = 1; //캐릭터가 처음 방문한 칸부터 세므로 1로 시작하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//1. 맵 크기 받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		
		//2. 캐릭터 위치 받기
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st2.nextToken()); //x
		int b = Integer.parseInt(st2.nextToken()); //y
		int d = Integer.parseInt(st2.nextToken()); //방향
		//캐릭터 위치 저장
		visit[a][b] = 1;
		
		//3. 맵 만들기
		for (int i = 0; i < n; i++) {
			String[] arr = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(arr[j]);
			}
		}
		
		//4. 시뮬레이션 시작
		
		int turn = 0; //회전 횟수
		while(true) {
			//4-1. 현 위치에서 왼쪽으로 방향 돌리기
			//방향    북 0 동 1 남 2 서 3
			d -= 1;
	        if (d == -1) d = 3;
	        turn++;
	        
	        //4-2. 갈 수 있다면 한 칸 앞으로 가기 == 육지 && 가보지않은땅
	        int tmpx = a + dx[d];
	        int tmpy = b + dy[d];
	        if (map[tmpx][tmpy] == 0 && visit[tmpx][tmpy] == 0) {
	        	a = tmpx;
	        	b = tmpy;
	        	visit[a][b] = 1;
	        	result ++;
	        	turn = 0;
	        } else {
	        	//4-3. 가지 못한다면 4방향 다 막혔는지 확인
	        	if(turn == 4) {
	        		//4방향 다 막혔다면 뒤로 갈 수 있는지 확인
	        		tmpx = a - dx[d];
	        		tmpy = b - dy[d];
	        		
	        		if(map[tmpx][tmpy] != 1) {
	        			//4-3-1. 뒤로 갈 수 있다면 이동 == 바다가 아니라면
	        			a = tmpx;
	        			b = tmpy;
	        		} else {
	        			//4-3-2. 뒤가 바다라면 종료
	        			break;
	        		}
	        		turn = 0;
	        	}
	        }
		}
		
		System.out.println(result);
		
	}
}
