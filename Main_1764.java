import java.util.*;
 
public class Main_1764 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Set<String> set1 = new HashSet<String>();
        Set<String> result = new HashSet<String>();
        
        int N = sc.nextInt();
        int M= sc.nextInt();
        String[] set2 = new String[M];
        
        for(int i=0; i<N; i++){
        	String tmp = sc.next();
        	set1.add(tmp);
        }
        for(int i=0; i<M; i++){
        	String tmp = sc.next();
        	set2[i] = tmp;
        }
        
        for(int i=0; i<M; i++){
        	if(set1.contains(set2[i])==true){ result.add(set2[i]);}
        }
        
        String[] tmp = result.toArray(new String[result.size()]);
        Arrays.sort(tmp);
        System.out.println(tmp.length);
        for(int i=0; i<tmp.length; i++){
        	System.out.println(tmp[i]);
        }
    }
}

