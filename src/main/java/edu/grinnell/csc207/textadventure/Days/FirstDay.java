package edu.grinnell.csc207.textadventure.Days;

import java.util.Scanner;
import edu.grinnell.csc207.textadventure.RoomObjects.MailBox;

public class FirstDay implements Day {
    Scanner scanner;
    boolean overcomeDizziness;
    MailBox mailbox;
    boolean seeKey;
    boolean haveKey;
    boolean endDay;

    public FirstDay() {
        this.scanner = new Scanner(System.in);
        this.overcomeDizziness = false;
        this.mailbox = new MailBox();
        this.seeKey = false;
        this.endDay = false;
    }
    
    public void playerWait() {
        overcomeDizziness = true;
        System.out.println("The dizziness fades. Your mind clears." +
        "Then it hits you - This is no ordinary dream.\n" +
        "You're inside a werewolf game!\n" +
        "You have 3 nights. When the sun rises on the fourth day, the game ends.\n" + 
        "Either the villagers will uncover the wolf…\n" + 
        "Or the wolf will have taken them all.\n" +
        "But first, you must uncover one thing: Which side are you on?\n" +
        "Goal Day 1: Find out your role.\n" +
        "You scan the room. There's a mailbox, a drawer, a rug, and a door. " +
        "What will you do?");
    }

    public void go(String direction) {
        if (overcomeDizziness) {
            System.out.println("The room is too small - you don't need to move\n");
        } else {
            System.out.println("Your head spins with dizziness. " +
            "You probably can't do that yet.");
        }
    }

    public void talk(String person) {
        if (overcomeDizziness) {
            System.out.println("...No response\n");
        } else {
            System.out.println("Your head spins with dizziness. " +
            "You probably can't do that yet.");
        }
    }

    public void pick(String object) {
        if (overcomeDizziness) {
            switch (object.toLowerCase()) {
                case "key":
                    if (seeKey) {
                        haveKey = true;
                        System.out.println("You now have a key. What should you open?\n");
                    } else {
                        System.out.println("What key?\n");
                    }
                    break;
                default:
                    System.out.println("You can't do that.\n");
                }
        } else {
            System.out.println("Your head spins with dizziness. " +
            "You probably can't do that yet.");
        }
    }

    public void use(String object) {
        if (overcomeDizziness) {
            switch (object.toLowerCase()) {
                case "key":
                    if (seeKey && haveKey) {
                        mailbox.unlockMailBox();
                    } else {
                        System.out.println("What key?\n");
                    }
                    break;
                default:
                    System.out.println("You can't do that.\n");
                }
        } else {
            System.out.println("Your head spins with dizziness. " +
            "You probably can't do that yet.");
        }
    }

    public void kill(String person) {
        if (overcomeDizziness) {
            System.out.println("We don't do that here.\n");
        } else {
            System.out.println("Your head spins with dizziness. " +
            "You probably can't do that yet.");
        }
    }

    public void open(String object) {
        if (overcomeDizziness) {
            switch (object.toLowerCase()) {
                case "mailbox":
                    mailbox.openMailBox();
                    endDay = mailbox.getState() == true ? true : false;
                    break;
                case "drawer":
                    System.out.println("You opened the drawer and saw a key.\n");
                    seeKey = true;
                    break;
                case "door":
                    System.out.println("It's locked.\n");
                    break;
                default:
                    System.out.println("You can't open that.\n");
            }
        } else {
            System.out.println("Your head spins with dizziness. " +
            "You probably can't do that yet.");
        }
    } 

    public boolean isEndDay() {
        return endDay;
    }

    public Day getNextDay() {
        return new SecondDay();  
    }

    public boolean wakeUp() {
        System.out.println("Are you sure you want to wake up? " +
        "You haven't even discovered your role in this village...\nAnswer y/n?");
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
