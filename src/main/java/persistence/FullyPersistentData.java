package persistence;
import java.util.HashMap;

import device.Device;
import entity.Person;
import house.Floor;
import house.House;
import house.Room;

/**
 * Provides fully persistent data structure for house and its objects inside.
 * @author Thien Trang Vu
 */

public class FullyPersistentData {
  static int INDEX = 0;

  HashMap m_houseVersion;


  public FullyPersistentData() {
    this.m_houseVersion = new HashMap<Integer, House>();
  }

  public void setHouseVersion(int version, House house) {
    m_houseVersion.put(version, house);
  }

  public void getHouseVersion(int version) {
    System.out.println(m_houseVersion.get(version));
  }

  public void contructHouse(Tree data) {
    Tree.m_dataList.clear();
    data.display(Tree.root);

    // TO-DO: replace houseInfo string with JSON

    String houseInfo = "";
    for (Integer i : Tree.m_dataList) {

    }

    m_houseVersion.put(INDEX, houseInfo);
    INDEX ++;
  }

}
