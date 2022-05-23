package oopIntro;

public class Main {

	public static void main(String[] args) {

		// instance creation
		Product productInstance = new Product(1, "Lenovo V14", 15000, "16GB RAM");

		// instance creation
		Product productInstance2 = new Product();
		productInstance2.id = 1;
		productInstance2.name = "Lenovo V15";
		productInstance2.unitPrice = 16000;
		productInstance2.detail = "16GB RAM";

		// instance creation
		Product productInstance3 = new Product();
		productInstance3.id = 1;
		productInstance3.name = "HP 5";
		productInstance3.unitPrice = 10000;
		productInstance3.detail = "8GB RAM";

		Product[] products = { productInstance, productInstance2, productInstance3 };

		for (Product product : products) {
			System.out.println(product.name);
		}

		System.out.println(products.length);

		Category categoryInstance = new Category();
		categoryInstance.id = 1;
		categoryInstance.name = "Bilgisayar";

		Category categoryInstance2 = new Category();
		categoryInstance2.id = 2;
		categoryInstance2.name = "Ev/Bahçe";

		ProductManager productManager = new ProductManager();
		productManager.addToCart(productInstance);
	}

}
