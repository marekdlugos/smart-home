package entity;

public class Tool extends Entity {
  protected Tool() {
    super();
  }

  private Person currentUser;

  public Person getCurrentUser() {
    return currentUser;
  }

  public void setCurrentUser(Person currentUser) {
    this.currentUser = currentUser;
  }
}
