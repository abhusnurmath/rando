package guiprograms;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;



public class BorderLayoutExample extends JFrame {
	public void createGUI () {
		setLayout(new BorderLayout ());        
		add(new JButton("One"),   BorderLayout.NORTH);
		add(new JButton("Two"),   BorderLayout.WEST);
		add(new JButton("Three"), BorderLayout.CENTER);
		add(new JButton("Four"),  BorderLayout.EAST);
		add(new JButton("Five"),  BorderLayout.SOUTH);
		//magic 1 line command that puts everything into an optimal location
		pack();
		setSize(640, 480);
		//place in the center
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		//remember to do this!
		setVisible(true);
		}
	public static void main(String[] args) {
        new BorderLayoutExample().createGUI();
    }

}
