package thai.com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import thai.com.example.entity.Account;
import thai.com.example.logic.AccountLogic;

@Service
public class AccountService {

  @Autowired
  AccountLogic accountLogic;
  
  @Transactional(readOnly = true)
  public Account getAccount(String loginId) {
    return accountLogic.getAccount(loginId);
  }
  
  @Transactional(readOnly = true)
  public List<Account> findAccounts() {
    return accountLogic.findAllAccounts();
  }
  
  @Transactional()
  public Account saveAccount(Account account) {
    return accountLogic.saveAccount(account);
  }
  
  
}
