package log;

public class LoggerTester {

	public static void main(String[] args) {
		EventLogger logger = new EventLogger("log.txt");
		logger.log("test"); // 텍스트 파일을 하나 생성함
	}
}
