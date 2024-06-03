package org.company.tapu.capg;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    enum Face{
        SPADES, HEART, CLUB, DIAMONDS
    }
    enum Values{
        ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING
    }

    public static void main(String[] args) {
        List<Card> allCards = new ArrayList<>();
        for (Face face : Face.values()) {
            for (Values value : Values.values()) {
                Card newCard = new Card(face.name(), value.name());
                allCards.add(newCard);
            }
        }
        for (Card card : allCards) {
            System.out.println(card.getCardvalue() + " of " + card.getCardFace());
        }
    }
}
