package sec08.exam03_method_call;

public class Calculator {
	
	int plus(int x, int y) {
		return x + y;
	}
	
	double divide(int x, int y) {
		return (double)x / y;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		return sum / 2;
	}
	
	// execute : v, �����ϴ�.
	void execute() {
		double result = avg(7, 10);
		println("������ : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}

}
