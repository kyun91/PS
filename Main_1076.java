import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main_1076 {
	
	static public long sqrt(long num){
		int result=1;
		
		if(num == 0){
			return 1;
		}
		
		for(int i=0; i<num; i++){
			result *=10;
		}
		
		return result;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		map.put("black", "0");
		map.put("brown","1");
		map.put("red","2");
		map.put("orange","3");
		map.put("yellow","4");
		map.put("green","5");
		map.put("blue","6");
		map.put("violet","7");
		map.put("grey","8");
		map.put("white","9");
		
		String c1 = br.readLine();
		String c2 = br.readLine();
		String c3 = br.readLine();
		
		c1 = map.get(c1);
		c2 = map.get(c2);
		String value = c1+c2;
		long j3 = Integer.valueOf(map.get(c3));
		j3 = sqrt(j3);
		
		System.out.println(Integer.valueOf(value)*j3);
		
		
	}

}
