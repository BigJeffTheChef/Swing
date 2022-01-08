package swingBasics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Current guide page:
 * https://docs.oracle.com/javase/tutorial/uiswing/learn/logic.html
 * 
 * @author Peter Marley
 *
 */
public class CelciusConverterGUI extends JFrame {

	private JPanel contentPane;
	private JTextField inputTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CelciusConverterGUI frame = new CelciusConverterGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CelciusConverterGUI() {
		setTitle("Celcius Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 184, 149);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		inputTextField = new JTextField();
		inputTextField.setColumns(10);

		JLabel labelC = new JLabel("C");

		JButton buttonConvert = new JButton("Convert");
		

		JLabel labelF = new JLabel("F");
		
		JLabel result = new JLabel("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(buttonConvert, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(inputTextField, Alignment.TRAILING))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(labelC, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(labelF, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(22)
							.addComponent(result)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(inputTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelC))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonConvert)
						.addComponent(labelF))
					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
					.addComponent(result)
					.addGap(24))
		);
		contentPane.setLayout(gl_contentPane);
		
		buttonConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convert(inputTextField.getText(), result);
			}
		});
	}
	
	public static void convert(String input, JLabel result) {
		String errorMsg = "Bad input!";
		try {
			if (input != null && input.length() > 0) {
				double celsius = Integer.valueOf(input);
				double fahrenheit = (celsius * 1.8) + 32;
				System.out.println(fahrenheit);
				//Fahrenheit (°F) = (Celsius x 1.8) + 32
				
				result.setText(String.format("%.2f °F", fahrenheit));
			}
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
			result.setText(errorMsg);
		} catch (Exception ex) {
			ex.printStackTrace();
			result.setText(errorMsg);
		}
	}
}
