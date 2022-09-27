package dongBin;

import java.io.*;
import java.util.*;

public class Greedy3 {
	public static void main(String[] args) throws Exception{
		//3장 그리디
		//1이 될 때까지
		// n-1, n/k 를 반복적으로 수행하여 n이 1이 되는 과정의 최소 횟수 구하기
		// n/k는 나누어떨어질 때만 가능
		int result = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
//		//n이 k로 나눠진다면 나누고, 아니라면 1 빼기
//		while(n > 1) {
//			if (n % k == 0) {
//				n /= k;
//			} else {
//				n -= 1;
//			}
//			result++;
//		}
//		
//		System.out.println(result);
		
		//그러나 숫자가 커지면 이러한 방식은 비효율적이며 최적의 해인지 알 수 없다.
		//n이 k로 나누어 떨어지는 수가 될 때까지, 1을 빼고 그 후 나누기를 실행하기
		while (true) {
            // n이 k로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
			// > n - 나누어떨어지는 가장 큰 수 를 하면 1을 몇 번 빼는지 확인 가능
            int target = (n / k) * k;
            result += (n - target);
            n = target;
            // N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
            if (n < k) break;
            // K로 나누기
            result += 1;
            n /= k;
        }
		
		// 마지막으로 남은 수에 대하여 1씩 빼기
        result += (n - 1);
        System.out.println(result);
	}
}
