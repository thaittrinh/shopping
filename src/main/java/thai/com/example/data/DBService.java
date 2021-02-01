package thai.com.example.data;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import thai.com.example.config.DBServicePlugin;

@Service
public class DBService {

  @Autowired(required = false)
  private List<DBServicePlugin> plugins;
  
  @Transactional
  public void initDb() throws Exception {
    if(plugins == null) return;

    for(DBServicePlugin plugin: plugins) {
      Logger logger = plugin.getLogger();
      plugin.createSammpleData();
      logger.info("createSampleData(...)");
    }
    
  }
}
