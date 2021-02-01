package thai.com.example.config;

//import java.util.ArrayList;
//import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

public class DBScenario {
  private static final Logger LOGGER = LoggerFactory.getLogger(DBScenario.class);
  
  private ApplicationContext context;

//  public DBScenario(ApplicationContext context) {
//    this.context = context;
//  }
//  
//  private List<DBModuleScenario> modules = new ArrayList<DBModuleScenario>();
//
//  public DBScenario add(DBModuleScenario moduleScenario) {
//    modules.add(moduleScenario);
//    return this;
//  }
//
//  public <T extends DBModuleScenario> DBScenario add(Class<T> type) {
//    modules.add(createBean(type));
//    return this;
//  }
//
//  public void initialize() throws Exception {
//    for(DBModuleScenario module : modules) {
//      long start = System.currentTimeMillis();
//      module.initialize(this);
//      String name = module.getClass().getSimpleName();
//      LOGGER.info("Load {} data in  {}", name, (System.currentTimeMillis() - start) + "ms");
//    }
//  }
//
//  <T> T createBean(Class<T> type) {
//    return context.getAutowireCapableBeanFactory().createBean(type);
//  } 
  
}
