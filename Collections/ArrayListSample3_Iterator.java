package Collections;
import java.util.*;

/*
 * 이터레이터의 주요 메서드
 * boolean hasNext() - 다음 요소가 있는지 조사한다. 다음 요소가 있으면 true 반환
 * Object next()  - 다음 요소를 추출한다.
 *
 * 이터레이터.next()로 값을 추출하고 동시에 이터레이터가 다음 요소를 가리키게 한다.
*/
public class ArrayListSample3_Iterator {
	public static void main(String args[]){
		List<String> list = new ArrayList<String>();
		
		list.add("철수");
		list.add("영희");
		list.add("길동");
		
		//Iterator 선언
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()){
			//요소추출
			String name = it.next();
			System.out.println(name);
		}
		
	}
}
