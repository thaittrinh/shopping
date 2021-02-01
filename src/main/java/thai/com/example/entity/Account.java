package thai.com.example.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(
  name = "account",
  uniqueConstraints = {
    @UniqueConstraint(columnNames = {"loginId"})
  },
  indexes = {
    @Index(columnList = "loginId")
   }
)
@NoArgsConstructor
@Getter @Setter
public class Account {
  public static enum AccountType { EMPLOYEE, CUSTOMER, FACEBOOK, GOOGLE };
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @NotNull
  private String loginId;
  
  @NotNull
  private String password;
  
  @NotNull
  @Enumerated(EnumType.STRING)
  private AccountType type;
  
  public Account(String loginId, String password, AccountType type) {
    this.loginId = loginId;
    this.password = password;
    this.type = type;
  }
  
}
