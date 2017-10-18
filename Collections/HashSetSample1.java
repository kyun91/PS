package Collections;
import java.util.*;

public class HashSetSample1 {
	public static void main(String args[]){
		Set<String> set = new HashSet<String>();
		
		set.add("개");
		set.add("고양이");
		set.add("토끼");
		
		System.out.println("**첫 번째 표시**");
		for(String animal : set){
			System.out.println(animal);
		}
		
		set.remove("토끼");
		
		System.out.println("**존재 확인**");
		System.out.println(set.contains("토끼"));
		
		System.out.println("**두 번째 표시**");
		for(String animal : set){
			System.out.println(animal);
		}
	}
}
