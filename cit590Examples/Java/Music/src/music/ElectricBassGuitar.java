package music;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JApplet;

public class ElectricBassGuitar extends StringedInstrument {
    

    public ElectricBassGuitar(JApplet applet, String address) {
         super(applet, address);
         this.name = "Bass Guitar";
         this.numberOfStrings = 4;
         
        
         
    }

    public ElectricBassGuitar(JApplet applet, String address, int numberOfStrings) {
         super(applet, address);
         this.name = "Bass Guitar";
         this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
         System.out.println("An electric " + numberOfStrings + "-string " + name
               + " is rocking!");
         song.play();
         song.play();
    }
}
