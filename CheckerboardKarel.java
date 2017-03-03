/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

/* algorithm for creating checkerboard : problem #4
 * create an avenue variable: increase by one after each street completed
 * if avenue is odd, will put down beepers starting on first avenue
 * if avenue is even, will put down beepers starting on second avenue
 * make sure to check if side is clear to continue creating checkerboard --> this should help with board size
 */

public class CheckerboardKarel extends SuperKarel {

	int avenue = 1;
	int length = 1;
	
	public void findOutLength() {
		while(frontIsClear()) {
			move();
			length++;
		}
		turnAround();
	}
	public void checkerBoard() {
		if (avenue % 2 != 0) {
			putBeeperOnOddAvenue();
		}
	}

	public void putBeeperOnOddAvenue() {
		for (int i = 0; i )
		
	}
}
