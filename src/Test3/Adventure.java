package Test3;

public class Adventure {

	public static void t(CanFight x){x.fight();}
	public static void u(CanSwim x){x.swim();}
	public static void v(CanFly x){x.fly();}
	public static void w(ActionCharacter x){x.fight();}
	public static void x(CanClimb x){x.climb();}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero  = new Hero();
		t(hero);
		u(hero);
		v(hero);
		w(hero);
		x(hero);
	}

}

interface CanFight{
	void fight();
}
interface CanFly{
	void fly();
}
interface CanSwim{
	void swim();
}
interface CanClimb{
	void climb();
}
class ActionCharacter{
	public void fight() {
		
	}
}


class Hero extends ActionCharacter implements CanClimb, CanFight, CanFly, CanSwim{
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void climb() {
		// TODO Auto-generated method stub
		
	}
}