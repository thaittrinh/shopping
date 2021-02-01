package thai.com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import thai.com.example.entity.Product;
import thai.com.example.entity.ProductType;
import thai.com.example.logic.ProductLogic;

@Service
public class ProductService {

  @Autowired
  ProductLogic productLogic;

  @Transactional(readOnly = true)
  public ProductType getProductType(String name) {
    return productLogic.getProductType(name);
  }
  
  @Transactional
  public ProductType saveProductType(ProductType productType) {
    return productLogic.saveProductType(productType);
  }
  
  @Transactional
  public List<ProductType> findAllProductTypes() {
    return productLogic.findAllProductTypes();
  }
  
  @Transactional(readOnly = true)
  public Product getProduct(String code) {
    return productLogic.getProduct(code);
  }
  
  @Transactional
  public Product saveProduct(Product product) {
    return productLogic.saveProduct(product);
  }
  
  @Transactional
  public List<Product> findAllProducts() {
    return productLogic.findAllProducts();
  }
}
