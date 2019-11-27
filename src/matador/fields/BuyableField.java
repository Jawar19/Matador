/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matador.fields;

import matador.IField;
import matador.Player;

/**
 *
 * @author Mikke
 */
abstract class BuyableField implements IField
{
    //Attributter
    protected Player owner;
    protected String name;
    protected int price;

    //Constructors
    public BuyableField (String name, int price)
    {
        this.name = name;
        this.price = price;
        this.owner = null;
    }
    
    //Methods
    public void setOwner (Player owner)
    {
        this.owner = owner;
    }
    
    public abstract int calculatePrice();    
}
