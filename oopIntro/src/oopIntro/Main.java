package oopIntro;

public class Main {

	public static void main(String[] args) {

		// instance creation
		Product productInstance = new Product(1, "Lenovo V14", 15000, "16GB RAM", 10);

		// instance creation
		Product productInstance2 = new Product();
		productInstance2.setId(2);
		productInstance2.setName("Lenovo V15");
		productInstance2.setDetail("16GB RAM");
		productInstance2.setDiscount(10);
		productInstance2.setUnitPrice(16000);
		productInstance2.getUnitPriceAfterDiscount();

		// instance creation
		Product productInstance3 = new Product();

		Product[] products = { productInstance, productInstance2, productInstance3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}

		System.out.println(products.length);

		Category categoryInstance = new Category();
		categoryInstance.setId(1);
		categoryInstance.setName("Bilgisayar");

		Category categoryInstance2 = new Category();
		categoryInstance2.setId(2);
		categoryInstance2.setName("Ev/Bahçe");

		ProductManager productManager = new ProductManager();
		productManager.addToCart(productInstance);
	}

}
