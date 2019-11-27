/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matador.fields;

import matador.Player;

/**
 *
 * @author Mikke
 */
public class StreetField extends BuyableField
{

    public StreetField(String name, int price)
    {
        super(name, price);
    }

    @Override
    public int calculatePrice()
    {
        return 1;
    }

    @Override
    public void landOnField(Player P)
    {
        
    }
    
}
