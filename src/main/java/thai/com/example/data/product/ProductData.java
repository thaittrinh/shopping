package thai.com.example.data.product;

import thai.com.example.entity.Product;
import thai.com.example.entity.ProductType;

public class ProductData {

  public final ProductType CLOTHER = new ProductType(System.nanoTime() + "", "Clother");
  
  public final Product ASUS_X415JA =
    new Product(System.nanoTime() + "", "Laptop ASUS Vivobook X415JA- EK096T", "Laptop ASUS Vivobook X415JA- EK096T").
      withPrice(11000000.0).withImage("ASUS_X415JA");
  
  public final Product AM439T =
    new Product(System.nanoTime() + "", "Laptop ASUS Vivobook S433EA- AM439T", "Laptop ASUS Vivobook S433EA- AM439T").
      withPrice(17000000.0).withImage("AM439T");
  
  public final Product A5036T =
    new Product(System.nanoTime() + "", "Laptop ASUS Zenbook UX435EA- A5036T", "Laptop ASUS Zenbook UX435EA- A5036T").
      withPrice(24000000.0).withImage("A5036T");
  
  public final Product APPLE_MYD92SA =
    new Product(System.nanoTime() + "", "Laptop APPLE MacBook Pro 2020 MYD92SA/A", "Laptop APPLE MacBook Pro 2020 MYD92SA/A").
      withPrice(27000000.0).withImage("APPLE_MYD92SA");
    
    public final Product APPLE_MYD82SA =
      new Product(System.nanoTime() + "", "Laptop APPLE MacBook Pro 2020 MYD82SA/A", "Laptop APPLE MacBook Pro 2020 MYD82SA/A").
        withPrice(37000000.0).withImage("APPLE_MYD82SA");
    
    public final Product APPLE_MGND3SA =
      new Product(System.nanoTime() + "", "Laptop APPLE MacBook Air 2020 MGND3SA/A", "Laptop APPLE MacBook Air 2020 MGND3SA/A").
        withPrice(25000000.0).withImage("APPLE_MGND3SA");
    
    public final Product DELL_1XGR11 =
      new Product(System.nanoTime() + "", "Laptop Dell Inspiron 15 5502 1XGR11", "Laptop Dell Inspiron 15 5502 1XGR11").
        withPrice(21000000.0).withImage("DELL_1XGR11");
        
    public final Product DELL_N5I5012W =
      new Product(System.nanoTime() + "", "Laptop Dell Inspiron 15 7501 N5I5012W", "Laptop Dell Inspiron 15 7501 N5I5012W").
        withPrice(21000000.0).withImage("DELL_N5I5012W");
        
    public final Product DELL_NT0X01 =
      new Product(System.nanoTime() + "", "Laptop Dell Vostro 15 5502 NT0X01", "Laptop Dell Vostro 15 5502 NT0X01").
        withPrice(21000000.0).withImage("DELL_NT0X01");
    
  public Product[] ALL_PRODUCT =
    { ASUS_X415JA, AM439T, A5036T, APPLE_MYD92SA, APPLE_MYD82SA, APPLE_MGND3SA, DELL_1XGR11, DELL_N5I5012W, DELL_NT0X01};
}
 