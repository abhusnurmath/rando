package music;

import java.applet.*;
import javax.swing.*;
import java.io.*;
import java.net.*;

public class MusicTest extends JApplet

{
   
    public void init() {
        /*
         feel free to play around with this
        http://mididrumfiles.com/free-samples/
        http://www.reocities.com/SouthBeach/8243/midipage.html
        */
        ElectricGuitar eg = new ElectricGuitar(this,"http://www.myguitarsolo.com/new/sites/default/files/midi/IncreaseLick15.mid");
        eg.play();
        
        ElectricBassGuitar bg = new ElectricBassGuitar(this,"http://www.reocities.com/SouthBeach/8243/seinfeld_theme.mid");
        bg.play();
       
        Drums d = new Drums(this, "http://mididrumfiles.com/files/samples/Rock/Rock30.mid");
        d.play();
    }
}
