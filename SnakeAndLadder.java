package com.java.project;
import java.util.Random;

public class SnakeAndLadder {
	// UC1 snake and ladder game played with single player at position 0
	static final int START_POSITION = 0;
	static final int END_POSITION = 100;
	int PLAYER = 1;
	static final int LADDER = 1;
	static final int SNAKE = 2;
	static final int NOPLAY = 0;
	static Random random = new Random();
	private static int count = 0;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");
		checkPosition();
		
	}
	// UC2 rolling a dice
	static int rollingDice() {
		int diceNum = random.nextInt(6) + 1;
		System.out.println("DiceNum: " + diceNum);
		//UC6 no of times a dice is tossed
		count++;
		System.out.println("count: " + count);
		return diceNum;
		}
	// UC3 no play,ladder,snake
		static void checkPosition() {
			//UC4 repeat till the player reaches 100
			int currentPosition=START_POSITION;
			while(currentPosition < END_POSITION) {
			int diceNum = rollingDice();
			int choice = random.nextInt(3);
			System.out.println("choice: "+choice);
			
			switch (choice){
				case NOPLAY:
					System.out.println("no play: " + currentPosition);
					break;
				case LADDER:
					//UC5 player reaches 100
					int temp;
					temp = currentPosition;
					temp = temp + diceNum;
					if (temp <= END_POSITION) {
						currentPosition = temp;
						System.out.println("ladder: " + currentPosition);
					}
					break;
				case SNAKE:
					currentPosition = currentPosition - diceNum;
					if(currentPosition < START_POSITION){
						currentPosition = START_POSITION;
					} 
					System.out.println("Snake: " + currentPosition);
					break;	
				}
			}
		}

}