package edu.grinnell.csc207.util;

import javax.swing.tree.ExpandVetoException;

public class DecrementableCounter extends BasicCounter{
    /**
   * Create a new decrementable counter.
   *
   * @param start
   *   The initial value of the counter.
   */
  public DecrementableCounter(int start) {
    super(start);
  } // DecrementableCounter(int)

  public void decrement() throws ExpandVetoException {
        this.count += -1;
    } // decrement()
}
