package cards;

import java.util.*;

public class Deck {

    ArrayList<Card> deck;
    
    public Deck() {
        for (int rank = 1; rank <= 13; rank++){
            Card heartCard = new Card(rank, 'h');
            deck.add(heartCard);
            Card spadeCard = new Card(rank, 's');
            deck.add(spadeCard);
            Card clubCard = new Card(rank, 'c');
            deck.add(clubCard);
            Card diamondCard = new Card(rank, 'd');
            deck.add(diamondCard);
        }
    }

       
    void shuffle(){
        //do not worry about this method.
        // simple included it for completeness
        Collections.shuffle(deck);
    }
    
    Card deal(){
        Card topCard = this.deck.get(0);
        return topCard;
    }
    
    void addCardTop(Card c){
       this.deck.add(0, c);
    }
    
    void addCardBottom(Card c){
        this.deck.add(c);
    }
    
    boolean empty(){
        return this.deck.isEmpty();
    }
    
}
