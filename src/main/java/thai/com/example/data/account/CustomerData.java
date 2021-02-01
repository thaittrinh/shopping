package thai.com.example.data.account;

import thai.com.example.config.DataDB;
import thai.com.example.entity.Customer;

public class CustomerData {

  AccountData ACCOUNT_DATA = DataDB.getInstance().getData(AccountData.class);
  
  public final Customer ADMIN =
    new Customer(ACCOUNT_DATA.ADMIN.getLoginId(), "ADMIN");
  
  public Customer[] ALL_CUSTOMER = { ADMIN };
}
