package com.bridgeLab.snakeladdergame;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SnakeLadderOperation {
	
	final static int Destination = 100;
	
	static Map<Integer, Integer> snake = new HashMap<Integer, Integer>();
	static Map<Integer, Integer> ladder = new HashMap<Integer, Integer>();
	
	{
		snake.put(49, 6);
		snake.put(86, 53);
		snake.put(97, 63);
		
		ladder.put(3, 24);
		ladder.put(34, 64);
		ladder.put(42, 99);
		ladder.put(69, 88);
	}
	
	 public int rollDice()
	    {
		 	int n = 1;
	        Random r = new Random();
	        n = r.nextInt(6);
	        return n;
	    }
	
	 public int playerValue(int player, int diceValue)
	    {
	        player = player + diceValue;
	          
	        if(player > Destination)
	        {
	            player = player - diceValue;
	            return player;
	        }
	          
	        if(snake.get(player) != null)
	        {
	            System.out.println("bitten by snake");
	            player = snake.get(player);
	        }
	          
	        if( ladder.get(player) != null)
	        {
	            System.out.println("climb up the ladder");
	            player = ladder.get(player);
	        }
	        return player;
	    }
	 
	 
	 public boolean win(int player) {
		 return Destination == player;
	 }
	 
	 public void startGame()
	    {
	        int player1 = 0, player2 = 0;
	        int currentPlayer = -1;
	        Scanner s = new Scanner(System.in);
	        int diceValue =0;
	        int num;
			do
	        {
	            System.out.println(currentPlayer==-1?"\n\nFIRST PLAYER TURN":"\n\nSECOND PLAYER TURN");
	            System.out.println("Press 1 to roll Dice");
	            num = s.nextInt();
	            diceValue = rollDice();
	              
	              
	            if(currentPlayer == -1)
	            {
	                player1 = playerValue(player1,diceValue);
	                System.out.println("Player A: " + player1);
	                System.out.println("Player B: " + player2);
	               
	                if(win(player1))
	                {
	                    System.out.println("First player wins");
	                    return;
	                }
	            }
	            else
	            {
	                player2 = playerValue(player2,diceValue);
	                System.out.println("First Player: " + player1);
	                System.out.println("Second Player: " + player2);
	               
	                if(win(player2))
	                {
	                    System.out.println("Second player wins");
	                    return;
	                }
	            }
	              
	            currentPlayer= -currentPlayer;
	              
	              
	              
	        }while(1==num);
	    }  
	 
	
	
	
}
