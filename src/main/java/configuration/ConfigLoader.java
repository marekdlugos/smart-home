package configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import house.House;

import java.io.File;
import java.io.IOException;

/**
 * Class which loads JSON file containing house configuration
 * @author Thien Trang Vu
 */

public class ConfigLoader {

  private ObjectMapper jsonMapper;

  public ConfigLoader() {
    jsonMapper = new ObjectMapper();
  }

  public House loadConfig(String jsonFile) throws IOException {
    return jsonMapper.readValue(new File(jsonFile), House.class);
  }
}
