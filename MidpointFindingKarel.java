/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

/* algorithm for problem 3
 * find midway point without a built in method like math.floor in javascript
 * don't know length of avenues
 * keep a counter for every time karel moves
 * run a while loop to gauge how many moves Karel makes before hitting the wall
 * divide the counter by two
 * then move that many times in the opposite direction --- i.e. make sure to turn around before moving
 * then place beeper at that point
 */

public class MidpointFindingKarel extends SuperKarel {
	
	int counter = 0;
	int halfway = 0;
	public void findLengthOfAvenue() {
		while(frontIsClear()) {
			move();
			counter ++;
		}
		if (counter % 2 == 0) {
			halfway = counter / 2;
		} else {
			halfway = counter / 2;
			halfway -= 0.5;
		}
	}

}
