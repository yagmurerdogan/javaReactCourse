package interfaces;

public class CustomerManager {

	// loosly-tightly coupled

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Customer " + customer.getFirstName() + " added!");

		Utils.runLoggers(loggers, customer.getFirstName());

	}

	public void delete(Customer customer) {
		System.out.println("Customer " + customer.getFirstName() + " deleted!");

		Utils.runLoggers(loggers, customer.getFirstName());
	}

}
