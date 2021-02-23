package thai.com.example.rest.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import thai.com.example.entity.Product;
import thai.com.example.entity.ProductType;
import thai.com.example.service.ProductService;

@Api(value = "shopping", tags = "product service")
@RestController
@RequestMapping("rest/v1/product")
public class ProductController {

  @Autowired
  ProductService productService;
  
  @ApiOperation(value = "Get product type by name", response = ProductType.class)
  @GetMapping("/type/{name}")
  public ProductType getProductType( @PathVariable("name") String name) {
    return productService.getProductType(name);
  }
  
  @ApiOperation(value = "Save product type", response = ProductType.class)
  @PutMapping("/type")
  public ProductType saveProductType(@RequestBody ProductType productType) {
    return productService.saveProductType(productType);
  }
  
  @ApiOperation(value = "Find all product type", responseContainer = "List" ,response = ProductType.class)
  @PostMapping("/type")
  public List<ProductType> findProductTypes() {
    return productService.findAllProductTypes();
  }
  
  @ApiOperation(value = "Get product by code", response = Product.class)
  @GetMapping("/{code}")
  public Product getProduct( @PathVariable("code") String code) {
    return productService.getProduct(code);
  }
  
  @ApiOperation(value = "Save product", response = Product.class)
  @PutMapping()
  public Product saveProduct(@RequestBody Product product) {
    return productService.saveProduct(product);
  }
  
  @ApiOperation(value = "Find all product", responseContainer = "List" ,response = Product.class)
  @PostMapping("/all")
  public List<Product> findProducts() {
    return productService.findAllProducts();
  }
}
