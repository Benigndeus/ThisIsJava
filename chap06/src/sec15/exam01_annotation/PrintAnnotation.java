package sec15.exam01_annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
	/* **************
	 * @Target : Annotation�� ����� ����� ������ �� ���.
	 * ElementType : java.lang.annotation.ElementType ���� ����� ���ǵǾ� �ִ�. -> need import it for using.
	 * ElementType.METHOD : ���⼭�� Method���� Annotation�� �����Ѵ�.
	 * ************** */

@Retention(RetentionPolicy.RUNTIME)
	/* **************
	 * "Annotation ���� ��å"
	 * ��� �뵵�� ���� @AnnotationName�� ��� �������� ������ ������ �����ؾ� �Ѵ�.
	 * �ҽ� �󿡼��� ����	||	�����ϵ� Ŭ�������� ����	||	Runtime �ÿ��� ����
	 * 		SOURCE			||			CLASS				||		*RUNTIME		(���⼭�� RUNTIME ���)
	 * RetentionPolicy : java.lang.annotation.RetentionPolicy ���� ����� ���ǵǾ� �ִ�. -> need import it for using.
	 * Retention [��] 1. (� ���� ���� �ʴ�) ����[����]  2. (��ü������ ���� ���������� �ʴ�) ��ü[�ܷ�]  3. ���(��)
	 * Reflection : ���÷���. ��Ÿ�� �ÿ� Ŭ������ ��Ÿ ������ ��� ���.
	 * 	[��] [C] (� �Ϳ� ����) ����[����]
	 * 	1. Class�� ������ �ִ� Field�� �˰��� �� ��.
	 * 	2. � Method�� ������ �ִ���.
	 * 	3. ����� Annotation�� ��������.
	 * ************** */

public @interface PrintAnnotation {
	/* **************
	 * public : Access Modifier(����������).
	 * @interface : Interface�� �������� Annotation���� @�� ���δ�.
	 * PrintAnnotation : Annotation name.
	 * ************** */
	
	String value() default "-";
	int number() default 15;

}
