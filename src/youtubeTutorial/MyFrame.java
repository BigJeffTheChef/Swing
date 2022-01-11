package youtubeTutorial;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
		
		this.setSize(420, 420); 									// sets x and y dimension of this
		this.setTitle("Jthis title goes here");						// sets title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// exit out of application (otherwise it just hides this)
		this.setResizable(false); 									// prevents this from being resized

		ImageIcon image = new ImageIcon("./Calculator-19.png"); 	// creates an ImageIcon object
		this.setIconImage(image.getImage());						// set icon to image ImageIcon (not on linux?)
		this.getContentPane().setBackground(new Color(0xFFFFFF));	// change background colour of image

		this.setVisible(true);
	}
}
