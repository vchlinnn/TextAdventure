package edu.grinnell.csc207.textadventure.Days;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import edu.grinnell.csc207.textadventure.Scripts;

public abstract class TalkingDay implements Day {
    Scanner scanner;
    boolean endDay;
    Scripts scripts;
    String currentPerson;
    Set<String> peopleTalked;
    boolean found;

    public TalkingDay() {
        this.scanner = new Scanner(System.in);
        this.endDay = false;
        this.scripts = new Scripts();
        this.currentPerson = "";
        this.peopleTalked = new HashSet<>();
        this.found = false;
    }
    
    public void playerWait() {
        System.out.println("A sudden gust of wind whirls around you, urging you forward.\n" + 
        "You must move, before the sun sets...\n");
    }

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
        goHelper(currentPerson);
    }

    public abstract void goHelper(String currentPerson);

    public void talk(String person) {
        talkHelper(currentPerson);
        peopleTalked.add(currentPerson);
        if (peopleTalked.size() == 3) {
            System.out.println("You now can either kill one person " +
            "who you suspect is the wolf or continue talking.\n");
        }
    }

    public abstract void talkHelper(String currentPerson);

    public void pick(String object) {
        System.out.println("There's no such thing here.\n");
    }

    public void use(String object) {
        System.out.println("There's no such thing here.\n");
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

    public void open(String object) {
        System.out.println("There's no such thing here.\n");
    } 

    public boolean isEndDay() {
        return endDay;
    }

    public abstract Day getNextDay();

    public boolean wakeUp() {
        System.out.println("Are you sure you want to wake up? " +
        "You haven't found out who the werewolf is...\nAnswer y/n?");
        while (true) {
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equals("y")) {
                scanner.close();
                System.out.println("Till next time!\n");
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
