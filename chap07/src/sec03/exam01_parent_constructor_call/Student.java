package sec03.exam01_parent_constructor_call;

public class Student extends People {
	// Field
	public int studentNo;
	
	// Constructor
	public Student(String name, String ssn, int studentNo) {
		// ���� Ŭ������ �����ڿ��� �θ� �������� ȣ���� ù �ٷ� �;� �Ѵ�(super).
		super(name, ssn); 
		this.studentNo = studentNo;
		System.out.println("Student ��ü ����");
	}
}
