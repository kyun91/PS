package Generic;

/*
 * code를 보면 클래스의 인스턴스를 생성할 때 <String>으로 선언하고 있다. 
 * 즉, GenericsSample 클래스의 필드 정의에서 E였던 형이 String으로 모두 치환된다.
 * 이처럼 제네릭을 클래스 정의에 사용함으로써 클래스 정의 안에서 이용하는 형을 인스턴스를 생성할 때 지정할 수 있게 된다.
 * 이때 E를 형식 매개 변수(type parameter)라고 한다. 관례적으로 형식 매개 변수의 이름은 E로 한다.
*/
public class Main {
	public static void main(String args[]){
		GenericsSample<String> generic = new GenericsSample<String>();
		
		//setter 실행
		generic.setObject("안녕하세요.");
		
		//getter 실행
		System.out.println(generic.getObject());
		
		
		GenericsSample<Integer> ge = new GenericsSample<Integer>();
		
		ge.setObject(1);
		
		System.out.println(ge.getObject());
		
	}

}
