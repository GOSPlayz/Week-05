package week05;

public class Application {

	public static void main(String[] args) {
		
		Logger loggerAsterisk = new AsteriskLogger();
		Logger loggerSpace = new SpaceLogger();
		
		loggerAsterisk.log("Hello");
		loggerAsterisk.error("Hello");
		
		loggerSpace.log("Hello");
		loggerSpace.error("Hello");
		
	}

}




