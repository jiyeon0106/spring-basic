//package com.fastcampus.ch3;
//
//import java.util.Arrays;
//
//import javax.annotation.Resource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.GenericXmlApplicationContext;
//import org.springframework.stereotype.Component;
//
//@Component
//class Car {
//	@Value("red") String color;
//	@Value("100") int oil;
////	@Autowired // byType
////	@Qualifier("superEngine")
//	@Resource(name="superEngine") // byName
//	Engine engine; // byType - 타입으로 먼저 검색, 여러개면 이름으로 검색. - engine, superEngine, turboEngine
//	@Autowired Door[] doors;
//	
//	public Car() {} // 기본 생성자를 꼭 만들어주자!
//	// <constructor-arg> - 생성자 사용
//	public Car(String color, int oil, Engine engine, Door[] doors) {
//		super();
//		this.color = color;
//		this.oil = oil;
//		this.engine = engine;
//		this.doors = doors;
//	}
//	
//	// <property> - setter 사용
//	public void setColor(String color) {
//		this.color = color;
//	}
//	public void setOil(int oil) {
//		this.oil = oil;
//	}
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}
//	public void setDoors(Door[] doors) {
//		this.doors = doors;
//	}
//	
//	@Override
//	public String toString() {
//		return "Car {color=" + color + ", oil=" + oil + ", engine=" + engine + ", doors=" + Arrays.toString(doors)
//				+ "}";
//	}	
//}
////@Component("engine")
//class Engine {} // <bean id="engine" class="com.fastcampus.ch3.Engine"/>
//@Component
//class SuperEngine extends Engine {}
//@Component
//class TurboEngine extends Engine {}
//@Component
//class Door {}
//
//public class SpringDiTest {
//
//	public static void main(String[] args) {
//		// config.xml에 설정된 클래스 정보를 읽어 저장소 안에 객체가 만들어짐 (map 형태)
//		ApplicationContext ac = new GenericXmlApplicationContext("config.xml");
//		// getBean으로 가져다 사용
////		Car car = (Car) ac.getBean("car"); //byName. 아래와 같은 문장
//		Car car = ac.getBean("car", Car.class); //byName
////		Car car2 = (Car) ac.getBean(Car.class); //byType
//		
////		Engine engine = (Engine) ac.getBean("engine"); //byName
////		Engine engine = (Engine) ac.getBean(Engine.class); //byType - 같은 타입 여러개(3개)라 에러
////		Engine engine = (Engine) ac.getBean("superEngine"); 
////		Door door = (Door) ac.getBean("door");
//		
////		car.setColor("red");
////		car.setOil(100);
////		car.setEngine(engine);
////		car.setDoors(new Door[] {ac.getBean("door", Door.class), ac.getBean("door", Door.class)});
//		
//		System.out.println("car = " + car);
////		System.out.println("car2 = " + car2);
////		System.out.println("engine = " + engine);
////		System.out.println("door = " + door);
//	}
//}
