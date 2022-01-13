package Num01_frames;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
		ImageIcon image = new ImageIcon("checkersIcon.png");
		
		this.setSize(420, 420);										// set x and y dimension of frame
		this.setTitle("Swing tutorial");							// set text title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 		// make window close, and not hide on pressing x
		this.setResizable(false); 									// prevent frame from being resized
		this.setIconImage(image.getImage());			// set the window icon
		this.getContentPane().setBackground(Color.GREEN);

		// do at end to render the frame visible
		this.setVisible(true);
	}
}
