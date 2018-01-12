package report;

import event.Event;
import java.util.List;


public class EventReport implements Report {
  List<Event> events;

  public EventReport(List<Event> events) {
    this.events = events;
  }

  public void print() {
    // Tu si pekne prejdi eventy a vyprinti ich liebe dich
  }
}
