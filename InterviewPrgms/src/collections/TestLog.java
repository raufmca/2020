package collections;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLog {

	static Logger APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
	public static void main(String[] args) {
		
		//BasicConfigurator.configure();
		
		PropertyConfigurator.configure("C:\\Testing\\Test.txt");
		
		
		
		APPLICATION_LOGS.debug("Starting");
		APPLICATION_LOGS.debug("Executing");
		APPLICATION_LOGS.debug("Ending");

	}

}
