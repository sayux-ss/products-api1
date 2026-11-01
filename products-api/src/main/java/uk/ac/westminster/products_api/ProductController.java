package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductsService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/products")
    public Product addProducts(@RequestBody Product product) {
        return productService.addProduct(product);
    }

//    @GetMapping("/{id}")
//    public Product getById(@PathVariable Long id) {
//        return new Product(id, "Laptop", 999.99);
//    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id).orElse(null);
    }
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
    @GetMapping("/products/search")
    public List<Product> search(@RequestParam String name) {
        return productService.findByName(name);
    }
}
