package Collections;
import java.util.*;

public class HashMapSample1 {
	public static void main(String args[]){
		Map<String, String> map = new HashMap<>();
		
		map.put("»¡°­", "»ç°ú");
		map.put("º¸¶ó", "Æ÷µµ");
		map.put("³ë¶û", "±Ö");
		
		map.remove("»¡°­");
		
		for(String key : map.keySet()){
			String value = map.get(key);
			System.out.println(value);
		}
	}
}
