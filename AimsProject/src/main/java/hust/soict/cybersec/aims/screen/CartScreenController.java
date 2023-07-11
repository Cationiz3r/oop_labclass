package hust.soict.cybersec.aims.screen;

import hust.soict.cybersec.aims.cart.Cart;
import hust.soict.cybersec.aims.media.Media;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartScreenController {
	private Cart cart;

	@FXML private ToggleGroup filterCategory;
	@FXML private TableView<Media> tblMedia;
	@FXML private TableColumn<Media, String> colMediaTitle;
	@FXML private TableColumn<Media, String> colMediaCategory;
	@FXML private TableColumn<Media, Float> colMediaCost;
	@FXML private Button btnPlay;
	@FXML private Button btnRemove;
	@FXML private TextField tfFilter;
	@FXML private RadioButton radioBtnFilterID;
	@FXML private RadioButton radioBtnFilterTitle;

	public CartScreenController(Cart cart) { this.cart = cart; }

	@FXML
	private void initialize() {
		colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
		colMediaCategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
		colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
		tblMedia.setItems(cart.getItemsOrdered());

		btnPlay.setVisible(false);
		btnRemove.setVisible(false);
		tblMedia.getSelectionModel().selectedItemProperty().addListener(observable -> {
			var selected = tblMedia.getSelectionModel().getSelectedItem();
			if (selected == null) return;
			btnRemove.setVisible(true);
			btnPlay.setVisible(selected.isPlayable());
		});

		tfFilter.textProperty().addListener(observable -> { onFilterChange(); });
		filterCategory.selectedToggleProperty().addListener((obserble, oldValue, newValue) -> { onFilterChange(); });
	}

	private void onFilterChange() {
		// Empty filter
		if (tfFilter.getText().length() == 0) {
			tblMedia.setItems(cart.getItemsOrdered());
			return;
		}

		var button = (RadioButton)filterCategory.getSelectedToggle();
		assert(button != null);
		switch(button.getText()) {
			default:
			case "By Title":
				tblMedia.setItems(cart.filterTitle(tfFilter.getText()));
				break;
			case "By ID":
				tblMedia.setItems(cart.filterId(tfFilter.getText()));
				break;
		}
	}

	@FXML
	void onRemovePressed(ActionEvent event) {
		cart.removeMedia(tblMedia.getSelectionModel().getSelectedItem());
		if (cart.getItemsOrdered().size() < 1) {
			btnPlay.setVisible(false);
			btnRemove.setVisible(false);
		}
	}
}
