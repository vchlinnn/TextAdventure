package edu.grinnell.csc207.textadventure.RoomObjects;

public class MailBox {
    private boolean unlocked;
    private boolean opened;

    public MailBox(){
        this.unlocked = false;
        this.opened = false;
    }

    public void unlockMailBox(){
        this.unlocked = true;
        System.out.println("The mailbox is unlocked. Go ahead, open it.\n");
    }

    public void openMailBox(){
        if (unlocked) {
            System.out.println("The mailbox creaks open. You found a letter.\n" +
            "You are... a powerless villager. No powers. Just your instinct.\n" +
            "As your role has been revealed, door is self unlocked. Day 2 will now begin.\n");
            this.opened = true;
        } else {
            System.out.println("The mailbox is locked.\n");
        }
    }
    
    public boolean getState() {
        return opened;
    }
}
