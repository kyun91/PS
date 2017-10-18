package Generic;

/*
 * code�� ���� Ŭ������ �ν��Ͻ��� ������ �� <String>���� �����ϰ� �ִ�. 
 * ��, GenericsSample Ŭ������ �ʵ� ���ǿ��� E���� ���� String���� ��� ġȯ�ȴ�.
 * ��ó�� ���׸��� Ŭ���� ���ǿ� ��������ν� Ŭ���� ���� �ȿ��� �̿��ϴ� ���� �ν��Ͻ��� ������ �� ������ �� �ְ� �ȴ�.
 * �̶� E�� ���� �Ű� ����(type parameter)��� �Ѵ�. ���������� ���� �Ű� ������ �̸��� E�� �Ѵ�.
*/
public class Main {
	public static void main(String args[]){
		GenericsSample<String> generic = new GenericsSample<String>();
		
		//setter ����
		generic.setObject("�ȳ��ϼ���.");
		
		//getter ����
		System.out.println(generic.getObject());
		
		
		GenericsSample<Integer> ge = new GenericsSample<Integer>();
		
		ge.setObject(1);
		
		System.out.println(ge.getObject());
		
	}

}
