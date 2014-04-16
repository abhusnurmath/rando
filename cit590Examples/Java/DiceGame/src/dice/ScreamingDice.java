package dice;

import java.awt.Toolkit;
import java.util.Observable;

public class ScreamingDice extends Observable {

    Dice die1;
    Dice die2;
    
    ScreamingDice(){
        die1 = new Dice();
        die2 = new Dice();
    }
    
    public void rollDice() {
        die1.roll();
        die2.roll();
        if (die1.getValue() == die2.getValue()){
            Toolkit.getDefaultToolkit().beep();
            setChanged();
            notifyObservers("DOUBLE!!! " + die1.getValue());
        }
    }
    
    public Dice[] getDice(){
       Dice[] diceArray = new Dice[2];
       diceArray[0] = die1;
       diceArray[1] = die2;
       return diceArray;
    }

}
