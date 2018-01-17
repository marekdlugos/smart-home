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

  /**
   * Class which loads JSON file containing house configuration
   * @param pathToJsonFile  the string representation of JSON configuration file path
   *
   */

  public House loadConfig(String pathToJsonFile) throws IOException {
    return jsonMapper.readValue(new File(pathToJsonFile), House.class);
  }

  /*
  TO-DO: use Jackson model and parse to JSON nodes due to the JSON file structure
   */
}
