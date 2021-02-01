package thai.com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import thai.com.example.entity.ProductType;

public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {

  ProductType findByName(String name);
  
}
