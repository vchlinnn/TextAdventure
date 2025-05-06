package edu.grinnell.csc207.textadventure.Days;
import edu.grinnell.csc207.textadventure.Scripts;

/**
 * The Day interface represents a day in the game. It provides methods for player actions
 * such as moving, talking, picking, reading, killing people, and opening objects.
 * It also includes methods to check if the day has ended and if the player has woken up.
 */
public interface Day {

    /**
     * Lets the player wait for a turn
     * 
     */
    void playerWait();

    /**
     * Moves the player in a specified direction
     * 
     * @param direction The direction the player wants to move in .
     */
    void go(String direction);

   /**
     * Lets the player talk to a specific person
     * 
     * @param person The person the player wants to talk to
     */
    void talk(String person);

    /**
     * Lets the player pick up a specific object
     * 
     * @param object The object the player wants to pick up
     */
    void pick(String object);

   /**
     * Lets the player read a specific object
     * 
     * @param object The object the player wants to read
     */
    void read(String object);

   /**
     * Lets the player kill a specific person
     * 
     * @param person The person the player wants to kill
     */
    void kill(String person);

   /**
     * Lets the player open a specific object
     * 
     * @param object The object the player wants to open
     */
    void open(String object);

    /**
     * Check if the player has reached the end of the day
     * 
     * @return true if the player has reached the end of the day, false otherwise
     */
    boolean isEndDay();
    
    /**
     * Check if the player has woken up from the game
     * 
     * @return true if the player woke up, false otherwise
     */
    boolean wakeUp();

    /**
     * Get the next day in the game
     * @param scripts The scripts object containing the game scripts
     * @return The next day in the game
     */
    Day getNextDay(Scripts scripts);    

}
