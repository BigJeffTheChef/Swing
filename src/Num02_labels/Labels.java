package Num02_labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Labels {
	public static void main(String[] args) {

		ImageIcon icon = new ImageIcon("checkersIcon.png");		// create an icon
		Border border = BorderFactory.createLineBorder(Color.RED, 1); // create border; color and thickness

		JLabel label = new JLabel();							// create new label
		label.setText("Label Text!");							// set label text
		label.setIcon(icon); 									// set label icon

		label.setHorizontalTextPosition(JLabel.CENTER);			// SET TEXT VERT AND HOR - relative to image
		label.setVerticalTextPosition(JLabel.TOP);

		label.setForeground(Color.RED); 						// set text colour to RED
		label.setFont(new Font("Courier", Font.PLAIN, 20));		// set text font

		label.setIconTextGap(-50); 								// set gap between text and image (negative to bring closer)
		label.setBackground(Color.BLACK); 						// set background color - need to do next line to display
		label.setOpaque(true); 									// paint background color

		// label takes up as much room as possible unless specified

		label.setBorder(border);
		label.setVerticalAlignment(JLabel.TOP); 				// set vert positon of icon+text WITHIN the label
		label.setHorizontalAlignment(JLabel.CENTER);			// set hori positon of icon+text WITHIN the label
		//label.setBounds(100, 100, 300, 500); 					// set manual x and y position and dimensions within frame (requires frame layout manager to be null?)

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(750, 750);
		frame.setVisible(true);
		//frame.setLayout(null); 								// disable layout manager to allow manual positioning
		frame.add(label);										// add the label to frame
		frame.pack();											// pack all components into frame and resize to fit all (cant set layout to null or setBounds)

	}
}
