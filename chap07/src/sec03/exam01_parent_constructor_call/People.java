package sec03.exam01_parent_constructor_call;

public class People {
	// Field
	public String name;
	public String ssn;
	
	// Constructor
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		System.out.println("People ��ü ����");
	}
}
