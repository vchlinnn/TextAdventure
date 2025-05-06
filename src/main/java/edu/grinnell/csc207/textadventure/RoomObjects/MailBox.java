package edu.grinnell.csc207.textadventure.RoomObjects;

/**
 * The MailBox class represents a mailbox in the game. 
 * It provides methods to unlock and open the mailbox.
 */
public class MailBox {
    private boolean unlocked;
    private boolean opened;

    /**
     * Constructor for the MailBox class
     */
    public MailBox() {
        this.unlocked = false;
        this.opened = false;
    }

    /**
     * Unlocks the mailbox
     */
    public void unlockMailBox() {
        this.unlocked = true;
    }

    /**
     * Opens the mailbox if it is unlocked
     */
    public void openMailBox() {
        if (unlocked) {
            System.out.println("The mailbox creaks open. You found a letter.\n");
            this.opened = true;
        } else {
            System.out.println("The mailbox is locked.\n");
        }
    }
    
    /**
     * Checks if the mailbox is unlocked
     * 
     * @return true if the mailbox is unlocked, false otherwise
     */
    public boolean getState() {
        return opened;
    }
}
