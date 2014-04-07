package guiprograms;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class SliderExample extends JFrame implements ActionListener {

    DegreeSlider cs;
    DegreeSlider fs;
    JButton submit;

    public SliderExample() {
    }

    /***
     * the method where the actual GUI is created
     * main just calls into this method
     */
    public void createGUI() {
        JMenu menu = new JMenu("File");
        menu.add(makeMenuItem("Open"));
        menu.add(makeMenuItem("Save"));
        menu.add(makeMenuItem("Quit"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        setJMenuBar(menuBar);

        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        JLabel celsius = new JLabel("celsius");
        p1.add(celsius);
        cs = new DegreeSlider();
        p1.add(cs);
        JLabel fahrenheit = new JLabel("fahrenheit");
        p1.add(fahrenheit);
        fs = new DegreeSlider();
        p1.add(fs);
        this.add(p1, BorderLayout.NORTH);
        submit = new JButton("submit");
        submit.addActionListener(new ClickListener());
        this.add(submit, BorderLayout.CENTER);
        showIt();
    }

    public void onSubmit() {
        int celsius = cs.getValue();
        int fahr = (int) (9 / 5.0 * celsius + 32.0);
        fs.setValue(fahr);
    }

    public static void main(String[] args) {
        new SliderExample().createGUI();
    }

    public void actionPerformed(ActionEvent e) {
        
        // Menu item actions
        String command = e.getActionCommand();
        
        if (command.equals("Quit")) {
            System.exit(0);
        } else if (command.equals("Open")) {
            // Open menu item action
            System.out.println("Open menu item clicked");
        } else if (command.equals("Save")) {
            // Save menu item action
            System.out.println("Save menu item clicked");
        }
    }
    
    /***
     * a method that only exists because JFrame's show up in this super tiny
     * minimized manner.
     */
    private void showIt() {
        this.setMinimumSize(new Dimension(640, 480));
        this.setLocation(50, 100);
        pack();
        this.setVisible(true);
    }

    private JMenuItem makeMenuItem(String name) {
        JMenuItem m = new JMenuItem(name);
        m.addActionListener(this);
        return m;
    }
    

    /***
     * an inner class that handles the clicking of 
     * the submit button
     */
    class ClickListener implements KeyListener, ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            onSubmit();
        }

        @Override
        public void keyPressed(KeyEvent arg0) {
            // TODO Auto-generated method stub
        }

        @Override
        public void keyReleased(KeyEvent arg0) {
            // TODO Auto-generated method stub
        }

        @Override
        public void keyTyped(KeyEvent arg0) {
            // TODO Auto-generated method stub
        }

    }

}
