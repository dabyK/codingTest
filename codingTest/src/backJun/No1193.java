package backJun;

import java.util.Scanner;

public class No1193 {
	public static void main(String[] args) {
//		<문제>
//		이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 
//		1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
//		X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
//		1      1/1      
//		2~3    1/2 - 2/1    
//		4~6    3/1 - 2/2 - 1/3 
//		7~10   1/4 - 2/3 - 3/2 - 4/1
//		11~15  5/1 - 4/2 - 3/3 - 2/4 - 1/5
		//1+ (1+1) + (1+1+2) + (1+1+2+3)
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
//		int a = 1;
//		int su = 0;
//		int su2 = 0;
//		for (int i = 0; i >= 0; i++) { // X가 14 5번째 묶음 4번째 숫자
//			a = a + i; // 01 12 24 37 411
//			if (X <= a + i) {
//				// i+1이 몇번째 줄인지가 됨 a는 1,2,4,7,11...
//				// X가 14면 a는 11 i는 4 i+2는 두 수의 합
//				if (i % 2 == 0) { // i가 짝수면 홀수번째 줄이니까 분모가 1로 시작
//					// X-a+1이 몇번째인지가 됨
//					// i+1 - (X-a) //4+1 - (14-11) 가 분자(su)
//					// i+2 - (su) 가 분모
//					su = i + 1 - (X - a);
//					su2 = i + 2 - su;
//
//				} else {// i가 홀수면 짝수번째 줄이니까 분자가 1로 시작
//						// 짝수일때랑 분자 분모가 반대
//					su2 = i + 1 - (X - a);
//					su = i + 2 - su2;
//				}
//				break;
//			}
//		}
//		System.out.println(su + "/" + su2);
		
		//풀이2
		int b = 1;
		
		while(X > b) {
			X -= b++;
		} //X가5면 5-1 4-2 x는 2 b는 3
		
		if(b % 2 == 0) {
			System.out.println(X + "/" + (b+1-X));			
		}else {
			System.out.println((b+1-X) + "/" + X );

		}
	}

}
