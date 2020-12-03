package com.javaex.ex02;

public abstract class Bird {
    protected String name;
    
    public abstract void getName();
    
    //setName에도 abstract를 넣어서 실행하는 방법?
    
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void setName();
    public abstract void fly();
    public abstract void sing();
    public abstract void showName();

}
