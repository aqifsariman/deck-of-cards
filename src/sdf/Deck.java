package sdf;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Deck {

    private List<Card> deck;
    // private static Set<Card> shuffledDeck;

    public Deck(){
        this.deck = new LinkedList<>();
        // this.shuffledDeck = new HashSet<>();
        for (int i = 0; i < Constants.SUIT.length; i++){
            String suit = Constants.SUIT[i];
            for(int j = 0; j < Constants.VALUES.length; j++){
                Integer value = Constants.VALUES[j];
                String name = Constants.NAMES[j];
                Card card = new Card(suit, value, name);
                deck.add(card);
                // shuffledDeck.add(card);
            }
        }   
        System.out.println("The new deck ");
        System.out.println(deck); 
    }

    public void shuffle(){
        Random rand = new SecureRandom();
        for (int currentCard = 0; currentCard < deck.size(); currentCard++){
            int toSwap = rand.nextInt(deck.size());
            Card c = deck.get(currentCard);
            Card d = deck.get(toSwap);
            deck.set(currentCard, d);
            deck.set(toSwap, c);
        }
    }

    @Override
    public String toString() {
        return "Deck [deck=" + deck + "]";
    }

    
}
