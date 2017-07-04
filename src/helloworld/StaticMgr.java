package helloworld;

import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

public class StaticMgr {
	
	List<Student> studentList = new ArrayList<Student>();
	DataMessenger dm ;
	
	public StaticMgr(DataMessenger dm) {
		// TODO Auto-generated constructor stub
		this.dm = dm;
	}
	public interface DataMessenger{
		
		void sendData(List<Student> data);
	}
	
	public void getDatasFromWeb(){
		studentList.add(new Student("张三"));
		studentList.add(new Student("李四"));
		studentList.add(new Student("王五"));
		
		dm.sendData(studentList);
	}
	
}
