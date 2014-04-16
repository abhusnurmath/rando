package dice;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Dice extends JButton{

    int value;
    
    public Dice() {
        addIcon();
    }
    
    /**
     * roll the dice 
     * by setting an instance variable
     */
    public void roll(){
        value = (int)(Math.random()*(6-1)) + 1;
        switch (value) {
        case 1:
            addIcon("one.jpg");
            break;
        case 2:
            addIcon("two.jpg");
            break;
        case 3:
            addIcon("three.jpg");
            break;
        case 4:
            addIcon("four.jpg");
            break;
        case 5:
            addIcon("five.jpg");
            break;
        case 6:
            addIcon("six.jpg");
            break;
        default:
            break;
        }
    }
    
    /**
     * Used solely for the purpose
     * of adding a dice image to the button
     */
    private void addIcon(){
       addIcon("red-dice-icon.jpg");
    }
    
    private void addIcon(String imgName){
        Image img;
        try {
            img = ImageIO.read(new File(imgName));
            setIcon(new ImageIcon(img));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getValue() {
        return value;
    }
    
    

}
