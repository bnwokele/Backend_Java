package OOP;

public class SpacedLogger implements LoggerInterface {

	@Override
	public void log(String log) {
		StringBuilder newLog = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			newLog.append(log.charAt(i) + " ");
		}
		System.out.println(newLog);
	}

	@Override
	public void error(String error) {
		StringBuilder newError = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			newError.append(error.charAt(i) + " ");
		}
		System.out.println("Error: " + newError);
		
	}

}
