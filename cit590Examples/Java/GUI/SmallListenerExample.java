package guiprograms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SmallListenerExample extends JFrame {

	JFrame frame;
	
	public SmallListenerExample() {
	  frame = new JFrame("listener example");
	  
	  JButton button = new JButton("click and check");
	  button.addActionListener(new MyButtonListener());
	}

	//this is an inner class that implements a listener
	class MyButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			//what happens when you click?
		}
		
	}

}
