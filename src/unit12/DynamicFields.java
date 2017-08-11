package unit12;

import javax.xml.transform.Templates;

public class DynamicFields {
	private Object[][] fileds;
	//完成二维数组初始化
	public DynamicFields(int initialSize) {
		// TODO Auto-generated constructor stub
		fileds = new Object[initialSize][2];
		for(int i = 0; i < initialSize; i++){
			fileds[i] = new Object[]{null, null};
		}
	}
	//打印二维数组
	public String toString(){
		StringBuffer result = new StringBuffer();
		for(Object[] objects : fileds){
			result.append(objects[0]);
			result.append(": ");
			result.append(objects[1]);
			result.append("\n");
		}
		return result.toString();
	}
	//判断是否存在某一字符串
	private int hasFiled(String id){
		for(int i = 0; i < fileds.length; i++){
			if (id.equals(fileds[i][0])) {
				return i;
			}
		}
		return -1;
	}
	private int getFieldNumber(String id) throws NoSuchFieldException{
		int fieldNum = hasFiled(id);
		if (fieldNum == -1) {
			throw new NoSuchFieldError();
		}
		return fieldNum;
	}
	private int makeField(String id){
		for(int i = 0; i < fileds.length; i++){
			if (fileds[i][0] == null) {
				fileds[i][0] = id;
				return i;
			}
		}
		//创建一个比初始数组大一的临时数组
		Object[][] tmp = new Object[fileds.length + 1][2];
		for(int i = 0; i < fileds.length; i++){
			tmp[i] = fileds[i];
		}
		for(int i = fileds.length; i < tmp.length; i++){
			tmp[i] = new Object[]{null, null};
		}
		fileds = tmp;
		return makeField(id);
	}
	
	public Object getFiled(String id) throws NoSuchFieldException{
		return fileds[getFieldNumber(id)][1];
	}
	public Object setField(String id, Object value) throws DynamicFiledsException{
		if (value == null) {
			//Most exception do not hava a "cause" constructor.
			//In these cases you must use initCause().
			//available in all Throwable subclasses.
			DynamicFiledsException dfe = new DynamicFiledsException();
			dfe.initCause(new NullPointerException());
			throw dfe;
		}
		int fieldNumber = hasFiled(id);
		if (fieldNumber == -1) {
			fieldNumber = makeField(id);
		}
		Object result = null;
		try{
			result = getFiled(id);
		}catch(NoSuchFieldException e){
			//Use constructor that takes "cause"
			throw new RuntimeException(e);
		}
		fileds[fieldNumber][1] = value;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicFields df = new DynamicFields(3);
		System.out.println(df);
		try {
			df.setField("d", "A value for d");
			df.setField("number", 47);
			df.setField("number2", 48);
			System.out.println(df);
			df.setField("d", "A new value for d");
			df.setField("number3", 11);
			System.out.println(df);
			System.out.println("df.getField(\"d\"): " + df.getFiled("d"));
			Object field = df.setField("d", null);
		} catch (DynamicFiledsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
class DynamicFiledsException extends Exception{
	
}