package yagmurerdogan.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yagmurerdogan.northwind.business.abstracts.ProductService;
import yagmurerdogan.northwind.dataAccess.abstracts.ProductDao;
import yagmurerdogan.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;

	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		return this.productDao.findAll();
	}

}
