package report;

import event.Event;

import java.io.FileNotFoundException;
import java.util.List;
import java.io.PrintWriter;

public class EventReport implements Report {
  List<Event> events;

  public EventReport(List<Event> events) {
    this.events = events;
  }

  public void print() throws FileNotFoundException {
    PrintWriter writer;
    writer = new PrintWriter("EventReport.txt");
    writer.println("Event Report:");

    for(Event event : events) {
      writer.print("[" + event.getCreatedAt() + "]");
      writer.print(" ");
      writer.print(event.getClass().getSimpleName() + " event");
      writer.print(" ");
      writer.print("emitted by");
      writer.print(" ");
      writer.print(event.getSource().getClass().getSimpleName());
      writer.print("[" + event.getSource() + "]");
      writer.print(" ");
      writer.print("handled by");
      writer.print(" ");
      writer.print(event.getHandler().getClass().getSimpleName());
      writer.print("[" + event.getHandler() + "]");
      writer.print("\n");
    }

    writer.close();
  }
}
