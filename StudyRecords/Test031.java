/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- if 문
- if ~ else 문 실습
=================================================== 

1. 프로그램을 작성할 때 주어진 조건에 따라
   분기 방향을 정하기 위해 사용되는 제어문에는
   if문 if~else문 조건 연산자 복합if 문, switch문 등이 있다.
   
2. if문은 if 다음의 조건이 참일 경우
   특정 문장을 수행하고자 할 때 사용되는 구문이다.*/

import java.io.*;

public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		
		System.out.printf("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());
		
		if(num % 2 == 0)
			System.out.printf("입력하신 %d은(는) 짝수입니다.\n", num);
		
		if(num % 2 != 0)
			System.out.printf("입력하신 %d은(는) 홀수입니다.\n", num);
			
	}
}