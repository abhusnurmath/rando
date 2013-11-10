package guiprograms;

import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JButton;

public class GridLayoutExample extends JApplet {

	public void init () {
		setLayout(new GridLayout (2,4));        
		add(new JButton("One"));
		add(new JButton("Two"));  
		add(new JButton("Three"));
		add(new JButton("Four"));
		add(new JButton("Five"));         
		add(new JButton("Six"));      
	}
}
