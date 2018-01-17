package persistence;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Thien Trang Vu
 */
public class Tree {
  public static Node root;

  public static List<Integer> m_dataList;

  public Tree() {
    Tree.root = null;
    m_dataList = new ArrayList<>();
  }

  public boolean find(int id) {
    Node current = root;
    while (current != null) {
      if (current.data == id) {
        return true;
      } else if (current.data > id) {
        current = current.left;
      } else {
        current = current.right;
      }
    }

    return false;
  }

  public boolean delete(int id) {
    Node parent = root;
    Node current = root;
    boolean isLeftChild = false;
    while (current.data != id) {
      parent = current;
      if (current.data > id) {
        isLeftChild = true;
        current = current.left;
      } else {
        isLeftChild = false;
        current = current.right;
      }
      if (current == null) {
        return false;
      }
    }

    // if i am here that means we have found the node
    // Case 1: if node to be deleted has no children
    if (current.left == null && current.right == null) {
      if (current == root) {
        root = null;
      }
      if (isLeftChild == true) {
        parent.left = null;
      } else {
        parent.right = null;
      }
    } //Case 2 : if node to be deleted has only one child
    else if (current.right == null) {
      if (current == root) {
        root = current.left;
      } else if (isLeftChild) {
        parent.left = current.left;
      } else {
        parent.right = current.left;
      }
    } else if (current.left == null) {
      if (current == root) {
        root = current.right;
      } else if (isLeftChild) {
        parent.left = current.right;
      } else {
        parent.right = current.right;
      }
    } else if (current.left != null && current.right != null) {

      //now we have found the minimum element in the right sub tree
      Node successor = getSuccessor(current);
      if (current == root) {
        root = successor;
      } else if (isLeftChild) {
        parent.left = successor;
      } else {
        parent.right = successor;
      }
      successor.left = current.left;
    }
    return true;
  }

  public Node getSuccessor(Node deleleBNode) {
    Node successsor = null;
    Node successsorParent = null;
    Node current = deleleBNode.right;
    while (current != null) {
      successsorParent = successsor;
      successsor = current;
      current = current.left;
    }

    if (successsor != deleleBNode.right) {
      successsorParent.left = successsor.right;
      successsor.right = deleleBNode.right;
    }
    return successsor;
  }

  public void insert(int id) {
    Node newBNode = new Node(id);
    if (root == null) {
      root = newBNode;
      return;
    }

    Node current = root;
    Node parent = null;
    while (true) {
      parent = current;
      if (id < current.data) {
        current = current.left;
        if (current == null) {
          parent.left = newBNode;
          return;
        }
      } else {
        current = current.right;
        if (current == null) {
          parent.right = newBNode;
          return;
        }
      }
    }
  }

  public void display(Node root) {
    if (root != null) {
      display(root.left);
      m_dataList.add(root.data);
      display(root.right);
    }
  }

}
