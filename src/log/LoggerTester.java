package log;

import java.io.Serializable;

public class LoggerTester implements Serializable{
	private static final long serialVersionUID = -4869772762737823528L;

	public static void main(String[] args) {
		EventLogger logger = new EventLogger("log.txt");
		logger.log("test");
	}
}
