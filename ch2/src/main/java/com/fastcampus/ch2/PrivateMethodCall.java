package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {
	public static void main(String[] args) throws Exception {
		//Hello hello = new Hello();
		//hello.main(); //private�̶� �ܺ� ȣ�� �Ұ�
		
		// Reflection API�� ��� - Ŭ���� ������ ��� �ٸ� �� �ִ� ������ ��� ����
		//java.lang.reflect ��Ű���� ����
		//Hello Ŭ������ Class ��ü(Ŭ������ ������ ��� �ִ� ��ü)�� ���´�.
		//Ŭ���� ����(*.class)�� �޸𸮿� �ö� ��, Ŭ���� ���ϸ��� Class ��ü�� �ϳ��� �����ȴ�.
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello"); //����ó�� ����� ����
		//Ŭ���� ������ �̿��Ͽ� ��ü ����� ����
		//Class ��ü�� Ŭ������ ���� ��� ������ ������ �ֱ� ����, class=���赵
		Hello hello = (Hello)helloClass.newInstance(); //Class��ü�� ���� ������ ��ü �ļ�
		//hello Ŭ������ ������ �ִ� ���� �޼ҵ带 �ۿ��� ȣ���ϴ� ���
		Method main = helloClass.getDeclaredMethod("main");
		main.setAccessible(true); //private�� main()�� ȣ�� �����ϰ� �Ѵ�.
		
		main.invoke(hello); //hello.main() ȣ��� �Ȱ���
	}
}
