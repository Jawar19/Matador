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
    static ArrayList<Player> playerList;
    private static Cup dice;
    private short eyesOfDice;
    
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
    
    public short rollDice()
    {
        dice.rollDice();
        eyesOfDice = dice.getValue();
        System.out.println("you rolled" + dice.getValue());
        return eyesOfDice;
    }
    
    public int getDiceValue()
    {
        return dice.getValue();
    }
    
    
}

