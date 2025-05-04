package edu.grinnell.csc207.textadventure.Days;

import java.util.Arrays;
import edu.grinnell.csc207.textadventure.Days.FinalDay;

public class SecondDay extends TalkingDay {
    boolean found;

    public SecondDay() {
        this.found = false;
        System.out.println("Welcome to second day.\n" +
        "Day 2 Goal: Talk to at least three villagers.\n" +
        "By nightfall, you'll need to guess:\n" + 
        "Who is the werewolf?\n" +
        "Stepping outside, you are now in the middle of a quiet village market.\n" +
        "There's north, east, south, and west - where do you want to go?\n");
    }

    public void talkHelper(String currentPerson) {
        System.out.println(scripts.getScript(currentPerson, 1));
    }

    public void kill(String person) {
        if (peopleTalked.size() < 3) {
            System.out.println("You haven't talked to 3 people!\n");
        } else if (person.toLowerCase().equals("goofy")) {
            System.out.println("Congrats. You found the wolf\n" +
            "The village is safe... for now.\n");
            found = true;
            endDay = true;
        } else {
            scripts.replaceScript(person.toLowerCase(), Arrays.asList(
                person + " has been killed.\n", 
                "You can't talk to dead people.\n"
            ).toArray(new String[0]));
            found = false;
            endDay = true;
        }
    }

    public Day getNextDay() {
        if (found) {
            return null;
        } 
        return new FinalDay();  
    }
}

