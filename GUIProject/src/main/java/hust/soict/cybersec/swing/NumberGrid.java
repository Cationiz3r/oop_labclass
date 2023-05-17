package hust.soict.cybersec.swing;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberGrid
extends JFrame {
	private JButton[] btnNumbers = new JButton[10];
	private JButton btnDelete, btnReset;
	private JTextField tfDisplay;

	public NumberGrid() {
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());

		tfDisplay = new JTextField();
		tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		cp.add(tfDisplay, BorderLayout.NORTH);

		JPanel panelButtons = new JPanel(new GridLayout(4, 3));
		// addButtons(panelButtons);
		cp.add(panelButtons, BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Number grid");
		setSize(200, 200);
		setVisible(true);
	}
}
