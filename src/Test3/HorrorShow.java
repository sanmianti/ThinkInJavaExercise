package Test3;

public class HorrorShow {

	static void u(Moster b){b.menace();}
	static void v(DangerousMonster d){
		d.menace();
		d.destroy();
	}
	static void w(Lethal l){ l.kill(); }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
		
	}

}
interface Moster{
	void menace();
}
interface DangerousMonster extends Moster{
	void destroy();
}
interface Lethal{
	void kill();
}
class DragonZilla implements DangerousMonster{
	@Override
	public void menace() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
interface Vampire extends DangerousMonster, Lethal{
	void drinkBlood();
}
class VeryBadVampire implements Vampire{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menace() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drinkBlood() {
		// TODO Auto-generated method stub
		
	}
	
}