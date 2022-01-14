package Num04_Buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrameWithLambda extends JFrame {

	JButton button;

	public MyFrameWithLambda() {

		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(e -> System.out.println("poo"));
		button.setText("I'm a button");
		button.setForeground(Color.RED);
		button.setFocusable(false);
		button.setIcon(new ImageIcon("./blackPiece.png"));
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setIconTextGap(-20);
		button.setBackground(Color.GRAY);
		button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		//button.setEnabled(false); // disable

		this.setLayout(null);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		this.add(button);
	}

}
