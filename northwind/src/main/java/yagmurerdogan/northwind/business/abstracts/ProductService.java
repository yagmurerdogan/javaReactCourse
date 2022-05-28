package yagmurerdogan.northwind.business.abstracts;

import java.util.List;

import yagmurerdogan.northwind.entities.concretes.Product;

public interface ProductService {

	List<Product> getAll();

}
