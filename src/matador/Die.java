/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matador;

import java.util.Random;

public class Die
{
    private final int numberOfSides;
    private final Random rand;
    private int value;
    
    public Die(int numberOfSides)
    {
        this.numberOfSides = numberOfSides;
        this.rand = new Random();
    }
    
    //methods
    public void rollDie()
    {
        value = rand.nextInt(numberOfSides) + 1;
    }
    
    public int getValue()
    {
        return value;     
    }
}
