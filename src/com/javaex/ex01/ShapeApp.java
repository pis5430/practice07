package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		//Shape s = new Shape("빨강"); abstract 때문에 Shape 자체로 불러오면 오류남
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 12, 10);
		
		//sr1을 그리는 메소드 호출
		
		sr1.draw();
		
		//sr1의 가로크기 출력
		// 1. 가로를 구하는 메소드를 만든다. ex) drawWidth() -->복잡한 식일때 사용
		// 2. Shape에서 getter로 width값을 불러온다.  --> 가로값만 가져오면 되서 이걸로 사용!
		// Ractangle에 getter가 안만들어져 있어서 만들어야함
		
		System.out.println("sr1의 가로는 " + ((Ractangle)sr1).getWidth() + " 입니다.");
		
	}
}

	
	