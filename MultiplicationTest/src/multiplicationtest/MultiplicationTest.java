/*
 * Copyright 2017 Lassaad 
 */
package multiplicationtest;

import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author lassaad
 */

public class MultiplicationTest extends Application {
    int max= 10;
    int a = (int) (Math.random() * max);
    int b = (int) (Math.random() * max);
    int score = 0;
    long startTime;
    long endTime;
    long duration = 0;
    String resStatus ="";
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Start new game");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                startTime = System.currentTimeMillis();
                gameCycle(primaryStage);
            }
        });
        
        StackPane root = new StackPane();
        Label startText = new Label("Hi Arsen Welcome to Multiplication 50 facts in minute test ");
                
        Pane rootStartText = new Pane();
        startText.setLayoutX(50);
        startText.setLayoutY(200);
        rootStartText.getChildren().add(startText);
        root.getChildren().add(rootStartText);
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 500, 550);
        
        primaryStage.setTitle("Multiplication 50 facts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void validateAnswer(Label resultStatus, Label inputLeftNumber,Label inputRightNumber, TextField proposedResult,Label scoreValue ,Stage primaryStage){
        int leftPart = Integer.parseInt(inputLeftNumber.getText());
        int rightPart = Integer.parseInt(inputRightNumber.getText());
        int guess = Integer.parseInt(proposedResult.getText());
        score = Integer.parseInt(scoreValue.getText());

        if(guess == (leftPart*rightPart)){
            System.out.println("You are right");
            resStatus = "You are right";
           // resultStatus.setText("You are right");
            score++;
        } else{
            System.out.println("Sorry it's not correct");
            resStatus = "Sorry it's not correct";
            //resultStatus.setText("Sorry it's not correct");
        }
        scoreValue.setText(Integer.toString(score));
        inputLeftNumber.setText(Integer.toString(a));
        inputRightNumber.setText(Integer.toString(b));
         endTime = System.currentTimeMillis();
         duration = endTime - startTime;

         if(duration < 60000){
            gameCycle(primaryStage);
        }else{
            System.out.println("Game Over");
            gameOver(primaryStage);
        }
    }
    
    
    //gameCycle
    private void gameCycle(Stage primaryStage){
        StackPane newRoot = new StackPane();
        TextField result1 = new TextField();
        Label resultStatus = new Label(resStatus);
        Label inputMultiplicationSign = new Label("X");
        a = (int) (Math.random() * max);
        b = (int) (Math.random() * max);
        duration = endTime - startTime;
        Label inputLeftText = new Label(Integer.toString(a));
        Label inputRightText = new Label(Integer.toString(b));

        Label scoreLabel = new Label("Your score:");
        Label scoreValue = new Label(Integer.toString(score));
        Label timeLabel = new Label("Remaining Time:");
        Label timeValue = new Label(Long.toString(60 - (duration/1000)));
        
        Pane resLabel = new Pane();
        resultStatus.setLayoutX(200);
        resultStatus.setLayoutY(100);
        resultStatus.setScaleX(3);
        resultStatus.setScaleY(3);
        resLabel.getChildren().add(resultStatus);
        
        //X
        Pane rootLabel = new Pane();
        inputMultiplicationSign.setLayoutX(200);
        inputMultiplicationSign.setLayoutY(200);
        inputMultiplicationSign.setScaleX(3);
        inputMultiplicationSign.setScaleY(3);
        rootLabel.getChildren().add(inputMultiplicationSign);
        //A
        Pane rootLeftLabel = new Pane();
        inputLeftText.setLayoutX(160);
        inputLeftText.setLayoutY(200);
        inputLeftText.setScaleX(3);
        inputLeftText.setScaleY(3);
        rootLeftLabel.getChildren().add(inputLeftText);
        //B
        Pane rootRightLabel = new Pane();
        inputRightText.setLayoutX(240);
        inputRightText.setLayoutY(200);
        inputRightText.setScaleX(3);
        inputRightText.setScaleY(3);
        rootRightLabel.getChildren().add(inputRightText);

        Pane rootScoreLabel = new Pane();
        scoreLabel.setLayoutX(50);
        scoreLabel.setLayoutY(400);
        rootScoreLabel.getChildren().add(scoreLabel);

        Pane rootScoreValue = new Pane();
        scoreValue.setLayoutX(70);
        scoreValue.setLayoutY(450);
        rootScoreValue.getChildren().add(scoreValue);

        Pane rootTimeLabel = new Pane();
        timeLabel.setLayoutX(350);
        timeLabel.setLayoutY(400);
        rootTimeLabel.getChildren().add(timeLabel);

        Pane rootTimeValue = new Pane();
        timeValue.setLayoutX(370);
        timeValue.setLayoutY(450);
        
        rootTimeValue.getChildren().add(timeValue);
        
        result1.setPrefWidth(50);
        result1.setMinWidth(50);
        result1.setMaxWidth(160);

        Button submitBtn = new Button("Submit");

        Pane rootBtn = new Pane();
        submitBtn.setLayoutX(350);
        submitBtn.setLayoutY(263);
        rootBtn.getChildren().add(submitBtn);
        newRoot.getChildren().addAll(resLabel,rootLeftLabel,rootRightLabel,rootLabel,rootScoreLabel,rootScoreValue,rootTimeLabel ,rootTimeValue);
        newRoot.getChildren().add(result1);
        newRoot.getChildren().add(rootBtn);
        Scene scene = new Scene(newRoot, 500, 550);

        primaryStage.setTitle("Multiplication 50 facts");

        primaryStage.setScene(scene);

        primaryStage.show();
        submitBtn.setOnAction(e -> validateAnswer(resultStatus, inputLeftText,inputRightText,result1,scoreValue, primaryStage));

        if(submitBtn.isPressed()){
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;
            timeValue.setText(Long.toString(duration));
            if(duration < 60000){
                System.out.println(duration);
                gameCycle(primaryStage);
            }else{
                System.out.println("Game Over");
                gameOver(primaryStage);
            }

        }
    
    }

    private void gameOver(Stage primaryStage){
        StackPane newRoot = new StackPane();
                
        Label scoreLabel = new Label("Your final score is:");
        Label scoreValue = new Label(Integer.toString(score));
       
        Pane rootScoreLabel = new Pane();
        scoreLabel.setLayoutX(50);
        scoreLabel.setLayoutY(400);
        rootScoreLabel.getChildren().add(scoreLabel);

        Pane rootScoreValue = new Pane();
        scoreValue.setLayoutX(70);
        scoreValue.setLayoutY(450);
        rootScoreValue.getChildren().add(scoreValue);

        Label startText = new Label("Press this button if you want to play again:");
        Pane rstartText = new Pane();
        startText.setLayoutX(50);
        startText.setLayoutY(200);
        rstartText.getChildren().add(startText);

        Button replayBtn = new Button("rePlay");

        Pane rootBtn = new Pane();
        replayBtn.setLayoutX(350);
        replayBtn.setLayoutY(263);
        rootBtn.getChildren().add(replayBtn);


        newRoot.getChildren().addAll(rootScoreLabel,rootScoreValue ,rstartText);
        newRoot.getChildren().add(rootBtn);


        replayBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                startTime = System.currentTimeMillis();
                score = 0;
                gameCycle(primaryStage);

            }

        });
        Scene scene = new Scene(newRoot, 500, 550);

        primaryStage.setTitle("Multiplication 50 facts");

        primaryStage.setScene(scene);

        primaryStage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
