package Collections;
import java.util.*;

public class ArrayListSample2 {
	public static void main(String args[]){
		List<String> list = new ArrayList<>();
		
		list.add("ö��");
		list.add("����");
		list.add("�浿");
		
		/*for(int i=0; i<list.size(); i++){
			System.out.println(i+"��: "+list.get(i));
		}*/
		int k=0;
		for(String name : list){
			System.out.println(k+"��: "+name);
			k++;
		}
		
	}
}
