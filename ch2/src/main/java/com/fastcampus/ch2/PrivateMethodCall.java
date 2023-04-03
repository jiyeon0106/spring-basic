package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {
	public static void main(String[] args) throws Exception {
		//Hello hello = new Hello();
		//hello.main(); //private이라서 외부 호출 불가
		
		// Reflection API를 사용 - 클래스 정보를 얻고 다를 수 있는 강력한 기능 제공
		//java.lang.reflect 패키지를 제공
		//Hello 클래스의 Class 객체(클래스의 정보를 담고 있는 객체)를 얻어온다.
		//클래스 파일(*.class)이 메모리에 올라갈 때, 클래스 파일마다 Class 객체가 하나씩 생성된다.
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello"); //예외처리 해줘야 가능
		//클래스 정보를 이용하여 객체 만들기 가능
		//Class 객체는 클래스에 관한 모든 정보를 가지고 있기 때문, class=설계도
		Hello hello = (Hello)helloClass.newInstance(); //Class객체가 가진 정보로 객체 셍성
		//hello 클래스가 가지고 있는 메인 메소드를 밖에서 호출하는 방법
		Method main = helloClass.getDeclaredMethod("main");
		main.setAccessible(true); //private인 main()을 호출 가능하게 한다.
		
		main.invoke(hello); //hello.main() 호출과 똑같음
	}
}
