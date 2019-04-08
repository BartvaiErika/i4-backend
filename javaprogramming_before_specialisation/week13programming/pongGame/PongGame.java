package week13programming.pongGame;

import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PongGame extends Application {

    private static final int width = 800;
    private static final int height = 600;
    private static final int PLAYER_HEIGHT = 150;
    private static final int PLAYER_WIDTH = 15;
    private static final double radius = 15;
    private int ballYSpeed = 1;
    private int ballXSpeed = 1;
    private double playerOneYPos = height / 2;
    private double playerTwoYPos = height / 2;
    private double ballXPos = width / 2;
    private double ballYPos = height / 2;
    private int scoreP1 = 0;
    private int scoreP2 = 0;
    private boolean gameStarted;
    private int playerOneXPos = 0;
    private double playerTwoXPos = width - PLAYER_WIDTH;

    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(width, height);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        Timeline timeLimit = new Timeline(new KeyFrame(Duration.millis(10), e -> run(graphicsContext)));

        timeLimit.setCycleCount(Timeline.INDEFINITE);
        canvas.setOnMouseMoved(e ->  playerOneYPos  = e.getY());
        canvas.setOnMouseClicked(e ->  gameStarted = true);
        stage.setScene(new Scene(new StackPane(canvas)));
        stage.show();
        timeLimit.play();
    }

    private void run(GraphicsContext graphicsContext) {
        graphicsContext.setFill(Color.OLIVEDRAB);
        graphicsContext.fillRect(0, 0, width, height);
        graphicsContext.setFill(Color.WHITE);
        graphicsContext.setFont(Font.font(25));
        if(gameStarted) {
            ballXPos+=ballXSpeed;
            ballYPos+=ballYSpeed;
            if(ballXPos < width - width  / 4) {
                playerTwoYPos = ballYPos - PLAYER_HEIGHT / 2;
            }  else {
                playerTwoYPos =
                        ballYPos > playerTwoYPos + PLAYER_HEIGHT / 2 ?playerTwoYPos += 1: playerTwoYPos - 1;
            }
            graphicsContext.fillOval(ballXPos, ballYPos, radius, radius);
        } else {
            graphicsContext.setStroke(Color.YELLOW);
            graphicsContext.setTextAlign(TextAlignment.CENTER);
            graphicsContext.strokeText("Click to Start!", width / 2, height / 2);
            ballXPos = width / 2;
            ballYPos = height / 2;
            ballXSpeed = new Random().nextInt(100)+1 == 0 ? 1: -1;
            ballYSpeed = new Random().nextInt(100)+1 == 0 ? 1: -1;
        }
        if(ballYPos > height || ballYPos < 0) ballYSpeed *=-1;
        if(ballXPos < playerOneXPos - PLAYER_WIDTH) {
            scoreP2++;
            gameStarted = false;
        }
        if(ballXPos > playerTwoXPos + PLAYER_WIDTH) {
            scoreP1++;
            gameStarted = false;
        }
        if( ((ballXPos + radius > playerTwoXPos) && ballYPos >= playerTwoYPos && ballYPos <= playerTwoYPos + PLAYER_HEIGHT) ||
                ((ballXPos < playerOneXPos + PLAYER_WIDTH) && ballYPos >= playerOneYPos && ballYPos <= playerOneYPos + PLAYER_HEIGHT)) {
            if (ballXSpeed<=100) ballYSpeed += 1 * Math.signum(ballYSpeed);
            if (ballYSpeed<=100) ballXSpeed += 1 * Math.signum(ballXSpeed);
            if (ballXSpeed<=100) ballXSpeed *= -1;
            if (ballYSpeed<=100) ballYSpeed *= -1;
        }
        graphicsContext.fillText(scoreP1 + "\t\t\t\t\t\t\t\t" + scoreP2, width / 2, 100);
        graphicsContext.fillRect(playerTwoXPos, playerTwoYPos, PLAYER_WIDTH, PLAYER_HEIGHT);
        graphicsContext.fillRect(playerOneXPos, playerOneYPos, PLAYER_WIDTH, PLAYER_HEIGHT);
    }
}
