package Num04_Buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

	JButton button;
	JLabel label;

	public MyFrame() {
		label = new JLabel();
		label.setIcon(new ImageIcon("./Calculator-19smol.png"));
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);

		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(this);
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
		this.add(label);
		this.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			System.out.println("Poo");
			this.setEnabled(false);
			label.setVisible(true);
		}
	}

}
