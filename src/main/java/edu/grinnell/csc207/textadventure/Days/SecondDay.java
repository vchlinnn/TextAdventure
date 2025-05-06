package edu.grinnell.csc207.textadventure.Days;

import java.util.Arrays;

import edu.grinnell.csc207.textadventure.Scripts;

/**
 * The SecondDay class represents the second day in the game. 
 * It extends the TalkingDay class and provides methods for player actions.
 */
public class SecondDay extends TalkingDay {
    boolean found;

    /**
     * Constructor for the SecondDay class
     * 
     * @param scripts The Scripts object containing the game scripts
     */
    public SecondDay(Scripts scripts) {
        super(scripts);
        this.found = false;
        System.out.println("Welcome to second day.\n" 
            + "Day 2 Goal: Talk to at least three villagers.\n" 
            + "By nightfall, you'll need to guess:\n" 
            + "Who is the werewolf?\n" 
            + "Stepping outside, you are now in the middle of a quiet village market.\n" 
            + "There's north, east, south, and west - where do you want to go?\n");
    }

    /**
     * Prints the script for a specific person
     * 
     * @param currentPerson The name of the person to talk to
     */
    public void talkHelper(String currentPerson) {
        System.out.println(scripts.getScript(currentPerson, 1));
    }

    /**
     * Kills a specific person in the game
     * 
     * @param person The name of the person to kill
     */
    public void kill(String person) {
        if (peopleTalked.size() < 3) {
            System.out.println("You haven't talked to 3 people!\n");
        } else if (!scripts.contains(person.toLowerCase())) {
            System.out.println("Who is that person?\n");
        } else if (person.toLowerCase().equals("goofy")) {
            System.out.println("Congrats. You found the wolf!\n" 
                + "The village is safe... for now.\n");
            found = true;
            endDay = true;
        } else {
            System.out.println(person + " is not a wolf - You killed an innocent villager!\n"
                + "Better luck next time...\n");
            scripts.replaceScript(person.toLowerCase(), Arrays.asList(
                person + " has been killed.\n", "dummy",
                "You can't talk to dead people.\n"
            ).toArray(new String[0]));
            found = false;
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
        if (found) {
            return null;
        } 
        return new FinalDay(scripts);  
    }
}

