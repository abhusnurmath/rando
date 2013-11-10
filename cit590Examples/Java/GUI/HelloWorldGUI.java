package guiprograms;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloWorldGUI extends JFrame{
	
	
	public HelloWorldGUI(){
		super("best UI evah");
		setLayout(new BorderLayout());
	}
	
	public void addButton(){
		//make a new button
		JButton clickMe = new JButton("click me!");
		add(new JButton("One"),   BorderLayout.NORTH);
	}
	
	public static void main(String[] args) {
		HelloWorldGUI gui = new HelloWorldGUI();
		gui.addButton();
		gui.pack();
		gui.setVisible(true);
	}

}
