package edu.grinnell.csc207.textadventure.Days;
import edu.grinnell.csc207.textadventure.Scripts;

/*
 * This interface defines the methods that all Day classes must implement
 */
public interface Day {

    void playerWait();
    void go(String direction);
    void talk(String person);
    void pick(String object);
    void read(String object);
    void kill(String person);
    void open(String object);
    boolean isEndDay();
    boolean wakeUp();
    Day getNextDay(Scripts scripts);    

}
