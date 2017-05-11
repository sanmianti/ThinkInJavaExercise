package unit5;

/**
 * 练习10、练习11
 * 
 * @author zlm
 *
 */
public class Exercise10 {

	public static void main(String [] args){
		
		for(int i = 0; i < 10; i++){
			System.out.print(i + "");
			new Exercise10();
			//告诉垃圾回收器可以进行垃圾回收工作，但是否进行垃圾回收工作并不确定
			System.gc();
			//强制调用已经失去引用的对象的finalize方法
			System.runFinalization();
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalize");
		super.finalize();
	}
}
