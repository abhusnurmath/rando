package guiprograms;

import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class DegreeSlider extends JSlider {

	public DegreeSlider() {
		this.setMinimum(0);
		this.setMaximum(10);
		this.setOrientation(SwingConstants.VERTICAL);
		this.setPaintTicks(true);
		this.setPaintLabels(true);
		this.setMajorTickSpacing(2);
		this.setMinorTickSpacing(1);
	}

}
