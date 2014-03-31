package music;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JApplet;

abstract class Instrument {
    
    protected String name;
    AudioClip song;

    public Instrument(JApplet applet, String address) {
        super();
        try {
            URL songPath = new URL(applet.getCodeBase(), address);
            song = Applet.newAudioClip(songPath); // Load the Sound
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } // Get the Sound
    }

    /**
     * every subclass i.e. every specific instrument
     * has to implement a play method
     */
    abstract public void play();
}
