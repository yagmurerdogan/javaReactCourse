package intro;

public class Main {

	public static void main(String[] args) {

		String internetBranchButton = "İnternet Şubesi";

		double dollarYesterday = 8.15;
		double dollarToday = 8.18;

		int expiry = 12;

		boolean isYesterdayHigher = false;

		System.out.println(internetBranchButton);

		if (dollarToday < dollarYesterday) {
			isYesterdayHigher = true;
			System.out.println("Dollar down");

		} else if (dollarToday > dollarYesterday) {
			isYesterdayHigher = false;
			System.out.println("Dollar up");

		} else {
			System.out.println("Same as yesterday");
		}

		String[] credits = { "Hızlı Kredi", "Mutlu Emekli Kredisi", "Konut Kredisi", "Çiftçi Kredisi" };

		for (String credit : credits) {
			System.out.println(credit);
		}

		for (int i = 0; i < credits.length; i++) {
			System.out.println(credits[i]);
		}

		// Stack
		int number1 = 10;
		int number2 = 20;
		number1 = number2;
		number2 = 100;
		System.out.println(number1);
		// answer: 20

		// Heap
		int[] numbers1 = { 1, 2, 3, 4, 5 };
		int[] numbers2 = { 10, 20, 30, 40, 50 };
		numbers1 = numbers2;
		numbers2[0] = 100;
		System.out.println(numbers1[0]);
		// answer: 100

	}

}
