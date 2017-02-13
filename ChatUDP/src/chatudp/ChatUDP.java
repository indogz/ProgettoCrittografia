
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatudp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.*;

/**

 @author MATTEO
 */
public class ChatUDP extends Application {

	public static boolean isReady = false;

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

		Scene scene = new Scene(root);

		stage.setScene(scene);
		stage.show();

		System.out.println("dentro a start");

		
		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent t
			) {
				Platform.exit();
				System.exit(1);
			}
		});

	}

	/**
	 @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("dentro a main");
		launch(args);

	}

}
