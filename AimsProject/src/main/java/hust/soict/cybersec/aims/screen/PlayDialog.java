package hust.soict.cybersec.aims.screen;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.cybersec.aims.media.Media;
import hust.soict.cybersec.aims.media.Playable;

/**
 * Should only be called from the screen package
 */
class PlayDialog extends JDialog {
	PlayDialog(Media media) {
		assert(media.isPlayable());

		// Single text content
		var panel = new JPanel();
		var label = new JLabel(
			"Playing: " +
			media.getTitle() +
			" (" +
			((Playable)media).getLength() +
			" minutes)"
		);
		panel.add(label);
		getContentPane().add(panel);

		// Close button
		var closeButton = new JButton("Close");
		closeButton.addActionListener(e -> setVisible(false));
		panel.add(closeButton);

		// Set the dialog size and location
		pack();
	}
}
