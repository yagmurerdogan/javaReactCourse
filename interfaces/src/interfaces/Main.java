package interfaces;

public class Main {

	public static void main(String[] args) {

		Logger[] loggers = { new SmsLogger(), new EmailLogger() };

		CustomerManager customerManager = new CustomerManager(loggers);

		Customer yagmur = new Customer(1, "Yagmur", "Erdogan");
		customerManager.add(yagmur);
	}

}
