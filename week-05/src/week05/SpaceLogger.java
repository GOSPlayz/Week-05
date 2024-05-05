package week05;

public class SpaceLogger implements Logger {

		// takes the string input and puts a space in between each character
		// example H e l l o 
		
		@Override
		public void log(String log) {
				String result = "";
			for (int i = 0; i < log.length(); i ++) {
				
				result = result + log.charAt(i) + " ";
				
			}
			System.out.println(result);
		}

		
		// takes the string input and puts a space in between each character and puts "ERROR: " in front of the given string
		// example ERROR: H e l l o
		@Override
		public void error(String error) {
			String result = "";
			for (int i = 0; i < error.length(); i ++) {
				
				result = result + error.charAt(i) + " ";
				
			}
			System.out.println("ERROR: " + result);
			
		}
	}

