package yagmurerdogan.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import yagmurerdogan.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
