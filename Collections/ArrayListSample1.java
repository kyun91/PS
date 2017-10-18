package Collections;

/*
 * 이 예에서는 int형으로 ArrayList 객체를 선언했다. 제네릭의 형에는 
 * int 등의 기본형 대신 Integer형과 같은 래퍼 클래스를 지정한다.
*/
import java.util.ArrayList;
import java.util.List;

public class ArrayListSample1 {
	public static void main(String args[]){
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(17);
		list.add(51);
		list.add(39);
		
		System.out.println("**첫 번째 표시**");
		System.out.println("0 : "+list.get(0));
		System.out.println("1 : "+list.get(1));
		System.out.println("2 : "+list.get(2));
		
		list.remove(1);
		System.out.println("**두 번째 표시**");
		System.out.println("0 : "+list.get(0));
		System.out.println("1 : "+list.get(1));
		
		
	}

}
