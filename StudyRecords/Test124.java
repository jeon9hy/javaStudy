/*=====================================
■■■ 클래스 고급 ■■■
- 인터페이스(Interface)
=======================================*/

/*
◎ extends vs implements

   클래스 extends 클래스
   클래스 extends 추상클래스
   
   인터페이스 extends 인터페이스
   인터페이스 extends 인터페이스, 인터페이스
   
   추상클래스 implements 인터페이스
   추상클래스 implements 인터페이스, 인터페이스
   
   클래스 implements 인터페이스
   클래스 implements 인터페이스, 인터페이스

※ 인터페이스는 클래스와 달리 다중 상속이 가능하며,
   인터페이스 자체도 상속된다.
   
※ 인터페이스의 멤버 변수인 데이터는
   접근제어지시자를 별도로 명시하지 않더라도 기본 상수 (primitive constraint)인
   public static final 의 변경자로 설정된다.
   클래스에서 인터페이스를 추가하여(implements) 사용할 경우
   인터페이스 안에서 선언된 모든 메소드를 구현해 주어야 하며
   인터페이스의 상위 인터페이스가 제공하는 추상 메소드를 포함한
   모든 메소드를 구현하지 않을 경우
   추상 클래스로 선언해야 한다.
   
※ 형식

	- 인터페이스는 메소드를 선언만 하고 정의는 하지 않는다.
	- 인터페이스를 implements 할 경우 반드시 하위 클래스는
	  인터페이스의 모든 메소드를 오버라이딩 해야 한다.
	- 인터페이스는 자동적으로 다음과 같이 처리된다.
	  ' 멤버 변수 : public static final
	  ' 메소드    : public abstract
	- 다중 상속은 콤마( , )로 구분되며
	  여러 개의 인터페이스를 상속할 수 있다.
	- 인터페이스끼리 상속할 경우는 extends 키워드를 사용한다.
	
※ 인터페이스의 선언

   인터페이스는 클래스의 내부 구현을 제외한 참조형만 선언한 것이므로
   메소드를 선언만하고 정의는 할 수 없다.
   또한, 클래스에서의 변수는 값이 변할 수 있지만
   인터페이스에서의 변수는 상수처럼 값이 변할 수 없기 때문에
   선언 시에 미리 값을 할당해 놓아야 한다.
   
※ 인터페이스의 구현

   인터페이스는 클래스를 위한 템플릿이기 때문에
   사용 가능한 인터페이스가 되기 위해서는
   자바 프로그램에서 인터페이스를 구현해 주어야 하는데
   이러한 기능을 수행하는 것이 implements 예약어이다.
   
※ 클래스는 동시에 두 개 이상의 인터페이스를
   implements 할 수 있다~!
*/

interface ADemo
{
	public void write();
}

interface BDemo
{
	public void print();	
}

// 인터페이스 - 두 인터페이스를 상속 받은 인터페이스
interface CDemo extends ADemo, BDemo
{
	public void test();
}

class DemoImpl implements CDemo
{
	@Override
	public void test()
	{
		System.out.println("test()....");
	}
	
	@Override
	public void write()
	{
		System.out.println("write()....");
	}
	
	@Override
	public void print()
	{
		System.out.println("print()....");
	}		
}

public class Test124
{
	public static void main(String[] args)
	{
		DemoImpl ob = new DemoImpl();
		
		ob.test();
		ob.write();
		ob.print();		
	}
}