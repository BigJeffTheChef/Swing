package Num05_BorderLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutDemo {

	public static void main(String[] args) {
		int width_margin = 10;
		int height_margin = 10;

		JFrame frame = new JFrame();

		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout(width_margin, height_margin)); // add margins to BorderLayout Constructor

		JPanel panel1, panel2, panel3, panel4, panel5;

		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();

		panel1.setBackground(Color.RED);
		panel2.setBackground(Color.GREEN);
		panel3.setBackground(Color.YELLOW);
		panel4.setBackground(Color.MAGENTA);
		panel5.setBackground(Color.BLUE);

		// the x and y of each of these sometimes work and sometimes don't depending on where in BorderLayout they are added
		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setPreferredSize(new Dimension(100, 100));
		panel3.setPreferredSize(new Dimension(100, 100));
		panel4.setPreferredSize(new Dimension(100, 100));
		panel5.setPreferredSize(new Dimension(100, 100));
		panel5.setLayout(new BorderLayout());


		// ---- sub panels
		JPanel panel6, panel7, panel8, panel9, panel10;

		panel6 = new JPanel();
		panel7 = new JPanel();
		panel8 = new JPanel();
		panel9 = new JPanel();
		panel10 = new JPanel();

		panel6.setBackground(Color.BLACK);
		panel7.setBackground(Color.DARK_GRAY);
		panel8.setBackground(Color.GRAY);
		panel9.setBackground(Color.LIGHT_GRAY);
		panel10.setBackground(Color.WHITE);

		panel6.setPreferredSize(new Dimension(100, 100));
		panel7.setPreferredSize(new Dimension(100, 100));
		panel8.setPreferredSize(new Dimension(100, 100));
		panel9.setPreferredSize(new Dimension(100, 100));
		panel10.setPreferredSize(new Dimension(100, 100));
		
		panel5.add(panel6, BorderLayout.NORTH);
		panel5.add(panel7, BorderLayout.SOUTH);
		panel5.add(panel8, BorderLayout.EAST);
		panel5.add(panel9, BorderLayout.WEST);
		panel5.add(panel10, BorderLayout.CENTER);
		// ---- end of sub panels

		// set the components to one of the borders in BorderLayout N,E,S,W and CENTER
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.SOUTH);
		frame.add(panel3, BorderLayout.EAST);
		frame.add(panel4, BorderLayout.WEST);
		frame.add(panel5, BorderLayout.CENTER);

	}

}
