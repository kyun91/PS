package Generic;

/*
 * class ���ǿ� <~> �������� E��� ���ĺ��� ��õǰ�, �Ȱ��� �޼���� �ʵ��� ������ E���
 * ���ĺ��� ���� �ִ�. E �κ��� ���߿� �̿��� �ʿ��� ������ �� �ִ� �����ο� ���� ��Ÿ����.
*/
public class GenericsSample<E> {
	private E object;
	
	
	//getter
	public E getObject(){
		return this.object;
	}
	
	//setter
	public void setObject(E object){
		this.object = object;
	}
	
}
