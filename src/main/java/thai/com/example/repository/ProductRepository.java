package thai.com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import thai.com.example.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

  Product findByCode(String code);
  
}
