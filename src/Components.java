import java.util.ArrayList;
import java.util.List;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * The class that handles the components of the game.
 * @see Main
 */
public class Components {

	private ArrayList<Image> loadingImages;
	private ArrayList<Image> snoopyDialog;
	private ArrayList<Image> homeScreenImages;
	private ArrayList<Image> settingsImages;
	private ArrayList<Image> aboutImages;
	private ArrayList<Image> playImages;
	private ArrayList<Image> mainGameImages;
	private ArrayList<Image> savingGraceImages;
	private ArrayList<Image> timerImages;
	private ArrayList<Image> instructionImages;
	private ArrayList<Background> categoryBackground;
	private ArrayList<Button> categoryButtons;
	
	/**
	 * This constructor initializes the components used in the game.
	 */
	public Components() {

		//--------------------------------------------------------------------------------------------------------------IMAGES-------------------------------------------------------------------------------------------------
		
		loadingImages = new ArrayList<Image>();
		
		loadingImages.add(new Image("file:images/Loading/Loading1.jpg"));			//0
		loadingImages.add(new Image("file:images/Loading/Loading2.jpg"));			//1
		loadingImages.add(new Image("file:images/Loading/Loading3.jpg"));			//2
		loadingImages.add(new Image("file:images/Loading/Loading4.jpg"));			//3
		loadingImages.add(new Image("file:images/Loading/Loading5.jpg"));			//4
		loadingImages.add(new Image("file:images/Loading/Loading6.jpg"));			//5
		loadingImages.add(new Image("file:images/Loading/Loading7.jpg"));			//6
		loadingImages.add(new Image("file:images/Loading/Loading8.jpg"));			//7
		loadingImages.add(new Image("file:images/Loading/Loading9.jpg"));			//8
		loadingImages.add(new Image("file:images/Loading/Loading10.jpg"));			//9
		loadingImages.add(new Image("file:images/Loading/Loading11.jpg"));			//10
		loadingImages.add(new Image("file:images/Loading/IntroImage1.jpg"));		//11
		loadingImages.add(new Image("file:images/Loading/IntroImage2.jpg"));		//12
		loadingImages.add(new Image("file:images/Loading/IntroImage3.jpg"));		//13
		loadingImages.add(new Image("file:images/Loading/IntroImage4.jpg"));		//14
		
		
		snoopyDialog = new ArrayList<Image>();
		
		snoopyDialog.add(new Image("file:images/GameIntro/SnoopyDialog1.jpg"));		//0
		snoopyDialog.add(new Image("file:images/GameIntro/SnoopyDialog2.jpg"));		//1
		snoopyDialog.add(new Image("file:images/GameIntro/SnoopyDialog3.jpg"));		//2
		snoopyDialog.add(new Image("file:images/GameIntro/SnoopyDialog4.jpg"));		//3
		snoopyDialog.add(new Image("file:images/GameIntro/SnoopyDialog5.jpg"));		//4
		snoopyDialog.add(new Image("file:images/GameIntro/SnoopyDialog6.jpg"));		//5
		snoopyDialog.add(new Image("file:images/GameIntro/SnoopyDialog7.jpg"));		//6
		
		snoopyDialog.add(new Image("file:images/GameIntro/skipNormal.png"));			//7
		snoopyDialog.add(new Image("file:images/GameIntro/skipHover.png"));				//8
		snoopyDialog.add(new Image("file:images/GameIntro/AskName_Background.jpg"));	//9
		snoopyDialog.add(new Image("file:images/GameIntro/Enter_Background.jpg"));		//10
		snoopyDialog.add(new Image("file:images/GameIntro/Enter_Normal.png"));			//11
		snoopyDialog.add(new Image("file:images/GameIntro/Enter_Hover.png"));			//12
		
		
		homeScreenImages = new ArrayList<Image>();
		
		homeScreenImages.add(new Image("file:images/HomeScreen/HomeScreen_Normal.png"));					//0
		homeScreenImages.add(new Image("file:images/HomeScreen/HomeScreen_HighlightedHonorRoll.png"));		//1
		homeScreenImages.add(new Image("file:images/HomeScreen/HomeScreen_HighlightedInstructions.png"));	//2
		homeScreenImages.add(new Image("file:images/HomeScreen/HomeScreen_HighlightedSettings.png"));		//3
		homeScreenImages.add(new Image("file:images/HomeScreen/HomeScreen_HighlightedAbout.png"));			//4
		homeScreenImages.add(new Image("file:images/HomeScreen/HomeScreen_HighlightedPlay.png"));			//5
		homeScreenImages.add(new Image("file:images/HomeScreen/HomeScreen_HighlightedExit.png"));			//6
		
		homeScreenImages.add(new Image("file:images/HomeScreen/Exit_1.jpg"));								//7
		homeScreenImages.add(new Image("file:images/HomeScreen/Exit_2.jpg"));								//8
		homeScreenImages.add(new Image("file:images/HomeScreen/Exit_3.jpg"));								//9
		
		
		settingsImages = new ArrayList<Image>();
		
		settingsImages.add(new Image("file:images/Settings/Settings_Off-Off.png"));			//0
		settingsImages.add(new Image("file:images/Settings/Settings_Off-On.png"));			//1
		settingsImages.add(new Image("file:images/Settings/Settings_On-Off.png"));			//2
		settingsImages.add(new Image("file:images/Settings/Settings_On-On.png"));			//3
		
		
		aboutImages = new ArrayList<Image>();
		
		aboutImages.add(new Image("file:images/About/About_1.jpg"));					//0
		aboutImages.add(new Image("file:images/About/About_2.jpg"));					//1
		aboutImages.add(new Image("file:images/About/About_3.jpg"));					//2
		aboutImages.add(new Image("file:images/About/About_4.jpg"));					//3
		aboutImages.add(new Image("file:images/About/About_5.jpg"));					//4
		aboutImages.add(new Image("file:images/About/About_6.jpg"));					//5
		aboutImages.add(new Image("file:images/About/About_7.jpg"));					//6
		
		aboutImages.add(new Image("file:images/About/About_ButtonLeftNormal.png"));		//7
		aboutImages.add(new Image("file:images/About/About_ButtonLeftHover.png"));		//8
		aboutImages.add(new Image("file:images/About/About_ButtonRightNormal.png"));	//9
		aboutImages.add(new Image("file:images/About/About_ButtonRightHover.png"));		//10
		
		
		playImages = new ArrayList<Image>();
		
		playImages.add(new Image("file:images/Play/PlayBackground.jpg"));				//0
		playImages.add(new Image("file:images/Play/Dialog1.png"));						//1
		playImages.add(new Image("file:images/Play/GoBackButton_Normal.png"));			//2
		playImages.add(new Image("file:images/Play/GoBackButton_Hover.png"));			//3
		playImages.add(new Image("file:images/Play/ProceedButton_Normal.png"));			//4
		playImages.add(new Image("file:images/Play/ProceedButton_Hover.png"));			//5		
		
		
		mainGameImages = new ArrayList<Image>();
		
		mainGameImages.add(new Image("file:images/MainGame/AreYouSureYouWant2DropOut.jpg"));			//0
		mainGameImages.add(new Image("file:images/MainGame/DropOut_Button_Normal.png"));				//1
		mainGameImages.add(new Image("file:images/MainGame/DropOut_Button_Hover.png"));					//2
		mainGameImages.add(new Image("file:images/MainGame/MainGameProfSnoopy.png"));					//3
		mainGameImages.add(new Image("file:images/MainGame/MainGameBackground.jpg"));					//4
		mainGameImages.add(new Image("file:images/MainGame/MainGameBackground2.jpg"));					//5
		

		savingGraceImages = new ArrayList<Image>();
	
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/MainGame_CollabButton.png"));					//0
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/MainGame_CollabButton_Used.png"));			//1
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/MainGame_CollabButton_Hover.png"));			//2
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/MainGame_SearchButton.png"));					//3
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/MainGame_SearchButton_Used.png"));			//4
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/MainGame_SearchButton_Hover.png"));			//5
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/MainGame_ChanceButton.png"));					//6
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/MainGame_ChanceButton_Used.png"));			//7
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/MainGame_ChanceButton_Hover.png"));			//8
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/chanceDialog.png"));							//9
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/searchAnswer.png"));							//10
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/searchSearch.png"));							//11
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/searchSearch1.png"));							//12
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/searchSearch2.png"));							//13
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/searchSearch3.png"));							//14
		
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/pickClassmate.png"));							//15
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/JoeCoolSelected.png"));						//16
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/NancyPinkSelected.png"));						//17
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/CodyVirajSelected.png"));						//18
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/SilentKimSelected.png"));						//19
		
		savingGraceImages.add(new Image("file:images/MainGame/SavingGrace/close.png"));									//20
		
		
		instructionImages = new ArrayList<Image>();
		
		for(int i = 1 ; i < 27 ; i++) {
			instructionImages.add(new Image("file:images/Instructions/Instructions_" + i + ".png"));				
		}
		
		instructionImages.add(new Image("file:images/Instructions/BackToGame_Normal.png"));			//26
		instructionImages.add(new Image("file:images/Instructions/BackToGame_Highlighted.png"));	//27
		instructionImages.add(new Image("file:images/About/About_ButtonLeftNormal.png"));			//28
		instructionImages.add(new Image("file:images/About/About_ButtonLeftHover.png"));			//29
		instructionImages.add(new Image("file:images/About/About_ButtonRightNormal.png"));			//30
		instructionImages.add(new Image("file:images/About/About_ButtonRightHover.png"));			//31
		
		//--------------------------------------------------------------------------------------------------------------BUTTONS-------------------------------------------------------------------------------------------------
		
		mainGameImages.add(new Image("file:images/MainGame/AreYouSureYouWant2DropOut.jpg"));		//0
		
		categoryButtons = new ArrayList<Button>();
		categoryButtons.add(new Button("Programming Paradigms"));	
		
		createCategoryButtons();
		
		Background cleared = new Background(new BackgroundImage( new Image("File:images/MainGame/Category_Cleared.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background categoriesBackground = new Background(new BackgroundImage( new Image("File:images/MainGame/MainGame_CategoriesBackground.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background theoreticalBackground = new Background(new BackgroundImage( new Image("File:images/MainGame/TheoreticalQuestion_Background.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalBackground1 = new Background(new BackgroundImage( new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_Background1.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalBackground2 = new Background(new BackgroundImage( new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_Background2.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalBackground3 = new Background(new BackgroundImage( new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_Background3.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background theoreticalChoiceBackground = new Background(new BackgroundImage( new Image("File:images/MainGame/TheoreticalQuestion_Choice.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalChoiceBackground_A1 = new Background(new BackgroundImage( new Image("File:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_ChoiceA1.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalChoiceBackground_B1 = new Background(new BackgroundImage( new Image("File:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_ChoiceB1.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalChoiceBackground_C1 = new Background(new BackgroundImage( new Image("File:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_ChoiceC1.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalChoiceBackground_D1 = new Background(new BackgroundImage( new Image("File:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_ChoiceD1.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalChoiceBackground_A2 = new Background(new BackgroundImage( new Image("File:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_ChoiceA2.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalChoiceBackground_B2 = new Background(new BackgroundImage( new Image("File:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_ChoiceB2.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalChoiceBackground_C2 = new Background(new BackgroundImage( new Image("File:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_ChoiceC2.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalChoiceBackground_D2 = new Background(new BackgroundImage( new Image("File:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_ChoiceD2.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalChoiceBackground_A3 = new Background(new BackgroundImage( new Image("File:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_ChoiceA3.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalChoiceBackground_B3 = new Background(new BackgroundImage( new Image("File:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_ChoiceB3.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalChoiceBackground_C3 = new Background(new BackgroundImage( new Image("File:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_ChoiceC3.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalChoiceBackground_D3 = new Background(new BackgroundImage( new Image("File:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_ChoiceD3.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background theoreticalChoiceA = new Background(new BackgroundImage( new Image("File:images/MainGame/theoreticalChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background theoreticalChoiceB = new Background(new BackgroundImage( new Image("File:images/MainGame/theoreticalChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background theoreticalChoiceC = new Background(new BackgroundImage( new Image("File:images/MainGame/theoreticalChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background theoreticalChoiceD = new Background(new BackgroundImage( new Image("File:images/MainGame/theoreticalChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background theoreticalChoiceCorrect = new Background(new BackgroundImage( new Image("File:images/MainGame/TheoreticalQuestion_CorrectChoice.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background theoreticalChoiceWrong = new Background(new BackgroundImage( new Image("File:images/MainGame/TheoreticalQuestion_WrongChoice.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background analyticalChoice1Correct = new Background(new BackgroundImage(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_Choice1Correct.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalChoice1Wrong = new Background(new BackgroundImage(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_Choice1Wrong.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalChoice2Correct = new Background(new BackgroundImage(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_Choice2Correct.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalChoice2Wrong = new Background(new BackgroundImage(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_Choice2Wrong.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalChoice3Correct = new Background(new BackgroundImage(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_Choice3Correct.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalChoice3Wrong = new Background(new BackgroundImage(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_Choice3Wrong.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background chance = new Background(new BackgroundImage( new Image("File:images/MainGame/SavingGrace/chanceDialog.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		
		categoryBackground = new ArrayList<Background>();
		
		categoryBackground.add(cleared);						//0
		categoryBackground.add(categoriesBackground);			//1
		categoryBackground.add(theoreticalBackground);			//2
		categoryBackground.add(analyticalBackground1);			//3
		categoryBackground.add(analyticalBackground2);			//4
		categoryBackground.add(analyticalBackground3);			//5
		categoryBackground.add(theoreticalChoiceBackground);	//6
		categoryBackground.add(analyticalChoiceBackground_A1);	//7
		categoryBackground.add(analyticalChoiceBackground_B1);	//8
		categoryBackground.add(analyticalChoiceBackground_C1);	//9
		categoryBackground.add(analyticalChoiceBackground_D1);	//10
		categoryBackground.add(analyticalChoiceBackground_A2);	//11
		categoryBackground.add(analyticalChoiceBackground_B2);	//12
		categoryBackground.add(analyticalChoiceBackground_C2);	//13
		categoryBackground.add(analyticalChoiceBackground_D2);	//14
		categoryBackground.add(analyticalChoiceBackground_A3);	//15
		categoryBackground.add(analyticalChoiceBackground_B3);	//16
		categoryBackground.add(analyticalChoiceBackground_C3);	//17
		categoryBackground.add(analyticalChoiceBackground_D3);	//18
		categoryBackground.add(theoreticalChoiceCorrect);		//19
		categoryBackground.add(theoreticalChoiceWrong);			//20
		categoryBackground.add(analyticalChoice1Correct);		//21
		categoryBackground.add(analyticalChoice1Wrong);			//22
		categoryBackground.add(analyticalChoice2Correct);		//23
		categoryBackground.add(analyticalChoice2Wrong);			//24
		categoryBackground.add(analyticalChoice3Correct);		//25
		categoryBackground.add(analyticalChoice3Wrong);			//26
		
		categoryBackground.add(chance);							//27
		
		categoryBackground.add(theoreticalChoiceA);				//28
		categoryBackground.add(theoreticalChoiceB);				//29
		categoryBackground.add(theoreticalChoiceC);				//30
		categoryBackground.add(theoreticalChoiceD);				//31
		
		//--------------------------------------------------------------------------------------------------------------Timer-------------------------------------------------------------------------------------------------
		timerImages = new ArrayList<Image>();
		
		for(int j = 1 ; j < 62 ; j++) {
			timerImages.add(new Image("file:images/timer/timer" + j + ".png"));				
		}
		
		timerImages.add(new Image("file:images/timer/noTime.png"));
		
	}

	/**
	 * A special function for creating the categoryButtons components .
	 * to reset the design in every game iteration.
	 */
	public void createCategoryButtons() {
		
		categoryButtons.removeAll(categoryButtons);
		
		categoryButtons.add(new Button("Programming Paradigms"));			
		categoryButtons.add(new Button("Procedural Programming"));	
		categoryButtons.add(new Button("Functional Programming"));			
		categoryButtons.add(new Button("Even-driven Programming"));			
		categoryButtons.add(new Button("Imperative  vs. Declarative"));
		categoryButtons.add(new Button("Object-Oriented Programming"));
		categoryButtons.add(new Button("Design Pattern (1)"));
		categoryButtons.add(new Button("Design Pattern (2)"));
		categoryButtons.add(new Button("C (1)"));
		categoryButtons.add(new Button("C (2)"));
		categoryButtons.add(new Button("Java (1)"));
		categoryButtons.add(new Button("Java (2)"));
		categoryButtons.add(new Button("C++ (1)"));
		categoryButtons.add(new Button("C++ (2)"));
		categoryButtons.add(new Button("Python (1)"));
		categoryButtons.add(new Button("Python (2)"));
		
		Background theoreticalBoxBackground = new Background(new BackgroundImage(new Image("File:images/MainGame/Theoretical_CategoryBox.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background analyticalBoxBackground = new Background(new BackgroundImage(new Image("File:images/MainGame/Analytical_CategoryBox.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		//set buttons' font
		int i = 0;
		for(Button button : categoryButtons) {
			button.setPrefSize(200, 30);
			button.setFont(Font.font(10));
			button.setTextFill(Color.WHITE);
			
			if(i < 8) {
				button.setBackground(theoreticalBoxBackground);
				i++;
			}else {
				button.setBackground(analyticalBoxBackground);
				i++;
			}		
		}
	}
	
	/**
	 * A getter method for the loadingImages.
	 * @return loadingImages List
	 */
	public List<Image> getLoadingImages(){
		return loadingImages;
	}
	
	/**
	 * A getter method for snoopyDialog Images.
	 * @return snoopyDialog List
	 */
	public List<Image> getSnoopyDialog(){
		return snoopyDialog;
	}
	
	/**
	 * A getter method for the homeScreen Images.
	 * @return homeScreenImages List
	 */
	public List<Image> getHomeScreenImages(){
		return homeScreenImages;
	}
	
	/**
	 * A getter method for the settingsImages.
	 * @return settingsImages List
	 */
	public List<Image> getSettingsImages(){
		return settingsImages;
	}
	
	/**
	 * A getter method for the aboutImages.
	 * @return aboutImages List
	 */
	public List<Image> getAboutImages(){
		return aboutImages;
	}
	
	/**
	 * A getter method for the playImages.
	 * @return playImages List
	 */
	public List<Image> getPlayImages(){
		return playImages;
	}
	
	/**
	 * A getter method for the mainGameImages.
	 * @return maingameImagesList;
	 */
	public List<Image> getMainGameImages(){
		return mainGameImages;
	}
	
	/**
	 * A getter method for the categoryButtons.
	 * @return categoryButtons List
	 */
	public List<Button> getCategoryButtons(){
		return categoryButtons;
	}
	
	/**
	 * A getter method for the savingGraceImages.
	 * @return savingGraceImages List
	 */
	public List<Image> getSavingGraceImages(){
		return savingGraceImages;
	}
	
	/**
	 * A getter method for the timerImages.
	 * @return timerImages List
	 */
	public List<Image> getTimerImages(){
		return timerImages;
	}
	
	/**
	 * A getter method for the categoryButtonsBackground.
	 * @return categoryButtonBackground List
	 */
	public List<Background> getCategoryButtonsBackground(){
		return categoryBackground;
	}
	
	/**
	 * A getter method for the instructionImages.
	 * @return instructionsImages List
	 */
	public List<Image> getInstructionsImages(){
		return instructionImages;
	}
}
