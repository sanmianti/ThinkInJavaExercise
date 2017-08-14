package unit5;

public class Exercise21 {

	Money moneyType;
	
	public Exercise21(Money moneyType) {
		// TODO Auto-generated constructor stub
		this.moneyType = moneyType;
	}
	
	public void describe(){
		switch (moneyType) {
		case YIMAO:
			System.out.println("ä¸?æ¯?");
			break;
		case YIYUAN:
			System.out.println("ä¸?å…?");
			break;
		case WUYUAN:
			System.out.println("äº”å…ƒ");
			break;
		case SHIYUAN:
			System.out.println("åå…ƒ");
			break;
		case YIBAIYUAN:
			System.out.println("ä¸?ç™¾å…ƒ");
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Money money : Money.values()) {
			System.out.println(money);
		}
		
		new Exercise21(Money.WUYUAN).describe();
		new Exercise21(Money.YIBAIYUAN).describe();
		
		System.out.println(Money.YIMAO.ordinal());
	}

}

enum Money{
	YIMAO, YIYUAN, WUYUAN, SHIYUAN, YIBAIYUAN;
}
