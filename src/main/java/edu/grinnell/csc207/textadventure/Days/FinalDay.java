package edu.grinnell.csc207.textadventure.Days;

import java.util.Arrays;

public class FinalDay extends TalkingDay {

    public FinalDay() {
        System.out.println("Welcome to second day.\n" +
        "Day 2 Goal: Talk to at least three villagers.\n" +
        "By nightfall, you'll need to guess:\n" + 
        "Who is the werewolf?\n" +
        "Stepping outside, you are now in the middle of a quiet village market.\n" +
        "There's north, east, south, and west - where do you want to go?\n");
    }

    public void goHelper(String currentPerson) {
        System.out.println(scripts.getScript(currentPerson, 0));
    }

    public void talkHelper(String currentPerson) {
        System.out.println(scripts.getScript(currentPerson, 1));
    }

    public void kill(String person) {
        if (peopleTalked.size() < 3) {
            System.out.println("You haven't talked to 3 people!\n");
        } else {
            scripts.replaceScript(person, Arrays.asList(
                person + " has been killed.\n", 
                "You can't talk to dead people.\n"
            ).toArray(new String[0]));
            endDay = true;
        }
    }

    public Day getNextDay() {
        return null;  
    }
}
