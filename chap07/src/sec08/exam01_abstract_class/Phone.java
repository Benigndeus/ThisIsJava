package sec08.exam01_abstract_class;

public abstract class Phone {
	// Field
	public String owner;
	
	// Constructor
	public Phone(String owner) { this.owner = owner; }
	
	// Method
	public void turnOn()	{ System.out.println("�� ������ �մϴ�."); }
	public void turnOff()	{ System.out.println("�� ������ ���ϴ�."); }
}
