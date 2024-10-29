package desktop.app.core;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class MainApp extends Application {

    public Color primaryColor = new Color(32, 57, 179);
    public Color seconderyColor = new Color(66, 183, 41);
    public Color accentColor = new Color(51, 161, 254);
    public Color themeColor = new Color(241, 245, 247);
    public boolean authenticated = false;

    @Override
    public void start(Stage stage) throws IOException {
        // Variables:
        // Configuring Stage:
        stage.setResizable(false);
        stage.setTitle("دفترة - برنامج إعدادات الطباعة");
//        stage.getIcons().add(new Image("./../../images/app-icon.svg"));
//        Image appIcon = new Image("../../images/app-icon.svg");
//        stage.getIcons().add(appIcon);

        // Adding and Loading Scenes:
        FXMLLoader loginFXMLLoader = new FXMLLoader(MainApp.class.getResource("login-view.fxml"));
        FXMLLoader appFXMLLoader = new FXMLLoader(MainApp.class.getResource("app-view.fxml"));
        Scene loginScene = new Scene(loginFXMLLoader.load(), 800, 600);
        Scene appScene = new Scene(appFXMLLoader.load(), 800, 600);
//        loginScene.getStylesheets().add("-fx-background-color:"+primaryColor);
        if (authenticated)
        {
            stage.setScene(appScene);
//            System.out.print(authenticated);
        }
        else
        {
//            System.out.print(authenticated);
            stage.setScene(loginScene);
        }
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}