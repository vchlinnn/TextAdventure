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

    public TalkingDay(Scripts scripts) {
        this.scanner = new Scanner(System.in);
        this.endDay = false;
        this.scripts = new Scripts();
        this.currentPerson = "";
        this.peopleTalked = new HashSet<>();
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
        System.out.println(scripts.getScript(currentPerson, 0));
    }

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

    public abstract void kill(String person);

    public void open(String object) {
        System.out.println("There's no such thing here.\n");
    } 

    public boolean isEndDay() {
        return endDay;
    }

    public abstract Day getNextDay(Scripts scripts);

    public boolean wakeUp() {
        System.out.println("Are you sure you want to wake up? " +
        "You haven't found out who the werewolf is...\nAnswer y/n?");
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
