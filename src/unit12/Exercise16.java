package unit12;

import org.omg.CORBA.INTERNAL;

public class Exercise16 extends Shape{

	private Circle circle;
	private Triangle triangle;
	private Line[] lines = new Line[3];
	
	public Exercise16(int i) {
		// TODO Auto-generated constructor stub
		
		super(i + 1);
		System.out.println("Combined constructor");
		for(int j = 0; j < lines.length; j++){
			lines[j] = new Line(j, j*j);
		}
		circle = new Circle(1);
		triangle = new Triangle(1);
		
	}
	
	@Override
	void dispose() {
		// TODO Auto-generated method stub
		System.out.println("CADSystem.dispose()");
		triangle.dispose();
		circle.dispose();
		for (Line line : lines) {
			line.dispose();
		}
		
		
		super.dispose();
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise16 x = new Exercise16(47);
		try {
		  return;
		} finally{
			x.dispose();
		}
	}

}

class Shape{
	public Shape(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Shape constructor");
	}
	void dispose(){
		System.out.println("Shape dispose");
	}
}

class Circle extends Shape{
	public Circle(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Darwing Circle");
	}
	
	@Override
	void dispose() {
		// TODO Auto-generated method stub
		System.out.println("Erasing Circle");
		super.dispose();
	
	}
}

class Triangle extends Shape{
	public Triangle(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Drawing Triangle");
	}
	
	@Override
	void dispose() {
		// TODO Auto-generated method stub
		System.out.println("Erasing Triangle");
		super.dispose();
	}
}

class Line extends Shape{
	private int start ,end;
	public Line(int start, int end) {
		// TODO Auto-generated constructor stub
		super(start);
		this.end = end;
		this.start = start;
		System.out.println("Drawing Line: " + start + ", " + end);;
	}
	
	@Override
	void dispose() {
		// TODO Auto-generated method stub
		System.out.println("Erasing Line: " + start + ", " + end);
		super.dispose();
	}
}