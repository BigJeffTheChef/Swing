package youtubeTutorial;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 * Icon from : https://www.mcicon.com/product/calculator-icon-19/
 * @author Peter Marley
 * @GitHub BigJeffTheChef
 */
public class Main {

	public static void main(String[] args) {
		ImageIcon image = new ImageIcon("./Calculator-19smol.png");
		Border border = BorderFactory.createLineBorder(Color.GREEN, 3);

		// JLabel: A GUI display area for a String of text, an image, or both
		JLabel label = new JLabel();
		label.setText("Bro, do you even code?");				// set text of label (can pass as arg to constructor instead
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);			// set text left centre or right of ImageIcon
		label.setVerticalTextPosition(JLabel.TOP);				// set text top centre or bottom of ImageIcon
		label.setForeground(Color.RED);							// set label text colour
		label.setFont(new Font("Comic Sans", Font.PLAIN, 20));	// set label font
		label.setIconTextGap(100);								// set gap between text and image of JLabel
		label.setBackground(Color.ORANGE);						// set background colour
		label.setOpaque(true);									// paints every pixel within component bounds
		// label takes up entire space unless otherwise specified
		label.setBorder(border);								// again label takes up as much as possible
		label.setVerticalAlignment(JLabel.CENTER);				// set veritcal position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER);			// set horizontal positon of icon+text within label
		label.setBounds(0, 0, 250, 250);						// set the x and y position of label in frame, and dimensions

		// Jframe: a GUI window to add components to - implemented as a custom JFrame subclass (can also just set stuff here)
		JFrame frame = new JFrame();
		frame.setSize(420, 420); 								// sets x and y dimension of this
		//frame.setLayout(null); 								// disable default layout manager
		frame.setTitle("Jthis title goes here");				// sets title of this
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// exit out of application (otherwise it just hides this)
		//frame.setResizable(false); 									// prevents this from being resized

		frame.setIconImage(image.getImage());					// set icon to image ImageIcon (not on linux?)
		frame.getContentPane().setBackground(new Color(0xFFFFFF));// change background colour of image

		frame.setVisible(true);
		frame.add(label);										// add JLabel to JFrame
		frame.pack(); 											// automatically sizes the window to the components size (add components before packing)
	}

}
