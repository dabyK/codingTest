package dongBin;

import java.util.*;
import java.io.*;

public class FirstSearch1 {
	public static int n, m;
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	public static void main(String[] args) throws Exception{
		//5�� DFS/BFS
		//����� ����Ա�
		//N*Mũ���� ����Ʋ �� ������ �ո� �κ��� 0, ĭ���̰� �����ϴ� �κ��� 1
		//���۶ո� �ͳ����� ���� ����Ǿ� �ϳ��� ������ ����
		//�� ��� ������ ����� ������
		int result = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		//�׷��� �����ϱ�
		for(int i = 0; i < n; i++) {
			graph.add(new ArrayList<Integer>());
			String[] tmp = br.readLine().split("");
			for(int j = 0; j < m; j++) {
				graph.get(i).add(Integer.parseInt(tmp[j]));
			}
		}
		
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //�� ���鿡 ���ؼ� DFS �����ϱ�
                if (dfs(i, j)) {
                    result += 1;
                }
            }
        }
		
		System.out.println(result);
		
		
	}
	
	public static boolean dfs(int x, int y) {
		//���۳��κ��� �ֺ������� 0�� ������ ��� �湮ó���ϰ� �� ����� �����Ͽ� true ��ȯ���ֱ�
		//����Լ��� �̿��Ͽ� ��� �湮ó���� �� �������� ó���ϱ� ������ �ѵ�� true ��ȯ�� ��������
		//�湮ó���� 1�� ���ָ� ���� ó���� �Բ� ó�� ����
		
		//�׷��� ũ�⸦ ����ٸ� ����
		if (x < 0 || x >=n || y < 0 || y >= m) {
            return false;
        }
		
		if(graph.get(x).get(y) == 0) {
			//�����尡 0�� ���¶��(=�湮x, �ո� Ʋ) �ش� ��� �湮 ó��
			graph.get(x).set(y,1);
			//�ֺ� ��� Ž��(�����¿�)
			//0�� ��� �湮ó���ϰ� ����� ������ ���� �ֺ� ��� ��� Ž���ϰ� ��. �׷��� ��� ����� main���� �ѹ��� ���ֹǷ� �ߺ��Ͽ� ���������� ����
			dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
		}
		
		return false;
	}
}
