package thai.com.example.config;

import java.util.HashMap;
import java.util.Map;

public class DataDB {
  static DataDB instance = null ;
  
  Map<String, Object> dataMap = new HashMap<>();
  
  public <T> T getData(Class<T> type) { 
    T data = (T) dataMap.get(type.getName()); 
    if(data == null) {
      try {
        data = type.newInstance() ;
        dataMap.put(type.getName(), data);
      } catch (InstantiationException | IllegalAccessException e) {
        throw new RuntimeException(e) ;
      }
    }
    return data ;
  }
  
  static public void clearDataDB() {
    instance = null;
  }
  
  static public DataDB getInstance() {
    if(instance == null) instance = new DataDB();
    return instance ;
  }
}
