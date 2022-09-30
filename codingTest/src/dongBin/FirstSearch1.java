package dongBin;

import java.util.*;
import java.io.*;

public class FirstSearch1 {
	public static int n, m;
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	public static void main(String[] args) throws Exception{
		//5장 DFS/BFS
		//음료수 얼려먹기
		//N*M크기의 얼음틀 에 구멍이 뚫린 부분은 0, 칸막이가 존재하는 부분은 1
		//구멍뚫린 것끼리는 서로 연결되어 하나의 얼음을 생성
		//총 몇개의 얼음이 만들어 지는지
		int result = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		//그래프 생성하기
		for(int i = 0; i < n; i++) {
			graph.add(new ArrayList<Integer>());
			String[] tmp = br.readLine().split("");
			for(int j = 0; j < m; j++) {
				graph.get(i).add(Integer.parseInt(tmp[j]));
			}
		}
		
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //각 노드들에 대해서 DFS 수행하기
                if (dfs(i, j)) {
                    result += 1;
                }
            }
        }
		
		System.out.println(result);
		
		
	}
	
	public static boolean dfs(int x, int y) {
		//시작노드로부터 주변노드까지 0인 노드들을 모두 방문처리하고 한 덩어리로 생각하여 true 반환해주기
		//재귀함수를 이용하여 모두 방문처리를 한 로직으로 처리하기 때문에 한덩어리 true 반환이 가능해짐
		//방문처리를 1로 해주면 막힌 처리와 함께 처리 가능
		
		//그래프 크기를 벗어났다면 종료
		if (x < 0 || x >=n || y < 0 || y >= m) {
            return false;
        }
		
		if(graph.get(x).get(y) == 0) {
			//현재노드가 0인 상태라면(=방문x, 뚫린 틀) 해당 노드 방문 처리
			graph.get(x).set(y,1);
			//주변 노드 탐색(상하좌우)
			//0일 경우 방문처리하고 재귀적 과정을 통해 주변 노드 계속 탐색하게 됨. 그러나 덩어리 취급은 main에서 한번만 해주므로 중복하여 세어지지는 않음
			dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
		}
		
		return false;
	}
}
