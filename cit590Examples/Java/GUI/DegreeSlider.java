package guiprograms;

import java.awt.Dimension;

import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class DegreeSlider extends JSlider {

	public DegreeSlider() {
		this.setMinimum(-250);
		this.setMaximum(250);
		this.setPreferredSize(new Dimension(100,600));
		this.setOrientation(SwingConstants.VERTICAL);
		this.setPaintTicks(true);
		this.setPaintLabels(true);
		this.setMajorTickSpacing(10);
		this.setMinorTickSpacing(5);
	}
	
	public static void main(String[] args) {
		//TODO implement this
	}

}
