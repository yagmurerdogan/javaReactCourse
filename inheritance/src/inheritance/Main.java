package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer yagmur = new IndividualCustomer();
		yagmur.customerNumber = "12345";

		CorporateCustomer ekar = new CorporateCustomer();
		ekar.customerNumber = "ekar";

		CustomerManager customerManager = new CustomerManager();
		Customer[] customers = { yagmur, ekar };
		customerManager.addMultiple(customers);

	}

}
