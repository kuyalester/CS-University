import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * A game variant of the are you smarter than a fifth grader game.
 * The main class of the game.
 * @author Lester Lascano
 */
public class Main extends Application {
	
	Stage window;
	Group screen;
	
	Components components = new Components();
	Questions questions = new Questions();
	Honors honors = new Honors();
	Player player = new Player();
	Music music = new Music();
	
	List <Background> backgrounds = components.getCategoryButtonsBackground();
	List <Button> buttons = components.getCategoryButtons();
	
	ImageView settingsView = new ImageView(components.getSettingsImages().get(3));
	
	int counter = 0;
	int currentItem = 0;
	int playerAttempt = 1;
	
	ImageView background;
	Pane noTimePane;
	
	Button dropout;
	Button profSnoopy;
	Button seeResult;
	Button nextQuestion;
	Button seeScore;
	
	Button collab;
	Button search;
	Button chance;
	Button answer = new Button("A");
	
	boolean collabIsActive = true;
	boolean seekIsActive = true;
	boolean chanceIsActive = true;
	
	Timer timer;
	
	int currentItemScore = 0;
	
	/**
	 * Views a loading screen for the game
	 */
	public void viewLoadingScreen() {	

		music.playMainMenuBG();
		
		List<Image> loadingImages = components.getLoadingImages();
		ImageView viewImage = new ImageView(loadingImages.get(0));
		
		Button button = new Button("");						
		button.setPrefSize(800, 450);
		button.setBackground(null);
		button.setDisable(true);							
		
		button.setOnMouseClicked(e->{
			
			if(counter == 12) {
				music.playLetterAcceptance();
			}else if(counter == 13) {
				music.stopLetterAcceptance();
				music.playThunder();
			}else if(counter == 14) {
				music.stopThunder();
				counter = 0;							
				viewSnoopyIntro();
			}
			
			counter++;
			viewImage.setImage(loadingImages.get(counter));
		});
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			
			int i = 0;
			
			@Override
			public void run() {
			
				if(counter == 11) {
					if(i == 5) {
						counter++;
					}
					viewImage.setImage(loadingImages.get(counter));
					i++;
				}
				
				else if(counter < 11) {
					viewImage.setImage(loadingImages.get(counter));
					counter++;
				}else {
					button.setDisable(false);
					music.playLetterReceived();
					timer.cancel();
				}

			}	
			
		};

		timer.scheduleAtFixedRate(task, 0, 400); // change time back to default 400 milliseconds
		
