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
		Border border = BorderFactory.createLineBorder(Color.GREEN,3);

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

		// Jframe: a GUI window to add components to - implemented as a custom JFrame subclass (can also just set stuff here)
		MyFrame myframe = new MyFrame();

		myframe.add(label);										// add JLabel to JFrame
	}

}
