package sec05.exam02_final_method;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	/* final method�� �������̵� �� �� ����.
	@Override
	public void stop() {
		System.out.println("���� ����");
		speed = 0;
	}
	*/
}
