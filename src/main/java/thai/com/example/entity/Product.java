package thai.com.example.entity;

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
  name = "product",
  uniqueConstraints = {
    @UniqueConstraint(columnNames = "code")
  },
  indexes = {
    @Index(columnList = "id")
  }
)
@JsonInclude(Include.NON_NULL)
@NoArgsConstructor
@Setter @Getter
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @NotNull
  private String code;
  
  @NotNull
  private String name;
  
  @NotNull
  private String label;
  
//  @ManyToOne(optional = false)
//  @JoinColumn(name = "productTypeId", referencedColumnName = "id")
//  private ProductType type;
  
  private String image;
  
  @NotNull
  private Double price;
  
  private String description;
  
  public Product(String code, String name, String label) {
    this.code = code;
    this.name = name;
    this.label = label;
  }
  
  public Product withImage(String image) {
    this.image = image;
    return this;
  }
  
  public Product withPrice(Double price) {
    this.price = price;
    return this;
  }
  
  public Product withDescription(String description) {
    this.description = description;
    return this;
  }
  
}
