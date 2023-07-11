package hust.soict.cybersec.aims.screen;

import java.io.IOException;

import javax.swing.JFrame;

import hust.soict.cybersec.aims.cart.Cart;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class CartScreen extends JFrame {
	private Cart cart;

	public CartScreen(Cart cart) {
		this.cart = cart;

		var panel = new JFXPanel();
		add(panel);

		setTitle("Cart");
		setVisible(true);
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				try {
					var loader = new FXMLLoader(
						getClass()
						.getClassLoader()
						.getResource("cart.fxml"));
					loader.setController(new CartScreenController(cart));
					Parent root = loader.load();
					panel.setScene(new Scene(root));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
}
