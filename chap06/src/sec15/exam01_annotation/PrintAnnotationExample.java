package sec15.exam01_annotation;

import java.lang.reflect.*;

public class PrintAnnotationExample {

	public static void main(String[] args) {

		Method[] declaredMethods = Service.class.getDeclaredMethods();
		/* **************
		 * Class�� ����� Annotation ������ �������� java.lang.Class�� �̿��ϸ� ������,
		 * Field, Constructor, Method�� ����� ������ �������� java.lang.reflect package�� import.
		 * ���⼭�� Method Annotation ������ �ʿ��ϹǷ� ���� ���� ����Ѵ�.
		 * getDeclaredMethods() : Method�� ���� ����� ��� Annotation�� Method Array�� �����Ѵ�.
		 * ************** */
		
		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = 
						method.getAnnotation(PrintAnnotation.class);
				
				// Method Name Print
				System.out.println("[" + method.getName() + "]");
				
				// Division Line Print
				for(int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				
				// ����ó�� �� invoke�� ���߿� �н�.
				try {
					// Method Call
					method.invoke(new Service());
				} catch (Exception e) {}
				System.out.println();
				
				/*
				System.out.println(method.getName() + " : ");
				System.out.println("value = " + printAnnotation.value());
				System.out.println("number = " + printAnnotation.number());
				System.out.println();
				*/
				
				/*
				System.out.println(method.getName() + "���� ����Ǿ� ����.");
			} else {
				System.out.println(method.getName() + "���� ����Ǿ� ���� ����.");
				*/
			}
		}
	}
}
