package Collections;
import java.util.*;

public class HashSetSample1 {
	public static void main(String args[]){
		Set<String> set = new HashSet<String>();
		
		set.add("��");
		set.add("�����");
		set.add("�䳢");
		
		System.out.println("**ù ��° ǥ��**");
		for(String animal : set){
			System.out.println(animal);
		}
		
		set.remove("�䳢");
		
		System.out.println("**���� Ȯ��**");
		System.out.println(set.contains("�䳢"));
		
		System.out.println("**�� ��° ǥ��**");
		for(String animal : set){
			System.out.println(animal);
		}
	}
}
