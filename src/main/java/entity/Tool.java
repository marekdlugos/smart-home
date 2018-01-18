package entity;

public class Tool extends Entity {
  private Person currentUser;

  public Person getCurrentUser() {
    return currentUser;
  }

  public void setCurrentUser(Person currentUser) {
    this.currentUser = currentUser;
  }
}
