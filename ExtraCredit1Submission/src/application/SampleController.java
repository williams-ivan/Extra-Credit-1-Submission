package application;

import java.io.IOException;
//import java.util.List;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class SampleController {
	
	@FXML
	private TextField textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8;
	
	@FXML
	private Label label;
	
	@FXML
	public void close(ActionEvent event) { //exits the app
		Platform.exit();
		System.exit(0);
	}
	
	@FXML
	public void makeStory(ActionEvent event) throws IOException {
		//gets the text from each TextField
		String[] s = {textField1.getText(), textField2.getText(), textField3.getText(), textField4.getText(), textField5.getText(), textField6.getText(), textField7.getText(), textField8.getText()};
		
		String text = "I fell asleep yesterday listening to an old album that my mom had. I really enjoyed it, though I had a weird dream. It was kind of like one of the old songs.\n\nI've been workin' in " + s[1] + ",\nAll the " + s[2] + " day.\nI've been workin' in " + s[1] + ",\nJust to pass the time away.\nDon't you hear the whistle " + s[3] + "?\nRise up so early in the morn.\nDon't you hear " + s[4] + " shouting\n" + s[5] + ", " + s[6] + " your horn?\n\n" + s[5] + ", won't you " + s[6] + ",\n" + s[5] + ", won't you " + s[6] + " your horn?\n\nSomeone's in the " + s[7] + " with " + s[5] + ".\nSomeone's in the " + s[7] + ", I know\nSomeone's in the " + s[7] + " with " + s[5] + ".\nStrumming on the old " + s[8] + ".\n\nIt was the weirdest dream I've had in a long time!";
		
		//to change scenes
		Parent result = FXMLLoader.load(getClass().getResource("Result.fxml"));
		Scene resultScene = new Scene(result);
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.hide();
		stage.setScene(resultScene);
		stage.show();
		
		//sets the text of the label to the story
		label.setText(text);
	}
}
