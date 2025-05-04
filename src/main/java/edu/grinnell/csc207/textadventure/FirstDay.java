package edu.grinnell.csc207.textadventure;

import java.util.Scanner;

public class FirstDay implements Day {
    Scanner scanner;
    boolean overcomeDizziness;
    boolean mailboxUnlocked;

    public FirstDay() {
        this.scanner = new Scanner(System.in);
        this.overcomeDizziness = false;
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
        "You scan the room. There's a mailbox, a drawer, a rug, and a door." +
        "What will you do?");
    }

    public void go() {
        if (overcomeDizziness) {

        } else {
            System.out.println("Your head spins with dizziness." +
            "You probably can't do that yet.");
        }
    }

    public void talk(String person) {
        if (overcomeDizziness) {

        } else {
            System.out.println("Your head spins with dizziness." +
            "You probably can't do that yet.");
        }
    }

    public void pick(String object) {
        if (overcomeDizziness) {

        } else {
            System.out.println("Your head spins with dizziness." +
            "You probably can't do that yet.");
        }
    }

    public void use(String object) {
        if (overcomeDizziness) {

        } else {
            System.out.println("Your head spins with dizziness." +
            "You probably can't do that yet.");
        }
    }

    public void kill(String person) {
        if (overcomeDizziness) {

        } else {
            System.out.println("Your head spins with dizziness." +
            "You probably can't do that yet.");
        }
    }

    public void open(String object) {
        if (overcomeDizziness) {

        } else {
            System.out.println("Your head spins with dizziness." +
            "You probably can't do that yet.");
        }
    }

    public boolean wakeUp() {
        System.out.println("Are you sure you want to wake up?" +
        "You haven't even discovered your role in this village...\n y/n?");
        while (true) {
            if (scanner.nextLine().toLowerCase().equals("y")) {
                scanner.close();
                System.out.println("Bye!\n");
                return false;
            } else if (scanner.nextLine().toLowerCase().equals("n")) {
                scanner.close();
                System.out.println("Yay let's continue!\n");
                return true;
            } else {
                System.out.println("Please answer y/n?");
            }
        }
    }
}
