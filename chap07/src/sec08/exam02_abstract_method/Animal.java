package sec08.exam02_abstract_method;

public abstract class Animal {
	public String kind;
	
	public void breathe() { System.out.println("���� ���ϴ�."); }
	
	// Abstract Method�� �߰�ȣ({}) ���� �ۼ��ϸ� �����ݷ�(;)�� ���δ�.
	public abstract void sound();
}
