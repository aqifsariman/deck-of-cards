package sdf;

// 1. GENERATE CARD
// 2. SHUFFLE CARDS
// 3. PICK OUT FROM THE TOP

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.printf(">> Before: %s", deck);    
        deck.shuffle();    
        System.out.printf(">> After: %s", deck);        
        // System.out.println(deck);
        // System.out.println(deck.shuffleDeck());
        // System.out.println(deck.generateDeck());
    }
}
