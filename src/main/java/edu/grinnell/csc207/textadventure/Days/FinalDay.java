package edu.grinnell.csc207.textadventure.Days;

import java.util.Arrays;

public class FinalDay extends TalkingDay {

    public FinalDay() {
        System.out.println("Here's the final day. Time is running out.\n" +
        "Final Day Goal: Talk to at least two villagers.\n" +
        "By nightfall, you'll need to guess:\n" + 
        "Who is the werewolf?\n" +
        "You step into the silent market. The village holds its breath.\n" +
        "There's north, east, south, and west - choose quick before it's too late\n");
    }

    public void talkHelper(String currentPerson) {
        System.out.println(scripts.getScript(currentPerson, 2));
    }

    public void kill(String person) {
        if (peopleTalked.size() < 2) {
            System.out.println("You haven't talked to two people!\n");
        } else if (person.toLowerCase().equals("goofy")) {
            System.out.println("Congrats. You found the wolf\n" +
            "The village is safe... for now.\n");
        } else {
            System.out.println("Too bad, the wolf wins.\n");
        }
        endDay = true;
    }

    public Day getNextDay() {
        return null;  
    }
}
