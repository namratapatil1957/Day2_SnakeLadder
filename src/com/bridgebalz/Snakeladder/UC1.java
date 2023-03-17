package com.bridgebalz.Snakeladder;
import java.util.*;

public class UC1 {

	public static void main(String[] args) {
		
		int min_num = 1;
		int max_num = 7;
		
		int dice = (int) ((Math.random() *(max_num - min_num)) + min_num);
		
		System.out.println(" The dice number is:" + dice);
	}
}
