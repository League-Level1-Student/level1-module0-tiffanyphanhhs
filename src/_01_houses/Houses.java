package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
	//Have a robot start on the left side of the window near the bottom.
		Robot Bot = new Robot();
		Bot.moveTo(100, 500);
	//Draw a flat-topped house of height 100 with grass after it 
		for (int i = 0; i < 10; i++) {
			Bot.setPenColor(Color.CYAN);
			
		}
	}
}
