package Collections;
import java.util.*;

/*
 * ���ͷ������� �ֿ� �޼���
 * boolean hasNext() - ���� ��Ұ� �ִ��� �����Ѵ�. ���� ��Ұ� ������ true ��ȯ
 * Object next()  - ���� ��Ҹ� �����Ѵ�.
 *
 * ���ͷ�����.next()�� ���� �����ϰ� ���ÿ� ���ͷ����Ͱ� ���� ��Ҹ� ����Ű�� �Ѵ�.
*/
public class ArrayListSample3_Iterator {
	public static void main(String args[]){
		List<String> list = new ArrayList<String>();
		
		list.add("ö��");
		list.add("����");
		list.add("�浿");
		
		//Iterator ����
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()){
			//�������
			String name = it.next();
			System.out.println(name);
		}
		
	}
}