		screen.getChildren().setAll(viewImage, button);	
	}
	
	/**
	 * Views the snoopy dialogs during intro.
	 */
	public void viewSnoopyIntro() {		
		
		music.playMumble();
		
		List<Image> snoopyDialog = components.getSnoopyDialog();
		
		ImageView skipView = new ImageView(snoopyDialog.get(7));
		ImageView view = new ImageView(snoopyDialog.get(0));

		Button skipButton = new Button("", skipView);		
		skipButton.setPrefSize(138, 50);
		skipButton.setLayoutX(520);
		skipButton.setLayoutY(350);		
		skipButton.setBackground(null);						
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
			
				if(counter < 7) {
					//plays snooopy speaking effects here
					view.setImage(snoopyDialog.get(counter));
					counter++;
				}else {
					counter = 0;
					timer.cancel();
				}
			}	
			
		};

		timer.scheduleAtFixedRate(task, 0, 2000); // change time back to default 2000 milliseconds
		
		skipButton.setOnAction(e-> {
			music.stopMumble();
			music.playEnter();
			timer.cancel();
			counter = 0;
			askPlayerName();
		});
		skipButton.setOnMouseEntered(e-> skipView.setImage(snoopyDialog.get(8)));
		skipButton.setOnMouseExited(e->skipView.setImage(snoopyDialog.get(7)));
		
		screen.getChildren().setAll(view, skipButton);
	}
	
	/**
	 * Asks the player's name then enters the game 
	 */
	public void askPlayerName() {		
		
		List<Image> snoopyDialog = components.getSnoopyDialog();
		
		ImageView view = new ImageView(snoopyDialog.get(9));
		ImageView view2 = new ImageView(snoopyDialog.get(10));
		ImageView enterView = new ImageView(snoopyDialog.get(11));
		
		Button enter = new Button("", enterView);								
		enter.setPrefSize(150, 43);
		enter.setFont(Font.font(30));
		enter.setLayoutX(310);
		enter.setLayoutY(300);
		enter.setBackground(null);
		
		enter.setOnAction(e-> {
			music.stopEnter();
			music.playPlay();
			menu();
		});
		enter.setOnMouseEntered(e-> enterView.setImage(snoopyDialog.get(12)));
		enter.setOnMouseExited(e-> enterView.setImage(snoopyDialog.get(11)));	
		
		Text text = new Text("Please enter your name");							
		text.setFont(Font.font(20));
		text.setFill(Color.BLACK);
		
		TextField textField= new TextField();
		textField.setFont(Font.font(11));
		textField.setAlignment(Pos.CENTER);
		
		textField.setOnKeyPressed(e-> {									
			if(e.getCode().equals(KeyCode.ENTER)) {	
				player.setPlayerName(textField.getText());
				screen.getChildren().setAll(view2, enter);
			}
		});																		
		
		//Layout Code
		VBox vbox = new VBox(20, text, textField);
		vbox.setPadding(new Insets(110, 300, 20, 310));
		vbox.setAlignment(Pos.TOP_CENTER);
				
		screen.getChildren().setAll(view, vbox);
	}

	/**
	 * The menu window of the game
	 */
	public void menu() {							

		List<Image> homescreenImages = components.getHomeScreenImages();
		
		ImageView viewBackgroundImage = new ImageView(homescreenImages.get(0));		
		
		//creating the clickable rectangles in the Menu
		Rectangle playFrame = new Rectangle(365, 360, 70, 25);				
		Rectangle exitFrame = new Rectangle(375, 390, 50, 20);
		Rectangle honorRollFrame = new Rectangle(210, 125, 55, 90);
		Rectangle settingsFrame = new Rectangle(210, 255, 55, 90);
		Rectangle instructionsFrame = new Rectangle(530, 125, 55, 90);
		Rectangle aboutFrame = new Rectangle(530, 255, 55, 90);
	
		//Making the rectangles transparent		
		playFrame.setFill(Color.TRANSPARENT);
		exitFrame.setFill(Color.TRANSPARENT);
		honorRollFrame.setFill(Color.TRANSPARENT);
		settingsFrame.setFill(Color.TRANSPARENT);
		instructionsFrame.setFill(Color.TRANSPARENT);
		aboutFrame.setFill(Color.TRANSPARENT);								
		
		
		//action on the rectangles
		playFrame.setOnMouseEntered(e ->viewBackgroundImage.setImage(homescreenImages.get(5)));
		playFrame.setOnMouseExited(e -> viewBackgroundImage.setImage(homescreenImages.get(0)));
		
		exitFrame.setOnMouseEntered(e ->viewBackgroundImage.setImage(homescreenImages.get(6)));
		exitFrame.setOnMouseExited(e -> viewBackgroundImage.setImage(homescreenImages.get(0)));
		
		honorRollFrame.setOnMouseEntered(e ->viewBackgroundImage.setImage(homescreenImages.get(1)));
		honorRollFrame.setOnMouseExited(e -> viewBackgroundImage.setImage(homescreenImages.get(0)));
		
		settingsFrame.setOnMouseEntered(e ->viewBackgroundImage.setImage(homescreenImages.get(3)));
		settingsFrame.setOnMouseExited(e -> viewBackgroundImage.setImage(homescreenImages.get(0)));
		
		instructionsFrame.setOnMouseEntered(e ->viewBackgroundImage.setImage(homescreenImages.get(2)));
		instructionsFrame.setOnMouseExited(e -> viewBackgroundImage.setImage(homescreenImages.get(0)));
		
		aboutFrame.setOnMouseEntered(e ->viewBackgroundImage.setImage(homescreenImages.get(4)));
		aboutFrame.setOnMouseExited(e -> viewBackgroundImage.setImage(homescreenImages.get(0)));
		
		
		//actions on clicking the rectangles
		playFrame.setOnMouseClicked(e -> {
			music.playClick();
			confirmPlay();
		});
		exitFrame.setOnMouseClicked(e -> {
			music.playClick();
			exit();		
		});
		honorRollFrame.setOnMouseClicked(e -> {
			music.playClick();
			honorRoll();
		});
		settingsFrame.setOnMouseClicked(e -> {
			music.playClick();
			settings();
		});
		instructionsFrame.setOnMouseClicked(e -> {
			music.playClick();
			instructions();
		});
		aboutFrame.setOnMouseClicked(e -> {
			music.playClick();
			about();
		});
		
		screen.getChildren().setAll(viewBackgroundImage, playFrame, exitFrame, honorRollFrame, settingsFrame, instructionsFrame, aboutFrame);
		
	}
	
	/**
	 * Shows the instructions of the game
	 */
	public void instructions() {		
		
		List<Image> instructionImages = new ArrayList<Image>(components.getInstructionsImages());
		
		ImageView backgroundView = new ImageView(instructionImages.get(0));
		
		Button next = new Button("", new ImageView(instructionImages.get(30)));
		Button back = new Button("", new ImageView(instructionImages.get(28)));
		Button ready = new Button("");
		Button backToMenu =  new Button("", new ImageView(instructionImages.get(26)));
		
		next.setLayoutX(700);
		next.setLayoutY(370);
		
		back.setLayoutX(20);
		back.setLayoutY(370);
		
		ready.setLayoutX(300);
		ready.setLayoutY(225);
		ready.setPrefSize(230, 30);
		
		backToMenu.setLayoutX(20);
		backToMenu.setLayoutY(20);
		backToMenu.setPrefSize(70, 50);
		
		next.setBackground(null);
		back.setBackground(null);
		ready.setBackground(null);
		backToMenu.setBackground(null);

		next.setOnMouseEntered(e-> next.setGraphic(new ImageView(instructionImages.get(31))));
		next.setOnMouseExited(e-> next.setGraphic(new ImageView(instructionImages.get(30))));
		
		back.setOnMouseEntered(e-> back.setGraphic(new ImageView(instructionImages.get(29))));
		back.setOnMouseExited(e-> back.setGraphic(new ImageView(instructionImages.get(28))));
		
		ready.setOnMouseEntered(e-> backgroundView.setImage(instructionImages.get(1)));
		ready.setOnMouseExited(e-> backgroundView.setImage(instructionImages.get(0)));
		
		backToMenu.setOnMouseEntered(e-> backToMenu.setGraphic(new ImageView(instructionImages.get(27))));
		backToMenu.setOnMouseExited(e-> backToMenu.setGraphic(new ImageView(instructionImages.get(26))));
		
		Pane pane = new Pane(backgroundView, backToMenu, ready);
		
		next.setOnAction(e->{	
			music.playClick();
			if(counter == 25) {
				counter = 0;
				menu();
			}else {
				counter++;
				backgroundView.setImage(instructionImages.get(counter));
			}
		});
		
		back.setOnAction(e->{
			music.playClick();
			if(counter > 2) {
				counter--;
				backgroundView.setImage(instructionImages.get(counter));
			}
		});
		
		ready.setOnAction(e->{
			music.playClick();
			counter = 2;
			pane.getChildren().setAll(backgroundView, backToMenu, back, next);
			backgroundView.setImage(instructionImages.get(2));
		});
		
		backToMenu.setOnAction(e->{
			music.playClick();
			counter = 0;
			menu();
		});
		
		screen.getChildren().setAll(pane);
		
	}
	
	/**
	 * Shows the Honor Roll of the game
	 */
	public void honorRoll() {			
		
		Image background1 = new Image("file:images/HonorRoll_Normal.png");
		Image background2 = new Image("file:images/HonorRoll_Highlighted.png");
		ImageView backgroundView = new ImageView(background2);
		
		Rectangle backButton = new Rectangle(495, 380, 45, 25);
		backButton.setFill(Color.TRANSPARENT);
		
		backButton.setOnMouseClicked(e->{
			music.playClick();
			menu();
		});
		
		backButton.setOnMouseEntered(e ->backgroundView.setImage(background1));
		backButton.setOnMouseExited(e -> backgroundView.setImage(background2));
		
		//create text for the names and scores 
		Text name1 = new Text(honors.getHonorNames(0));
		Text name2 = new Text(honors.getHonorNames(1));
		Text name3 = new Text(honors.getHonorNames(2));
		Text name4 = new Text(honors.getHonorNames(3));
		Text name5 = new Text(honors.getHonorNames(4));
		Text name6 = new Text(honors.getHonorNames(5));
		Text name7 = new Text(honors.getHonorNames(6));
		Text score1 = new Text(honors.getHonorScores(0));
		Text score2 = new Text(honors.getHonorScores(1));
		Text score3 = new Text(honors.getHonorScores(2));
		Text score4 = new Text(honors.getHonorScores(3));
		Text score5 = new Text(honors.getHonorScores(4));
		Text score6 = new Text(honors.getHonorScores(5));
		Text score7 = new Text(honors.getHonorScores(6));
	
		//set font
		name1.setFont(Font.font("Courier New", 17));
		name2.setFont(Font.font("Courier New", 17));
		name3.setFont(Font.font("Courier New", 17));
		name4.setFont(Font.font("Courier New", 17));
		name5.setFont(Font.font("Courier New", 17));
		name6.setFont(Font.font("Courier New", 17));
		name7.setFont(Font.font("Courier New", 17));
		score1.setFont(Font.font("Courier New", 17));
		score2.setFont(Font.font("Courier New", 17));
		score3.setFont(Font.font("Courier New", 17));
		score4.setFont(Font.font("Courier New", 17));
		score5.setFont(Font.font("Courier New", 17));
		score6.setFont(Font.font("Courier New", 17));
		score7.setFont(Font.font("Courier New", 17));
		
		//set Text Color
		name1.setFill(Color.WHITE);
		name2.setFill(Color.WHITE);
		name3.setFill(Color.WHITE);
		name4.setFill(Color.WHITE);
		name5.setFill(Color.WHITE);
		name6.setFill(Color.WHITE);
		name7.setFill(Color.WHITE);
		score1.setFill(Color.WHITE);
		score2.setFill(Color.WHITE);
		score3.setFill(Color.WHITE);
		score4.setFill(Color.WHITE);
		score5.setFill(Color.WHITE);
		score6.setFill(Color.WHITE);
		score7.setFill(Color.WHITE);
		
		//layout code
		VBox names = new VBox(17, name1, name2, name3, name4, name5, name6, name7);
		names.setPadding(new Insets(0, 40, 0, 0));
		names.setAlignment(Pos.TOP_CENTER);
		
		VBox scores= new VBox(17, score1, score2, score3, score4, score5, score6, score7);
		scores.setPadding(new Insets(0, 0, 0, 35));
		scores.setAlignment(Pos.TOP_CENTER);
		
		HBox honors = new HBox(names, scores);
		honors.setPadding(new Insets(140, 300, 0 ,300));

		screen.getChildren().setAll(backgroundView, honors, backButton);
		
	}
	
	/**
	 * Quits/Exits the game after a confirmation
	 */
	public void exit() {		
		
		ImageView viewBackgroundImage = new ImageView(components.getHomeScreenImages().get(7));		
		
		Button yes = new Button();
		Button no = new Button();
		
		yes.setLayoutX(448);
		yes.setLayoutY(327);
		yes.setPrefSize(100, 30);;
		yes.setBackground(null);
		
		no.setLayoutX(245);
		no.setLayoutY(327);
		no.setPrefSize(100, 30);
		no.setBackground(null);
		
		yes.setOnAction(e -> {
			music.playClick();
			music.stopMainMenuBG();
			window.close();
		});
		yes.setOnMouseEntered(e -> viewBackgroundImage.setImage(components.getHomeScreenImages().get(9)));
		yes.setOnMouseExited(e -> viewBackgroundImage.setImage(components.getHomeScreenImages().get(7)));
		
		no.setOnAction(e -> {
			music.playClick();
			menu();
		});
		no.setOnMouseEntered(e -> viewBackgroundImage.setImage(components.getHomeScreenImages().get(8)));
		no.setOnMouseExited(e -> viewBackgroundImage.setImage(components.getHomeScreenImages().get(7)));
		
		screen.getChildren().setAll(viewBackgroundImage, yes, no);
	}
	
	/**
	 * Asks the player if he reads the instruction before playing
	 */
	public void confirmPlay() {			
		
		List<Image> playImages = components.getPlayImages();
		ImageView view = new ImageView(playImages.get(0));
		
		//snoopy dialog
		Button text = new Button("", new ImageView(playImages.get(1)));
		text.setPrefSize(500, 190);
		text.setBackground(null);
		
		//back button
		Button back = new Button("", new ImageView(playImages.get(2)));
		back.setPrefSize(150, 100);
		back.setBackground(null);
		back.setOnMouseEntered(e-> back.setGraphic(new ImageView(playImages.get(3))));
		back.setOnMouseExited(e-> back.setGraphic(new ImageView(playImages.get(2))));
		back.setOnAction(e-> {
			music.playClick();
			menu();
		});
		
		//proceed button
		Button proceed = new Button("", new ImageView(playImages.get(4)));
		proceed.setPrefSize(150, 100);	
		proceed.setBackground(null);
		proceed.setOnMouseEntered(e-> proceed.setGraphic(new ImageView(playImages.get(5))));
		proceed.setOnMouseExited(e-> proceed.setGraphic(new ImageView(playImages.get(4))));
		proceed.setOnAction(e-> {
			music.playClick();
			music.stopMainMenuBG();
			music.playGameplayBG();
			play();
		});

		//layoutcode
		text.setLayoutX(225);
		text.setLayoutY(50);
		
		back.setLayoutX(340);
		back.setLayoutY(260);
		
		proceed.setLayoutX(525);
		proceed.setLayoutY(260);
		
		Pane pane = new Pane(view, text, back, proceed);

		screen.getChildren().setAll(pane);
	}
	
	/**
	 * The settings window of the game
	 */
	public void settings() {		
		
		List<Image> settingsImages = components.getSettingsImages();
		
		Rectangle sound = new Rectangle(410, 215, 80, 35);				
		Rectangle musics = new Rectangle(410, 265, 80, 35);
		Rectangle back = new Rectangle(560, 355, 45, 25);
		
		sound.setFill(Color.TRANSPARENT);
		musics.setFill(Color.TRANSPARENT);
		back.setFill(Color.TRANSPARENT);

		sound.setOnMouseClicked(e-> {
			music.playClick();
			if(music.getAudio() == true && music.getMusic() == true) {
				settingsView.setImage(settingsImages.get(1));
				music.toggleAudio();
			}else if(music.getAudio() == false && music.getMusic()  == true){
				settingsView.setImage(settingsImages.get(3));
				music.toggleAudio();
			}else if(music.getAudio() == true && music.getMusic()  == false){
				settingsView.setImage(settingsImages.get(0));
				music.toggleAudio();
			}else {
				settingsView.setImage(settingsImages.get(2));
				music.toggleAudio();
			}
		});
		musics.setOnMouseClicked(e-> {
			music.playClick();
			
			if(music.getAudio() == true && music.getMusic()  == true) {
				settingsView.setImage(settingsImages.get(2));
				music.stopMainMenuBG();
				music.toggleMusic();
			}else if(music.getAudio() == false && music.getMusic()  == true){
				settingsView.setImage(settingsImages.get(0));
				music.stopMainMenuBG();
				music.toggleMusic();
			}else if(music.getAudio() == true && music.getMusic()  == false){
				settingsView.setImage(settingsImages.get(3));
				music.toggleMusic();
				music.playMainMenuBG();
			}else {
				settingsView.setImage(settingsImages.get(1));
				music.toggleMusic();
				music.playMainMenuBG();
			}
		});
		
		back.setOnMouseClicked(e-> {
			music.playClick();
			menu();
		});

		screen.getChildren().setAll(settingsView, sound, musics, back);
	}
	
	/**
	 * Shows the about of the game (origin + characters)
	 */
	public void about() {				
		
		List<Image> aboutImages = components.getAboutImages();
		
		ImageView imageView = new ImageView(aboutImages.get(0));
		
		Button next = new Button("", new ImageView(aboutImages.get(9)));
		Button back = new Button("", new ImageView(aboutImages.get(7)));
		
		next.setLayoutX(700);
		next.setLayoutY(370);
		back.setLayoutX(20);
		back.setLayoutY(370);
		
		next.setBackground(null);
		back.setBackground(null);

		next.setOnMouseEntered(e-> next.setGraphic(new ImageView(aboutImages.get(10))));
		next.setOnMouseExited(e-> next.setGraphic(new ImageView(aboutImages.get(9))));
		back.setOnMouseEntered(e-> back.setGraphic(new ImageView(aboutImages.get(8))));
		back.setOnMouseExited(e-> back.setGraphic(new ImageView(aboutImages.get(7))));
		
		next.setOnAction(e->{	
			music.playClick();
			if(counter == 6) {
				menu();
				counter = 0;
			}else {
				counter++;
				imageView.setImage(aboutImages.get(counter));
			}
		});
		
		back.setOnAction(e->{
			music.playClick();
			if(counter == 0) {
				menu();
				counter = 0;
			}else {
				counter--;
				imageView.setImage(aboutImages.get(counter));
			}	
		});
				
		Pane pane = new Pane(imageView, next, back);
		
		screen.getChildren().setAll(pane);
	}

	/**
	 * Initializes the important components for the game and enters the game.
	 */
	public void play() {
		
		List<Image> mainGameImages = components.getMainGameImages();
		
		background = new ImageView(mainGameImages.get(4));
		
		//--------------------------------------------------------------------DROP OUT WINDOW-------------------------------------------------
		Button yes = new Button("", new ImageView(new Image("file:images/MainGame/Yes.png")));
		Button no = new Button("", new ImageView(new Image("file:images/MainGame/No.png")));
		
		yes.setLayoutX(515);
		yes.setLayoutY(275);
		yes.setBackground(null);
		
		no.setLayoutX(355);
		no.setLayoutY(275);
		no.setBackground(null);
		
		Pane dropPane = new Pane(yes, no);
		dropPane.setPrefSize(800, 450);
		dropPane.setBackground(new Background(new BackgroundImage(mainGameImages.get(0), BackgroundRepeat.NO_REPEAT, 
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
		
		yes.setOnAction(e->{
			music.playClick();
			music.playFail();
			music.stopGameplayBG();
			result(4);
		});
		no.setOnAction(e->{
			music.playClick();
			screen.getChildren().remove(dropPane);
		});

		//-------------------------------------------------------------------DROP OUT Button---------------------------------------------------------
		dropout = new Button("", new ImageView(mainGameImages.get(1)));
		dropout.setPrefSize(70, 75);
		dropout.setLayoutX(10);
		dropout.setLayoutY(10);
		dropout.setBackground(null);
		
		dropout.setOnMouseEntered(e ->dropout.setGraphic(new ImageView(mainGameImages.get(2))));
		dropout.setOnMouseExited(e -> dropout.setGraphic(new ImageView(mainGameImages.get(1))));
		dropout.setOnAction(e-> {
			music.playClick();
			screen.getChildren().add(dropPane);
		});
		
		
		//-----------------------------------------------------------------------Snoopy Button-------------------------------------------------------
		profSnoopy = new Button("", new ImageView(mainGameImages.get(3)));
		profSnoopy.setPrefSize(170, 222);
		profSnoopy.setLayoutY(205);
		profSnoopy.setBackground(null);
		
		//-----------------------------------------------------------------------nextQuestion Pop up Dialog------------------------------------------
		nextQuestion = new Button("", new ImageView(new Image("file:images/MainGame/NextQuestion_Hover.png")));
		nextQuestion.setLayoutX(70);
		nextQuestion.setLayoutY(370);
		nextQuestion.setBackground(null);
		
		nextQuestion.setOnMouseEntered(e -> nextQuestion.setGraphic(new ImageView("file:images/MainGame/NextQuestion_Hover.png")));
		nextQuestion.setOnMouseExited(e -> nextQuestion.setGraphic(new ImageView("file:images/MainGame/NextQuestion_Normal.png")));
		
		nextQuestion.setOnAction(e->{
			music.playClick();
			screen.getChildren().setAll(background, dropout, chooseCategory(), profSnoopy);
		});
		
		//-----------------------------------------------------------------------seeResult Pop up ---------------------------------------
		
		seeResult = new Button("see Result");
		seeResult.setLayoutX(60);
		seeResult.setLayoutY(370);	
		
		seeResult.setOnAction(e->{
			music.playClick();
			if(player.getPlayerScore() >= 2800) {
				music.playSuccess();
				music.stopGameplayBG();
				result(1);
			}else {
				music.playFail();
				music.stopGameplayBG();
				result(2);
			}
		});
		
		seeScore = new Button("", new ImageView(new Image("file:images/MainGame/Result_Normal.png")));
		seeScore.setLayoutX(70);
		seeScore.setLayoutY(370);
		seeScore.setBackground(null);
		
		seeScore.setOnMouseEntered(e -> seeScore.setGraphic(new ImageView("file:images/MainGame/Result_Hover.png")));
		seeScore.setOnMouseExited(e -> seeScore.setGraphic(new ImageView("file:images/MainGame/Result_Normal.png")));
		
		seeScore.setOnAction(e->{
			music.playClick();
			music.playFail();
			music.stopGameplayBG();
			result(3);
		});
		
		//-----------------------------------------------------------------------noTime Pop up ---------------------------------------
		ImageView noTimeView = new ImageView(new Image("file:images/timer/noTime.png"));
		
		Label noTime = new Label("", noTimeView);
		noTime.setPrefSize(542, 333);
		noTime.setLayoutX(145);
		noTime.setLayoutY(55);
		
		noTimePane = new Pane(noTime, seeScore);
		noTimePane.setVisible(false);
		
		screen.getChildren().setAll(background, dropout, chooseCategory(), profSnoopy);	
	}
	
	/**
	 * The choose category HBox where the player chooses what questions to answer.
	 * @return chooseCategory HBox
	 */
	public HBox chooseCategory() {		
		
		//set actions on theoretical questions buttons
		buttons.get(0).setOnAction(e->{
			music.playClick();
			buttons.get(0).setDisable(true);
			buttons.get(0).setText("");
			buttons.get(0).setBackground(backgrounds.get(0));
			screen.getChildren().setAll(background, theoreticalQuestion(1), profSnoopy, dropout, savingGrace(), timer(1), noTimePane);
		});
		buttons.get(1).setOnAction(e->{
			music.playClick();
			buttons.get(1).setDisable(true);
			buttons.get(1).setText("");
			buttons.get(1).setBackground(backgrounds.get(0));
			screen.getChildren().setAll(background, theoreticalQuestion(2), profSnoopy, dropout, savingGrace(), timer(1), noTimePane);
		});
		buttons.get(2).setOnAction(e->{
			music.playClick();
			buttons.get(2).setDisable(true);
			buttons.get(2).setText("");
			buttons.get(2).setBackground(backgrounds.get(0));
			screen.getChildren().setAll(background, theoreticalQuestion(3), profSnoopy, dropout, savingGrace(), timer(1), noTimePane);
		});
		buttons.get(3).setOnAction(e->{
			music.playClick();
			buttons.get(3).setDisable(true);
			buttons.get(3).setText("");
			buttons.get(3).setBackground(backgrounds.get(0));
			screen.getChildren().setAll(background, theoreticalQuestion(4), profSnoopy, dropout, savingGrace(), timer(1), noTimePane);
		});
		buttons.get(4).setOnAction(e->{
			music.playClick();
			buttons.get(4).setDisable(true);
			buttons.get(4).setText("");
			buttons.get(4).setBackground(backgrounds.get(0));
			screen.getChildren().setAll(background, theoreticalQuestion(5), profSnoopy, dropout, savingGrace(), timer(1), noTimePane);
		});
		buttons.get(5).setOnAction(e->{
			music.playClick();
			buttons.get(5).setDisable(true);
			buttons.get(5).setText("");
			buttons.get(5).setBackground(backgrounds.get(0));
			screen.getChildren().setAll(background, theoreticalQuestion(6), profSnoopy, dropout, savingGrace(), timer(1), noTimePane);
		});
		buttons.get(6).setOnAction(e->{
			music.playClick();
			buttons.get(6).setDisable(true);
			buttons.get(6).setText("");
			buttons.get(6).setBackground(backgrounds.get(0));
			screen.getChildren().setAll(background, theoreticalQuestion(7), profSnoopy, dropout, savingGrace(), timer(1), noTimePane);
		});
		buttons.get(7).setOnAction(e->{
			music.playClick();
			buttons.get(7).setDisable(true);
			buttons.get(7).setText("");
			buttons.get(7).setBackground(backgrounds.get(0));
			screen.getChildren().setAll(background, theoreticalQuestion(8), profSnoopy, dropout, savingGrace(), timer(1), noTimePane);
		});
		
		int categoryType = (int)Math.floor(Math.random() * 3 + 1);		
		
		//set actions on analytical questions buttons
		buttons.get(8).setOnAction(e->{
			music.playClick();
			buttons.get(8).setDisable(true);
			buttons.get(8).setText("");
			buttons.get(8).setBackground(backgrounds.get(0));
			screen.getChildren().setAll(background, analyticalQuestion(categoryType, 1), profSnoopy, dropout, savingGrace(), timer(2), noTimePane);
		});
		buttons.get(9).setOnAction(e->{
			music.playClick();
			buttons.get(9).setDisable(true);
			buttons.get(9).setText("");
			buttons.get(9).setBackground(backgrounds.get(0));
			screen.getChildren().setAll(background, analyticalQuestion(categoryType, 2), profSnoopy, dropout, savingGrace(), timer(2), noTimePane);
		});
		buttons.get(10).setOnAction(e->{
			music.playClick();
			buttons.get(10).setDisable(true);
			buttons.get(10).setText("");
			buttons.get(10).setBackground(backgrounds.get(0));
			screen.getChildren().setAll(background, analyticalQuestion(categoryType, 3), profSnoopy, dropout, savingGrace(), timer(2), noTimePane);
		});
		buttons.get(11).setOnAction(e->{
			music.playClick();
			buttons.get(11).setDisable(true);
			buttons.get(11).setText("");
			buttons.get(11).setBackground(backgrounds.get(0));
			screen.getChildren().setAll(background, analyticalQuestion(categoryType, 4), profSnoopy, dropout, savingGrace(), timer(2), noTimePane);
		});
		buttons.get(12).setOnAction(e->{
			music.playClick();
			buttons.get(12).setDisable(true);
			buttons.get(12).setText("");
			buttons.get(12).setBackground(backgrounds.get(0));;
			screen.getChildren().setAll(background, analyticalQuestion(categoryType, 5), profSnoopy, dropout, savingGrace(), timer(2), noTimePane);
		});
		buttons.get(13).setOnAction(e->{
			music.playClick();
			buttons.get(13).setDisable(true);
			buttons.get(13).setText("");
			buttons.get(13).setBackground(backgrounds.get(0));
			screen.getChildren().setAll(background, analyticalQuestion(categoryType, 6), profSnoopy, dropout, savingGrace(), timer(2), noTimePane);
		});
		buttons.get(14).setOnAction(e->{
			music.playClick();
			buttons.get(14).setDisable(true);
			buttons.get(14).setText("");
			buttons.get(14).setBackground(backgrounds.get(0));
			screen.getChildren().setAll(background, analyticalQuestion(categoryType, 7), profSnoopy, dropout, savingGrace(), timer(2), noTimePane);
		});
		buttons.get(15).setOnAction(e->{
			music.playClick();
			buttons.get(15).setDisable(true);
			buttons.get(15).setText("");
			buttons.get(15).setBackground(backgrounds.get(0));
			screen.getChildren().setAll(background, analyticalQuestion(categoryType, 8), profSnoopy, dropout, savingGrace(), timer(2), noTimePane);
		});	
		
		//Layout Code
		VBox theoriticalQuestion = new VBox(3, buttons.get(0), buttons.get(1)
				, buttons.get(2), buttons.get(3), buttons.get(4)
				, buttons.get(5), buttons.get(6), buttons.get(7));
		
		theoriticalQuestion.setPadding(new Insets(55, 29, 0, 55));
		theoriticalQuestion.setAlignment(Pos.TOP_CENTER);
		
		VBox analyticalQuestion = new VBox(3, buttons.get(8), buttons.get(9)
				, buttons.get(10), buttons.get(11), buttons.get(12)
				, buttons.get(13), buttons.get(14), buttons.get(15));
		
		analyticalQuestion.setPadding(new Insets(55, 0, 0, 29));
		analyticalQuestion.setAlignment(Pos.TOP_CENTER);
		
		HBox categories = new HBox(theoriticalQuestion, analyticalQuestion);
		categories.setPrefSize(555, 336);
		categories.setLayoutX(138);
		categories.setLayoutY(55);
		categories.setBackground(backgrounds.get(1));
		
		return categories;
		
	}
	
	/**
	 * The theoretical questionnaire.
	 * @param num The type of theoretical question the player chose.
	 * @return theoreticalQuestion pane
	 */
	public Pane theoreticalQuestion(int num) {	
		
		Label questionBackground = new Label("");				//question background
		questionBackground.setBackground(backgrounds.get(2));
		questionBackground.setPrefSize(532, 190);;
		
		Label question = new Label("");							//question
		question.setGraphic(questions.getQuestion(1, 0, num)); 
		
		StackPane questionStack = new StackPane();			
		questionStack.setPrefSize(470, 150);
		questionStack.getChildren().addAll(question);
		
		ScrollPane scrollPane = new ScrollPane();				//question container
		scrollPane.setContent(questionStack);
		scrollPane.setStyle("-fx-background: #303840 ; -fx-border-color: #303840; -fx-opacity: 1"); //303840
		scrollPane.setPrefSize(490, 155);
		scrollPane.setLayoutX(170);
		scrollPane.setLayoutY(76);
		
		List<Button> choices = new ArrayList<Button>();			//choices list
		List<HBox> choicesBox = new ArrayList<HBox>();			//choice HBox container 

		GridPane choiceGrid = new GridPane();					//choices container
		choiceGrid.setPadding(new Insets(0, 0, 0, 20));
		choiceGrid.setHgap(7);
		
		//loop for creating the buttons for the choices then storing it on the Grid
		for(int i = 0, j = 0, k = 0; i < 4; i++) {
			Button choice = new Button();
			//choice.setPrefSize(195, 65);
			choice.setPrefWidth(195);
			choice.setBackground(null);
			choices.add(choice);
			
			Label trash = new Label("");
			trash.setPrefSize(50, 65);
			trash.setBackground(null);
			
			HBox choiceBox = new HBox(trash, choice);	
			choiceBox.setBackground(backgrounds.get(i + 28));
			choiceBox.setAlignment(Pos.CENTER);
			choicesBox.add(choiceBox);
			
			choice.setOnAction(e->{
				
				if(choice.equals(choices.get(questions.getAnswer()))) {
					
					music.playCorrect();
					
					player.addPlayerScore(currentItemScore);
					choiceBox.setBackground(backgrounds.get(19));	
					
					if(currentItem == 16) {
						screen.getChildren().add(seeResult);
						seeResult.setDisable(false);
						timer.cancel();
					}else {
						screen.getChildren().add(nextQuestion);
						nextQuestion.setDisable(false);
						timer.cancel();
					}
					
					for(Button b : choices) {
						b.setDisable(true);
					}
					
				}else {
					
					music.playWrong();
					
					choiceBox.setBackground(backgrounds.get(20));				//see components class for index
					
					
					if(playerAttempt == 2) {
						playerAttempt--;
					}else {
						screen.getChildren().add(seeScore);
						seeScore.setDisable(false);

						/*
						for(HBox b : choicesBox) {
							if(b.getChildren().contains(choices.get(questions.getAnswer()))) {
								b.setBackground(questions.getTheoreticalChoicesReveal(questions.getAnswer()));	
								b.getChildren().set(0, new Text(""));
								break;
							}
						}
						*/
						timer.cancel();
						
						for(Button b : choices) {
							b.setDisable(true);
						}
					}
					
				}
			});
			
			if(i == 1){
				j = 0;
				k = 1;
			}else if(i == 2){
				j = 1;
				k = 0;
			}else if(i == 3){
				j = 1;
				k = 1;
			}
			choiceGrid.add(choiceBox, j, k);
		}
		
		Collections.shuffle(choices);
		
		
		for(int i = 0; i < 4; i++){
			choices.get(i).setBackground(questions.getTheoreticalChoices(i));
		}
		
		
		int i = 0;
		
		for(HBox b : choicesBox) {
			if(b.getChildren().contains(choices.get(questions.getAnswer()))) {
				if(i == 0) {
					answer.setText("A");
					break;
				}else if(i == 1) {
					answer.setText("B");
					break;
				}else if(i == 2) {
					answer.setText("C");
					break;
				}else {
					answer.setText("D");
					break;
				}
			}
			i++;
		}
		
		currentItem++;
		
		VBox test = new VBox(5, questionBackground, choiceGrid);
		test.setLayoutX(150);
		test.setLayoutY(60);
		
		Pane pane = new Pane(test,scrollPane);
		
		return pane;
	}
	
	/**
	 * The analytical questionnaire.
	 * @param questionCategory The random categoryType of analytical question.
	 * @param questionNumber The type of analytical question the player chose.
	 * @return analyticalQuestion pane
	 */
	public Pane analyticalQuestion(int questionCategory, int questionNumber) {	
		
		Label questionBackground = new Label("");	//question background
		Label question = new Label("");				//question 	
		ScrollPane scrollPane = new ScrollPane();	//question container
		
		StackPane questionStack = new StackPane();
		questionStack.getChildren().addAll(question);
		
		scrollPane.setContent(questionStack);
		scrollPane.setStyle("-fx-background: #262626 ; -fx-border-color: #262626; -fx-opacity: 1"); //#262626	
		
		Label output = new Label("");					//output 	
		ScrollPane outputScrollPane = new ScrollPane();	//output container
		
		List<ScrollPane> choices = new ArrayList<>();			//choices list
		List<Label> choicesLabel = new ArrayList<>();			//choicesLabel list
		VBox choicesBox = new VBox(19);							//choices VBox container
		VBox choicesBackgroundBox = new VBox(7);				//choices backgrounds VBox container
		
		if(questionCategory == 1) {
			
			questionBackground.setBackground(backgrounds.get(3));
			questionBackground.setPrefSize(300, 325);
			
			question.setGraphic(questions.getQuestion(2, 1, questionNumber));			//image size should be 260 X 237		
				
			scrollPane.setPrefSize(266, 243);
			scrollPane.setLayoutX(167);
			scrollPane.setLayoutY(130);
			
			choicesBox.setLayoutX(477);
			choicesBox.setLayoutY(73);
			
			choicesBackgroundBox.setPadding(new Insets(5, 0, 0, 0));
			
		}else if(questionCategory == 2) {
			
			questionBackground.setBackground(backgrounds.get(4));
			questionBackground.setPrefSize(190, 325);
			
			question.setGraphic(questions.getQuestion(2, 2, questionNumber));			//image size should be 156 X 236
				
			scrollPane.setPrefSize(160, 243);
			scrollPane.setLayoutX(165);
			scrollPane.setLayoutY(130);
			
			choicesBox.setLayoutX(367);
			choicesBox.setLayoutY(73);
			
			choicesBackgroundBox.setPadding(new Insets(5, 0, 0, 0));
			
		}else {																		
			
			StackPane ouputStack = new StackPane();
			//ouputStack.setPrefSize(203, 53);
			ouputStack.getChildren().addAll(output);

			outputScrollPane.setContent(ouputStack);
			outputScrollPane.setStyle("-fx-background: #262626 ; -fx-border-color: #262626; -fx-opacity: 1"); //#262626	
			outputScrollPane.setPrefSize(220, 53);
			outputScrollPane.setLayoutX(167);
			outputScrollPane.setLayoutY(318);
			
			questionBackground.setBackground(backgrounds.get(5));
			questionBackground.setPrefSize(250, 325);
			
			question.setGraphic(questions.getQuestion(2, 3, questionNumber));			//image size should be 214 X 149		29% (if 2 sides not optimal)
			output.setGraphic(questions.getAnalyticalOutput());							//image size should be 203 X 49
				
			scrollPane.setPrefSize(220, 153);
			scrollPane.setLayoutX(167);
			scrollPane.setLayoutY(128);
			
			choicesBox.setLayoutX(430);
			choicesBox.setLayoutY(73);
			
			choicesBackgroundBox.setPadding(new Insets(5, 0, 0, 0));
		}
	
		//loop for creating the choices
		for(int i = 0; i < 4; i++) {
			
			Label choiceBackground = new Label();				//choice background
			Label choice = new Label("");						//choice
			ScrollPane scrollPaneChoice = new ScrollPane();		//choice container
			
			scrollPaneChoice.setContent(choice);
			scrollPaneChoice.setStyle("-fx-background: #262626 ; -fx-border-color: #262626; -fx-opacity: 1"); //#262626		
			
			if(questionCategory == 1) {
				choiceBackground.setPrefSize(200, 75);
				choiceBackground.setBackground(backgrounds.get(i+7));		//see component class for index
				
				//choice.setPrefSize(175, 63);
				//choice.setGraphic(questions.getAnalyticalChoices(i)); 		//image size should be 156 X 59
				choicesLabel.add(choice);
				
				scrollPaneChoice.setPrefSize(160, 63);	
				
			}else if(questionCategory == 2) {
				choiceBackground.setPrefSize(310, 75);
				choiceBackground.setBackground(backgrounds.get(i+11));		//see component class for index
					
				//choice.setPrefSize(175, 63);
				//choice.setGraphic(questions.getAnalyticalChoices(i)); 		//image size should be 243 X 59
				choicesLabel.add(choice);
				
				scrollPaneChoice.setPrefSize(255, 63);
				
			}else {
				choiceBackground.setPrefSize(250, 75);
				choiceBackground.setBackground(backgrounds.get(i+15));		//see component class for index
				
				//choice.setPrefSize(175, 63);
				//choice.setGraphic(questions.getAnalyticalChoices(i)); 		//image size should be 187 X 59
				choicesLabel.add(choice);
				
				scrollPaneChoice.setPrefSize(200, 63);
			}
									
			choices.add(scrollPaneChoice);
			choicesBox.getChildren().addAll(scrollPaneChoice);

			//Action
			scrollPaneChoice.setOnMouseClicked(e->{
		
				if(choice.equals(choicesLabel.get(questions.getAnswer()))) {
					
					music.playCorrect();
					
					player.addPlayerScore(currentItemScore);
					
					//System.out.println("Correct answer");
					
					if(questionCategory == 1) {
						choiceBackground.setBackground(backgrounds.get(21));	
					}else if(questionCategory == 2) {
						choiceBackground.setBackground(backgrounds.get(23));
					}else {
						choiceBackground.setBackground(backgrounds.get(25));
					}	

					if(currentItem == 16) {
						screen.getChildren().add(seeResult);
						seeResult.setDisable(false);
					}else {
						screen.getChildren().add(nextQuestion);
						nextQuestion.setDisable(false);
						timer.cancel();
					}
					
					for(ScrollPane pane : choices) {
						pane.setDisable(true);
					}
				
				}else {
					
					music.playWrong();
					
					//System.out.println("Wrong answer");
					
					if(questionCategory == 1) {
						choiceBackground.setBackground(backgrounds.get(22));	
					}else if(questionCategory == 2) {
						choiceBackground.setBackground(backgrounds.get(24));
					}else {
						choiceBackground.setBackground(backgrounds.get(26));
					}		
					
					for(ScrollPane pane : choices) {
						pane.setDisable(true);
					}
					
					screen.getChildren().add(seeScore);
					seeScore.setDisable(false);
					timer.cancel();
				}
			});
		
		choicesBackgroundBox.getChildren().add(choiceBackground);	
			
		}

		Collections.shuffle(choicesLabel);
		
		for(int i = 0; i < 4; i++){
			choicesLabel.get(i).setGraphic(questions.getAnalyticalChoices(i));
		}
		
		int i = 0;
		
		for(ScrollPane b : choices) {
			if(b.getContent().equals(choicesLabel.get(questions.getAnswer()))) {
				if(i == 0) {
					answer.setText("A");
					break;
				}else if(i == 1) {
					answer.setText("B");
					break;
				}else if(i == 2) {
					answer.setText("C");
					break;
				}else {
					answer.setText("D");
					break;
				}
			}
			i++;
		}
		
		/*
		List<Button> buttons = new ArrayList<>();
		Button b1 = new Button();
		Button b2 = new Button();
		Button b3 = new Button();
		Button b4 = new Button();
		buttons.add(b1);
		buttons.add(b2);
		buttons.add(b3);
		buttons.add(b4);
		Collections.shuffle(buttons);
		b1.setText("Button 1");
		b2.setText("Button 2");
		b3.setText("Button 3");
		b4.setText("Button 4");

		HBox box = new HBox(buttons.get(0), buttons.get(1), buttons.get(2), buttons.get(3));
		box.setLayoutX(400);
		box.setLayoutY(400);
		*/
		
		//layout
		HBox test = new HBox(20, questionBackground, choicesBackgroundBox);	
		test.setLayoutX(150);
		test.setLayoutY(60);
		
		currentItem++;
		
		Pane pane = new Pane(test, scrollPane, choicesBox);
		if(questionCategory == 3) {
			pane.getChildren().addAll(outputScrollPane);
		}
		
		return pane;
		
	}

	/**
	 * Initialized the lifelines of the game.
	 * @return savingGraceBox VBox
	 */
	public VBox savingGrace() {			
		
		//-------------------------------------------------------Collab Button-------------------------------------------------------------------
		ImageView collabView = new ImageView(components.getSavingGraceImages().get(0));
		Background collabBackground = new Background(new BackgroundImage(components.getSavingGraceImages().get(15), 
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Pane collabBox = new Pane();
		collabBox.setPrefSize(542, 333);
		collabBox.setLayoutX(145);
		collabBox.setLayoutY(55);
		collabBox.setBackground(collabBackground);
		
		Rectangle joeCool = new Rectangle(185, 100, 105, 180);
		Rectangle nancyPink = new Rectangle(304, 100, 105, 180);
		Rectangle codyViraj = new Rectangle(423, 100, 105, 180);	
		Rectangle silentKim = new Rectangle(541, 100, 110, 180);
		Rectangle okay = new Rectangle(620, 90, 33, 33);
		
		joeCool.setFill(Color.TRANSPARENT);
		nancyPink.setFill(Color.TRANSPARENT);
		codyViraj.setFill(Color.TRANSPARENT);
		silentKim.setFill(Color.TRANSPARENT);
		okay.setFill(Color.TRANSPARENT);
		
		answer.setLayoutX(430);
		answer.setLayoutY(162);
		answer.setFont(Font.font(20));
		answer.setBackground(null);
		
		joeCool.setOnMouseClicked(e->{
			music.playClassmateSelected();
			screen.getChildren().removeAll(joeCool, nancyPink, codyViraj, silentKim);
			collabBox.setBackground(new Background(new BackgroundImage(components.getSavingGraceImages().get(16), 
					BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));			
			answer.setVisible(true);
			screen.getChildren().addAll(answer, okay);	
		});
		nancyPink.setOnMouseClicked(e->{
			music.playClassmateSelected();
			screen.getChildren().removeAll(joeCool, nancyPink, codyViraj, silentKim);
			collabBox.setBackground(new Background(new BackgroundImage(components.getSavingGraceImages().get(17), 
					BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			answer.setVisible(true);
			screen.getChildren().addAll(answer, okay);	
		});
		codyViraj.setOnMouseClicked(e->{
			music.playClassmateSelected();
			screen.getChildren().removeAll(joeCool, nancyPink, codyViraj, silentKim);
			collabBox.setBackground(new Background(new BackgroundImage(components.getSavingGraceImages().get(18), 
					BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			answer.setVisible(true);
			screen.getChildren().addAll(answer, okay);	
		});
		silentKim.setOnMouseClicked(e->{
			music.playClassmateSelected();
			screen.getChildren().removeAll(joeCool, nancyPink, codyViraj, silentKim);
			collabBox.setBackground(new Background(new BackgroundImage(components.getSavingGraceImages().get(19), 
					BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			answer.setVisible(true);
			screen.getChildren().addAll(answer, okay);	
		});
		okay.setOnMouseClicked(e->{
			music.stopClassmateSelected();
			music.playClick();
			screen.getChildren().removeAll(collabView, collabBox, okay, answer);
		});

		
		collab = new Button("", collabView);
		collab.setPrefSize(130, 50);
		collab.setAlignment(Pos.CENTER_RIGHT);
		collab.setStyle("-fx-background-color: transparent");
		
		if(collabIsActive == false) {
			collab.setDisable(true);
			collabView.setImage(components.getSavingGraceImages().get(1));
		}
		
		collab.setOnMouseEntered(e ->{
			if(collabIsActive == true) {
				collabView.setImage(components.getSavingGraceImages().get(2));
			}else {
				collabView.setImage(components.getSavingGraceImages().get(1));
			}
		});
		collab.setOnMouseExited(e -> {
			if(collabIsActive == true) {
				collabView.setImage(components.getSavingGraceImages().get(0));
			}else {
				collabView.setImage(components.getSavingGraceImages().get(1));
			}
		});
		collab.setOnAction(e->{
			music.playGraceBubble();
			screen.getChildren().addAll(collabBox, joeCool, nancyPink, codyViraj, silentKim);
			collabIsActive = false;
			collab.setDisable(true);
		});	
		
		//-----------------------------------------------------------------Search Button-------------------------------------------------------------------
		ImageView searchView = new ImageView(components.getSavingGraceImages().get(3));
		Background searchBackground = new Background(new BackgroundImage(components.getSavingGraceImages().get(11), 
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Button trash = new Button();
		trash.setFont(Font.font(20));
		
		Pane searchBox = new Pane();
		searchBox.setPrefSize(542, 333);
		searchBox.setLayoutX(145);
		searchBox.setLayoutY(55);
		searchBox.setBackground(searchBackground);
		
		Button searchClose= new Button();
		searchClose.setPrefSize(31, 33);
		searchClose.setLayoutX(605);
		searchClose.setLayoutY(95);
		searchClose.setBackground(null);
		
		Pane searchPane = new Pane(searchBox, searchClose);
		
		searchClose.setOnAction(e->{
			music.playClick();
			music.stopLoadingSearch();
			screen.getChildren().removeAll(searchPane);
		});
		
		search = new Button("", searchView);
		search.setPrefSize(130, 50);
		search.setAlignment(Pos.CENTER_RIGHT);
		search.setStyle("-fx-background-color: transparent");
		
		if(seekIsActive == false) {
			search.setDisable(true);
			searchView.setImage(components.getSavingGraceImages().get(4));
		}
				
		search.setOnMouseEntered(e ->{
			if(seekIsActive == true) {
				searchView.setImage(components.getSavingGraceImages().get(5));
			}else {
				searchView.setImage(components.getSavingGraceImages().get(4));
			}
		});
		search.setOnMouseExited(e -> {
			if(seekIsActive == true) {
				searchView.setImage(components.getSavingGraceImages().get(3));
			}else {
				searchView.setImage(components.getSavingGraceImages().get(4));
			}
		});
		
		search.setOnAction(e->{
			music.playGraceBubble();
			music.playLoadingSearch();
			Timer timer = new Timer();
			TimerTask task = new TimerTask() {
				
				int i = 0;
				int j = 11;
				
				@Override
				public void run() {
					
					if(i < 20) {
						searchBox.setBackground(new Background(new BackgroundImage(components.getSavingGraceImages().get(j), BackgroundRepeat.NO_REPEAT,
								BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
						i++;
						j++;
						if(j == 15) {
							j = 11;
						}
					}else {
						searchBox.setBackground(new Background(new BackgroundImage(components.getSavingGraceImages().get(10), BackgroundRepeat.NO_REPEAT,
								BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
						answer.setVisible(true);
						trash.setVisible(true);
						timer.cancel();
					}

				}	
				
			};

			timer.scheduleAtFixedRate(task, 0, 100); // need to change time	
			
			double random = Math.random();
			
			answer.setLayoutX(388);
			answer.setLayoutY(234);
			answer.setFont(Font.font(20));
			answer.setBackground(null);
			
			if(random * 5 < 4) {
				answer.setVisible(false);
				searchPane.getChildren().add(answer);
				screen.getChildren().addAll(searchPane);
			}else {
				if(random < .85) {
					trash.setText("A");
				}else if(random < .90) {
					trash.setText("B");
				}else if(random < .95) {
					trash.setText("C");
				}else{
					trash.setText("D");
				}
				trash.setLayoutX(388);
				trash.setLayoutY(234);
				trash.setBackground(null);
				trash.setVisible(false);
				searchPane.getChildren().add(trash);
				screen.getChildren().addAll(searchPane);
			}
			
			seekIsActive = false;
			search.setDisable(true);
		});
		
	
		//----------------------------------------------------------------Chance Button-------------------------------------------------------------------
		
		ImageView chanceView = new ImageView(components.getSavingGraceImages().get(6));
		
		Pane chanceBox = new Pane();
		chanceBox.setPrefSize(542, 333);
		chanceBox.setLayoutX(145);
		chanceBox.setLayoutY(55);
		chanceBox.setBackground(backgrounds.get(27));
		
		Button chanceClose= new Button("", new ImageView(components.getSavingGraceImages().get(20)));
		chanceClose.setPrefSize(31, 33);
		chanceClose.setLayoutX(613);
		chanceClose.setLayoutY(83);
		chanceClose.setBackground(null);
		
		chanceClose.setOnAction(e->{
			music.playClick();
			music.stopExtraChance();
			screen.getChildren().removeAll(chanceBox, chanceClose);
		});

		chance = new Button("", chanceView);
		chance.setPrefSize(130, 50);
		chance.setAlignment(Pos.CENTER_RIGHT);
		chance.setStyle("-fx-background-color: transparent");
		
		if(chanceIsActive == false) {
			chance.setDisable(true);
			chanceView.setImage(components.getSavingGraceImages().get(7));
		}
		
		chance.setOnMouseEntered(e -> {
			if(chanceIsActive == true) {
				chanceView.setImage(components.getSavingGraceImages().get(8));
			}else {
				chanceView.setImage(components.getSavingGraceImages().get(7));
			}
		});
		chance.setOnMouseExited(e -> {
			if(chanceIsActive == true) {
				chanceView.setImage(components.getSavingGraceImages().get(6));
			}else {
				chanceView.setImage(components.getSavingGraceImages().get(7));
			}
		});		
		chance.setOnAction(e->{
			music.playGraceBubble();
			music.playExtraChance();
			chanceIsActive = false;
			chance.setDisable(true);
			playerAttempt = 2;
			screen.getChildren().remove(profSnoopy);
			screen.getChildren().addAll(chanceBox, chanceClose, profSnoopy);	
		});
		
		//layoutcode
		VBox savingGrace = new VBox(collab, search, chance);
		savingGrace.setPrefSize(130, 400);
		savingGrace.setAlignment(Pos.TOP_RIGHT);
		savingGrace.setLayoutY(60);
		
		return savingGrace;
	}
	
	/**
	 * The timer of the game.
	 * @param num the type of timer (1 for theoretical and 2 for analytical).
	 * @return timer Label
	 */
	public Label timer(int num) {		
				
		List <Image> timerImages = components.getTimerImages();
		ImageView timerView = new ImageView(timerImages.get(0));
		
		Label time = new Label("", timerView);
		time.setPrefSize(50, 370);
		time.setFont(Font.font(10));
		time.setLayoutX(725);
		time.setLayoutY(40);
		time.setBackground(null);
		
		if(num == 1) {
			timer = new Timer();
			TimerTask task = new TimerTask() {
				
				int points = 180;
				int i = 1;
				int j = 1;
				
				@Override
				public void run() {
					if(points > 0) {
						if(j == 3) {
							timerView.setImage(timerImages.get(i));
							i++;
							j = 0;
						}
						j++;
						points--;
					}else {
						System.out.println("no more time");
						noTimePane.setVisible(true);
						timer.cancel();
					}
					currentItemScore = points;
					
				}	
			};

			timer.scheduleAtFixedRate(task, 0, 1000);	// change time back to default 1000 milliseconds
			
		}else {
			timer = new Timer();
			TimerTask task = new TimerTask() {

				int points = 480;
				int i = 0;
				int j = 1;
				
				@Override
				public void run() {
				
					if(points > 0) {
						if(j == 8) {
							timerView.setImage(timerImages.get(i));
							i++;
							j = 0;
						}
						j++;
						points--;
					}else {
						System.out.println("no more time");
						noTimePane.setVisible(true);
						timer.cancel();
					}
					currentItemScore = points;
				}	
			};

			timer.scheduleAtFixedRate(task, 0, 1000);	// change time back to default 1000 milliseconds
			
		}
		
		return time;
	}
	
	/**
	 * Handles the results of the game.
	 * @param num The type of result.
	 */
	public void result(int num) {		
		
		Image won1 = new Image("file:images/Result/Won_Background_Normal.jpg");
		Image won2 = new Image("file:images/Result/Won_Background_Hover.jpg");
		Image low1 = new Image("file:images/Result/LowScore_Background_Normal.jpg");
		Image low2 = new Image("file:images/Result/LowScore_Background_Hover.jpg");
		Image kick1 = new Image("file:images/Result/KickedOut_Background_Normal.jpg");
		Image kick2 = new Image("file:images/Result/KickedOut_Background_Hover.jpg");
		Image drop1 = new Image("file:images/Result/DropOut_Background_Normal.jpg");
		Image drop2 = new Image("file:images/Result/DropOut_Background_Hover.jpg");
		
		ImageView result = new ImageView();
		
		Rectangle backToEntrance = new Rectangle(135, 370, 150, 15);
		backToEntrance.setFill(Color.TRANSPARENT);
		
		Button name = new Button("" + player.getPlayerName());
		name.setFont(Font.font(15));
		name.setTextFill(Color.BLACK);
		name.setPrefSize(75, 15);
		name.setLayoutX(427);
		name.setLayoutY(277);
		name.setBackground(null);
		
		
		Button score = new Button("" + (int) player.getPlayerScore());
		score.setFont(Font.font(50));
		score.setTextFill(Color.LIGHTBLUE);
		score.setPrefSize(300, 120);
		score.setLayoutX(250);
		score.setLayoutY(150);
		score.setStyle("-fx-background-color:transparent");
		
		Group stack = new Group(result, score, backToEntrance);
		
		if(num == 1) {			//Won the game
			stack.getChildren().add(name);
			honors.updateHonorList(player.getPlayerName(), (int) player.getPlayerScore());
			result.setImage(won1);
		}else if(num == 2) {	//Not enough score
			result.setImage(low1);
		}else if(num == 3) {	//Kicked
			result.setImage(kick1);
		}else {					//drop out
			result.setImage(drop1);
		}
		
		backToEntrance.setOnMouseEntered(e->{
			if(num == 1) {			//Won the game
				result.setImage(won2);
			}else if(num == 2) {	//Not enough score
				result.setImage(low2);
			}else if(num == 3) {	//Kicked
				result.setImage(kick2);
			}else {					//drop out
				result.setImage(drop2);
			}
		});
		backToEntrance.setOnMouseExited(e->{
			if(num == 1) {			//Won the game
				result.setImage(won1);
			}else if(num == 2) {	//Not enough score
				result.setImage(low1);
			}else if(num == 3) {	//Kicked
				result.setImage(kick1);
			}else {					//drop out
				result.setImage(drop1);
			}
		});
		backToEntrance.setOnMouseClicked(e-> {
			music.stopSuccess();
			music.stopFail();
			music.playClick();
			music.playMainMenuBG();
			menu();
		});
		
		//reset
		playerAttempt = 1 ;
		player.setPlayerScore(0);
		components.createCategoryButtons();
		collabIsActive = true;
		seekIsActive = true;
		chanceIsActive = true;
		for(Button button : components.getCategoryButtons()) {
			button.setDisable(false);
		}
		
		screen.getChildren().setAll(stack);
	}
	
	/**
	 * Creates the window and start the game.
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;
		window.setTitle("CS University");
		screen = new Group();
		
		viewLoadingScreen();
		
		Scene scene = new Scene(screen, 800, 450);
		window.setScene(scene);
		window.setResizable(false);
		window.show(); 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
