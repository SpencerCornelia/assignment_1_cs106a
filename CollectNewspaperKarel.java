/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {
	
	// You fill in this part
	private void moveToNewspaper() {
		turnRight();
		move();
		turnLeft();
		move();
		move();
		move();
		pickBeeper();
		turnAround();
	}
	
	private void pickUpNewspaper() {
		if (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
	}
	
	private void returnHome() {
		while(frontIsClear()) {
			move();
		}
		turnRight();
		move();
		turnRight();
	}
}
