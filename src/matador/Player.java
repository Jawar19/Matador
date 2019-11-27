/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matador;

public class Player
{

    private String name;
    private int balance;
    private short currentPosition;
    private short numberOfRound;
    private boolean isJail;
    private short pairCounter;

    //contructor
    public Player(String name)
    {
        this.name = name;
        balance = 4000;
        currentPosition = 0;
        numberOfRound = 0;
    }

    public int getPosition()
    {
        return currentPosition;
    }
    
    public int getbalance()
    {
        return balance;
    }
    
    public String GetName()
    {
        return this.name;
    }

    public void setIsJail(boolean isJail)
    {
        this.isJail = isJail;
    }
    
    public void addBalance(int amount)
    {
        this.balance += amount;
    }
    
    public boolean deductBalance(int amount)
    {
        boolean isDeductable = false;
        if (balance < amount){
            return !isDeductable;
        }
        else
        {
           balance -= amount;
           return isDeductable;
        }
    }
    
    public void movePlayer(int move)
    {
        if (this.currentPosition + move < Controller.board.length - 1)
        {
            this.currentPosition = (short) (this.currentPosition + move);
        }
        else if (this.currentPosition + move > Controller.board.length - 1)
        {
             this.currentPosition = (short) (this.currentPosition + move - Controller.board.length);
             this.addBalance(4000);
             numberOfRound++;   
        }
    }
    
    public short getNumberOfRounds()
    {
        return this.numberOfRound;
    }
    
    public void pairCounter(boolean isPair)
    {
        if (isPair)
        {
            pairCounter++;
        }
        if (pairCounter == 3){
            currentPosition = 10;
            isJail = true;
            System.out.println("You've been jail, you lucky SOB");
        }
    }
}
