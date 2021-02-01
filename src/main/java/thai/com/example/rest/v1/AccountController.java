package thai.com.example.rest.v1;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import thai.com.example.entity.Account;
import thai.com.example.service.AccountService;


@Api(value = "shopping", tags = "account service")
@RestController
@RequestMapping("rest/v1/account")
public class AccountController {

  @Autowired
  AccountService accountService;
  
  @ApiOperation(value = "Get Account by login id", response = Account.class)
  @GetMapping("/{login-id}")
  public Account getAccount(HttpSession session, @PathVariable("login-id") String loginId) {
    return accountService.getAccount(loginId);
  }
  
}
