package test;

import java.util.Random;

public class Shaps {
	
	private static RandomShapeGenerator gen  = 
			new RandomShapeGenerator();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape1[] shape1s = new Shape1[9];
		for(int i = 0; i < shape1s.length; i++){
			shape1s[i] = gen.next();
		}
		for (Shape1 shape1 : shape1s) {
			shape1.draw();
			shape1.color();
		}
	}

	public static void ride(Shape1 shape1){
		System.out.println("wheels nmuber:" + shape1);
	}
}

class Shape1{
	public void draw(){
		
	}
	public void erase(){
		
	}
	public void color(){
		System.out.println("Shape1.color()");
	}
}
class Circle1 extends Shape1{
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle.draw()");
	}
	@Override
	public void erase() {
		// TODO Auto-generated method stub
		System.out.println("Circle.erase()");
	}
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Circle1.color()");
	}
	public int wheels(){
		return 4;
	}
}

class Square1 extends Shape1{
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square1.draw()");
	}
	@Override
	public void erase() {
		// TODO Auto-generated method stub
		System.out.println("Square1.erase()");
	}
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Squrel.color()");
	}
}


class Triangle1 extends Shape1{
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Triangle1.draw()");
	}
	@Override
	public void erase() {
		// TODO Auto-generated method stub
		System.out.println("Triangle1.erase()");
	}
	
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Triangle1.color()");
	}
}

class RandomShapeGenerator{
	private Random random = new Random(47);
	public Shape1 next(){
		switch (random.nextInt(3)) {
		default:
		case 0:
			return new Circle1();
		case 1:
			return new Square1();
		case 3:
			return new Triangle1();
		}
	}
}