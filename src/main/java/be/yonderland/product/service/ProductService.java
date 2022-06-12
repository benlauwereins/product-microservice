package be.yonderland.product.service;

import be.yonderland.product.entity.Product;
import be.yonderland.product.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        log.info("saveProduct in ProductService");
        return productRepository.save(product);
    }

    public Product findProductById(Long productId) {
        log.info("findProductById in ProductService");
        return productRepository.findProductByProductId(productId);
    }

    @Transactional
    public Integer deleteProduct(Long productId) {
        log.info("deleteProduct in ProductService");
        return productRepository.deleteByProductId(productId);
    }

    public List<Product> findAll() {
        log.info("findAll in ProductService");
        return productRepository.findAll();
    }
}
