package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot Bot = new Robot();

	public void run() {
		// Have a robot start on the left side of the window near the bottom.
		Bot.moveTo(20, 500);
		// Draw a flat-topped house of height 100 with grass after it
		Random ran = new Random();
		
		drawHouse("small");
		drawHouse("medium");
		drawHouse("large");
		
		for (int i = 0; i < 7; i++) {
			drawHouse(ran.nextInt(150) + 100,Color.CYAN);
		}
	}

	void drawHouse(int height, Color c) {
		Bot.setPenColor(c);
		Bot.setPenWidth(10);
		Bot.setSpeed(20);
		Bot.penDown();
		drawFlatRoof();
		Bot.move(height);
		Bot.move(height);
		Bot.turn(270);
		Bot.move(30);
		Bot.turn(270);

	}
	
	void drawHouse(String height) {
		if(height.equals("small")) {
			drawHouse(60,Color.CYAN);
		}
		else if(height.equals("medium")) {
			drawHouse(120,Color.CYAN);
		}
		if(height.equals("large")) {
			drawHouse(250,Color.CYAN);
		}
		void drawFlatRoof() {
			Bot.turn(90);
			Bot.move(50);
			Bot.turn(90);
		}
	}
}
