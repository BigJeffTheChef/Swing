package Num03_panels;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panels {

	public static void main(String[] args) {
		/*
		 * JPanel = A GUI component that functions as a container to hold other components
		 */

		JLabel label = new JLabel();
		label.setText("Label Text!");
		label.setIcon(new ImageIcon("Calculator-19smol.png"));
		//label.setVerticalAlignment(JLabel.BOTTOM); 					// not needed if using null layout manager
		//label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(0, 0, 200, 200);

		JPanel redPanel = new JPanel();									// create the red panel
		redPanel.setBackground(Color.RED);
		redPanel.setBounds(0, 0, 250, 250);
		//redPanel.setLayout(new BorderLayout());
		redPanel.setLayout(null);

		JPanel bluePanel = new JPanel();								// create the blue panel
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setBounds(250, 0, 250, 250);
		//bluePanel.setLayout(new BorderLayout());
		bluePanel.setLayout(null);

		JPanel greenPanel = new JPanel();								// create the green panel
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setBounds(0, 250, 500, 250);
		//greenPanel.setLayout(new BorderLayout());
		bluePanel.setLayout(null);

		// create frame
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);											// will be using this until layout lesson
		frame.setSize(750, 750);

		// add components
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		//bluePanel.add(label);
		greenPanel.add(label);
		//redPanel.add(label);

		// display frame
		frame.setVisible(true);

	}

}
