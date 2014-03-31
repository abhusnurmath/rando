package music;

import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JApplet;

public class Drums extends Instrument {

    public Drums(JApplet applet, String address) {
        super(applet, address);
        this.name = "Drums";
       
    }

    @Override
    public void play() {
        System.out.println("drum drum drum");
        song.loop();
    }

}
