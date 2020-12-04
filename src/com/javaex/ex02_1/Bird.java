package com.javaex.ex02_1;

public abstract class Bird { // name을 private으로 바꿔서 getName을 활용해서 다시 풀어보기

	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void fly();

	public abstract void sing();

	public abstract void showName();

}
