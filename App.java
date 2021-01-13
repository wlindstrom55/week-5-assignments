
public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
	
		
		logger.log("Hello");
		logger.Error("Hello");
		
		logger2.log("Hello");
		logger2.Error("Hello");

	}

}
