package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cookies implements ActionListener {
public void showButton() {
            System.out.println("Button clicked");
            JFrame Cookies = new JFrame ();
            Cookies.setVisible(true);
            JButton button = new JButton("CLICK ME");
            Cookies.add(button);
            Cookies.pack();
            button.addActionListener(this);


}

@Override
public void actionPerformed(ActionEvent arg0) {
	System.out.println("sdfsdfsdfds");
	int rand = new Random().nextInt(5);
	
}



}

