package com.ECommerce.productRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ECommerce.product.Product;
@Repository
public interface ProductRepository {
public interface ProductRepository extends JpaRepository<Product, Long> {
	public Product findById(long id);
}
}
