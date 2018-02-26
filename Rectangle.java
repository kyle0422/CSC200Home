import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;

public class Rectangle extends Application {
	@Override
	public void start(Stage primaryStage) {
		TextInputDialog dialog = new TextInputDialog();
		dialog.setTitle("Smart Calculator");
		dialog.setHeaderText("Input width and height of the rectangle by space");
		Optional<String> input = dialog.showAndWait();
		String [] side = input.get().split(" ");
		double width = Double.parseDouble(side[0]);
		double height = Double.parseDouble(side[1]);
		double perimeter = 2 * (width + height);
		double area = width * height;

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Result of Calculation");
		alert.setContentText("The perimeter of the rectangle is " + perimeter + " cm. \nThe area of the rectangle is " + area + " cm^2.");
		alert.showAndWait();
	}
}
		
