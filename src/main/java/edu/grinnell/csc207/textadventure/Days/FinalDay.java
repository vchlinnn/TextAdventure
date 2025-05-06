package edu.grinnell.csc207.textadventure.Days;


import edu.grinnell.csc207.textadventure.Scripts;

/**
 * The FinalDay class represents the final day in the game. 
 */
public class FinalDay extends TalkingDay {

    /**
     * Constructor for the FinalDay class
     * 
     * @param scripts The Scripts object containing the game scripts
     */
    public FinalDay(Scripts scripts) {
        super(scripts);
        System.out.println("Here's the final day. Time is running out.\n" 
                + "Final Day Goal: Find out who the wolf is!\n" 
                + "By nightfall, you'll need to guess:\n" 
                + "Who is the werewolf?\n" 
                + "You step into the silent market. The village holds its breath.\n" 
                + "There's north, east, south, and west - choose quick before it's too late\n");
    }

    /**
     * Prints the script for a specific person
     * 
     * @param currentPerson The name of the person to talk to
     */
    public void talkHelper(String currentPerson) {
        System.out.println(scripts.getScript(currentPerson, 2));
    }

    /**
     * Kills a specific person in the game
     * 
     * @param person The name of the person to kill
     */
    public void kill(String person) {
        if (person.toLowerCase().equals("goofy")) {
            System.out.println("Congrats. You found the wolf!\n" 
                + "The village is safe... for now.\n");
            endDay = true;
        } else if (!scripts.contains(person.toLowerCase())) {
            System.out.println("Who is that person?\n");
        } else {
            System.out.println("Too bad, the wolf wins.\n");
            endDay = true;
        }
    }

    /**
     * Gets the next day in the game
     * 
     * @param scripts The Scripts object containing the game scripts
     * @return The next day in the game
     */
    public Day getNextDay(Scripts scripts) {
        return null;  
    }
}
