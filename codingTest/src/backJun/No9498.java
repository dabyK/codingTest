package backJun;

import java.util.Scanner;

public class No9498 {
	public static void main(String[] args) {
		
//		<문제>
//		시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String result="";
		if(90<=n) {
			result="A";
		}else if(80<=n) {
			result="B";
		}else if(70<=n) {
			result="C";
		}else if(60<=n){
			result="D";
		}else {
			result="F";
		}
		System.out.println(result);
	}
}
