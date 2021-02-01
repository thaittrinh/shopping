package thai.com.example.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import thai.com.example.entity.Account;
import thai.com.example.repository.AccountRepository;

@Component
public class AccountLogic {

  @Autowired
  AccountRepository accountRepo;
  
  public Account getAccount(String loginId) {
   return accountRepo.findByLoginId(loginId);
  }
  
  public List<Account> findAllAccounts() {
    return accountRepo.findAll();
  }
  
  public Account saveAccount(Account account) {
    return accountRepo.save(account);
  }
  
}
