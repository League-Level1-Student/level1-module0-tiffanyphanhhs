package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cookies implements ActionListener {
public void showButton() {
            System.out.println("Button clicked");
            JFrame Cookies = new JFrame ();
            Cookies.setVisible(true);
            JButton button = new JButton();
            Cookies.add(button);
            Cookies.pack();
            button.addActionListener(this);


}

private void actionPerformed(null, "Wahoo") {
	// TODO Auto-generated method stub
	 int rand = new Random().nextInt(5);
}
}
}

