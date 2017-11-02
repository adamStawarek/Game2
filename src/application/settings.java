package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class settings implements Initializable{
	
	@FXML
    private RadioButton rbMulti,rbSingle,rbOnline,rbSmall,rbMedium,rbLarge,rbTime,rbKill ;
	
	@FXML
	private ComboBox<String> cmbTime,cmbKill,cmbScenario,cmbLevel;  

	
	public void Play() {
		Main m=new Main();
		Stage s= new Stage();
		m.start(s);
	}
	public void GoBack() {
		res2Contrloller r=new res2Contrloller();
		r.OpenMenu();
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		ToggleGroup group = new ToggleGroup();
		ToggleGroup group2 = new ToggleGroup();
		ToggleGroup group3 = new ToggleGroup();
		
		rbMulti.setToggleGroup(group);
		rbSingle.setToggleGroup(group);
		rbOnline.setToggleGroup(group);
		rbSingle.setSelected(true);
			
		rbSmall.setToggleGroup(group2);
		rbMedium.setToggleGroup(group2);
		rbLarge.setToggleGroup(group2);
		rbMedium.setSelected(true);
		
		rbTime.setToggleGroup(group3);
		rbKill.setToggleGroup(group3);
		rbTime.setSelected(true);
		
	    cmbTime.getItems().addAll("3min", "5min", "10min");
	    cmbTime.getSelectionModel().select("3min");
		
	    cmbKill.getItems().addAll("100", "300", "500");
	    cmbKill.getSelectionModel().select("100");
	    
	    cmbLevel.getItems().addAll("Easy", "Medium", "Hard");
	    cmbLevel.getSelectionModel().select("Medium");
	    
	    cmbScenario.getItems().addAll("USA-Elections", "Korwin the King", "Study apocalypse");
	    cmbScenario.getSelectionModel().select("USA-Elections");
	    
	    
	}
}
