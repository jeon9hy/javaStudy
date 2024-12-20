/*================================================
■■■ 자바의 주요(중요) 클래스 ■■■
- Math 클래스
==================================================*/
/*

생성자 호출 못하므로 인스턴스 생성 불가.
모든 메소드 STATIC이어서, 클래스 명으로 접근하면 된다. → Math.PI

○ java.lang.Math 클래스는

	수학(Mathmatics)과 관련된 유용한 속성과 메소드를 제공하는 클래스로
	생성자가 있긴 하지만... 『private』으로 선언되어 있기 떄문에
	외부에서 객체(인스턴스) 를 생성할 수 없다.
	단, 모든 메소드가 『static』 으로 정의디어 있으므로
	객체를 생성하지 않고 바로 접근하여 사용하는 것이 가능하다.


○ java.lang.Math 클래스의 주요 상수 및 메소드

	- public static final double E = 2.71...;
	 : 자연 로그 상수

	- public static final double PI = 3.141592...;
	 : 원주율(π)	// ㅎ

	- public static double sin(double a)
	- public static double cos(double a)
	- public static double tan(double a)
	 : sin(a), cos(a), tan(a) 값을 반환한다. (삼각함수)

	- public static double asin(double a)
	- public static double acos(double a)
	- public static double atan(double a)
	 : asin(a), acos(a), atan(a) 값을 반환한다. (삼각함수의 역함수)

	- public static double toRadians(double angdeg)
	 : 각도(angdeg)를 라디안(radian)으로 바꾸어 반환한다.

	- public static double toDegrees(double angrad)
	 : 라디안(angrad)을 각도(degree)로 바꾸어 반환한다.

	- public static double exp(double a)
	 : e 의 a 승을 구하여 반환한다.

	- public static double log(double a)
	 : 로그(log) 값을 구하여 반환한다.

	- public static double sqrt(double a)
	 : a 의 제곱근을 구하여 반환한다.

	- public static double ceil(double a)
	 : a 보다 크거나 같은 정수를 반환한다. (올림의 개념)

	- public static double floor(double a)
	 : a 보다 작거나 같은 정수를 반환한다. (절삭의 개념)

	- public static double pow(double a, double b)
	 : a 의 b 승을 구하여 반환한다.

	- public static int round(float a)
	- public static long round(double a)
	 : a 를 반올림하여 결과값을 반환한다.

	- public static double random()
	 : 0.0 ~ 1.0 사이의 난수(임의의 실수)를 발생시켜 반환한다.

*/

public class Test150
{
	public static void main(String[] args)
	{
		System.out.println("원주율	   : " + Math.PI);
		System.out.println("2의 제곱근 : " + Math.sqrt(2));
		
		System.out.println("파이에 대한 Degree : "  + Math.toDegrees(Math.PI));
		System.out.println("2파이에 대한 Degree : "  + Math.toDegrees(2.0*Math.PI));
		
		double radian45 = Math.toRadians(45);
		System.out.println("각도 45 : " + radian45);
		
		System.out.println("싸인	45 : " + Math.sin(radian45));
		System.out.println("코싸인  45 : " + Math.cos(radian45));
		System.out.println("탄젠트  45 : " + Math.tan(radian45));
		
		System.out.println("로그    25 : " + Math.log(25));
		
		System.out.println("2의 4승    : " + Math.pow(2, 4));
		
		System.out.println("0.0 ~ 1.0 사이의 난수 : " + Math.random());
//		random 매서드는 실행할 때마다 다른값
		
		
	}
}