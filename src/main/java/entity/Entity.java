package entity;

import event.*;

import java.util.Observable;
import java.util.Observer;


public class Entity implements Observer {
  protected Entity() {
    subscribe();
  }

  public void emit(Event event) {
    event.setSource(this);
    EventMachine.publish(event);
  }

  public void subscribe() {
    EventMachine.addSubscriber(this);
  }

  public void update(Observable o, Object event) {
    Event e = (Event) event;
    e.dispatchToHandler(this);
  }

  public void handle(Event event) {}
  public void handle(FridgeEmptySupplyEvent event) {}
  public void handle(FridgeFoodEndageredEvent event) {}
  public void handle(FoodReadyEvent event) {}
  public void handle(ExpiredWarrantyEvent event) {}
}
