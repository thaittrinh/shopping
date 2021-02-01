package thai.com.example.data.account;

import thai.com.example.entity.Account;
import thai.com.example.entity.Account.AccountType;

public class AccountData {

  public final Account ADMIN = new Account("admin", "admin", AccountType.EMPLOYEE);
  
  public Account[] ALL_ACCOUNTS = { ADMIN };
}
