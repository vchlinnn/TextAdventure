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
    }

    public void openMailBox(){
        if (unlocked) {
            System.out.println("The mailbox creaks open. You found a letter.\n");
            this.opened = true;
        } else {
            System.out.println("The mailbox is locked.\n");
        }
    }
    
    public boolean getState() {
        return opened;
    }
}
