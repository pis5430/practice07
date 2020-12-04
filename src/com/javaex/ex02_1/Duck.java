package com.javaex.ex02_1;

public class Duck extends Bird {


	public void sing() {
		System.out.println("오리(" + super.name + ")가 소리내어 웁니다.");
	}

	public void fly() {
		System.out.println("오리(꽥꽥이)가 날지 않습니다.");
	}

	public void showName() {
		System.out.println("오리의 이름은 " + super.name + " 입니다.");
	}

}
