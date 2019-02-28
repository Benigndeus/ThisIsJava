package sec02.exam01_inheritance;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		// Create DbmCellPhone Object
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		// inherited Fields from CellPhone Class
		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		
		// Field of DmbCellPhone Class
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		// Call inherited Methods of CellPhone Class
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbCellPhone.sendVoice("��~ �� �ȳ��ϼ���");
		dmbCellPhone.hangUp();
		
		// Call Methods of DmbCellPhone Class
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
