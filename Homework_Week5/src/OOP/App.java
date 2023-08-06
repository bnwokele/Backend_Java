package OOP;

public class App {
	
	public static void main(String[] args) {
		LoggerInterface logger1 = new AsteriskLogger();
		logger1.log("Will master OOP");
		logger1.error("This is an error, pls fix");
		LoggerInterface logger2 = new SpacedLogger();
		logger2.log("Homework 5");
		logger2.error("This is an error, pls fix");
	}

}
