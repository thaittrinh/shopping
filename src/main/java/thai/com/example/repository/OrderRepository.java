package thai.com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import thai.com.example.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
