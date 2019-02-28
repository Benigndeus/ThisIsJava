package sec07.exam06_casting;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/* parent�� �ڷ����� Parent�̹Ƿ� ��ü�� Child��� �ϴ���,
		 * Child�� field�� ����� �� ����.
		parent.field2 = "data2";
		parent.method3();
		*/
		
		// �Ʒ��� ���� parent�� Casting �ϰ� ����ϸ� Child�� field �� method ��� ����.
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
	}
}
