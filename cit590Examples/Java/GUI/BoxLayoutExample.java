package guiprograms;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JApplet;
import javax.swing.JButton;

public class BoxLayoutExample extends JApplet {

	public void init () {
		Box box = new Box(BoxLayout.Y_AXIS);
		add(box);        
		box.add(new JButton("One"));
		box.add(new JButton("Two"));  
		box.add(new JButton("Three"));
		box.add(new JButton("Four"));
		box.add(new JButton("Five"));         
		box.add(new JButton("Six"));      
	}
}
