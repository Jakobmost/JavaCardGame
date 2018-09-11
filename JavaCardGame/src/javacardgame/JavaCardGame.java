/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacardgame;
import java.util.Random;

/**
 *
 * @author jakob
 */
public class JavaCardGame {
    
    //DIS DA CARD GAME

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        String[] name = {"John", "Marcus", "Susan", "Henry", "Adam"};
        CardConstructor[] cards = new CardConstructor[5];
        
        for (int i = 0; i<cards.length; i++){
            int attackPower = (int) Math.floor(Math.random()*10+10);
            int defence = (int) Math.floor(Math.random()*20+40);
            int health = (int) Math.floor(Math.random()*30+30);
            cards[i] = new CardConstructor(name[i], attackPower,defence,health);
            System.out.println(cards[i].attack);
        }
        
        CardConstructor firstPokemon = new CardConstructor("Jytte", 12, 50, 20);
        CardConstructor SecondPokemon = new CardConstructor("Jytte", 12, 50, 20);

        //System.out.print(cards[i].attack);
        //cardCreator("Jytte", 12, 50, 20);
    }
    
    
  
    
}
