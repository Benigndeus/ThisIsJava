package sec04.exam01_overriding;

public class Computer extends Calculator {
	/* Override �޼ҵ� ������ �� Tip
	 * Menu - Source - Override/Implement Methods... Ȱ��
	 * ctrl+Space �� ����� �ߴµ�, �ű⼭ ����� �׸� ���� */
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
}
