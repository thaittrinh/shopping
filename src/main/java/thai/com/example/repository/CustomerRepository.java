package thai.com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import thai.com.example.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

  Customer findByLoginId(String loginId);
}
