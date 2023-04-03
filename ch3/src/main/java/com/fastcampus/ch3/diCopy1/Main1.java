package com.fastcampus.ch3.diCopy1;

import java.io.FileReader;
import java.util.Properties;

class Car {}
class SportsCar extends Car {}
class Truck extends Car {}
class Engine {}

public class Main1 {
	public static void main(String[] args) throws Exception {
		Car car = (Car)getObject("car");
		Engine engine = (Engine)getObject("engine");
//		Car car = getCar();
		System.out.println("car = " + car);
		System.out.println("engine = " + engine);
	}
	
	static Object getObject(String key) throws Exception {
		Properties p = new Properties();
		p.load(new FileReader("config.txt")); //예외처리 필요
		
		Class clazz = Class.forName(p.getProperty(key)); //key를 이용해 클래스에 대한 정보를 얻어오기.
		
		//객체 만들어서 반환
		return clazz.newInstance();
	}
	
	static Car getCar() throws Exception {
		Properties p = new Properties();
		p.load(new FileReader("config.txt")); //예외처리 필요
		
		Class clazz = Class.forName(p.getProperty("car")); //key가 car인 entry의 value 얻어옴.
		
		//객체 만들어서 반환
		return (Car)clazz.newInstance();
	}
}