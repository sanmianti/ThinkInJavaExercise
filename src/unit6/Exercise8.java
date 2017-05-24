package unit6;


public class Exercise8 {
	
	public static void main(String[] args){
		Connection[] connections = ConnectionManager.getConnections();
		if (connections == null) {
			ConnectionManager.setConnections();
			connections = ConnectionManager.getConnections();
			System.out.println(connections.length);
		}
		Connection connection = new Connection();
	}

}
class ConnectionManager{
	static Connection[] connections ;
	
	
	public static Connection[] getConnections() {
		if (connections == null) {
			return null;
		}
		return connections;
	}


	public static void setConnections() {
		connections = new Connection[5];
		for (Connection connection : connections) {
			connection = new Connection();
		}
	}
	
	public static Connection getConnection(){
		return new Connection();
	}

}

class Connection{
	
	Connection(){
	}
	
}