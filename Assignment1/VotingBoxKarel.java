import stanford.karel.SuperKarel;

public class VotingBoxKarel extends SuperKarel {
	public void run() {
		while (facingEast()) {
		checkForPunches();
		}
	}
	
	//Alerts Karel of paper and cleans it
	private void checkForPunches() {
		while (frontIsClear()) {
			move();
			if (noBeepersPresent()) {
				recyclePaper();
			}
			move();
		}
	}
	
	//Karel collects paper
	private void recyclePaper() {
		turnLeft();
		look4Paper();
		look4Paper();
		turnRight();
	}
	
	//detects paper and resets position
	private void look4Paper() {
		move();
		while (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
	}
	



	

}