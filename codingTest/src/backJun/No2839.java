package backJun;

import java.util.Scanner;

public class No2839 {
	public static void main(String[] args) {
//		<����>
//		����̴� ���� �������忡�� ������ ����ϰ� �ִ�. ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�. 
//		�������忡�� ����� ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
//		����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. 
//		���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
//		����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		����, ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ����Ѵ�.
		//11�� ��� 5*1+3*2 3��
		//21 5*3 + 3*2 5�� 
		//22�� ��� 5*2 + 3*4 6��
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
//		int result=N/5;
//		int temp=N%5;					
//		if(temp%3!=0) {
//			if(result!=0&&(N-(5*(result-1)))%3==0){
//				result=result-1+((N-(5*(result-1)))/3);
//			}else if(result!=0&&(N-(5*(result-2)))%3==0){
//				result=result-2+((N-(5*(result-2)))/3);
//			}else if(N%3==0) {
//				result=N/3;
//			}else {
//				result=-1;
//			}
//		}else {
//			result+=temp/3;
//		}
//		System.out.println(result);
		
		//Ǯ��
		int result=0;
		while(true) {
			if(N%5==0) {
				result+=(N/5);
				break;
			}
			N-=3;
			result++;
			
			if(N<0) {
				result=-1;
				break;
			}
		}
		System.out.println(result);
	
		
	}
}
