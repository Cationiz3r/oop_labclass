package hust.soict.cybersec.swing;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberGrid
extends JFrame {
	private JButton[] btnNumbers = new JButton[10];
	private JButton btnDelete, btnReset;
	private JTextField tfDisplay;

	private class ButtonListener
	implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		}
	}

	public NumberGrid() {
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());

		tfDisplay = new JTextField();
		tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		cp.add(tfDisplay, BorderLayout.NORTH);

		JPanel panelButtons = new JPanel(new GridLayout(4, 3));
		addButtons(panelButtons);
		cp.add(panelButtons, BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Number grid");
		setSize(200, 200);
		setVisible(true);
	}

	private void addButtons(JPanel panelButtons) {
		var listener = new ButtonListener();
		for (int i = 0; i <= 9; ++i) {
			btnNumbers[i] = new JButton("" + i);
			btnNumbers[i].addActionListener(listener);
			if (i == 0) continue;
			panelButtons.add(btnNumbers[i]);
		}

		btnDelete = new JButton("DEL");
		btnDelete.addActionListener(listener);
		panelButtons.add(btnDelete);

		panelButtons.add(btnNumbers[0]);

		btnReset = new JButton("C");
		btnReset.addActionListener(listener);
		panelButtons.add(btnReset);
	}

	public static void main(String[] args) {
		new NumberGrid();
	}
}
