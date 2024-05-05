package week05;

public class SpaceLogger implements Logger {

		@Override
		public void log(String log) {
				String result = "";
			for (int i = 0; i < log.length(); i ++) {
				
				result = result + log.charAt(i) + " ";
				
			}
			System.out.println(result);
		}

		@Override
		public void error(String error) {
			String result = "";
			for (int i = 0; i < error.length(); i ++) {
				
				result = result + error.charAt(i) + " ";
				
			}
			System.out.println("ERROR: " + result);
			
		}
	}

