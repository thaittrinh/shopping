package thai.com.example.data;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitDataService {
  private static final Logger logger = LoggerFactory.getLogger(InitDataService.class);
  
  @Autowired
  DBService dBService;
  
  @PostConstruct
  private void onInit() throws Exception {
    logger.info("onInit()");
    dBService.initDb();
  }
}
