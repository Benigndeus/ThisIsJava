package sec02.exam05_static_method;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	void turnOn();
	void turnOff();
	void setVolume(int volume);

	default void setMute(boolean mute) {
		if(mute)	{ System.out.println("���� ó���մϴ�."); }
		else		{ System.out.println("���� �����մϴ�."); }
	}
	
	// public�� ������ �ʴ��� compile �������� �ڵ����� �ٴ´�.
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
