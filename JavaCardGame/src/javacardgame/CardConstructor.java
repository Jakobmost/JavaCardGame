package javacardgame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jakob
 */
public class CardConstructor {

    public String name;
    public int attack;
    public int defence;
    public int health;
    
    
    public  CardConstructor(String pokemonName, int attackPoints, int defencePoints, int healthPoints){
        this.name = pokemonName;
        this.attack = attackPoints;
        this.defence = defencePoints;
        this.health = healthPoints;
        

 
        
        
    }
    
    
}
