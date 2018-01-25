package report;

import device.Device;
import iterator.HouseIterator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.ArrayList;


/**
 * Represents Consumption report that contains the whole house consumption and the cost of it.
 */
public class ConsumptionReport implements Report {
  private List<Device> devices;

  private static double electricityCost = 30.5;
  private static double waterCost = 2.5;
  private static double gasCost = 4.5;
  private double totalElectricityCost = 0;
  private double totalWaterCost = 0;
  private double totalGasCost = 0;
  private double totalElectricityConsumption = 0;

  DecimalFormat df = new DecimalFormat("#.##");

  public ConsumptionReport(ArrayList<Device> devices) {
    this.devices = devices;
  }


  /**
   * Prints out the Consumption Report into Consumption-Report.txt file. Report consists of total devices consumption and how much it would cost.
   */
  public void print() {
    PrintWriter writer = null;
    try {
      writer = new PrintWriter("Consumption-Report.txt", "UTF-8");
      writer.println("------------------------- CONSUMPTION REPORT -------------------------");
      writer.println(" ");
      for(Device device : devices) {
        double consumption = device.getEnergyConsumed();
        double cost = device.getEnergyConsumed()*electricityCost;

        totalElectricityConsumption += consumption;
        totalElectricityCost += cost;

        writer.println("  " + device.getClass().getSimpleName());
        writer.println("    " + "Consumed: " + df.format(consumption) + "kWh");
        writer.println("    " + "Cost: " + df.format(cost) + "\u20ac");
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }

    writer.println(" ");
    writer.println("Total house electricity consumption: " + df.format(totalElectricityConsumption) + "kWh");
    writer.println("Total house electricity cost: " + df.format(totalElectricityCost) + "\u20ac");
    writer.println(" ");
    writer.println("---------------------- END OF CONSUMPTION REPORT ----------------------");

    writer.close();
  }
}
