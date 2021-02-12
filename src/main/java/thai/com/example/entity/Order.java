package thai.com.example.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(
   name = "customer_oder"
)
@NoArgsConstructor
@Getter @Setter
public class Order {
  static public enum Status { Draf, Ready, PartiallyDelivered, Delivered };
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @NotNull
  private String code;
  
  @ManyToOne(optional = false)
  @JoinColumn(name = "customerId", referencedColumnName = "id")
  private Customer customer;
  
  private Date date;
  
  private double totalPrice;
  
  @NotNull
  @Enumerated(EnumType.STRING)
  private Status status;
  
  @ManyToMany()
  @JoinTable(
     name = "order_detail",
     joinColumns = @JoinColumn(name = "orderId"), inverseJoinColumns = @JoinColumn(name = "productId")
  )
  private List<Product> products; 
  
}
