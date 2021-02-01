package thai.com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import thai.com.example.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

  Account findByLoginId(String loginId);
  
}
