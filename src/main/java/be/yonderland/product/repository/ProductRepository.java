package be.yonderland.product.repository;

import be.yonderland.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findProductByProductId(Long productId);

    Integer deleteByProductId(Long productId);
}
