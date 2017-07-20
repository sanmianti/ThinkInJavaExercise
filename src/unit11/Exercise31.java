package unit11;

import java.util.Iterator;
import java.util.Random;

public class Exercise31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomShapeGenerator rShapeGenerator = new RandomShapeGenerator(10);
		for (Shape shape : rShapeGenerator) {
			shape.color();
			shape.draw();
			shape.erase();
		}
	}

}

class RandomShapeGenerator implements Iterable<Shape>{
	Shape[] shapes ;
	public RandomShapeGenerator(int elementNum) {
		// TODO Auto-generated constructor stub
		shapes = new Shape[elementNum];
		Random random = new Random(25);
		for(int i = 0; i < shapes.length; i++){
			switch (random.nextInt(3)) {
			case 0:
				shapes[i] = new Circle();
				break;
			case 1:
				shapes[i] = new Square();
				break;
			case 2:
				shapes[i] = new Triangle();
				break;
			default:
				break;
			}
		}
	}
	@Override
	public Iterator<Shape> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Shape>() {
			
			private int index = 0;
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index < shapes.length;
			}
			@Override
			public Shape next() {
				// TODO Auto-generated method stub
				return shapes[index++];
			}
			@Override
			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}
		};
	}
}

class Shape{
	public void draw(){
		System.out.println(getClass().getSimpleName() + ".draw()");
	}
	public void erase(){
		System.out.println(getClass().getSimpleName() + ".erase()");
	}
	public void color(){
		System.out.println(getClass().getSimpleName() + ".color()");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
	}
	@Override
	public void erase() {
		// TODO Auto-generated method stub
		super.erase();
	}
	@Override
	public void color() {
		// TODO Auto-generated method stub
		super.color();
	}
}
class Square extends Shape{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
	}
	@Override
	public void erase() {
		// TODO Auto-generated method stub
		super.erase();
	}
	@Override
	public void color() {
		// TODO Auto-generated method stub
		super.color();
	}
}
class Triangle extends Shape{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
	}
	@Override
	public void erase() {
		// TODO Auto-generated method stub
		super.erase();
	}
	@Override
	public void color() {
		// TODO Auto-generated method stub
		super.color();
	}
}