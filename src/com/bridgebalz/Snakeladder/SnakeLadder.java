package com.bridgebalz.Snakeladder;
import java.util.*;

public class SnakeLadder {
	
Scanner sc = new Scanner (System.in);
	
	int current_position = 0;
	int win_position = 100;
	int min = 1;
	int max = 7;
	int dice_count = 0;
	
	
	public static void main(String[] args) {
		
		SnakeLadder sl = new SnakeLadder();
		
		System.out.println("\n ---------- Welcome to Snake and Ladder game ---------- ");
		
		sl.play();
	}
	
	
	public void play() {
		
		while (current_position < win_position) {
			
			int dice = (int) (Math.random()*(max - min) + min);
			System.out.println("\n The dice number is: " + dice);
			dice_count ++;
			
			int opt = (int) (Math.random()* 10) %3;
			System.out.println(" The option is: " + opt);
			
			System.out.println(" The current position is: " + current_position);
			
			switch(opt) {
			
			case 0:
				System.out.println(" No Play: Player can't go ahead");
				current_position = current_position;
				
				break;
				
			case 1:
				System.out.println(" Ladder: Player move ahead with " + dice + " place");
				current_position = current_position + dice;
				
				break;
				
			case 2:
				System.out.println(" Snack: Player move back with " + dice + " place");
				current_position = current_position - dice;
				if (current_position < 0) {
					current_position = 0;
				}
				break;
				
			}
			
			if (current_position > 100) {
				current_position = current_position - dice;
				System.out.println(" After moving current position is: " + current_position);
			}else {
				System.out.println(" After moving current position is: " + current_position);
			}
			
		}
		
	}
}