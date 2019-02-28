package sec15.exam01_annotation;

public class Service {
	
	@PrintAnnotation() // ��ȣ�� ��� �ȴ�.
	public void method1() {
		System.out.println("���� ����1");
	}
	
	@PrintAnnotation("*") // value default "-" ��ſ� "*"�� ����.
	public void method2() {
		System.out.println("���� ����2");
	}
	
	@PrintAnnotation(value="#", number=20) // value default "-" ��ſ� "#"��, number default 15 ��ſ� 20.
	public void method3() {
		System.out.println("���� ����3");
	}
	

}
