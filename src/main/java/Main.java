import factory.DeviceFactory;

import entity.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("skinny jeans ya");

    House house = new House();

    house.floor(0);

    // factorize the shit
    // apply random cycle to them
    // make report
      // HouseConfigurationReport
        // veškerá konfigurační data domu zachovávající
        // hieararchii - dům -> patro -> místnost -> okno -> žaluzie atd. Plus jací jsou obyvatelé domu
      // EventReport
        // report eventů, kde grupujeme eventy podle typu, zdroje eventů a jejich cíle (jaká entita event odbavila)
      // ActivityAndUsageReport
        // Report akcí (aktivit) jednotlivých osob a zvířat, kolikrát které osoby použily které zařízení
      // ConsumptionReport
        // Kolik jednotlivé spotřebiče spotřebovaly eletřiny, plynu, vody. Včetně finančního vyčíslení


  }
}
