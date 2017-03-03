/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	/* algorithm for problem 2
	 * turn left
	 * move up the avenue
	 * place a beeper where beeper is not present
	 * check if beeper is on last avenue before wall and place beeper if one is not present
	 * turn around
	 * go back down to wall
	 * turn left 
	 */
	
	public void repairArches() {
		for (int i = 1; i <= 13; i += 4) {
			turnLeft();
			moveUpAvenue();
			turnAround();
			returnToFirstAvenue();
			if (i == 1 || i == 5 || i == 9) {
				moveToNextArch();	
			}
			turnLeft();
		}
	}
	
	public void moveUpAvenue() {
		while(frontIsClear()) {
			if (noBeepersPresent()) {
				putBeeper();
			}
		}
		if (noBeepersPresent()) {
			putBeeper();
		}
	}
	
	public void returnToFirstAvenue() {
		while(frontIsClear()) {
			move();
		}
		turnLeft();
	}
	
	public void moveToNextArch() {
		for (int i = 0; i <= 3; i++) {
			move();
		}
	}
}
