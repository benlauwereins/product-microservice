package be.yonderland.product.controller;

import be.yonderland.product.entity.Product;
import be.yonderland.product.repository.ProductRepository;
import be.yonderland.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public Product saveProduct(@RequestBody Product product) {
        log.info("saveProduct in ProductController");
        return productService.saveProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public Integer deleteProduct(@PathVariable("id") Long productId) {
        log.info("deleteProduct in ProductController");
        return productService.deleteProduct(productId);
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable("id") Long productId) {
        log.info("findProductById in ProductController");
        return productService.findProductById(productId);
    }

    @GetMapping("/all")
    public List<Product> findAll() {
        log.info("findAll in ProductController");
        return productService.findAll();
    }
}
