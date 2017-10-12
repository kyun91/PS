import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main_7785 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));
		
		int N = Integer.valueOf(bf.readLine());
		String[] str = new String[2];
		
		Set<String> set = new HashSet<String>();
		
		for(int i=0; i<N; i++){
			str = bf.readLine().split(" ");
			
			if(str[1].equals("enter")){
				set.add(str[0]);
			}else{
				set.remove(str[0]);
			}
		}
		
		String[] a = set.toArray(new String[set.size()]);
		Arrays.sort(a);
		
		for(int i=a.length-1; i>=0; i--){
			bw.write(a[i]+"\n");
		}
		
		bw.flush();
		
	}

}
