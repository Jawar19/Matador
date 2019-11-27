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
public class BreweryField extends BuyableField
{

    public BreweryField(String name, int price)
    {
        super(name, price);
    }

    @Override
    public int calculatePrice()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void landOnField(Player P)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
