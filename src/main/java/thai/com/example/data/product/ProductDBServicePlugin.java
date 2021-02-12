package thai.com.example.data.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import thai.com.example.config.DBServicePlugin;
import thai.com.example.config.DataDB;
import thai.com.example.entity.Product;
import thai.com.example.service.ProductService;

@Component
public class ProductDBServicePlugin extends DBServicePlugin {

  @Autowired
  ProductService productService;
  
  public void createSammpleData() throws Exception{
    ProductData PRODUCT_DATA = DataDB.getInstance().getData(ProductData.class);
    createProduct(PRODUCT_DATA.ALL_PRODUCT);
  }
  
  private void createProduct(Product[] products) {
    for(int i = 0; i < products.length; i++ ) {
      Product product = products[i];
      productService.saveProduct(product);
    }
  }
}
