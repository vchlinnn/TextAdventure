package edu.grinnell.csc207.textadventure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scripts {
    Map<String, List<String>> scripts;
    
    public Scripts() {
        this.scripts = new HashMap<String,List<String>>();
        scripts.put("open mailbox", Arrays.asList("It's locked.", "Good job, you unlocked it."));
    }
}
