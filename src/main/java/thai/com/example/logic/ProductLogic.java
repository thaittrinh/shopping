package thai.com.example.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import thai.com.example.entity.Product;
import thai.com.example.entity.ProductType;
import thai.com.example.repository.ProductRepository;
import thai.com.example.repository.ProductTypeRepository;

@Component
public class ProductLogic {

  @Autowired
  ProductTypeRepository productTypeRepo;
  
  @Autowired
  ProductRepository productRepo;
  
  public ProductType getProductType(String name) {
    return productTypeRepo.findByName(name);
  }
  
  public List<ProductType> findAllProductTypes() {
    return productTypeRepo.findAll();
  }
  
  public ProductType saveProductType(ProductType productType) {
    return productTypeRepo.save(productType);
  }
  
  public Product getProduct(String code) {
    return productRepo.findByCode(code);
  }
  
  public List<Product> findAllProducts() {
    return productRepo.findAll();
  }
  
  public Product saveProduct(Product product) {
    return productRepo.save(product);
  }
}
