package com.java.project;
import java.util.Random;

public class SnakeAndLadder {
	// UC1 snake and ladder game played with single player at position 0
	static final int START_POSITION = 0;
	int PLAYER = 1;
	static final int LADDER = 1;
	static final int SNAKE = 2;
	static final int NOPLAY = 0;
	static Random random = new Random();
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");
		int currentPositionOfPlayer = 0;
		int diceNum = rollingDice();
		System.out.println("diceNum:" + diceNum);
		
		while(currentPositionOfPlayer==100) {
			checkPosition(diceNum);
		}
		
	}
	// UC2 rolling a dice
	static int rollingDice() {
		int diceNum = random.nextInt(6) + 1;
		return diceNum;
	}
	// UC3 no play,ladder,snake
		static void checkPosition(int diceNum) {
			int choice = random.nextInt(3);
			System.out.println("choice"+choice);
			
			
			switch (choice) {
				case NOPLAY	:
					currentPosition = currentPosition;
					System.out.println("no play: " + currentPosition);
					break;
				case LADDER:
					currentPosition = currentPosition + diceNum;
					System.out.println("ladder: " + currentPosition);
					break;
				case SNAKE:
					currentPosition = currentPosition - diceNum;
					if(currentPosition<0){
						currentPosition =START_POSITION;
					} 
					System.out.println("Snake: " + currentPosition);
					break;	
				}
		}

}