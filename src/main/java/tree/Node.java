package tree;
import java.util.ArrayList;
import java.util.List;
import house.House;
/**
 * Provides fully persistent data structure so that we can go back
 * to a specific version of house and modify it.
 *
 * Tree representation enables creating new branch from any node.
 * Node represents version of the object. There's no class for Tree
 * since first created node will be the root - hence the tree itself.
 *
 * @author Thien Trang Vu
 */
public class Node {
  private int id;
  private House houseVersion;
  private String indexB;
  private String indexE;
  private final List<Node> children = new ArrayList();
  private final Node parent;

  public Node(Node parent) {
    this.parent = parent;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public House getHouseVersion() {
    return houseVersion;
  }

  public void setHouseVersion(House houseVersion) {
    this.houseVersion = houseVersion;
  }

  public String getIndexB() {
    return indexB;
  }

  public void setIndexB(String indexB) {
    this.indexB = indexB;
  }

  public String getIndexE() {
    return indexE;
  }

  public void setIndexE(String indexE) {
    this.indexE = indexE;
  }

  public List<Node> getChildren() {
    return children;
  }

  public Node getParent() {
    return parent;
  }

  /**
   *
   * @param parent Parent node
   * @param id Id of the version
   * @param house The specific house object
   * @return
   */

  private static Node addChild(Node parent, int id, House house) {
    Node node = new Node(parent);
    node.setId(id);
    node.setHouseVersion(house);
    parent.getChildren().add(node);
    return node;
  }
}
