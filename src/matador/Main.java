/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matador;

/**
 *
 * @author Jacob
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        boolean startGame = false;
        String preGame = "addPlayer";
        String gameOrder = "nextPlayer";
        boolean isGameOver = false;
        short turnCount = 0;
        short eyeCount;
        boolean extraRoll;

        //
        Controller MatadorController = new Controller();

        do
        {
            switch (preGame)
            {
                case "addplayer":
                    MatadorController.addPlayer();
                    break;
                case "startGame":
                    if (MatadorController.playerList.size() < 2)
                    {
                        System.out.println("at least 2 players are needed to start the game");
                        break;
                    }
                    else
                    {
                        startGame = true;
                        break;
                    }
            }
        }
        while (MatadorController.playerList.size() < 6 || !startGame);

        do
        {
            switch (gameOrder)
            {
                case "nextPlayer":
                    System.out.println("Next player is: " + MatadorController.getCurrentPlayer(turnCount).GetName());
                    gameOrder = "rollDice";
                    break;
                case "rollDice":
                    eyeCount = MatadorController.rollDice();
                    MatadorController.checkPairCount(MatadorController.getCurrentPlayer(turnCount));
                    if (MatadorController.getCurrentPlayer(turnCount).isJail())
                    {
                        gameOrder = "endTurn";
                    }
                    extraRoll = MatadorController.isPair();
                    gameOrder = "movePlayer";
                    break;

                case "movePlayer":
                    MatadorController.getCurrentPlayer(turnCount).movePlayer(MatadorController.getDiceValue());
                    gameOrder = "fieldactions";
                    break;
                    
                case "fieldaction":
                    MatadorController.board[MatadorController.getCurrentPlayer(turnCount).getPosition()].landOnField(MatadorController.getCurrentPlayer(turnCount));
                    
                case "options":
                    System.out.println("what do you want to do?");
                    
                case "buyProperty":
                    MatadorController.board[MatadorController.getCurrentPlayer(turnCount).getPosition()].buyField(MatadorController.getCurrentPlayer(turnCount));
                    
                case "buildEstate":
                    
                case "endTurn":
                    MatadorController.getCurrentPlayer(turnCount).resetPair();
                    turnCount++;
                    gameOrder = "nextPlayer";
                    break;
            }

        }
        while (!isGameOver);
    }
}
