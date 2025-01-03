/* ====================================
  ■■■ 컬렉션 (Collection) ■■■
======================================*/

/*
○ List
   - 순서가 있음, 배열과 유사, 중복을 허용
   - 주요 구현 클래스
     ·Vector (동기화 지원)
	 ·ArrayList (동기화 지원 안함)
	 ·LinkedList (체인, 링크, 결합, 큐)


*/

import java.util.*;

public class Test172
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		
		list.add("서울");
		list.add("부산");
		list.add("인천");
		list.add("대구");
		list.add("광주");
		list.add("대전");
		list.add("울산");
		list.add("세종");
		
		System.out.println(list); // 더미 췤!!!
		
		System.out.println("전체 개수 : " + list.size());
		
		// 첫 번째 요소만 출력
		System.out.println("첫번째 요소만 출력 : " + list.get(0));
		

		// 마지막 요소만 출력
		System.out.println("마지막 요소만 출력 : " + list.get(list.size()-1));	
		
		// 처음 위치에 한국 추가
		list.add(0, "한국");
		
		System.out.println(list);
		System.out.println("전체 개수 : " + list.size());
		
		// 처음 위치의 데이터를 대한민국 으로 변경
		list.set(0, "대한민국");
		
		System.out.println(list);
		System.out.println("전체 개수 : " + list.size());
		
		// "서울" 요소의 존재여부 확인
		if(list.contains("서울"))
		{
			System.out.println("서울이 존재합니다.");
		}
		System.out.println();
	
		// 서울이 몇 번째 인덱스에 위치하는지 확인
		int n = list.indexOf("서울");
		System.out.println("서울의 인덱스 : " + n );
	
		// 대한민국 지우기
//		list.remove("대한민국");
		list.remove(0);
		
		System.out.println(list);
		
		// list 의 전체 요소 출력
		System.out.print("전체 출력...① : ");
		for(int idx=0;idx<list.size();idx++)
		{
			System.out.print(list.get(idx) + " " );
		}
		System.out.println();
		
		// list 의 전체 요소 출력
		System.out.print("전체 출력...② : ");
		for(String str : list)
		{
			System.out.print(str + " " );
		}
		System.out.println();
		
		// list 의 전체 요소 출력
		System.out.print("전체 출력...③ : ");
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			String str = it.next();
			System.out.print(str + " " );
		}
		System.out.println();
		
		// list 의 전체 요소 출력
		System.out.print("전체 출력...④ : ");
		ListIterator<String> li = list.listIterator();
		while(li.hasNext())
		{
			String str = li.next();
			System.out.print(str + " " );
		}
		System.out.println();
		
		
		// list 의 전체 요소 역순 출력
		System.out.print("역순 출력...① : ");
		for(int idx=list.size()-1;idx>=0;idx--)
		{
			System.out.print(list.get(idx) + " " );
		}
		System.out.println();
		
		// list 의 전체 요소 역순 출력
		System.out.print("역순 출력...② : ");
		while(li.hasPrevious())
		{
			String str = li.previous();
			System.out.print(str + " " );
		}
		System.out.println();
	}
}