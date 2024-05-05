package week05;


public class AsteriskLogger implements Logger {

	
	
		//puts three asterisks behind and in front of the given string
		// example ***Hello***
	
		@Override
		public void log(String log) {
			
			System.out.println("***" + log + "***");
		}

		
		
		// creates a box around the input string made out of asterisks and is dynamic to the length of the word. 
		//	example	******************
		//			***Error: Hello***
		//			******************

		
		@Override
		public void error(String error) {
			
			String box = "*************";
			
			for (int i = 0; i < error.length(); i++) {
				box = box + "*";
			}
			
			System.out.println(box);
			System.out.println("***Error: " + error + "***");
			System.out.println(box);
		}
}




