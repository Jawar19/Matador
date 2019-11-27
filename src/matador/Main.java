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
<<<<<<< HEAD
        boolean extraRoll;
        
        
=======

>>>>>>> 38e17ee68dbc07cc382cdf43171ec532da32472b
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
                    } else
                    {
                        startGame = true;
                        break;
                    }
            }
        } while (MatadorController.playerList.size() < 6 || !startGame);

        do
        {
<<<<<<< HEAD
            case "nextPlayer":
                System.out.println("Next player is: " + MatadorController.playerList.get(turnCount).GetName());
                gameOrder = "rollDice";
                break;
            case "rollDice":
                eyeCount = MatadorController.rollDice();
                extraRoll = MatadorController.isPair();
                        
            case "movePlayer":
                MatadorController.playerList.get(turnCount).movePlayer(MatadorController.getDiceValue());
        }
        
    } while (!isGameOver);
=======

            switch (gameOrder)
            {
                case "nextPlayer":
                    System.out.println("Next player is: " + MatadorController.playerList.get(turnCount).GetName());
                    gameOrder = "rollDice";
                    break;
                case "rollDice":
                    if (MatadorController.rollDice())
                    {
                        gameOrder = "moveJail";
                    } else
                    {
                        gameOrder = "movePlayer";
                    }
                case "movePlayer":
                    MatadorController.playerList.get(turnCount).movePlayer(MatadorController.getDiceValue());
            }

        } while (!isGameOver);
>>>>>>> 38e17ee68dbc07cc382cdf43171ec532da32472b
    }

}
