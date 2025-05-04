package edu.grinnell.csc207.textadventure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Scripts {
    Map<String, String[]> scripts;
    
    public Scripts() {
        this.scripts = new HashMap<String,String[]>();
        scripts.put("donald", 
            Arrays.asList(
                "You approach Donald. He eyes you coldly.", 
                "\"Anyone can be the wolf. Even you.\n" +
                "Don't expect me to trust you… or talk.\"\n" +
                "He turns away without another word.\n"
            ).toArray(new String[0])
        );
        scripts.put("minnie", 
            Arrays.asList(
                "Minnie glances around nervously as you approach.", 
                "\"Please… find the wolf. I'm scared.\n" +
                "I just know I'll be the next victim…\"\n"
            ).toArray(new String[0])
        );
        scripts.put("mickey", 
            Arrays.asList(
                "Mickey meets your gaze with a calm nod.", 
                "\"Be careful. Not everything said is true.\n" +
                "But if you're looking for signs…\n" +
                "Minnie's been acting strange lately.\"\n"
            ).toArray(new String[0])
        );
        scripts.put("goofy", 
            Arrays.asList(
                "Goofy waves with a crooked grin.", 
                "\"Psst… don't tell anyone, but I'm a seer.\n" +
                "Saw Donald last night. He's the wolf! \"\n" +
                "He chuckles. You're not sure if he's serious… or just being Goofy.\n"
            ).toArray(new String[0])
        );
    }

    public String getScript(String person, int index) {
        return scripts.get(person)[index];
    }

    public void replaceScript(String person, String[] value) {
        scripts.put(person, value);
    }
}
