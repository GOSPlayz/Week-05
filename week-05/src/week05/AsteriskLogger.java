package week05;

public class AsteriskLogger implements Logger {

		@Override
		public void log(String log) {
			
			System.out.println("***" + log + "***");
		}

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




