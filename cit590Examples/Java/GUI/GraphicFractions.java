package guiprograms;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GraphicFractions {
	
	Rational r1;
	Rational r2;
	JFrame frame;
	JButton button;
	JTextField numText1, denText1, numText2, denText2;
	JTextField ansText;
	int option; // an option that tells you what the user decided to do
	
	public GraphicFractions(){};

	public Rational compute(String numText1, String denText1, String numText2, String denText2) throws NumberFormatException {
		try{
			Integer numInt1 = Integer.valueOf(numText1);
			Integer denInt1 = Integer.valueOf(denText1);
			Integer numInt2 = Integer.valueOf(numText2);
			Integer denInt2 = Integer.valueOf(denText2);
			
			r1 = new Rational(numInt1, denInt1);
			r2 = new Rational(numInt2, denInt2);
			
			switch (option) {
			case 0:
				return r1.add(r2);
			case 1:
				return r1.sub(r2);
			case 2:
				return r1.mul(r2);
			case 3:
				return r1.div(r2);
			default:
				break;
			}
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(frame, "bad inputs. please try again");
		}
		return null;
	}
	
	public static void main(String[] args) {
		new GraphicFractions().createGui();
	}
	
	public void createGui(){
		frame = new JFrame("fraction calculation program");
		frame.setLayout(new FlowLayout());
		
		JPanel inputPanel  = new JPanel();
		inputPanel.setLayout(new GridLayout(4,2));
		
		JLabel numLabel1 = new JLabel("numerator of the first fraction");
		JLabel denLabel1 = new JLabel("denominator of the first fraction");
		JLabel numLabel2 = new JLabel("numerator of the second fraction");
		JLabel denLabel2 = new JLabel("denominator of the second fraction");

		numText1 = new JTextField(5);
		denText1 = new JTextField(5);
		numText2 = new JTextField(5);
		denText2 = new JTextField(5);
		
		inputPanel.add(numLabel1);
		inputPanel.add(numText1);
		
		inputPanel.add(denLabel1);
		inputPanel.add(denText1);
		
		inputPanel.add(numLabel2);
		inputPanel.add(numText2);
		
		inputPanel.add(denLabel2);
		inputPanel.add(denText2);
	
		
		frame.add(inputPanel);
		
		//making this simple so the button only does addition
		button = new JButton("Add!");
		button.setBackground(new Color(255,0,0));
		button.addActionListener(new AddListener());
		frame.add(button);
		
		//TODO - can we write a general enough method so that I
		// get add, subtract etc etc
		
		ansText = new JTextField(5);
		frame.add(ansText);
		
		String userName = JOptionPane.showInputDialog(frame, "what is your name?");  
		
		createOperationOptions();
		
		modifyButtonAsPerUserActions();
		
		frame.setTitle("Rational calculator for " + userName);
		frame.setMinimumSize(new Dimension(640,480));
		frame.setVisible(true);
	}
	
	/**
	 * ask the user if they want to add, subtract, multiply or divide
	 */
	public void createOperationOptions(){
		Object[] options = new String[]{"+", "-", "*", "/"};
		//TODO - try this live in class
		option = JOptionPane.showOptionDialog(frame, "which operation would you like to perform?",
									"option picker", 
									JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
	}
	
	public void modifyButtonAsPerUserActions(){
		switch (option) {
		case 0:
			button.setText("Add");
			break;
		case 1:
			button.setText("Sub");
			break;
		case 2:
			button.setText("Multiply");
			break;
		case 3:
			button.setText("Divide");
			break;
		default:
			break;
		}
	}
	
	//internal class
	class AddListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			Rational r = compute(numText1.getText(), denText1.getText(), numText2.getText(), denText2.getText());
			if (r!=null)
			ansText.setText(r.toString());
		}
	}

	
}
