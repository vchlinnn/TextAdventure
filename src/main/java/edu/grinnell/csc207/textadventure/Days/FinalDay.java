package edu.grinnell.csc207.textadventure.Days;

import java.util.Arrays;

import edu.grinnell.csc207.textadventure.Scripts;

public class FinalDay extends TalkingDay {

    public FinalDay(Scripts scripts) {
        super(scripts);
        System.out.println("Here's the final day. Time is running out.\n" +
        "Final Day Goal: Find out who the wolf is!\n" +
        "By nightfall, you'll need to guess:\n" + 
        "Who is the werewolf?\n" +
        "You step into the silent market. The village holds its breath.\n" +
        "There's north, east, south, and west - choose quick before it's too late\n");
    }

    public void talkHelper(String currentPerson) {
        System.out.println(scripts.getScript(currentPerson, 2));
    }

    public void kill(String person) {
        if (person.toLowerCase().equals("goofy")) {
            System.out.println("Congrats. You found the wolf!\n" +
            "The village is safe... for now.\n");
            endDay = true;
        } else if (!scripts.contains(person.toLowerCase())) {
            System.out.println("Who is that person?\n");
        } else {
            System.out.println("Too bad, the wolf wins.\n");
            endDay = true;
        }
    }

    public Day getNextDay(Scripts scripts) {
        return null;  
    }
}
