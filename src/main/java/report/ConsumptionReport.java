package report;

import device.Device;
import java.util.List;
import java.util.ArrayList;


public class ConsumptionReport implements Report {
  private List<Device> devices;

  private static double electricityCost = 3.5;
  private static double waterCost = 2.5;
  private static double gasCost = 4.5;

  public ConsumptionReport(ArrayList<Device> devices) {
    this.devices = devices;
  }

  private Integer totalConsumption(Device device) {

  }

  private void print() {
    for(Device device : devices) {
      // time period
      // if(device.type == "ELECTRIC")
      // device.consumption =+ electricityCost;

      // TODO: OUTPUT
      //
      // Consumption Report for last 24h (24 cycles):
      //
      //   Microwave
      //     In the idle state: 5 hour(s). [Idle state consumption per hour: 0.3][Consumption: xy kW][Cost: xy €]
      //     Turned on: 1 hour(s). [Turned on consumption per hour: 1.9][Consumption: xy kW][Cost: xy €]
      //     Turned off: 0 hour(s). [Turned off consumption per hour: 0.01][Consumption: xy kW][Cost: xy €]
      //
      //     Total Consumption: xy kW.
      //     Cost: xy €.

      System.out.println("---------- CONSUMPTION REPORT FOR LAST 24H ----------");
      System.out.println("  " + device.name);
      System.out.println("      " + "In the idle state: " + idleState.hours + " hour(s)." + "[Idle state consumption per hour: " + idleState.Consumption + "]" + "[Consumption: " + (idleState.hours*idleState.Consumption) + " kW]" + "[Cost: " + (idleState.hours*idleState.Consumption)*electricityCost + " €]");

    }
  }
}
