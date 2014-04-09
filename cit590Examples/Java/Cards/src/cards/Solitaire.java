package cards;

public class Solitaire {
    
    Deck deck;

    public Solitaire() {
        deck = new Deck();
    }
    
    public void play(){
        deck.shuffle();
        Card c = deck.deal();
        System.out.println("you were dealt " + c);
        Card c1 = deck.deal();
        System.out.println("the second card in the deck is " + c);
    }
    
    public static void main(String[] args) {
        new Solitaire().play();
    }

}
