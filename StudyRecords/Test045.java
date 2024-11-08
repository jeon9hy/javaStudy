/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문 실습 및 관찰
===================================================*/

// 1 부터 100 까지의 정수 중에서
// 짝수들의 합을 계산하여 결과값을 출력하는 프로그램을 구현한다.
// 단, 조건문을 사용하지 않도록 하며
// while 반복문을 활용하여 처리할 수 있도록 한다.
public class Test045
{
	public static void main(String[] args)
	{
		// 주요 변수 선언 및 초기화
		int n=0, sum=0;
		
		
		// 연산 및 처리
		while(n<50)
		{
			n++;
			sum+=n*2;
		}
		
		
		// 결과 출력
		System.out.println(sum);
	}
}