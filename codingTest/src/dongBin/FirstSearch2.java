package dongBin;

import java.util.*;
import java.io.*;

class Node {

    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
}

public class FirstSearch2 {
	public static int n,m;
	public static int[][] graph = new int[201][201];
	
	// 이동할 네 가지 방향 정의 (상, 하, 좌, 우) 
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
	
	public static void main(String[] args) throws Exception{
		//5장 DFS/BFS
		//미로 탈출
		//N*M의 직사각형 미로에서 괴물을 피해 탈출하기
		//괴물이 있는 곳은 0, 없는 곳은 1
		//탈출하기위해 움직여야하는 최소 칸의 개수
		
		//그래프가 0101 형태로 주어지기 때문에, 마지막 노드까지 거쳐온 갯수를 값에 반영시킨다.(숫자는 이전 노드의 숫자랑 비교하여 반영)
		//그렇게 되면 한 노드에서 두개의 노드로 연결되더라도, 그 다음 경로가 없으면 숫자가 변경되지 않는다.
		//110	>120
		//101	>201
		//111	>345
		//가 되는 셈
		//모든 노드를 거쳐서 경로를 표현하게 된다.(마지막 노드의 값만 추출하면 풀이 가능)
		int result = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		//그래프 생성하기
		for(int i = 0; i < n; i++) {
			String[] tmp = br.readLine().split("");
			for(int j = 0; j < m; j++) {
				graph[i][j] = Integer.parseInt(tmp[j]);
			}
		}
	}
	
	public static int bfs(int x, int y) {
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x, y));
		
        while(!q.isEmpty()) {
            Node node = q.poll(); //큐에서 노드를 꺼낸다.
            x = node.getX();
            y = node.getY();
            // 현재 위치에서 4가지 방향으로의 위치를 확인한다.
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 미로 찾기 공간을 벗어난 경우 무시
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                
                // 괴물이 있는 경우 무시
                if (graph[nx][ny] == 0) continue;
                
                // 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    q.offer(new Node(nx, ny)); //큐에 해당 노드 추가(다음 경로를 찾기 위해) > 괴물이 있는 노드는 아예 탐색도 하지 않게 됨
                } 
            } 
        }
        // 가장 오른쪽 아래까지의 최단 거리 반환
        return graph[n - 1][m - 1];
		
	}
}
