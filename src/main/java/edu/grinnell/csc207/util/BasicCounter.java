package edu.grinnell.csc207.util;

import javax.swing.tree.ExpandVetoException;

public class BasicCounter implements Counter {
    
    /**
     * Fields
     */
    int count;
    int start;

    /**
     * Constructors
     */

     public BasicCounter(int start) {
        this.start = start;
        this.count = start;
     } // BasicCounter(int)

    /**
     * Methods
     */

    public void increment() throws ExpandVetoException {
        this.count = this.count +=1;
    } // increment()

    public void reset() {
        this.count = this.start;
    } // reset()

    public String toString() {
        String newString = "[" + this.count + "]";
        return newString;
    } // toString()

    public int get() {
        return this.count;
    } // get()
}
