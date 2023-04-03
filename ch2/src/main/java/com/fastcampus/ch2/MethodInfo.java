package com.fastcampus.ch2;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.StringJoiner;

public class MethodInfo {
	public static void main(String[] args) throws Exception{
		
		//1.YoilTellerŬ������ ��ü�� ����
		Class clazz = Class.forName("com.fastcampus.ch2.YoilTellerMVC");
		Object obj = clazz.newInstance();
		
		//2.��� �޼ҵ� ������ �����ͼ� �迭�� ����
		//�޼ҵ尡 ������ �� �� �ֱ� ������ ��ȯ Ÿ���� �޼ҵ� �迭�� �Ǿ� ����
		Method[] methodArr = clazz.getDeclaredMethods();
		
		//�ݺ������� �޼ҵ� �ϴϾ� �о� ���� ���
		for(Method m : methodArr) {
			String name = m.getName(); //�޼ҵ��� �̸�
			Parameter[] paramArr = m.getParameters(); //�Ű����� ���
//			Class[] paramTypeArr = m.getParameterTypes();
			Class returnType = m.getReturnType(); //�޼ҵ��� ��ȯ Ÿ��
			
			StringJoiner paramList = new StringJoiner(", ", "(", ")");
			
			//�޼ҵ��� �Ű������� �������� �� �����Ƿ� �ݺ���
			for(Parameter param : paramArr) {
				String paramName = param.getName();
				Class  paramType = param.getType();
				
				paramList.add(paramType.getName() + " " + paramName);
			}
			
			System.out.printf("%s %s%s%n", returnType.getName(), name, paramList);
		}
	} // main
}