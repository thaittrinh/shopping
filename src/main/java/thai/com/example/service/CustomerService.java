package thai.com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import thai.com.example.entity.Customer;
import thai.com.example.logic.CustomerLogic;

@Service
public class CustomerService {

  @Autowired
  CustomerLogic customerLogic;
  
  @Transactional(readOnly = true)
  public Customer getCustomer(String loginId) {
    return customerLogic.getCustomer(loginId);
  }
  
  @Transactional(readOnly = true)
  public List<Customer> findCustomers() {
    return customerLogic.findAllCustomers();
  }
  
  @Transactional()
  public Customer saveCustomer(Customer customer) {
    return customerLogic.saveCustomer(customer);
  }
}
