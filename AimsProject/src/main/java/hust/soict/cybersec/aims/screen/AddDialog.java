package hust.soict.cybersec.aims.screen;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.cybersec.aims.media.Media;

/**
 * Should only be called from the screen package
 */
class AddDialog extends JDialog {
	AddDialog(Media media) {
		// Single text content
		var panel = new JPanel();
		var label = new JLabel("Item added to cart");
		panel.add(label);
		getContentPane().add(panel);

		// Close button
		var closeButton = new JButton("Ok");
		closeButton.addActionListener(e -> setVisible(false));
		panel.add(closeButton);

		// Set the dialog size and location
		pack();
	}
}
