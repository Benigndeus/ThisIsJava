package sec08.exam02_abstract_method;

public class Dog extends Animal {
	public Dog() { this.kind = "������"; }
	
	// Abstract Method�� �ݵ�� ���� Ŭ�������� ������(Override) �ؾ� �Ѵ�.
	@Override
	public void sound() { System.out.println("�۸�"); }
}
