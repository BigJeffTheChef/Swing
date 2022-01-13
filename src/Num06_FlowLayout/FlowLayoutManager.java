package Num06_FlowLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutManager {
	public static void main(String[] args) {
		/*
		 *  Layout Manager = Defines the natural layout for components within a container
		 *  
		 *  FlowLayout =	places components in a row, sized at their preferred size.
		 *  				if the horizontal space in the container is too small,
		 *  				the FlowLayout class uses the next available row
		 */
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		frame.setTitle("FlowLayout Tutorial!");

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100, 250));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 2));

		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));

		frame.add(panel);

		frame.setVisible(true); // do at end
	}
}
