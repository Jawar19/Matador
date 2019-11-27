/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matador;

import java.util.ArrayList;
import java.util.Scanner;


public class Controller
{
    public static IField[]  board;
    ArrayList<Player> playerList;
    private Cup dice;
    
    public Controller()
    {
        this.board = new IField[40];
        this.dice = new Cup();
        playerList = new ArrayList<>();
    }
         
    
    //Metods
    public void addPlayer()
    {
        //method variables
        Scanner input = new Scanner(System.in);
        String name;
        //Getting name input, if theres less than 6 players in the playerlist, according to Matador-ruleset
        if (playerList.size() < 6 )
        {
        System.out.println("What is your name:");
        name = input.next();
        
        //Constructs a player at puts player in playerList
        Player p = new Player(name);
        playerList.add(p);
        }
    }
    
    public void fillBoard()
    {
        
    }
    
    public boolean rollDice()
    {
        dice.rollDice();
        System.out.println("you rolled" + dice.getValue());
        if (dice.isPair()[0])
        {
            
            System.out.println("You got a pair");
        }
        
        if (dice.isPair()[1])
        {
            System.out.println("You're goin to jail, for beeing to god damn lucky!");
            //playerList.get(player) //Move player to jail.
        }
        return dice.isPair()[1];
    }
    
    public int getDiceValue()
    {
        return dice.getValue();
    }
}

