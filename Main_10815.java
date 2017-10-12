import java.util.HashMap;
import java.util.Scanner;
/*
 * HashMap 클래스는 key, value 값의 한싸으로 묶어서 관리한다.
 * key의 중복은 허용하지 않지만 value의 중복은 허용한다.
 * 
 *  HashMap Method
 *  put() - key와 값으로 구성된 새로운 데이터를 추가
 *  get() - 지정한 key에 해당하는 데이터를 반환한다.
 *  containKey() - key가 존재하는지 여부를 반환한다.
 *  size() - Map의 요소 개수를 반환한다.
*/

public class Main_10815 {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i=0; i<N; i++){
			int num = sc.nextInt();
			hm.put(num, 0);
		}
		
		int M = sc.nextInt();
		for(int i=0; i<M; i++){
			int key = sc.nextInt();
			if(hm.get(key) != null){
				System.out.print("1 ");
			}else{
				System.out.print("0 ");
			}
		}
	}

}
