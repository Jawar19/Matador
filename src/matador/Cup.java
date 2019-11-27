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
    private short result;

    //constructor
    public Cup()
    {
        this.die1 = new Die(6);
        this.die2 = new Die(6);
    }

    //methods
    public short getValue()
    {
        result = (short) (die1.getValue() + die2.getValue());
        return result;
    }

    public void rollDice()
    {
        die1.rollDie();
        die2.rollDie();
    }

    public boolean isPair()
    {   //could be replaces by "return die1.getValue() == die2.getValue()"
        return die1.getValue() == die2.getValue();
    }
}
