package Collections;

/*
 * �� �������� int������ ArrayList ��ü�� �����ߴ�. ���׸��� ������ 
 * int ���� �⺻�� ��� Integer���� ���� ���� Ŭ������ �����Ѵ�.
*/
import java.util.ArrayList;
import java.util.List;

public class ArrayListSample1 {
	public static void main(String args[]){
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(17);
		list.add(51);
		list.add(39);
		
		System.out.println("**ù ��° ǥ��**");
		System.out.println("0 : "+list.get(0));
		System.out.println("1 : "+list.get(1));
		System.out.println("2 : "+list.get(2));
		
		list.remove(1);
		System.out.println("**�� ��° ǥ��**");
		System.out.println("0 : "+list.get(0));
		System.out.println("1 : "+list.get(1));
		
		
	}

}
