package mvc;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ReverserGUI extends JFrame {
	ReverserModel model = new ReverserModel();
	JTextField text = new JTextField(30);
	JButton button = new JButton("Reverse");
	
	public static void main(String[] args) {
		ReverserGUI gui = new ReverserGUI();
		gui.create();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void create(){
		setLayout(new GridLayout(2,1));
		add(text);
		add(button);
		
		button.addActionListener(new ClickListener());
		pack();
		setVisible(true);
	}
	
	class ClickListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			//get the text and reverse it
			String s = text.getText();
			
			//we could do a reverse right over here, but that is 
			//bad programming practice. The view file should not
			// do calculation! The model is where that happens.
			s = model.reverse(s);
			
			text.setText(s);
		}
	}

}

