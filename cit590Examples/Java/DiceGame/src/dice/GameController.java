package dice;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GameController extends JFrame implements Observer,ActionListener{
    
    ScreamingDice d;
    JTextField f; 
    JButton play;

    @Override
    public void update(Observable arg0, Object arg1) {
        f.setText(arg1.toString());
    }
    
    /**
     * create the UI
     */
    public void createGUI(){
        d = new ScreamingDice();
        setLayout(new FlowLayout());
        f = new JTextField(20);
        play = new JButton("play");
        play.addActionListener(this);
        add(d.getDice()[0]);
        add(d.getDice()[1]);
        add(f);
        add(play);
        d.addObserver(this);
        showIt();
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        f.setText("");
        d.rollDice();
    }
    
    public static void main(String[] args) {
        new GameController().createGUI();
    }
    
    /**
     * sets the frame up to be visible
     * pack, setSize, set to the center etc
     */
    private void showIt(){
        pack();
        setSize(640, 480);
        //place in the center
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        //remember to do this!
        setVisible(true);
    }

}
