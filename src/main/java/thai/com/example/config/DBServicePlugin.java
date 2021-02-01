package thai.com.example.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DBServicePlugin {
  protected Logger logger = LoggerFactory.getLogger(getClass());
  
  public void createSammpleData() throws Exception{
  }
  
}
