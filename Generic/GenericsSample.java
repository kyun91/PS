package Generic;

/*
 * class 정의에 <~> 형식으로 E라는 알파벳이 명시되고, 똑같이 메서드와 필드의 형에도 E라는
 * 알파벳이 쓰여 있다. E 부분은 나중에 이용자 쪽에서 결정할 수 있는 자유로운 형을 나타낸다.
*/
public class GenericsSample<E> {
	private E object;
	
	
	//getter
	public E getObject(){
		return this.object;
	}
	
	//setter
	public void setObject(E object){
		this.object = object;
	}
	
}
