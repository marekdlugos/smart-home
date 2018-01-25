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

  /**
   * Prints out the Event Report into EventReport.txt file. It's a list of events grouped by type of the event, source of the event and target of the event (which entity handled the event).
   * @throws FileNotFoundException
   */
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
