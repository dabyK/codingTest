package dongBin;

public class Recursive {
	public static void main(String[] args) {
		//5장 DFS / BFS
		//재귀함수 이해하기
		//팩토리얼 구현하기
		System.out.println(factorial(5));
		
	}
	
	public static int factorial(int n) {
		if (n <= 1) return 1;
		return n * factorial(n-1);
	}
}
