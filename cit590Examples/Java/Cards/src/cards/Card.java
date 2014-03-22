package cards;

public class Card {

    int rank;
    char suit;
    boolean hidden;

    public Card(int rank, char suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * determine if this card has the same color the card represented by other
     * 
     * @param other
     * @return
     */
    boolean hasSameColor(Card other) {
        char suit = this.getSuit();
        char otherSuit = other.getSuit();
        if ((suit == 'D') || (suit == 'H')) {
            if ((otherSuit == 'D') || (otherSuit == 'H')) {
                return true;
            }
            return false;
        }
        if ((suit == 'C') || (suit == 'S')) {
            if ((otherSuit == 'C') || (otherSuit == 'S')) {
                return true;
            }
            return false;
        }
        return false;
    }

    char getSuit() {
        return suit;
    }

    int getRank() {
        return rank;
    }

    boolean isHidden() {
        return hidden;
    }

    void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    void setRank(int rank) {
        this.rank = rank;
    }

    void setSuit(char suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        if (this.rank == 0){
            return "blk";
        }
        if (this.hidden){
            return "xx";
        }
        if (this.rank <= 10){
            return ""+ rank + Character.toUpperCase(suit);
        }
        switch (rank) {
        case 11:
            return "J" + Character.toUpperCase(suit);
        case 12:
            return "Q" + Character.toUpperCase(suit);
        case 13:
            return "K" + Character.toUpperCase(suit);
        }
        return "invalid card";
    }
}
