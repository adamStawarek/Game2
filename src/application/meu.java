package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class meu extends Application{
	
	@FXML
	Button btnSettings;
	
	public void OpenScores() {
		System.out.println("SHow scores");
		scores s=new scores();
		Stage stg=new Stage();
		try {
			s.start(stg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Stage stage = (Stage) btnSettings.getScene().getWindow();	    
	    stage.close();
	}
	public void Close() {
		System.out.println("Close window");
		Platform.exit();
	}
	public void OpenSettings() {
		System.out.println("Open Settings");		
		try {
	    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("set.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
       
		} catch(Exception e) {
			e.printStackTrace();
		}
		Stage stage = (Stage) btnSettings.getScene().getWindow();	    
	    stage.close();
	}
	
	 //The main is now launched in res2Controlle
   	public static void main(String[] args) {
   			launch(args);
   	}
	
	@Override
	public void start(Stage stage) throws Exception {
		try {
	        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
	                Parent root1 = (Parent) fxmlLoader.load();
	                stage = new Stage();
	                stage.setScene(new Scene(root1));  
	                stage.show();
	        } catch(Exception e) {
	           e.printStackTrace();
	   }
		
	}
}
