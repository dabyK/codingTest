package dongBin;

public class Recursive {
	public static void main(String[] args) {
		//5�� DFS / BFS
		//����Լ� �����ϱ�
		//���丮�� �����ϱ�
		System.out.println(factorial(5));
		
	}
	
	public static int factorial(int n) {
		if (n <= 1) return 1;
		return n * factorial(n-1);
	}
}
