/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacardgame;
import java.util.Random;
import java.util.Scanner;

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
        CardConstructor[] cards = new CardConstructor[2];
        
        for (int i = 0; i<cards.length; i++){
            int attackPower = (int) Math.floor(Math.random()*10+10);
            int defence = (int) Math.floor(Math.random()*20+40);
            int health = (int) Math.floor(Math.random()*30+30);
            cards[i] = new CardConstructor(name[i], attackPower,defence,health);
            //System.out.print(cards[i].name);
            
            
        }
        CardConstructor player = cards[0];
        CardConstructor enemy = cards[1];
        
        int playerScore = 0;
        int enemyScore = 0;
        
            System.out.println("Name: "+player.name);
            System.out.println("AP: "+player.attack);
            System.out.println("DP: "+player.defence);
            System.out.println("HP: " + player.health);
            
        while (playerScore < 10 || enemyScore < 10){
            
            Scanner sc = new Scanner(System.in);
            
            int attack = sc.nextInt();
            switch (attack){
                case 1: 
                    if (player.attack > enemy.attack){
                        System.out.println("You choose attack: " + player.attack + " Your opponent had " + enemy.attack);
                        System.out.println("You Win!"); 
                    }
                    else if (player.attack == enemy.attack){
                        System.out.println("You choose attack: " + player.attack + " Your opponent had " + enemy.attack);
                        System.out.println("It's a tie!"); 
                    }
                    else{
                        System.out.println("You choose attack: " + player.attack + " Your opponent had " + enemy.attack);
                        System.out.println("Noob!");
                    }
                    break;
                case 2: 
                    if (player.defence > enemy.defence){
                        System.out.println("You choose defence: " + player.defence + " Your opponent had " + enemy.defence);
                        System.out.println("You Win!");
                    }
                    else if (player.defence == enemy.defence){
                        System.out.println("You choose defence: " + player.attack + " Your opponent had " + enemy.attack);
                        System.out.println("It's a tie!"); 
                    }else{
                        System.out.println("You choose defence: " + player.defence + " Your opponent had " + enemy.defence);
                        System.out.println("Noob!");
                    }
                        
                    break;
                case 3: 
                    if (player.health > enemy.health){
                        System.out.println("You choose health: " + player.health + " Your opponent had " + enemy.health);
                        System.out.println("You Win!");
                    }
                    else if (player.health == enemy.health){
                        System.out.println("You choose health: " + player.attack + " Your opponent had " + enemy.attack);
                        System.out.println("It's a tie!"); 
                    }else{
                        System.out.println("You choose health: " + player.health + " Your opponent had " + enemy.health);
                        System.out.println("Noob!");
                    }
                        
                    break;
                default: System.out.println("QUUEUEUE?");
                 
                           
            }
                
            
            
        }

        //System.out.print(cards[i].attack);
        //cardCreator("Jytte", 12, 50, 20);
    }
    
    
  
    
}
