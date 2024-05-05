package week05;

public class Application {

	public static void main(String[] args) {
		
		// calls for the AsteriskLogger class
		Logger loggerAsterisk = new AsteriskLogger();
		
		// calls for the AsteriskLogger class
		Logger loggerSpace = new SpaceLogger();
		
		
		//input for AsterisksLogger class's methods
		loggerAsterisk.log("Hello");
		loggerAsterisk.error("Hello");
		
		//input for SpaceLogger class's methods
		loggerSpace.log("Hello");
		loggerSpace.error("Hello");
		
	}

}




