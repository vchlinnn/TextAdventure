package edu.grinnell.csc207.textadventure.Days;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import edu.grinnell.csc207.textadventure.Scripts;

/**
 * The TalkingDay abstract class represents a day where the player can talk.
 */
public abstract class TalkingDay implements Day {
    Scanner scanner;
    boolean endDay;
    Scripts scripts;
    String currentPerson;
    Set<String> peopleTalked;

    /**
     * Constructor for the TalkingDay class
     * 
     * @param scripts The Scripts object containing the game scripts
     */
    public TalkingDay(Scripts scripts) {
        this.scanner = new Scanner(System.in);
        this.endDay = false;
        this.scripts = scripts;
        this.currentPerson = "";
        this.peopleTalked = new HashSet<>();
    }
    
    /**
     * Makes the player wait for a turn
     * 
     */
    public void playerWait() {
        System.out.println("A sudden gust of wind whirls around you, urging you forward.\n"
            + "You must move, before the sun sets...\n");
    }

    /**
     * Moves the player in a specified direction
     * 
     * @param direction The direction the player wants to move in
     */
    public void go(String direction) {
        switch (direction.toLowerCase()) {
            case "north":
                currentPerson = "donald";
                break;
            case "east":
                currentPerson = "minnie";
                break;
            case "west":
                currentPerson = "mickey";
                break;
            case "south":
                currentPerson = "goofy";
                break;
            default:
                System.out.println("You will get lost if you go there.\n");
        }
        System.out.println(scripts.getScript(currentPerson, 0));
    }

    /**
     * Lets the player talk to a specific person
     * 
     * @param person The person the player wants to talk to
     */
    public void talk(String person) {
        talkHelper(currentPerson);
        peopleTalked.add(currentPerson);
        if (peopleTalked.size() == 3) {
            System.out.println("You now can either kill one person " 
                + "who you suspect is the wolf or continue talking.\n");
        }
    }

    /**
     * Prints the script for a specific person
     * 
     * @param currentPerson The name of the person to talk to
     */
    public abstract void talkHelper(String currentPerson);

    /**
     * Lets the player pick up a specific object
     * 
     * @param object The object the player wants to pick up
     */
    public void pick(String object) {
        System.out.println("There's no such thing here.\n");
    }

    /**
     * Lets the player read a specific object
     * 
     * @param object The object the player wants to read
     */
    public void read(String object) {
        System.out.println("There's no such thing here.\n");
    }

    /**
     * Lets the player kill a specific person
     * 
     * @param person The person the player wants to kill
     * */
    public abstract void kill(String person);

    /**
     * Lets the player open a specific object
     * 
     * @param object The object the player wants to open
     */
    public void open(String object) {
        System.out.println("There's no such thing here.\n");
    } 

    /**
     * Checks if the player has reached the end of the day
     * 
     * @return true if the player has reached the end of the day, false otherwise
     */
    public boolean isEndDay() {
        return endDay;
    }

    /**
     * Gets the next day in the game
     * 
     * @param scripts The Scripts object containing the game scripts
     * @return The next day in the game
     */
    public abstract Day getNextDay(Scripts scripts);

    /**
     * Checks if the player has woken up from the game
     * 
     * @return true if the player woke up, false otherwise
     */
    public boolean wakeUp() {
        System.out.println("Are you sure you want to wake up? " 
            + "You haven't found out who the werewolf is...\nAnswer y/n?");
        while (true) {
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equals("y")) {
                scanner.close();
                System.out.println("Till next time.\n");
                return false;
            } else if (answer.equals("n")) {
                System.out.println("Yay let's continue!\n");
                return true;
            } else {
                System.out.println("Please answer y/n?");
            }
        }
    }
}
