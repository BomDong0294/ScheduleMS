package log;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import function.ScheduleMethod;

public class EventLogger {
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
	
	public static ScheduleMethod getObject(String filename) {
		ScheduleMethod schfunction = null;
		FileInputStream file;
		try { // 파일로 받아들이고 readObject()를 통해서 객체를 받아옴.
			file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			schfunction = (ScheduleMethod)in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return schfunction; // 예외처리 및 파일을 받지 못하면 객체 반환
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 예외 처리
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 예외 처리
		}
		return schfunction;
	}
	
	public static void putObject(ScheduleMethod schfunction, String filename) {
		try { // 객체를 텍스트 파일에 작성함.
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(schfunction);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // 예외처리
		} catch (IOException e) {
			e.printStackTrace(); // 예외처리
		}
	}
}
