package logs;

import org.apache.log4j.Logger;

public class Tests_log {

	public static void main(String[] args) {
		
		Logger APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
		APPLICATION_LOGS.debug("Starting Test");
		APPLICATION_LOGS.debug("Executing ");
		APPLICATION_LOGS.debug("Ending");
		

	}

}
