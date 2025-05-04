package edu.grinnell.csc207.textadventure.Days;

import java.util.Scanner;

public class SecondDay implements Day{
    Scanner scanner;
    boolean endDay;

    public SecondDay() {
        this.scanner = new Scanner(System.in);
        this.endDay = false;
        System.out.println("Welcome to second day.\n" +
        "Day 2 Goal: Talk to at least three villagers.\n" +
        "By nightfall, you'll need to guess:\n" + 
        "Who is the werewolf?\n" +
        "Stepping outside, you are now in the middle of a quiet village market.\n" +
        "There's north, east, south, and west - where do you want to go?\n");
    }
    
    public void playerWait() {
        System.out.println("A sudden gust of wind whirls around you, urging you forward.\n" + 
        "You must move, before the sun sets...\n");
    }

    public void go(String direction) {
        switch (direction.toLowerCase()) {
            case "north":
                // meet mickey
            case "east":
                // meet minnie
            case "west":
                // meet donald
            case "south":
                // meet goofey
        }
    }

    public void talk(String person) {
        
    }

    public void pick(String object) {
        
    }

    public void use(String object) {
        
    }

    public void kill(String person) {
        
    }

    public void open(String object) {
        
    } 

    public boolean isEndDay() {
        return endDay;
    }

    public Day getNextDay() {
        return new SecondDay();  
    }

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

