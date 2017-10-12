import java.util.HashMap;
import java.util.Scanner;
/*
 * HashMap Ŭ������ key, value ���� �ѽ����� ��� �����Ѵ�.
 * key�� �ߺ��� ������� ������ value�� �ߺ��� ����Ѵ�.
 * 
 *  HashMap Method
 *  put() - key�� ������ ������ ���ο� �����͸� �߰�
 *  get() - ������ key�� �ش��ϴ� �����͸� ��ȯ�Ѵ�.
 *  containKey() - key�� �����ϴ��� ���θ� ��ȯ�Ѵ�.
 *  size() - Map�� ��� ������ ��ȯ�Ѵ�.
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
