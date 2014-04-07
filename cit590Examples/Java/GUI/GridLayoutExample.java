package guiprograms;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExample extends JFrame {

	public void createGUI () {
		setLayout(new GridLayout (2,2));        
		add(new JButton("One"));
		add(new JButton("Two"));  
		add(new JButton("Three"));
		add(new JButton("Four"));
		add(new JButton("Five"));         
		add(new JButton("Six"));
		render();
	}
	
	private void render(){
	    pack();
        setSize(640, 480);
        //place in the center
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        //remember to do this!
        setVisible(true);
	}
	
	public static void main(String[] args) {
        new GridLayoutExample().createGUI();
    }
}
