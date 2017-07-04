package Test3;

import java.awt.image.renderable.RenderableImage;

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
		
		HorrorShow hs = new HorrorShow();
		hs.getDM().menace();
		hs.getVampire().destroy();
		
	}
	
	DangerousMonster getDM(){
		return new DangerousMonster() {
			
			@Override
			public void menace() {
				// TODO Auto-generated method stub
				System.out.println("menace()");
			}
			
			@Override
			public void destroy() {
				// TODO Auto-generated method stub
				System.out.println("destroy()");
			}
		};
	}
	
	Vampire getVampire(){
		return new Vampire() {
			
			@Override
			public void kill() {
				// TODO Auto-generated method stub
				System.out.println("kill()");
			}
			
			@Override
			public void menace() {
				// TODO Auto-generated method stub
				System.out.println("menace()");
			}
			
			@Override
			public void destroy() {
				// TODO Auto-generated method stub
				System.out.println("destroy()");
			}
			
			@Override
			public void drinkBlood() {
				// TODO Auto-generated method stub
				System.out.println("drinkBlood()");
			}
		};
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