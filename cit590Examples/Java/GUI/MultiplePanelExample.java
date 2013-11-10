package guiprograms;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiplePanelExample {

	Container container;
	
	public MultiplePanelExample() {
		container = new JFrame();
		JPanel p1 = new JPanel(); 
		p1.setLayout(new BorderLayout());
		p1.add(new JButton("A"), BorderLayout.NORTH);
		p1.add(new JButton("B"), BorderLayout.WEST);
		p1.add(new JButton("C"), BorderLayout.CENTER);
		p1.add(new JButton("D"), BorderLayout.EAST);
		p1.add(new JButton("E"), BorderLayout.SOUTH);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(3, 2));
		p2.add(new JButton("F"));
		p2.add(new JButton("G"));
		p2.add(new JButton("H"));
		p2.add(new JButton("I"));
		p2.add(new JButton("J"));
		p2.add(new JButton("K"));
		
//		JPanel p3 = new JPanel();
//		p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
//		p3.add(new JButton("L"));
//		p3.add(new JButton("M"));
//		p3.add(new JButton("N"));
//		p3.add(new JButton("O"));
//		p3.add(new JButton("P"));
		
		container.setLayout(new BorderLayout());
		container.add(p1, BorderLayout.CENTER); 
		container.add(p2, BorderLayout.SOUTH);
	//	container.add(p3, BorderLayout.EAST);
		
		//although this should not be necessary, I seemed to require it all the time.
		container.setMinimumSize(new Dimension(640,320));
	}
	
	public static void main(String[] args) {
		new MultiplePanelExample().container.setVisible(true);
	}

}
