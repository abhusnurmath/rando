package guiprograms;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JApplet;
import javax.swing.JButton;

public class FlowLayoutExample extends JApplet {
	public void init () {
		setLayout(new FlowLayout());        
		add(new JButton("One"));
		add(new JButton("Two"));
		add(new JButton("Three"));
		add(new JButton("Four"));
		add(new JButton("Five"));        
		add(new JButton("Six"));      
		}
}

