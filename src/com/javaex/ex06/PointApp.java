package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
	}

}

//p1과 p2는 주소가 다르기 때문에 false
//				"
//				"
//p4는 p1과 같은 주소기 때문에 true
//p1과 p2는 주소가 다르기 때문에 false
//p4는 p1과 같은 주소기 때문에 true

//기본적으로 Object 클래스(equals() 메소드를 포함 함)를 상위받았기 때문에 실행이 된다.
