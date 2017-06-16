package test2;

public class PolyConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RoundGlyph(5);
	}

}
class Glyph{
	void draw(){
		System.out.println("Glyph.draw()");
	}
	public Glyph() {
		// TODO Auto-generated constructor stub
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph{
	private int radius = 1;
	public RoundGlyph(int r) {
		// TODO Auto-generated constructor stub
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
}