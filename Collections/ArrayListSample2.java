package Collections;
import java.util.*;

public class ArrayListSample2 {
	public static void main(String args[]){
		List<String> list = new ArrayList<>();
		
		list.add("Ã¶¼ö");
		list.add("¿µÈñ");
		list.add("±æµ¿");
		
		/*for(int i=0; i<list.size(); i++){
			System.out.println(i+"¹ø: "+list.get(i));
		}*/
		int k=0;
		for(String name : list){
			System.out.println(k+"¹ø: "+name);
			k++;
		}
		
	}
}
