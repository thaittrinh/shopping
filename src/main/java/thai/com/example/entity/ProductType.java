package thai.com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(
  name = "product_type",
  uniqueConstraints = {
    @UniqueConstraint(columnNames = "name")
  },
  indexes = {
    @Index(columnList = "id") 
  }
)
@AllArgsConstructor
@Getter @Setter
public class ProductType {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @NotNull
  private String name;
  
  @NotNull
  private String label;
  
  private String description;
  
  public ProductType(String name, String label) {
    this.name = name;
    this.label = label;
  }
  
  public ProductType withDescription(String description) {
    this.description = description;
    return this;
  }
  
}
