import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;




public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> firstCard = new HashSet<Integer>();
		
		int N;
		int M;
		System.out.println("N");
		N = Integer.valueOf(bf.readLine());
		System.out.println("N의 값");
		String first = bf.readLine();
		StringTokenizer st = new StringTokenizer(first);
		
		while(st.hasMoreTokens()){
			firstCard.add(Integer.valueOf(st.nextToken()));
		}
		
		System.out.println("M");
		M = Integer.valueOf(bf.readLine());
		
		int result[] = new int[M];
		int line[] = new int[M];
		System.out.println("M의 값");
		String second = bf.readLine();
		StringTokenizer st2 = new StringTokenizer(second);
		
		int k=0;
		while(st2.hasMoreTokens()){
			line[k] = Integer.valueOf(st2.nextToken());
			
			if(firstCard.contains(line[k])){
				result[k] = 1;
			}else{
				result[k] = 0;
			}
			
			k++;
		}
		
		
		
		
		System.out.print("Result : ");
		for(int i=0; i<M; i++){
			if(i>0){
				System.out.print(" ");
			}
			System.out.print(result[i]);
		}
		
	}
}