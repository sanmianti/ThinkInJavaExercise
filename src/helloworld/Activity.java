package helloworld;

import java.util.ArrayList;
import java.util.List;

import helloworld.StaticMgr.DataMessenger;

public class Activity  {
	
	public static void main(String[] args){
		Activity activity = new Activity();
		activity.getData();
	}
	
	List<Student> studentList = new ArrayList<Student>();
	
	class DataMessengerImpl implements DataMessenger{

		@Override
		public void sendData(List<Student> data) {
			// TODO Auto-generated method stub
			studentList = data;
		}
		
	}
	
	public void getData(){
		StaticMgr mgr = new StaticMgr(new DataMessengerImpl());
		mgr.getDatasFromWeb();
		System.out.println("获取到" + studentList.size() + "条数据");
	}
}
