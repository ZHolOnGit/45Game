package Interfaces;

import Enums.Suit;

public interface Card {
    /**
     * Attributes for the Interfaces.Card class
     * Suit suit (Diamond, spade ect)
     * Enums.CardType Card type (ace, two ect)
     * int Power
     * int Owner, determines which player the card belongs to once played
     */

    public int calculatePower();// Calculates the power of the card based on the type and suit

    public boolean checkPlayable(Suit trump, Suit current);//calculates if the card can be played based on the current game state


}
