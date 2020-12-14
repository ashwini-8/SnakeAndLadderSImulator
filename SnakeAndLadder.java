package com.java.project;
import java.util.Random;

public class SnakeAndLadder {
	// UC1 snake and ladder game played with single player at position 0
	int START_POSITION = 0;
	int PLAYER = 1;
	static Random random = new Random();
	
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");
		int diceNum = rollingDice();
		System.out.println("diceNum:" + diceNum);
		
	}
	// UC2 rolling a dice
	static int rollingDice() {
		int diceNum = random.nextInt(6) + 1;
		return diceNum;
		}
}