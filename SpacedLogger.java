
public class SpacedLogger implements Logger {
//The SpacedLogger should add spaces between each character of the String argument passed into its methods.
//If the log method received “Hello” as an argument, it should print H e l l o
//The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
	
	@Override
	public void log(String log) {
		StringBuilder result = new StringBuilder(); // iterates over String passed through log, appends a space after each string.
		for (int i = 0; i < log.length(); i++) {
		   if (i > 0) {
		      result.append(" ");
		    }

		   result.append(log.charAt(i));
		}

		System.out.println(result.toString());
		
	}

	@Override
	public void Error(String Error) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < Error.length(); i++) {
		   if (i > 0) {
		      result.append(" ");
		    }

		   result.append(Error.charAt(i));
		}

		System.out.println("ERROR: " + result.toString());
		
	}

}
