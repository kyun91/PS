package Collections;
import java.util.*;

public class HashMapSample1 {
	public static void main(String args[]){
		Map<String, String> map = new HashMap<>();
		
		map.put("����", "���");
		map.put("����", "����");
		map.put("���", "��");
		
		map.remove("����");
		
		for(String key : map.keySet()){
			String value = map.get(key);
			System.out.println(value);
		}
	}
}
