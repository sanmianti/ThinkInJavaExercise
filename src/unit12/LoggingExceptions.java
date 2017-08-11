package unit12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			// TODO: handle exception
			System.err.println("Caught " + e);
		}
		
		try {
			throw new LoggingException();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Caught " + e);
		}
	}

}
class LoggingException extends Exception{
	private static Logger logger = Logger.getLogger("LoggingException......");
	public LoggingException(){
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
		logger.warning(trace.toString());
	}
}