package sec06.exam01_array_bylist;

public class ArrayCreateByValueExample2 {

	public static void main(String[] args) {

		int[] scores;
		//scores = { 83, 90 ,87 }; -> ������ ����
		scores = new int[] { 83, 90, 87 };
		
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		
		System.out.println("���� : " + sum1);
		
		//add({ 83, 90 ,87 }) -> ������ ����
		//int sum2 = add(scores); -> �迭 ��ü�� �Ű������� ��� ����
		int sum2 = add(new int[] { 83, 90 ,87 });
		
		System.out.println("���� : " + sum2);
		
		System.out.println("���� : " + add(scores));

	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
