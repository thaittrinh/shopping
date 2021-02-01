package thai.com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(
  name = "customer_order_detail"
)
@AllArgsConstructor
@Getter @Setter
public class OrderDetail {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY )
  private Long Id;
  
  @NotNull
  private Long orderId;
  
  @NotNull
  private Long productId;
  
  @NotNull
  private Long quantity;
  
  @NotNull
  private Double price;
  
}
