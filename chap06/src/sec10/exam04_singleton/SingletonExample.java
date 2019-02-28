package sec10.exam04_singleton;

public class SingletonExample {

	public static void main(String[] args) {

		/* Singleton Class�̹Ƿ� new �����ڸ� ����� �� ����.
		 Singleton obj1 = new Singleton();
		 Singleton obj2 = new Singleton(); 
		 */
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� Singleton Object�Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton Object�Դϴ�.");
		}

	}

}
