package guiprograms;

import java.awt.BorderLayout;

import javax.swing.JApplet;
import javax.swing.JButton;

public class BorderLayoutExample extends JApplet {
	public void init () {
		setLayout(new BorderLayout ());        
		add(new JButton("One"),   BorderLayout.NORTH);
		add(new JButton("Two"),   BorderLayout.WEST);
		add(new JButton("Three"), BorderLayout.CENTER);
		add(new JButton("Four"),  BorderLayout.EAST);
		add(new JButton("Five"),  BorderLayout.SOUTH);        
		add(new JButton("Six"));      
		}
}
