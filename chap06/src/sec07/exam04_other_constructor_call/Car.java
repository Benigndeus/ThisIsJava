package sec07.exam04_other_constructor_call;

public class Car {
	
	// Field
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Car() {}
	
	Car(String model) {
		
		/*this.model = model;
		this.color = null;
		this.maxSpeed = 0;*/
		
		this(model, null, 0);
		// �ּ��� �����ϰ� this������ ȣ���� ������ ����� ù�ٿ� �ۼ��Ǿ�� �Ѵ�.
	}
	
	Car(String model, String color) {
		
		/*this.model = model;
		this.color = color;
		this.maxSpeed = 0;*/
		
		this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}