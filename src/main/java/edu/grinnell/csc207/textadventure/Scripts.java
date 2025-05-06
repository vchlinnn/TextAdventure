package edu.grinnell.csc207.textadventure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * The Scripts class manages the scripts for different characters in the game.
 * */
public class Scripts {
    Map<String, String[]> scripts;
    
    /**
     * Constructor for the Scripts class
     * Initializes the scripts for different characters
     */
    public Scripts() {
        this.scripts = new HashMap<String, String[]>();
        scripts.put("donald", 
            Arrays.asList(
                "You approach Donald. He eyes you coldly.", 
                "\"Anyone can be the wolf. Even you.\n" 
                + "Don't expect me to trust you... or talk.\"\n" 
                + "He turns away without another word.\n",
                "\"Funny how Goofy's still smiling. Wouldn't you be scared?\"\n"
            ).toArray(new String[0])
        );
        scripts.put("minnie", 
            Arrays.asList(
                "Minnie glances around nervously as you approach.", 
                "\"Please... find the wolf. I'm scared.\n" 
                + "I just know I'll be the next victim!\"\n",
                "\"I thought I heard Mickey whispering last night to someone. I ran.\"\n"
            ).toArray(new String[0])
        );
        scripts.put("mickey", 
            Arrays.asList(
                "Mickey meets your gaze with a calm nod.", 
                "\"Be careful. Not everything said is true.\n" 
                + "But if you're looking for signs...\n" 
                + "Minnie's been acting strange lately.\"\n",
                "\"Villagers lie too. Don't forget that.\"\n"
            ).toArray(new String[0])
        );
        scripts.put("goofy", 
            Arrays.asList(
                "Goofy waves with a crooked grin.", 
                "\"Psst... don't tell anyone, but I'm a seer.\n" 
                + "Saw Donald last night. He's the wolf! \"\n" 
                + "He chuckles. You're not sure if he's serious... or just being Goofy.\n",
                "\"Dream's almost over, friend. Hope you guess right!\"\n"
            ).toArray(new String[0])
        );
    }

    /**
     * Gets the script for a specific person and index
     * 
     * @param person The name of the person
     * @param index  The index of the script to retrieve
     * @return The script for the specified person and index
     */
    public String getScript(String person, int index) {
        if (scripts.containsKey(person)) {
            return scripts.get(person)[index];
        } else {
            return "There's no one here.\n";
        }
    }

    /**
     * Replaces the script for a specific person
     * 
     * @param person    The name of the person
     * @param newScript The new script to set for the person
     */
    public void replaceScript(String person, String[] newScript) {
        scripts.put(person.toLowerCase(), newScript);
    }

    /**
     * Checks if a specific person exists in the scripts
     * 
     * @param person The name of the person to check
     * @return True if the person exists, false otherwise
     */
    public boolean contains(String person) {
        return scripts.containsKey(person);
    }
}
