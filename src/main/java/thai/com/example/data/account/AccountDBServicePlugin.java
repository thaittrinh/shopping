package thai.com.example.data.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import thai.com.example.config.DBServicePlugin;
import thai.com.example.config.DataDB;
import thai.com.example.entity.Account;
import thai.com.example.entity.Customer;
import thai.com.example.service.AccountService;
import thai.com.example.service.CustomerService;

@Component
public class AccountDBServicePlugin extends DBServicePlugin {

  @Autowired
  AccountService accountService;
  
  @Autowired
  CustomerService customerService;
  
  @Override
  public void createSammpleData() throws Exception{
    AccountData ACCOUNT_DATA = DataDB.getInstance().getData(AccountData.class);
    CustomerData CUSTOMER_DATA = DataDB.getInstance().getData(CustomerData.class);
    createAccount(ACCOUNT_DATA.ALL_ACCOUNTS);
    createCustomer(CUSTOMER_DATA.ALL_CUSTOMER);
  }
  
  private void createAccount(Account[] accounts) {
    for (int i = 0; i < accounts.length; i++) {
      Account account = accounts[i];
      accountService.saveAccount(account);
    }
  }
  
  private void createCustomer(Customer[] customers) {
    for (int i = 0; i < customers.length; i++) {
      Customer customer = customers[i];
      customerService.saveCustomer(customer);
    }
  }
  
}
