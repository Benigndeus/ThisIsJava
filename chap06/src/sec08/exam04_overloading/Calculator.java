package sec08.exam04_overloading;

public class Calculator {
	
	double areaRectangle(double width) {
		return width * width;
	}
	
	/** Method Overloading **/
	double areaRectangle(double width, double height) {
		return width * height;
	}

}
