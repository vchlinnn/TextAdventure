package edu.grinnell.csc207.textadventure;

import java.util.Scanner;

import edu.grinnell.csc207.textadventure.Days.*;

public class TextAdventure {
    Scanner scanner;
    Day currentDay;
    Scripts scripts;

    public TextAdventure() {
        this.scripts = new Scripts();
        this.scanner = new Scanner(System.in);
        this.currentDay = new FirstDay(scripts);
    }

    private void handleInput(String[] command) {
        String verb = command[0];
        String noun = command.length > 1 ? command[command.length - 1] : "";
        switch (verb) {
            case "wait":
                currentDay.playerWait();
                break;
            case "go":
                currentDay.go(noun);
                break;
            case "talk":
                currentDay.talk(noun);
                break;
            case "pick":
                currentDay.pick(noun);
                break;
            case "read":
                currentDay.read(noun);
                break;
            case "kill":
                currentDay.kill(noun);
                break;
            case "open":
                currentDay.open(noun);
                break;
            default:
                System.out.println("You are speaking an unfathomable language");
        }
    }
    public static void main(String[] args) {
        boolean playing = true;
        TextAdventure game = new TextAdventure();
        System.out.print(
            "Welcome to Linh Vu's TextAdventure game.\n" + "\n" + 
            "You slowly open your eyes.\n" +
            "You're in a small, old room. " + 
            "The walls are cracked. " + 
            "The air smells like dust and wood. " + 
            "It feels like a house in a quiet village.\n" +
            "You don't remember how you got here.\n" +
            "But somehow… you know this is a dream. \n" + 
            "You can wake up anytime — just pinch yourself. \n" + 
            "Still, something tells you to wait. \n" + 
            "Not yet.\n" 
        );
        while (playing) {
            String[] command = game.scanner.nextLine().toLowerCase().split(" ");
            if (command[0].equals("pinch")) {
                playing = game.currentDay.wakeUp();
            } else {
                game.handleInput(command);
            }

            if (game.currentDay.isEndDay()) {
                Day next = game.currentDay.getNextDay(game.scripts);
                if (next != null) {
                    game.currentDay = next;
                } else {
                    System.out.println("End game.");
                    break;
                }
            }
        }
    }
}