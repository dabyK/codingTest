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
	
	// �̵��� �� ���� ���� ���� (��, ��, ��, ��) 
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
	
	public static void main(String[] args) throws Exception{
		//5�� DFS/BFS
		//�̷� Ż��
		//N*M�� ���簢�� �̷ο��� ������ ���� Ż���ϱ�
		//������ �ִ� ���� 0, ���� ���� 1
		//Ż���ϱ����� ���������ϴ� �ּ� ĭ�� ����
		
		//�׷����� 0101 ���·� �־����� ������, ������ ������ ���Ŀ� ������ ���� �ݿ���Ų��.(���ڴ� ���� ����� ���ڶ� ���Ͽ� �ݿ�)
		//�׷��� �Ǹ� �� ��忡�� �ΰ��� ���� ����Ǵ���, �� ���� ��ΰ� ������ ���ڰ� ������� �ʴ´�.
		//110	>120
		//101	>201
		//111	>345
		//�� �Ǵ� ��
		//��� ��带 ���ļ� ��θ� ǥ���ϰ� �ȴ�.(������ ����� ���� �����ϸ� Ǯ�� ����)
		int result = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		//�׷��� �����ϱ�
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
            Node node = q.poll(); //ť���� ��带 ������.
            x = node.getX();
            y = node.getY();
            // ���� ��ġ���� 4���� ���������� ��ġ�� Ȯ���Ѵ�.
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // �̷� ã�� ������ ��� ��� ����
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                
                // ������ �ִ� ��� ����
                if (graph[nx][ny] == 0) continue;
                
                // �ش� ��带 ó�� �湮�ϴ� ��쿡�� �ִ� �Ÿ� ���
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    q.offer(new Node(nx, ny)); //ť�� �ش� ��� �߰�(���� ��θ� ã�� ����) > ������ �ִ� ���� �ƿ� Ž���� ���� �ʰ� ��
                } 
            } 
        }
        // ���� ������ �Ʒ������� �ִ� �Ÿ� ��ȯ
        return graph[n - 1][m - 1];
		
	}
}
