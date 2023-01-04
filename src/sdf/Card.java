package sdf;

public class Card {

    private String suit;
    private int value;
    private String name;

    public Card(String suit, int value, String name) {
        this.suit = suit;
        this.value = value;
        this.name = name;
    }
    public String getSuit() {
        return suit;
    }
    public int getValue() {
        return value;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Card [suit=" + suit + ", value=" + value + ", name=" + name + "]";
    }

    



    // public String[] generateDeck(){
    //     int[] cardNumber = new int[13];
    //     String[] suits = new String[4];
    //     String[] deck = new String[52];
    //     List<String> cardDeck = new LinkedList<String>();

    //     suits[0] = "Diamond";
    //     suits[1] = "Club";
    //     suits[2] = "Hearts";
    //     suits[3] = "Spade";

    //     for( int i = 0; i < cardNumber.length ; i++){
    //         cardNumber[i] = (i + 1);
    //     }

    //     for( int i = 0; i < cardNumber.length; i++){
    //         for(int j = 0; j < suits.length; j++){
    //             String cardString = String.valueOf(cardNumber[i]);
    //             if(cardString.equalsIgnoreCase("1")){
    //                 cardString = "Ace";                }
    //             if(cardString.equalsIgnoreCase("11")){
    //                 cardString = "Jack";                }
    //             if(cardString.equalsIgnoreCase("12")){
    //                 cardString = "Queen";                }
    //             if(cardString.equalsIgnoreCase("13")){
    //                 cardString = "King";                }
    //             cardDeck.add(cardString + " of " + suits[j]);
    //         }
    //     }
    //     for(int i = 0 ; i < deck.length ; i++){
    //         System.out.println(cardDeck.get(i));
    //     }
    //     return deck;
    // }
}
