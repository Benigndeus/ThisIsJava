package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {

		Person p1 = new Person("123456-1234567", "���");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		/* final field�� ���� ���α׷� ���� ���� ������ �� ����.
		p1.nation = "USA";
		p1.ssn = "987654-9876543";
		*/
		
		p1.name = "��ȣ";
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		

	}

}
