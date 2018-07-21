package com.goldenogre.drakesquest;

import com.goldenogre.drakesquest.data.CreateHeroes;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
public class Main extends Application implements EventHandler<ActionEvent> {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("battle.fxml"));
        primaryStage.setTitle("Drake's Quest");

        String music = "battle.mp3";
        Media sound = new Media(new File(music).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();

        primaryStage.setScene(new Scene(root, 720, 480 ));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void handle(ActionEvent event) {

    }
}
