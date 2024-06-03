package org.company.tapu.capg;

public class Card {
    private String cardFace;
    private String cardvalue;

    public Card(String cardFace, String cardvalue) {
        this.cardFace = cardFace;
        this.cardvalue = cardvalue;
    }

    public String getCardFace() {
        return cardFace;
    }

    public void setCardFace(String cardFace) {
        this.cardFace = cardFace;
    }

    public String getCardvalue() {
        return cardvalue;
    }

    public void setCardvalue(String cardvalue) {
        this.cardvalue = cardvalue;
    }
}
