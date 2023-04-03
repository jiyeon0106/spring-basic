package com.fastcampus.ch3.diCopy2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

class Car {}
class SportsCar extends Car {}
class Truck extends Car {}
class Engine {}

class AppContext {
	Map map; //객체 저장소
	
	//생성자
	AppContext() {
//		map = new HashMap();
//		map.put("car",new SportsCar());
//		map.put("engine", new Engine());
		
		try {
			Properties p = new Properties();
			p.load(new FileReader("config.txt")); //예외처리 필요
			
			// Properties에 저장된 내용을 Map에 저장
			map = new HashMap(p);
			
			// 반복문으로 클래스 이름을 얻어서 객체를 생성해 다시 map에 저장
			for(Object key : map.keySet()) {
				Class clazz = Class.forName((String)map.get(key));
				map.put(key, clazz.newInstance());
			}
		}
//			Class clazz = Class.forName(p.getProperty("car"));
			catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	//map에 담겨있는 객체 반환
	Object getBean(String key) {
		return map.get(key);
	}
}

public class Main2 {
	public static void main(String[] args) throws Exception {
		AppContext ac = new AppContext();
		Car car = (Car)ac.getBean("car");
		Engine engine = (Engine)ac.getBean("engine");
//		Car car = getCar();
		System.out.println("car = " + car);
		System.out.println("engine = " + engine);
	}
}