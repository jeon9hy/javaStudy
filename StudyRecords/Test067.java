/* ================================================
■■■ 실행 흐름의 컨트롤(제어문) ■■■
- 반복문(for문) 실습
===================================================*/

// 다중 반복문(반복문의 중첩)을 활용한 별찍기

// 과제)
// 다음과 같은 내용이 출력될 수 있도록
// 반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

/* 실행 예)
		
	*********
	 *******
	  *****
	   ***
	    *
*/

public class Test067
{
	public static void main(String[] args)
	{
			
		for(int i=1;i<=5;i++){
						
			// 첫 행부터 공백을 0개 1개 2개 ... 4개 순서대로 찍는 코드
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			
			// 첫 행부터 *을 9 7 5 3 1 등차수열로 찍는 코드
			for(int k=9;k>=(2*i-1);k--)
			{
				System.out.print("*");
			}	
			
			// 개행을 위한 코드
			System.out.println();
		}
	}
}

// 실행 결과

/*

	*********
	 *******
	  *****
	   ***
		*
	계속하려면 아무 키나 누르십시오 . . .

*/

