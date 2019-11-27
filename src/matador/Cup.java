/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matador;

public class Cup
{

    //attributes
    private Die die1;
    private Die die2;
    private int result;
    private int pairCount;

    //constructor
    public Cup()
    {
        this.die1 = new Die(6);
        this.die2 = new Die(6);
    }

    //methods
    public int getValue()
    {
        result = die1.getValue() + die2.getValue();
        return result;
    }

    public void rollDice()
    {
        die1.rollDie();
        die2.rollDie();
    }

    public boolean[] isPair()
    {
        //do boolean array
        boolean[] isPairReturn = new boolean[2];

        //could be replaces by "return die1.getValue() == die2.getValue()"
        if (die1.getValue() == die2.getValue())
        {
            pairCount++;
            if (pairCount == 3)
            {
                isPairReturn[1] = false;
            }
            else
            {
                isPairReturn[1] = true;
            }
            isPairReturn[0] = true;
        }
        else
        {
            isPairReturn[0] = false;
        }
        return isPairReturn;
    }
}
