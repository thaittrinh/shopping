package thai.com.example.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(
  name = "customer",
  uniqueConstraints = {
    @UniqueConstraint(columnNames = {"loginId"} )
  },
  indexes = {
    @Index(columnList = "loginId")
  }
)
@JsonInclude(Include.NON_NULL)
@NoArgsConstructor
@Getter @Setter
public class Customer {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @NotNull
  private String loginId;
  
  @NotNull
  private String fullName;
  
  private Date birthday;
  
  private String address;
  
  private String phone;
  
  private String email;
  
  public Customer(String loginId, String fullName) {
    this.loginId = loginId;
    this.fullName = fullName;
  }
  
  public Customer withBirthday(Date birthday) {
    this.birthday = birthday;
    return this;
    
  }
  
  public Customer withAddress(String address) {
    this.address = address;
    return this;
  }
  
  public Customer withPhone(String phone) {
    this.phone = phone;
    return this;
  }
  
  public Customer withEmail(String email) {
    this.email = email;
    return this;
  }
}


