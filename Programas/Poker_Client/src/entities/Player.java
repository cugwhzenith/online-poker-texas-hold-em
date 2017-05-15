package entities;

import java.util.ArrayList;
import network.Connection;

/**
 * Representation of a player.
 * @author Mario Codes
 * @version 0.0.1 Just created. Setting the basics.
 */
public class Player {
    private Hand hand = new Hand();
    private int chips = 1000;
    private final String ID;
    
    /**
     * Default Constructor.
     * It assigns the ID of the player. 'Guest' if none.
     * @param ID Own players ID.
     */
    public Player(String ID) { 
        this.ID = ID;
    }
    
    public int bet(String reference, int amount) {
        int pool = Connection.bet(this, reference, amount);
        if(pool > 0) chips -= amount;
        return pool;
    }
    
    /**
     * Deletes the previous cards in the hand (if any) and adds the new ones.
     * @param cards AL<Card> to add as private cards.
     */
    public void addOwn(ArrayList<Card> cards) {
        this.hand.addOwn(cards);
    }
    
    public void addTable(ArrayList<Card> cards) {
        this.hand.addTable(cards);
    }
    
    /**
     * Get the private player cards.
     * @return AL<Card>. Private player cards.
     */
    public ArrayList<Card> getOwnCards() {
        return getHand().getOwn();
    }
    
    /**
     * Gets the saved common cards.
     * @return AL<Card>. Player common cards.
     */
    public ArrayList<Card> getTableCards() {
        return getHand().getTable();
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @return the hand
     */
    public Hand getHand() {
        return hand;
    }
}
