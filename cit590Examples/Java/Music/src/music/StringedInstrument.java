package music;

import javax.swing.JApplet;

abstract class StringedInstrument extends Instrument {

    public StringedInstrument(JApplet applet, String address) {
        super(applet, address);
    }

    protected int numberOfStrings;

}
