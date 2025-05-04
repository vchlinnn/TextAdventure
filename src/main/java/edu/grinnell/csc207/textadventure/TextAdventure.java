package edu.grinnell.csc207.textadventure;

import java.util.Scanner;

public class TextAdventure {
    Scanner scanner;

    public TextAdventure() {
        this.scanner = new Scanner(System.in);
    }

    private void handleInput(String[] command) {
        String verb = command[0];
        String noun = command.length > 1 ? command[-1] : "";
        switch (verb) {
            case "wait":
                // movePlayer(noun);
                break;
            case "go":
                // pickUpItem(noun);
                break;
            case "talk":
                // openObject(noun);
                break;
            case "pick":
                // openObject(noun);
                break;
            case "use":
                // openObject(noun);
                break;
            case "kill":
                // openObject(noun);
                break;
            case "pinch":
                // openObject(noun);
                break;
            default:
                System.out.println("You are speaking an unfathomable language");
        }
    }
    public static void main(String[] args) {
        boolean playing = true;
        while (playing) {
            TextAdventure game = new TextAdventure();
            System.out.print(
                "Welcome to Linh Vu's TextAdventure game.\n" + "\n" + 
                "You slowly open your eyes.\n" +
                "You’re in a small, old room. " + 
                "The walls are cracked. " + 
                "The air smells like dust and wood. " + 
                "It feels like a house in a quiet village.\n" +
                "You don’t remember how you got here.\n" +
                "But somehow… you know this is a dream. \n" + 
                "You can wake up anytime — just pinch yourself. \n" + 
                "Still, something tells you to wait. \n" + 
                "Not yet.\n" 
            );
            String[] command = game.scanner.nextLine().toLowerCase().split(" ");

        }
        
    }
}