/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package states;

import entities.Game;

/**
 * Turn Phase.
 * @author Mario Codes
 */
public class Turn implements Phase {
    @Override
    public void change(Game game) {
        game.setPhase(this);
        if(game.isLastPlayerInRound()) new River().change(game);
        else {
            game.resetPhaseTurns();
            game.retrieveTableCards(1);
        }
    }

    @Override
    public boolean checkMayPlayerBet(Game game, String id) {
        return Actions.mayBet(game, id);
    }
    
    @Override
    public int doBet(Game game, String id, int amount) {
        int pool = Actions.bet(game, id, amount);
        if(Actions.isLastPlayerInOrder(game, id)) new River().change(game);        
        return pool;
    }

    @Override
    public boolean retirePlayerFromRound(Game game, String id) {
        boolean retired = Actions.retirePlayer(game, id);
        if(game.isLastPlayerInRound()) new River().change(game);
        return retired;
    }
    
    @Override
    public String toString() {
        return "Turn";
    }
}