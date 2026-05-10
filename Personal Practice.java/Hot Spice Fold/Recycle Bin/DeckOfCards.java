import java.security.SecureRandom;

public class Array{

private final SecureRandom randomNumbers = new SecureRandom();
private final int NUMBER_OF_CARDS = 52;

private Card [] deck = new Card [NUMBER_OF_CARDS];
private int currentCard = 0;


    public DeckoFCard (){

    String [] faces = {"Ace", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Queen", "King"};

    String [] suits = {"Heart", "Diamonds", "Clubs", "Spades"};

    for(int count = 0; count < deck.length; count ++){

        deck[count] = new Card(faces[count % 13], suits[count / 13]);

    }


 }

    public void shuffle(){

    currentCard = 0;

    for(int first = 0; first < deck.length; first ++) {

    int second = randomNumber.nextInt(NUMBER_OF_CARDS);

    Card temp = deck[first];
    deck[first] = deck[second];
    deck[second] = temp;
    }

    }

    public card dealCard(){

    if(currentCard < deck.length){
        return deck[currentCard++];
    
    }
    else {
        return null;
    
    }

    }
}

