package edu.grinnell.csc207.textadventure.Days;

public interface Day {

    void playerWait();
    void go();
    void talk(String person);
    void pick(String object);
    void use(String object);
    void kill(String person);
    void open(String object);
    boolean isEndDay();
    boolean wakeUp();
    Day getNextDay();    

}
