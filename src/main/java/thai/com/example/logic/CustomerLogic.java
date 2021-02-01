package thai.com.example.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import thai.com.example.entity.Customer;
import thai.com.example.repository.CustomerRepository;

@Component
public class CustomerLogic {

  @Autowired
  CustomerRepository customerRepo;
  
  public Customer getCustomer(String loginId) {
   return customerRepo.findByLoginId(loginId);
  }
  
  public List<Customer> findAllCustomers() {
    return customerRepo.findAll();
  }
  
  public Customer saveCustomer(Customer customer) {
    return customerRepo.save(customer);
  }
}
