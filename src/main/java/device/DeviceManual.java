package device;

import org.json.*;

import java.io.*;

import org.apache.commons.io.IOUtils;

public class DeviceManual {
  private static final String MANUAL_PATH = "manuals.json";

  private final String content;

  public static DeviceManual fetch(Device device) {
    InputStream is;
    String jsonTxt;
    JSONObject json = new JSONObject();

    try {
      File f = new File(MANUAL_PATH);
      is = new FileInputStream(f);
      jsonTxt = IOUtils.toString(is, "UTF-8");
      json = new JSONObject(jsonTxt);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return new DeviceManual(json.getString(device.getClass().getSimpleName()));

  }

  public DeviceManual(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }
}
