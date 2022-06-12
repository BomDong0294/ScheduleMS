package log;

import java.io.*;
import java.util.logging.*;

public class EventLogger{
	FileHandler filehandler;
	LogManager logmanager;
	Logger logger;

	public EventLogger(String fileName) {
		try { // log파일을 생성하고 할당함.
			logmanager = LogManager.getLogManager();
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			filehandler = new FileHandler(fileName);
			filehandler.setFormatter(new SimpleFormatter());
			logger.addHandler(filehandler);
		} catch (IOException e) {
			// input/output 예외가 뜨면 예외처리를 함.
			e.printStackTrace();
		}
	}
	
	public void log(String logMessage) {
		logger.info(logMessage);
	} // 로그 메시지를 저장하는 함수.

}
