package entity;

import activity.Activity;
import activity.ActivityMachine;
import device.Microwave;
import event.FoodReadyEvent;

import java.util.Date;

public class Person extends Animal {
  private Tool currentTool;

  protected Person() {
    super();
  }

  public boolean use(Tool tool) {
    if (tool.getCurrentUser() != null) {
      return false;
    }

    this.currentTool = tool;
    this.currentTool.setCurrentUser(this);

    ActivityMachine.record(new Activity(this, tool, new Date()));

    return true;
  }

  public Tool getCurrentTool() {
    return currentTool;
  }

  public void release() {
    this.currentTool.setCurrentUser(null);
    this.currentTool = null;
  }

  public boolean isUsingTool() {
    return currentTool != null;
  }

  public void handle(FoodReadyEvent event) {
    if(event.getUser() != this) {
      return;
    }

    event.setHandler(this);

    ((Microwave) this.getCurrentTool()).setContents("");
  }
}
