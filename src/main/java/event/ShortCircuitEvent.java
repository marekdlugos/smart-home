package event;

import entity.Entity;

/**
 * Represents the event when the circuit breaker will shut down the electricity in the House.
 */
public class ShortCircuitEvent extends Event {
  public void dispatchToHandler(Entity handler) {
    handler.handle(this);
  }
}
