package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String image = "https://upload.wikimedia.org/wikipedia/commons/9/92/%E2%99%82_Common_Kingfisher_%28Alcedo_atthis%29_Photograph_By_Shantanu_Kuveskar%2C_Mangaon%2C_Maharashtra%2C_India.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component com = createImage(image);
		// 3. use the "createImage()" method below to initialize your Component
		
		// 4. add the image to the quiz window
		quizWindow.add(com);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String kingfisher = JOptionPane.showInputDialog(null, "What is this bird called?");
		// 7. print "CORRECT" if the user gave the right answer
		if (kingfisher.equals("Kingfisher")) {
			JOptionPane.showMessageDialog(null,"Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		// 8. print "INCORRECT" if the answer is wrong
        
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(com);
		// 10. find another image and create it (might take more than one line
		// of code)
		String image2 = "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F37%2F2020%2F07%2F14%2FAttract-Cardinals.jpg";
		// 11. add the second image to the quiz window
		Component com2 = createImage(image2);
		quizWindow.add(com2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String cardinal = JOptionPane.showInputDialog("What is this bird called?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (cardinal.equals("Cardinal")) {
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
