package hust.soict.cybersec.aims.screen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import hust.soict.cybersec.aims.media.Media;

public class MediaStore
extends JPanel {
	private Media media;

	public MediaStore(Media media) {
		this.media = media;

		JLabel title = new JLabel(this.media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);

		JLabel cost = new JLabel("$" + media.getCost());
		cost.setAlignmentX(CENTER_ALIGNMENT);

		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		container.add(new JButton("Add to cart"));
		var playButton = new JButton("Play");
		playButton.addActionListener(e -> {
			var dialog = new PlayDialog(media);
			dialog.setVisible(true);
		});
		if (media.isPlayable()) container.add(playButton);

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(Box.createVerticalGlue());
		add(title);
		add(cost);
		add(Box.createVerticalGlue());
		add(container);

		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
}
