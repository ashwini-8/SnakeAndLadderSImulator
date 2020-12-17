package com.java.project;
import java.util.Random;

public class SnakeAndLadder {
	// UC1 snake and ladder game played with single player at position 0
	static final int START_POSITION = 0;
	static final int END_POSITION = 100;
    static int playerOne = 0;
    static int playerTwo = 0;
	static final int LADDER = 1;
	static final int SNAKE = 2;
	static final int NOPLAY = 0;
	static Random random = new Random();
	private static int count = 0;
	
	public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
        //UC7 two players game 
        while(playerOne < END_POSITION && playerTwo < END_POSITION)
		{
            playerOne = checkPosition(playerOne);
            playerTwo = checkPosition(playerTwo);
        }
        if(playerOne >= END_POSITION){
            System.out.println("Player One Wins!"); 
        }
        else System.out.println("Player Two Wins!");
        System.out.println("Num of times dice is tossed = "+count);
    }
    
	// UC2 rolling a dice
	static int rollingDice() {
		int diceNum = random.nextInt(6) + 1;
		System.out.println("DiceNum: " + diceNum);
		count++;
		return diceNum;
        }
        
	// UC3 no play,ladder,snake
	static int checkPosition(int currentPosition) {
        //UC4 repeat till the player reaches 100
        int diceNum = rollingDice();
        int choice = random.nextInt(3);
        System.out.println("choice: "+choice);
        
        switch (choice){
            case NOPLAY:
                System.out.println("no play: " + currentPosition);
                break;
            case LADDER:
                //UC5 player reaches 100
                currentPosition += diceNum;
                System.out.println("ladder: " + currentPosition);
                break;
            case SNAKE:
                currentPosition -= diceNum;
                if(currentPosition < START_POSITION){
                    currentPosition = START_POSITION;
                } 
                System.out.println("Snake: " + currentPosition);
                break;	
            }
        return currentPosition;
        
        }
    }