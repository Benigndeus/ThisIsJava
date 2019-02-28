package sec14.exam01_getter_setter;

public class Car {
	
	private int speed;
	private boolean stop;
	/* menu - Source - Generate Getter and Setters... */
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) {
			speed = 0;
		}
	}
	
	// �� ����� ����� �Ŀ� getter&setter�� ���ϴ� �ڵ�� �����ϸ� �ȴ�.
	
	/* eclipse�� getter&setter�� �ڵ����� �������ִ� ����� �ִ�.
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	*/
	
}
