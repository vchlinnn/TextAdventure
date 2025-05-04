package edu.grinnell.csc207.textadventure;

import java.util.Scanner;
import edu.grinnell.csc207.textadventure.Day;
import edu.grinnell.csc207.textadventure.FirstDay;

public class TextAdventure {
    Scanner scanner;
    Day currentDay;

    public TextAdventure() {
        this.scanner = new Scanner(System.in);
        this.currentDay = new FirstDay();
    }

    private void handleInput(String[] command) {
        String verb = command[0];
        String noun = command.length > 1 ? command[-1] : "";
        switch (verb) {
            case "wait":
                currentDay.playerWait();
                break;
            case "go":
                currentDay.go();
                break;
            case "talk":
                currentDay.talk(noun);
                break;
            case "pick":
                currentDay.pick(noun);
                break;
            case "use":
                currentDay.use(noun);
                break;
            case "kill":
                currentDay.kill(noun);
                break;
            case "pinch":
                currentDay.wakeUp();;
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
            game.handleInput(command);
        }
        
    }
}