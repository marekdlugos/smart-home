package report;

import device.Device;
import java.util.List;
import java.util.ArrayList;


public class ConsumptionReport implements Report {
  private List<Device> devices;

  public ConsumptionReport(ArrayList<Device> devices) {
    this.devices = devices;
  }

  private Integer totalConsumption(Device device) {

  }

  private void print() {
    for(Device device : devices) {

    }
  }
}
