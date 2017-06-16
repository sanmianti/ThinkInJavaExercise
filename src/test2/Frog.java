package test2;

public class Frog extends Amphibian{

	private Characteristic characteristic = new Characteristic("Croaks");
	private Description description = new Description("Eats Bugs");
	public Frog() {
		// TODO Auto-generated constructor stub
		System.out.println("Frog()");
	}
	@Override
	protected void dispose() {
		// TODO Auto-generated method stub
		System.out.println("Frog dispose");
		characteristic.dispose();
		description.dispose();
		super.dispose();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frog frog = new Frog();
		System.out.println("Bye!");
		frog.dispose();
	}

}
class Characteristic{
	private String s;
	public Characteristic(String s) {
		// TODO Auto-generated constructor stub
		this.s = s;
		System.out.println("Creating Characteristic " + s);
	}
	
	protected void dispose() {
		System.out.println("disposing Characteristic " + s);
	}
}
class Description{
	private String s;
	public Description(String s) {
		// TODO Auto-generated constructor stub
		this.s = s;
		System.out.println("Creating Description " + s);
	}
	
	protected void dispose() {
		System.out.println("disposing Description " + s);
	}
}
class LivingCreature{
	private Characteristic characteristic = new Characteristic("is alive");
	private Description description = new Description("Basic Living Creature");
	
	public LivingCreature() {
		// TODO Auto-generated constructor stub
		System.out.println("LivingCreature()");
	}
	
	protected void  dispose() {
		System.out.println("LivingCreature dispose");
		characteristic.dispose();
		description.dispose();
	}
}
class Animal extends LivingCreature{
	private Characteristic characteristic = new Characteristic("has heart");
	private Description description = new Description("Animal not Vegetable");
	public Animal() {
		// TODO Auto-generated constructor stub
		System.out.println("Animal()");
	}
	@Override
	protected void dispose() {
		System.out.println("Animal dispose()");
		characteristic.dispose();
		description.dispose();
		super.dispose();
	}
}
class Amphibian extends Animal{
	private Characteristic characteristic = new Characteristic("can live in water");
	private Description description = new Description("Both water and land");
	public Amphibian() {
		// TODO Auto-generated constructor stub
		System.out.println("Amphibian()");
	}
	@Override
	protected void dispose() {
		// TODO Auto-generated method stub
		System.out.println("Amphibian dispose");
		characteristic.dispose();
		description.dispose();
		super.dispose();
	}
}