package backJun;

import java.util.Scanner;

public class No9655 {

	public static void main(String[] args) {
		
//		<문제>
//		돌 게임은 두 명이서 즐기는 재밌는 게임이다.
//		탁자 위에 돌 N개가 있다. 상근이와 창영이는 턴을 번갈아가면서 돌을 가져가며, 돌은 1개 또는 3개 가져갈 수 있다. 
//		마지막 돌을 가져가는 사람이 게임을 이기게 된다.
//		두 사람이 완벽하게 게임을 했을 때, 이기는 사람을 구하는 프로그램을 작성하시오. 게임은 상근이가 먼저 시작한다.
//		상근이가 게임을 이기면 SK를, 창영이가 게임을 이기면 CY을 출력한다.
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int result=N/3;
		result+=N%3;
		System.out.println(result%2==0?"CY":"SK");
		
		//근데 그냥 주어진 수가 홀수면 상근이, 짝수명 창영이가 승리함

	}

}
