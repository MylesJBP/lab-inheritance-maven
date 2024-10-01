package edu.grinnell.csc207.util;

import javax.swing.tree.ExpandVetoException;

public class DoubleCounter extends BasicCounter {

    public DoubleCounter(int start) {
        super(start);
      } // DoubleCounter(int)

    @Override
    public void increment() throws ExpandVetoException{ 
        super.increment();
        super.increment();
    } // increment()
} // class DoubleCounter 
