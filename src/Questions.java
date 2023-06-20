import java.util.ArrayList;
import java.util.List;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

/**
 * This class handles the questions of the game
 * @see Main
 *
 */
public class Questions {

	private List<ImageView> questions;
	private List<Background> questionsChoices;
	private List<Background> questionsChoicesReveal;
	private List<ImageView> analyticalQuestionsChoices;
	private List<ImageView> analyticalOutput;
	
	
	private List<Integer> takenNumbers = new ArrayList<Integer>(); 
	private List<Integer> answerKey;
	
	private int random = 0;
	
	
	/**
	 * This constructor initializes the questions used in the game.
	 */
	public Questions() {
		
		//--------------------------------------------------QUESTIONS----------------------------------------------------------------
		questions = new ArrayList<>();
				
		ImageView question1 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_1.png"));
		ImageView question2 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_2.png"));
		ImageView question3 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_3.png"));
		ImageView question4 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_4.png"));
		ImageView question5 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_5.png"));
	
		ImageView question6 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_6.png"));
		ImageView question7 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_7.png"));
		ImageView question8 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_8.png"));
		ImageView question9 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_9.png"));
		ImageView question10 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_10.png"));
		
		ImageView question11 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_11.png"));
		ImageView question12 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_12.png"));
		ImageView question13 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_13.png"));
		ImageView question14 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_14.png"));
		ImageView question15 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_15.png"));
		
		ImageView question16 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_16.png"));
		ImageView question17 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_17.png"));
		ImageView question18 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_18.png"));
		ImageView question19 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_19.png"));
		ImageView question20 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_20.png"));
		
		ImageView question21 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_21.png"));
		ImageView question22 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_22.png"));
		ImageView question23 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_23.png"));
		ImageView question24 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_24.png"));
		ImageView question25 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_25.png"));
		
		ImageView question26 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_26.png"));
		ImageView question27 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_27.png"));
		ImageView question28 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_28.png"));
		ImageView question29 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_29.png"));
		ImageView question30 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_30.png"));
		
		ImageView question31 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_31.png"));
		ImageView question32 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_32.png"));
		ImageView question33 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_33.png"));
		ImageView question34 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_34.png"));
		ImageView question35 = new ImageView(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_35.png"));
		
		ImageView question36 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_1.png"));
		ImageView question37 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_2.png"));
		ImageView question38 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_3.png"));
		ImageView question39 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_4.png"));
		ImageView question40 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_5.png"));
		
		ImageView question41 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_6.png"));
		ImageView question42 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_7.png"));
		ImageView question43 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_8.png"));
		ImageView question44 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_9.png"));
		ImageView question45 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_10.png"));
		
		ImageView question46 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_11.png"));
		ImageView question47 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_12.png"));
		ImageView question48 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_13.png"));
		ImageView question49 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_14.png"));
		ImageView question50 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_15.png"));
		
		ImageView question51 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_16.png"));
		ImageView question52 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_17.png"));
		ImageView question53 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_18.png"));
		ImageView question54 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_19.png"));
		ImageView question55 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_20.png"));
		
		ImageView question56 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_21.png"));
		ImageView question57 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_22.png"));
		ImageView question58 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_23.png"));
		ImageView question59 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_24.png"));
		ImageView question60 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_25.png"));
		
		ImageView question61 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_26.png"));
		ImageView question62 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_27.png"));
		ImageView question63 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_28.png"));
		ImageView question64 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_29.png"));
		ImageView question65 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_30.png"));
		
		ImageView question66 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_31.png"));
		ImageView question67 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_32.png"));
		ImageView question68 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_33.png"));
		ImageView question69 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_34.png"));
		ImageView question70 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_35.png"));
		
		ImageView question71 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_36.png"));
		ImageView question72 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_37.png"));
		ImageView question73 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_38.png"));
		ImageView question74 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_39.png"));
		ImageView question75 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_40.png"));
		
		
		//Theoretical
		questions.add(question1);	//0		Introduction to Programming Paradigms
		questions.add(question2); 	//1
		questions.add(question3); 	//2
		questions.add(question4); 	//3
		questions.add(question5); 	//4
		questions.add(question6); 	//5		Procedural Programming
		questions.add(question7); 	//6
		questions.add(question8);	//7
		questions.add(question9);	//8
		questions.add(question10);	//9
		questions.add(question11);	//10	Functional Programming
		questions.add(question12); 	//11
		questions.add(question13); 	//12
		questions.add(question14); 	//13
		questions.add(question15); 	//14
		questions.add(question16); 	//15	Object-oriented Programming 
		questions.add(question17); 	//16
		questions.add(question18);	//17
		questions.add(question19);	//18
		questions.add(question20);	//19
		questions.add(question21);	//20	Event-driven Programming
		questions.add(question22); 	//21
		questions.add(question23); 	//22
		questions.add(question24); 	//23
		questions.add(question25); 	//24
		questions.add(question26); 	//25	Imperative vs Declarative Programming
		questions.add(question27); 	//26
		questions.add(question28);	//27
		questions.add(question29);	//28
		questions.add(question30);	//29	Design Patterns
		questions.add(question31);	//30
		questions.add(question32); 	//31
		questions.add(question33); 	//32
		questions.add(question34); 	//33
		questions.add(question35); 	//34
		
		
		//Analytical
		questions.add(question36); 	//35	C
		questions.add(question37); 	//36
		questions.add(question38);	//37
		questions.add(question39);	//38
		questions.add(question40);	//39
		questions.add(question41);	//40
		questions.add(question42); 	//41
		questions.add(question43); 	//42
		questions.add(question44); 	//43
		questions.add(question45); 	//44
		questions.add(question46); 	//45
		questions.add(question47); 	//46
		questions.add(question48);	//47
		questions.add(question49);	//48	Java
		questions.add(question50);	//49
		questions.add(question51);	//50
		questions.add(question52); 	//51
		questions.add(question53); 	//52
		questions.add(question54); 	//53
		questions.add(question55); 	//54
		questions.add(question56); 	//55
		questions.add(question57); 	//56	
		questions.add(question58);	//57
		questions.add(question59);	//58
		questions.add(question60);	//59
		questions.add(question61);	//60
		questions.add(question62); 	//61	JavaScipt
		questions.add(question63); 	//62
		questions.add(question64); 	//63
		questions.add(question65); 	//64
		questions.add(question66); 	//65
		questions.add(question67); 	//66
		questions.add(question68);	//67
		questions.add(question69);	//68
		questions.add(question70);	//69	Python
		questions.add(question71);	//70
		questions.add(question72); 	//71
		questions.add(question73); 	//72
		questions.add(question74); 	//73
		questions.add(question75); 	//74	
		
		
		//--------------------------------------------------CHOICES----------------------------------------------------------------
		
		questionsChoices = new ArrayList<>();
		
		Background question1A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_1ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question1B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_1ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question1C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_1ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question1D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_1ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question2A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_2ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question2B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_2ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question2C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_2ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question2D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_2ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		Background question3A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_3ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question3B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_3ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question3C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_3ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question3D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_3ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question4A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_4ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question4B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_4ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question4C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_4ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question4D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_4ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question5A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_5ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question5B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_5ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question5C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_5ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question5D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_5ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question6A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_6ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question6B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_6ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question6C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_6ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question6D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_6ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question7A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_7ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question7B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_7ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question7C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_7ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question7D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_7ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		Background question8A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_8ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question8B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_8ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question8C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_8ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question8D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_8ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question9A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_9ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question9B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_9ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question9C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_9ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question9D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_9ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question10A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_10ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question10B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_10ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question10C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_10ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question10D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_10ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		Background question11A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_11ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question11B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_11ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question11C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_11ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question11D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_11ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question12A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_12ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question12B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_12ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question12C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_12ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question12D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_12ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		Background question13A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_13ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question13B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_13ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question13C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_13ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question13D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_13ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question14A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_14ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question14B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_14ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question14C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_14ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question14D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_14ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question15A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_15ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question15B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_15ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question15C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_15ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question15D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_15ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question16A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_16ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question16B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_16ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question16C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_16ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question16D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_16ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question17A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_17ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question17B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_17ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question17C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_17ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question17D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_17ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		Background question18A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_18ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question18B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_18ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question18C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_18ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question18D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_18ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question19A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_19ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question19B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_19ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question19C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_19ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question19D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_19ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question20A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_20ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question20B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_20ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question20C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_20ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question20D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_20ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		Background question21A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_21ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question21B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_21ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question21C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_21ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question21D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_21ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question22A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_22ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question22B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_22ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question22C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_22ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question22D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_22ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		Background question23A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_23ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question23B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_23ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question23C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_23ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question23D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_23ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question24A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_24ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question24B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_24ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question24C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_24ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question24D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_24ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question25A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_25ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question25B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_25ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question25C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_25ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question25D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_25ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question26A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_26ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question26B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_26ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question26C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_26ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question26D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_26ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question27A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_27ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question27B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_27ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question27C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_27ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question27D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_27ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		Background question28A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_28ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question28B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_28ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question28C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_28ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question28D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_28ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question29A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_29ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question29B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_29ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question29C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_29ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question29D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_29ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question30A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_30ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question30B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_30ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question30C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_30ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question30D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_30ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question31A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_31ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question31B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_31ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question31C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_31ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question31D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_31ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question32A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_32ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question32B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_32ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question32C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_32ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question32D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_32ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		Background question33A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_33ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question33B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_33ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question33C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_33ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question33D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_33ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question34A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_34ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question34B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_34ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question34C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_34ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question34D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_34ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question35A = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_35ChoiceA.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question35B = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_35ChoiceB.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question35C = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_35ChoiceC.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question35D = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_35ChoiceD.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		
		questionsChoicesReveal = new ArrayList<>();
		
		Background question1A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_1ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question1B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_1ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question1C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_1ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question1D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_1ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question2A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_2ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question2B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_2ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question2C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_2ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question2D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_2ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		Background question3A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_3ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question3B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_3ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question3C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_3ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question3D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_3ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question4A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_4ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question4B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_4ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question4C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_4ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question4D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_4ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question5A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_5ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question5B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_5ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question5C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_5ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question5D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_5ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question6A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_6ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question6B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_6ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question6C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_6ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question6D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_6ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question7A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_7ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question7B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_7ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question7C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_7ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question7D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_7ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		Background question8A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_8ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question8B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_8ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question8C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_8ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question8D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_8ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question9A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_9ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question9B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_9ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question9C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_9ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question9D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_9ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question10A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_10ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question10B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_10ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question10C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_10ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question10D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_10ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		Background question11A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_11ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question11B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_11ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question11C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_11ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question11D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_11ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question12A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_12ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question12B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_12ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question12C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_12ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question12D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_12ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		Background question13A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_13ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question13B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_13ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question13C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_13ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question13D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_13ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question14A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_14ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question14B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_14ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question14C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_14ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question14D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_14ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question15A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_15ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question15B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_15ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question15C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_15ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question15D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_15ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question16A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_16ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question16B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_16ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question16C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_16ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question16D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_16ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question17A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_17ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question17B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_17ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question17C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_17ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question17D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_17ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		Background question18A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_18ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question18B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_18ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question18C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_18ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question18D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_18ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question19A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_19ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question19B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_19ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question19C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_19ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question19D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_19ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question20A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_20ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question20B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_20ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question20C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_20ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question20D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_20ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		Background question21A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_21ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question21B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_21ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question21C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_21ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question21D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_21ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question22A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_22ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question22B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_22ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question22C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_22ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question22D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_22ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		Background question23A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_23ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question23B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_23ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question23C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_23ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question23D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_23ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question24A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_24ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question24B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_24ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question24C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_24ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question24D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_24ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question25A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_25ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question25B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_25ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question25C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_25ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question25D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_25ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question26A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_26ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question26B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_26ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question26C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_26ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question26D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_26ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question27A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_27ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question27B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_27ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question27C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_27ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question27D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_27ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		Background question28A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_28ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question28B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_28ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question28C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_28ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question28D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_28ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question29A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_29ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question29B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_29ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question29C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_29ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question29D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_29ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question30A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_30ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question30B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_30ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question30C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_30ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question30D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_30ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question31A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_31ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question31B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_31ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question31C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_31ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question31D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_31ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question32A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_32ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question32B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_32ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question32C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_32ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question32D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_32ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		Background question33A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_33ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question33B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_33ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question33C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_33ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question33D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_33ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question34A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_34ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question34B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_34ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question34C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_34ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question34D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_34ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		
		Background question35A0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_35ChoiceA0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question35B0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_35ChoiceB0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question35C0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_35ChoiceC0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));
		Background question35D0 = new Background(new BackgroundImage(new Image("file:images/MainGame/TheoreticalQuestion/TheoreticalQuestion_35ChoiceD0.png"),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT));

		
		analyticalQuestionsChoices = new ArrayList<>();
		
		ImageView question36A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_1ChoiceA.png"));
		ImageView question36B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_1ChoiceB.png"));
		ImageView question36C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_1ChoiceC.png"));
		ImageView question36D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_1ChoiceD.png"));
		
		ImageView question37A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_2ChoiceA.png"));
		ImageView question37B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_2ChoiceB.png"));
		ImageView question37C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_2ChoiceC.png"));
		ImageView question37D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_2ChoiceD.png"));
	
		ImageView question38A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_3ChoiceA.png"));
		ImageView question38B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_3ChoiceB.png"));
		ImageView question38C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_3ChoiceC.png"));
		ImageView question38D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_3ChoiceD.png"));
		
		ImageView question39A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_4ChoiceA.png"));
		ImageView question39B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_4ChoiceB.png"));
		ImageView question39C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_4ChoiceC.png"));
		ImageView question39D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_4ChoiceD.png"));
		
		ImageView question40A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_5ChoiceA.png"));
		ImageView question40B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_5ChoiceB.png"));
		ImageView question40C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_5ChoiceC.png"));
		ImageView question40D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_5ChoiceD.png"));
		
		ImageView question41A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_6ChoiceA.png"));
		ImageView question41B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_6ChoiceB.png"));
		ImageView question41C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_6ChoiceC.png"));
		ImageView question41D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_6ChoiceD.png"));
		
		ImageView question42A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_7ChoiceA.png"));
		ImageView question42B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_7ChoiceB.png"));
		ImageView question42C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_7ChoiceC.png"));
		ImageView question42D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_7ChoiceD.png"));
	
		ImageView question43A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_8ChoiceA.png"));
		ImageView question43B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_8ChoiceB.png"));
		ImageView question43C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_8ChoiceC.png"));
		ImageView question43D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_8ChoiceD.png"));
	
		ImageView question44A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_9ChoiceA.png"));
		ImageView question44B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_9ChoiceB.png"));
		ImageView question44C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_9ChoiceC.png"));
		ImageView question44D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_9ChoiceD.png"));
		
		ImageView question45A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_10ChoiceA.png"));
		ImageView question45B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_10ChoiceB.png"));
		ImageView question45C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_10ChoiceC.png"));
		ImageView question45D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_10ChoiceD.png"));
		
		ImageView question46A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_11ChoiceA.png"));
		ImageView question46B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_11ChoiceB.png"));
		ImageView question46C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_11ChoiceC.png"));
		ImageView question46D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_11ChoiceD.png"));
		
		ImageView question47A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_12ChoiceA.png"));
		ImageView question47B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_12ChoiceB.png"));
		ImageView question47C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_12ChoiceC.png"));
		ImageView question47D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_12ChoiceD.png"));
	
		ImageView question48A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_13ChoiceA.png"));
		ImageView question48B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_13ChoiceB.png"));
		ImageView question48C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_13ChoiceC.png"));
		ImageView question48D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_13ChoiceD.png"));
	
		ImageView question49A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_14ChoiceA.png"));
		ImageView question49B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_14ChoiceB.png"));
		ImageView question49C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_14ChoiceC.png"));
		ImageView question49D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_14ChoiceD.png"));
		
		ImageView question50A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_15ChoiceA.png"));
		ImageView question50B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_15ChoiceB.png"));
		ImageView question50C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_15ChoiceC.png"));
		ImageView question50D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_15ChoiceD.png"));
		
		ImageView question51A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_16ChoiceA.png"));
		ImageView question51B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_16ChoiceB.png"));
		ImageView question51C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_16ChoiceC.png"));
		ImageView question51D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_16ChoiceD.png"));
		
		ImageView question52A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_17ChoiceA.png"));
		ImageView question52B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_17ChoiceB.png"));
		ImageView question52C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_17ChoiceC.png"));
		ImageView question52D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_17ChoiceD.png"));
	
		ImageView question53A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_18ChoiceA.png"));
		ImageView question53B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_18ChoiceB.png"));
		ImageView question53C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_18ChoiceC.png"));
		ImageView question53D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_18ChoiceD.png"));
	
		ImageView question54A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_19ChoiceA.png"));
		ImageView question54B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_19ChoiceB.png"));
		ImageView question54C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_19ChoiceC.png"));
		ImageView question54D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_19ChoiceD.png"));
		
		ImageView question55A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_20ChoiceA.png"));
		ImageView question55B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_20ChoiceB.png"));
		ImageView question55C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_20ChoiceC.png"));
		ImageView question55D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_20ChoiceD.png"));
		
		ImageView question56A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_21ChoiceA.png"));
		ImageView question56B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_21ChoiceB.png"));
		ImageView question56C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_21ChoiceC.png"));
		ImageView question56D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_21ChoiceD.png"));
	
		ImageView question57A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_22ChoiceA.png"));
		ImageView question57B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_22ChoiceB.png"));
		ImageView question57C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_22ChoiceC.png"));
		ImageView question57D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_22ChoiceD.png"));
	
		ImageView question58A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_23ChoiceA.png"));
		ImageView question58B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_23ChoiceB.png"));
		ImageView question58C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_23ChoiceC.png"));
		ImageView question58D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_23ChoiceD.png"));
	
		ImageView question59A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_24ChoiceA.png"));
		ImageView question59B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_24ChoiceB.png"));
		ImageView question59C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_24ChoiceC.png"));
		ImageView question59D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_24ChoiceD.png"));
		
		ImageView question60A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_25ChoiceA.png"));
		ImageView question60B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_25ChoiceB.png"));
		ImageView question60C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_25ChoiceC.png"));
		ImageView question60D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_25ChoiceD.png"));

		ImageView question61A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_26ChoiceA.png"));
		ImageView question61B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_26ChoiceB.png"));
		ImageView question61C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_26ChoiceC.png"));
		ImageView question61D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_26ChoiceD.png"));
		
		ImageView question62A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_27ChoiceA.png"));
		ImageView question62B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_27ChoiceB.png"));
		ImageView question62C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_27ChoiceC.png"));
		ImageView question62D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_27ChoiceD.png"));
	
		ImageView question63A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_28ChoiceA.png"));
		ImageView question63B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_28ChoiceB.png"));
		ImageView question63C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_28ChoiceC.png"));
		ImageView question63D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_28ChoiceD.png"));
	
		ImageView question64A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_29ChoiceA.png"));
		ImageView question64B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_29ChoiceB.png"));
		ImageView question64C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_29ChoiceC.png"));
		ImageView question64D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_29ChoiceD.png"));
		
		ImageView question65A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_30ChoiceA.png"));
		ImageView question65B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_30ChoiceB.png"));
		ImageView question65C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_30ChoiceC.png"));
		ImageView question65D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_30ChoiceD.png"));
		
		ImageView question66A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_31ChoiceA.png"));
		ImageView question66B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_31ChoiceB.png"));
		ImageView question66C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_31ChoiceC.png"));
		ImageView question66D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_31ChoiceD.png"));
		
		ImageView question67A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_32ChoiceA.png"));
		ImageView question67B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_32ChoiceB.png"));
		ImageView question67C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_32ChoiceC.png"));
		ImageView question67D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_32ChoiceD.png"));
	
		ImageView question68A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_33ChoiceA.png"));
		ImageView question68B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_33ChoiceB.png"));
		ImageView question68C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_33ChoiceC.png"));
		ImageView question68D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_33ChoiceD.png"));
	
		ImageView question69A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_34ChoiceA.png"));
		ImageView question69B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_34ChoiceB.png"));
		ImageView question69C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_34ChoiceC.png"));
		ImageView question69D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_34ChoiceD.png"));
		
		ImageView question70A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_35ChoiceA.png"));
		ImageView question70B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_35ChoiceB.png"));
		ImageView question70C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_35ChoiceC.png"));
		ImageView question70D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_35ChoiceD.png"));
		
		ImageView question71A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_36ChoiceA.png"));
		ImageView question71B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_36ChoiceB.png"));
		ImageView question71C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_36ChoiceC.png"));
		ImageView question71D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_36ChoiceD.png"));
		
		ImageView question72A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_37ChoiceA.png"));
		ImageView question72B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_37ChoiceB.png"));
		ImageView question72C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_37ChoiceC.png"));
		ImageView question72D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_37ChoiceD.png"));
	
		ImageView question73A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_38ChoiceA.png"));
		ImageView question73B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_38ChoiceB.png"));
		ImageView question73C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_38ChoiceC.png"));
		ImageView question73D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_38ChoiceD.png"));
	
		ImageView question74A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_39ChoiceA.png"));
		ImageView question74B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_39ChoiceB.png"));
		ImageView question74C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_39ChoiceC.png"));
		ImageView question74D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_39ChoiceD.png"));
		
		ImageView question75A = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_40ChoiceA.png"));
		ImageView question75B = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_40ChoiceB.png"));
		ImageView question75C = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_40ChoiceC.png"));
		ImageView question75D = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalQuestion_40ChoiceD.png"));
		

		//Theoretical
		questionsChoices.add(question1A);	//0
		questionsChoices.add(question1B); 	//1
		questionsChoices.add(question1C); 	//2
		questionsChoices.add(question1D); 	//3	
		questionsChoices.add(question2A);	//4
		questionsChoices.add(question2B); 	//5
		questionsChoices.add(question2C); 	//6
		questionsChoices.add(question2D); 	//7
		questionsChoices.add(question3A);	//8
		questionsChoices.add(question3B); 	//9
		questionsChoices.add(question3C); 	//10
		questionsChoices.add(question3D); 	//11
		questionsChoices.add(question4A);	//12
		questionsChoices.add(question4B); 	//13
		questionsChoices.add(question4C); 	//14
		questionsChoices.add(question4D); 	//15
		questionsChoices.add(question5A);	//16
		questionsChoices.add(question5B); 	//17
		questionsChoices.add(question5C); 	//18
		questionsChoices.add(question5D); 	//19
		questionsChoices.add(question6A);	//20
		questionsChoices.add(question6B); 	//21
		questionsChoices.add(question6C); 	//22
		questionsChoices.add(question6D); 	//23
		questionsChoices.add(question7A);	//24
		questionsChoices.add(question7B); 	//25
		questionsChoices.add(question7C); 	//26
		questionsChoices.add(question7D); 	//27
		questionsChoices.add(question8A);	//28
		questionsChoices.add(question8B); 	//29
		questionsChoices.add(question8C); 	//30
		questionsChoices.add(question8D); 	//31
		questionsChoices.add(question9A);	//32
		questionsChoices.add(question9B); 	//33
		questionsChoices.add(question9C); 	//34
		questionsChoices.add(question9D); 	//35
		questionsChoices.add(question10A);	//36
		questionsChoices.add(question10B); 	//37
		questionsChoices.add(question10C); 	//38
		questionsChoices.add(question10D); 	//39
		
		questionsChoices.add(question11A);	//40
		questionsChoices.add(question11B); 	//41
		questionsChoices.add(question11C); 	//42
		questionsChoices.add(question11D); 	//43	
		questionsChoices.add(question12A);	//44
		questionsChoices.add(question12B); 	//45
		questionsChoices.add(question12C); 	//46
		questionsChoices.add(question12D); 	//47
		questionsChoices.add(question13A);	//48
		questionsChoices.add(question13B); 	//49
		questionsChoices.add(question13C); 	//50
		questionsChoices.add(question13D); 	//51
		questionsChoices.add(question14A);	//52
		questionsChoices.add(question14B); 	//53
		questionsChoices.add(question14C); 	//54
		questionsChoices.add(question14D); 	//55
		questionsChoices.add(question15A);	//56
		questionsChoices.add(question15B); 	//57
		questionsChoices.add(question15C); 	//58
		questionsChoices.add(question15D); 	//59
		questionsChoices.add(question16A);	//60
		questionsChoices.add(question16B); 	//61
		questionsChoices.add(question16C); 	//62
		questionsChoices.add(question16D); 	//63
		questionsChoices.add(question17A);	//64
		questionsChoices.add(question17B); 	//65
		questionsChoices.add(question17C); 	//66
		questionsChoices.add(question17D); 	//67
		questionsChoices.add(question18A);	//68
		questionsChoices.add(question18B); 	//69
		questionsChoices.add(question18C); 	//70
		questionsChoices.add(question18D); 	//71
		questionsChoices.add(question19A);	//72
		questionsChoices.add(question19B); 	//73
		questionsChoices.add(question19C); 	//74
		questionsChoices.add(question19D); 	//75
		questionsChoices.add(question20A);	//76
		questionsChoices.add(question20B); 	//77
		questionsChoices.add(question20C); 	//78
		questionsChoices.add(question20D); 	//79
		
		questionsChoices.add(question21A);	//80
		questionsChoices.add(question21B); 	//81
		questionsChoices.add(question21C); 	//82
		questionsChoices.add(question21D); 	//83	
		questionsChoices.add(question22A);	//84
		questionsChoices.add(question22B); 	//85
		questionsChoices.add(question22C); 	//86
		questionsChoices.add(question22D); 	//87
		questionsChoices.add(question23A);	//88
		questionsChoices.add(question23B); 	//89
		questionsChoices.add(question23C); 	//90
		questionsChoices.add(question23D); 	//91
		questionsChoices.add(question24A);	//92
		questionsChoices.add(question24B); 	//93
		questionsChoices.add(question24C); 	//94
		questionsChoices.add(question24D); 	//95
		questionsChoices.add(question25A);	//96
		questionsChoices.add(question25B); 	//97
		questionsChoices.add(question25C); 	//98
		questionsChoices.add(question25D); 	//99
		questionsChoices.add(question26A);	//100
		questionsChoices.add(question26B); 	//101
		questionsChoices.add(question26C); 	//102
		questionsChoices.add(question26D); 	//103
		questionsChoices.add(question27A);	//104
		questionsChoices.add(question27B); 	//105
		questionsChoices.add(question27C); 	//106
		questionsChoices.add(question27D); 	//107
		questionsChoices.add(question28A);	//108
		questionsChoices.add(question28B); 	//109
		questionsChoices.add(question28C); 	//110
		questionsChoices.add(question28D); 	//111
		questionsChoices.add(question29A);	//112
		questionsChoices.add(question29B); 	//113
		questionsChoices.add(question29C); 	//114
		questionsChoices.add(question29D); 	//115
		questionsChoices.add(question30A);	//116
		questionsChoices.add(question30B); 	//117
		questionsChoices.add(question30C); 	//118
		questionsChoices.add(question30D); 	//119
		
		questionsChoices.add(question31A);	//120
		questionsChoices.add(question31B); 	//121
		questionsChoices.add(question31C); 	//122
		questionsChoices.add(question31D); 	//123	
		questionsChoices.add(question32A);	//124
		questionsChoices.add(question32B); 	//125
		questionsChoices.add(question32C); 	//126
		questionsChoices.add(question32D); 	//127
		questionsChoices.add(question33A);	//128
		questionsChoices.add(question33B); 	//129
		questionsChoices.add(question33C); 	//130
		questionsChoices.add(question33D); 	//131
		questionsChoices.add(question34A);	//132
		questionsChoices.add(question34B); 	//133
		questionsChoices.add(question34C); 	//134
		questionsChoices.add(question34D); 	//135
		questionsChoices.add(question35A);	//136
		questionsChoices.add(question35B); 	//137
		questionsChoices.add(question35C); 	//138
		questionsChoices.add(question35D); 	//139
		
		questionsChoicesReveal.add(question1A0);	//0
		questionsChoicesReveal.add(question1B0); 	//1
		questionsChoicesReveal.add(question1C0); 	//2
		questionsChoicesReveal.add(question1D0); 	//3	
		questionsChoicesReveal.add(question2A0);	//4
		questionsChoicesReveal.add(question2B0); 	//5
		questionsChoicesReveal.add(question2C0); 	//6
		questionsChoicesReveal.add(question2D0); 	//7
		questionsChoicesReveal.add(question3A0);	//8
		questionsChoicesReveal.add(question3B0); 	//9
		questionsChoicesReveal.add(question3C0); 	//10
		questionsChoicesReveal.add(question3D0); 	//11
		questionsChoicesReveal.add(question4A0);	//12
		questionsChoicesReveal.add(question4B0); 	//13
		questionsChoicesReveal.add(question4C0); 	//14
		questionsChoicesReveal.add(question4D0); 	//15
		questionsChoicesReveal.add(question5A0);	//16
		questionsChoicesReveal.add(question5B0); 	//17
		questionsChoicesReveal.add(question5C0); 	//18
		questionsChoicesReveal.add(question5D0); 	//19
		questionsChoicesReveal.add(question6A0);	//20
		questionsChoicesReveal.add(question6B0); 	//21
		questionsChoicesReveal.add(question6C0); 	//22
		questionsChoicesReveal.add(question6D0); 	//23
		questionsChoicesReveal.add(question7A0);	//24
		questionsChoicesReveal.add(question7B0); 	//25
		questionsChoicesReveal.add(question7C0); 	//26
		questionsChoicesReveal.add(question7D0); 	//27
		questionsChoicesReveal.add(question8A0);	//28
		questionsChoicesReveal.add(question8B0); 	//29
		questionsChoicesReveal.add(question8C0); 	//30
		questionsChoicesReveal.add(question8D0); 	//31
		questionsChoicesReveal.add(question9A0);	//32
		questionsChoicesReveal.add(question9B0); 	//33
		questionsChoicesReveal.add(question9C0); 	//34
		questionsChoicesReveal.add(question9D0); 	//35
		questionsChoicesReveal.add(question10A0);	//36
		questionsChoicesReveal.add(question10B0); 	//37
		questionsChoicesReveal.add(question10C0); 	//38
		questionsChoicesReveal.add(question10D0); 	//39
		
		questionsChoicesReveal.add(question11A0);	//40
		questionsChoicesReveal.add(question11B0); 	//41
		questionsChoicesReveal.add(question11C0); 	//42
		questionsChoicesReveal.add(question11D0); 	//43	
		questionsChoicesReveal.add(question12A0);	//44
		questionsChoicesReveal.add(question12B0); 	//45
		questionsChoicesReveal.add(question12C0); 	//46
		questionsChoicesReveal.add(question12D0); 	//47
		questionsChoicesReveal.add(question13A0);	//48
		questionsChoicesReveal.add(question13B0); 	//49
		questionsChoicesReveal.add(question13C0); 	//50
		questionsChoicesReveal.add(question13D0); 	//51
		questionsChoicesReveal.add(question14A0);	//52
		questionsChoicesReveal.add(question14B0); 	//53
		questionsChoicesReveal.add(question14C0); 	//54
		questionsChoicesReveal.add(question14D0); 	//55
		questionsChoicesReveal.add(question15A0);	//56
		questionsChoicesReveal.add(question15B0); 	//57
		questionsChoicesReveal.add(question15C0); 	//58
		questionsChoicesReveal.add(question15D0); 	//59
		questionsChoicesReveal.add(question16A0);	//60
		questionsChoicesReveal.add(question16B0); 	//61
		questionsChoicesReveal.add(question16C0); 	//62
		questionsChoicesReveal.add(question16D0); 	//63
		questionsChoicesReveal.add(question17A0);	//64
		questionsChoicesReveal.add(question17B0); 	//65
		questionsChoicesReveal.add(question17C0); 	//66
		questionsChoicesReveal.add(question17D0); 	//67
		questionsChoicesReveal.add(question18A0);	//68
		questionsChoicesReveal.add(question18B0); 	//69
		questionsChoicesReveal.add(question18C0); 	//70
		questionsChoicesReveal.add(question18D0); 	//71
		questionsChoicesReveal.add(question19A0);	//72
		questionsChoicesReveal.add(question19B0); 	//73
		questionsChoicesReveal.add(question19C0); 	//74
		questionsChoicesReveal.add(question19D0); 	//75
		questionsChoicesReveal.add(question20A0);	//76
		questionsChoicesReveal.add(question20B0); 	//77
		questionsChoicesReveal.add(question20C0); 	//78
		questionsChoicesReveal.add(question20D0); 	//79
		
		questionsChoicesReveal.add(question21A0);	//80
		questionsChoicesReveal.add(question21B0); 	//81
		questionsChoicesReveal.add(question21C0); 	//82
		questionsChoicesReveal.add(question21D0); 	//83	
		questionsChoicesReveal.add(question22A0);	//84
		questionsChoicesReveal.add(question22B0); 	//85
		questionsChoicesReveal.add(question22C0); 	//86
		questionsChoicesReveal.add(question22D0); 	//87
		questionsChoicesReveal.add(question23A0);	//88
		questionsChoicesReveal.add(question23B0); 	//89
		questionsChoicesReveal.add(question23C0); 	//90
		questionsChoicesReveal.add(question23D0); 	//91
		questionsChoicesReveal.add(question24A0);	//92
		questionsChoicesReveal.add(question24B0); 	//93
		questionsChoicesReveal.add(question24C0); 	//94
		questionsChoicesReveal.add(question24D0); 	//95
		questionsChoicesReveal.add(question25A0);	//96
		questionsChoicesReveal.add(question25B0); 	//97
		questionsChoicesReveal.add(question25C0); 	//98
		questionsChoicesReveal.add(question25D0); 	//99
		questionsChoicesReveal.add(question26A0);	//100
		questionsChoicesReveal.add(question26B0); 	//101
		questionsChoicesReveal.add(question26C0); 	//102
		questionsChoicesReveal.add(question26D0); 	//103
		questionsChoicesReveal.add(question27A0);	//104
		questionsChoicesReveal.add(question27B0); 	//105
		questionsChoicesReveal.add(question27C0); 	//106
		questionsChoicesReveal.add(question27D0); 	//107
		questionsChoicesReveal.add(question28A0);	//108
		questionsChoicesReveal.add(question28B0); 	//109
		questionsChoicesReveal.add(question28C0); 	//110
		questionsChoicesReveal.add(question28D0); 	//111
		questionsChoicesReveal.add(question29A0);	//112
		questionsChoicesReveal.add(question29B0); 	//113
		questionsChoicesReveal.add(question29C0); 	//114
		questionsChoicesReveal.add(question29D0); 	//115
		questionsChoicesReveal.add(question30A0);	//116
		questionsChoicesReveal.add(question30B0); 	//117
		questionsChoicesReveal.add(question30C0); 	//118
		questionsChoicesReveal.add(question30D0); 	//119
		
		questionsChoicesReveal.add(question31A0);	//120
		questionsChoicesReveal.add(question31B0); 	//121
		questionsChoicesReveal.add(question31C0); 	//122
		questionsChoicesReveal.add(question31D0); 	//123	
		questionsChoicesReveal.add(question32A0);	//124
		questionsChoicesReveal.add(question32B0); 	//125
		questionsChoicesReveal.add(question32C0); 	//126
		questionsChoicesReveal.add(question32D0); 	//127
		questionsChoicesReveal.add(question33A0);	//128
		questionsChoicesReveal.add(question33B0); 	//129
		questionsChoicesReveal.add(question33C0); 	//130
		questionsChoicesReveal.add(question33D0); 	//131
		questionsChoicesReveal.add(question34A0);	//132
		questionsChoicesReveal.add(question34B0); 	//133
		questionsChoicesReveal.add(question34C0); 	//134
		questionsChoicesReveal.add(question34D0); 	//135
		questionsChoicesReveal.add(question35A0);	//136
		questionsChoicesReveal.add(question35B0); 	//137
		questionsChoicesReveal.add(question35C0); 	//138
		questionsChoicesReveal.add(question35D0); 	//139
		
		
		
		analyticalQuestionsChoices.add(question36A);	//140
		analyticalQuestionsChoices.add(question36B); 	//141
		analyticalQuestionsChoices.add(question36C); 	//142
		analyticalQuestionsChoices.add(question36D); 	//143	
		analyticalQuestionsChoices.add(question37A);	//144
		analyticalQuestionsChoices.add(question37B); 	//145
		analyticalQuestionsChoices.add(question37C); 	//146
		analyticalQuestionsChoices.add(question37D); 	//147
		analyticalQuestionsChoices.add(question38A);	//148
		analyticalQuestionsChoices.add(question38B); 	//149
		analyticalQuestionsChoices.add(question38C); 	//150
		analyticalQuestionsChoices.add(question38D); 	//151
		analyticalQuestionsChoices.add(question39A);	//152
		analyticalQuestionsChoices.add(question39B); 	//153
		analyticalQuestionsChoices.add(question39C); 	//154
		analyticalQuestionsChoices.add(question39D); 	//155
		analyticalQuestionsChoices.add(question40A);	//156
		analyticalQuestionsChoices.add(question40B); 	//157
		analyticalQuestionsChoices.add(question40C); 	//158
		analyticalQuestionsChoices.add(question40D); 	//159
		
		analyticalQuestionsChoices.add(question41A);	//160
		analyticalQuestionsChoices.add(question41B); 	//161
		analyticalQuestionsChoices.add(question41C); 	//162
		analyticalQuestionsChoices.add(question41D); 	//163	
		analyticalQuestionsChoices.add(question42A);	//164
		analyticalQuestionsChoices.add(question42B); 	//165
		analyticalQuestionsChoices.add(question42C); 	//166
		analyticalQuestionsChoices.add(question42D); 	//167
		analyticalQuestionsChoices.add(question43A);	//168
		analyticalQuestionsChoices.add(question43B); 	//169
		analyticalQuestionsChoices.add(question43C); 	//170
		analyticalQuestionsChoices.add(question43D); 	//171
		analyticalQuestionsChoices.add(question44A);	//172
		analyticalQuestionsChoices.add(question44B); 	//173
		analyticalQuestionsChoices.add(question44C); 	//174
		analyticalQuestionsChoices.add(question44D); 	//175
		analyticalQuestionsChoices.add(question45A);	//176
		analyticalQuestionsChoices.add(question45B); 	//177
		analyticalQuestionsChoices.add(question45C); 	//178
		analyticalQuestionsChoices.add(question45D); 	//179
		analyticalQuestionsChoices.add(question46A);	//180
		analyticalQuestionsChoices.add(question46B); 	//181
		analyticalQuestionsChoices.add(question46C); 	//182
		analyticalQuestionsChoices.add(question46D); 	//183
		analyticalQuestionsChoices.add(question47A);	//184
		analyticalQuestionsChoices.add(question47B); 	//185
		analyticalQuestionsChoices.add(question47C); 	//186
		analyticalQuestionsChoices.add(question47D); 	//187
		analyticalQuestionsChoices.add(question48A);	//188
		analyticalQuestionsChoices.add(question48B); 	//189
		analyticalQuestionsChoices.add(question48C); 	//190
		analyticalQuestionsChoices.add(question48D); 	//191
		analyticalQuestionsChoices.add(question49A);	//192
		analyticalQuestionsChoices.add(question49B); 	//193
		analyticalQuestionsChoices.add(question49C); 	//194
		analyticalQuestionsChoices.add(question49D); 	//195
		analyticalQuestionsChoices.add(question50A);	//196
		analyticalQuestionsChoices.add(question50B); 	//197
		analyticalQuestionsChoices.add(question50C); 	//198
		analyticalQuestionsChoices.add(question50D); 	//199
		
		analyticalQuestionsChoices.add(question51A);	//200
		analyticalQuestionsChoices.add(question51B); 	//201
		analyticalQuestionsChoices.add(question51C); 	//202
		analyticalQuestionsChoices.add(question51D); 	//203	
		analyticalQuestionsChoices.add(question52A);	//204
		analyticalQuestionsChoices.add(question52B); 	//205
		analyticalQuestionsChoices.add(question52C); 	//206
		analyticalQuestionsChoices.add(question52D); 	//207
		analyticalQuestionsChoices.add(question53A);	//208
		analyticalQuestionsChoices.add(question53B); 	//209
		analyticalQuestionsChoices.add(question53C); 	//210
		analyticalQuestionsChoices.add(question53D); 	//211
		analyticalQuestionsChoices.add(question54A);	//212
		analyticalQuestionsChoices.add(question54B); 	//213
		analyticalQuestionsChoices.add(question54C); 	//214
		analyticalQuestionsChoices.add(question54D); 	//215
		analyticalQuestionsChoices.add(question55A);	//216
		analyticalQuestionsChoices.add(question55B); 	//217
		analyticalQuestionsChoices.add(question55C); 	//218
		analyticalQuestionsChoices.add(question55D); 	//219
		analyticalQuestionsChoices.add(question56A);	//220
		analyticalQuestionsChoices.add(question56B); 	//221
		analyticalQuestionsChoices.add(question56C); 	//222
		analyticalQuestionsChoices.add(question56D); 	//223
		analyticalQuestionsChoices.add(question57A);	//224
		analyticalQuestionsChoices.add(question57B); 	//225
		analyticalQuestionsChoices.add(question57C); 	//226
		analyticalQuestionsChoices.add(question57D); 	//227
		analyticalQuestionsChoices.add(question58A);	//228
		analyticalQuestionsChoices.add(question58B); 	//229
		analyticalQuestionsChoices.add(question58C); 	//230
		analyticalQuestionsChoices.add(question58D); 	//231
		analyticalQuestionsChoices.add(question59A);	//232
		analyticalQuestionsChoices.add(question59B); 	//233
		analyticalQuestionsChoices.add(question59C); 	//234
		analyticalQuestionsChoices.add(question59D); 	//235
		analyticalQuestionsChoices.add(question60A);	//236
		analyticalQuestionsChoices.add(question60B); 	//237
		analyticalQuestionsChoices.add(question60C); 	//238
		analyticalQuestionsChoices.add(question60D); 	//239
		
		analyticalQuestionsChoices.add(question61A);	//240
		analyticalQuestionsChoices.add(question61B); 	//241
		analyticalQuestionsChoices.add(question61C); 	//242
		analyticalQuestionsChoices.add(question61D); 	//243	
		analyticalQuestionsChoices.add(question62A);	//244
		analyticalQuestionsChoices.add(question62B); 	//245
		analyticalQuestionsChoices.add(question62C); 	//246
		analyticalQuestionsChoices.add(question62D); 	//247
		analyticalQuestionsChoices.add(question63A);	//248
		analyticalQuestionsChoices.add(question63B); 	//249
		analyticalQuestionsChoices.add(question63C); 	//250
		analyticalQuestionsChoices.add(question63D); 	//251
		analyticalQuestionsChoices.add(question64A);	//252
		analyticalQuestionsChoices.add(question64B); 	//253
		analyticalQuestionsChoices.add(question64C); 	//254
		analyticalQuestionsChoices.add(question64D); 	//255
		analyticalQuestionsChoices.add(question65A);	//256
		analyticalQuestionsChoices.add(question65B); 	//257
		analyticalQuestionsChoices.add(question65C); 	//258
		analyticalQuestionsChoices.add(question65D); 	//259
		analyticalQuestionsChoices.add(question66A);	//260
		analyticalQuestionsChoices.add(question66B); 	//261
		analyticalQuestionsChoices.add(question66C); 	//262
		analyticalQuestionsChoices.add(question66D); 	//263
		analyticalQuestionsChoices.add(question67A);	//264
		analyticalQuestionsChoices.add(question67B); 	//265
		analyticalQuestionsChoices.add(question67C); 	//266
		analyticalQuestionsChoices.add(question67D); 	//267
		analyticalQuestionsChoices.add(question68A);	//268
		analyticalQuestionsChoices.add(question68B); 	//269
		analyticalQuestionsChoices.add(question68C); 	//270
		analyticalQuestionsChoices.add(question68D); 	//271
		analyticalQuestionsChoices.add(question69A);	//272
		analyticalQuestionsChoices.add(question69B); 	//273
		analyticalQuestionsChoices.add(question69C); 	//274
		analyticalQuestionsChoices.add(question69D); 	//275
		analyticalQuestionsChoices.add(question70A);	//276
		analyticalQuestionsChoices.add(question70B); 	//277
		analyticalQuestionsChoices.add(question70C); 	//278
		analyticalQuestionsChoices.add(question70D); 	//279
		
		analyticalQuestionsChoices.add(question71A);	//280
		analyticalQuestionsChoices.add(question71B); 	//281
		analyticalQuestionsChoices.add(question71C); 	//282
		analyticalQuestionsChoices.add(question71D); 	//283	
		analyticalQuestionsChoices.add(question72A);	//284
		analyticalQuestionsChoices.add(question72B); 	//285
		analyticalQuestionsChoices.add(question72C); 	//286
		analyticalQuestionsChoices.add(question72D); 	//287
		analyticalQuestionsChoices.add(question73A);	//288
		analyticalQuestionsChoices.add(question73B); 	//289
		analyticalQuestionsChoices.add(question73C); 	//290
		analyticalQuestionsChoices.add(question73D); 	//291
		analyticalQuestionsChoices.add(question74A);	//292
		analyticalQuestionsChoices.add(question74B); 	//293
		analyticalQuestionsChoices.add(question74C); 	//294
		analyticalQuestionsChoices.add(question74D); 	//295
		analyticalQuestionsChoices.add(question75A);	//296
		analyticalQuestionsChoices.add(question75B); 	//297
		analyticalQuestionsChoices.add(question75C); 	//298
		analyticalQuestionsChoices.add(question75D); 	//299
	
		//--------------------------------------------------Analytical Questions Output----------------------------------------------------------------
		
		analyticalOutput = new ArrayList<ImageView>();
		
		ImageView output1 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalOutput_1.png"));
		ImageView output2 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalOutput_2.png"));
		ImageView output3 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalOutput_3.png"));
		ImageView output4 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalOutput_4.png"));
		ImageView output5 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalOutput_5.png"));
		ImageView output6 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalOutput_6.png"));
		ImageView output7 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalOutput_7.png"));
		ImageView output8 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalOutput_8.png"));
		ImageView output9 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalOutput_9.png"));
		ImageView output10 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalOutput_10.png"));
		ImageView output11 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalOutput_11.png"));
		ImageView output12 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalOutput_12.png"));
		ImageView output13 = new ImageView(new Image("file:images/MainGame/AnalyticalQuestion/AnalyticalOutput_13.png"));

		
		analyticalOutput.add(output1);
		analyticalOutput.add(output2);
		analyticalOutput.add(output3);
		analyticalOutput.add(output4);
		analyticalOutput.add(output5);
		analyticalOutput.add(output6);
		analyticalOutput.add(output7);
		analyticalOutput.add(output8);
		analyticalOutput.add(output9);
		analyticalOutput.add(output10);
		analyticalOutput.add(output11);
		analyticalOutput.add(output12);
		analyticalOutput.add(output13);
		
		//--------------------------------------------------Answer Key----------------------------------------------------------------
		
		answerKey = new ArrayList<>();
		
		answerKey.add(0);	//0
		answerKey.add(2);	//1
		answerKey.add(3);	//2
		answerKey.add(3);	//3
		answerKey.add(0);	//4
		answerKey.add(2);	//5
		answerKey.add(1);	//6
		answerKey.add(0);	//7
		answerKey.add(1);	//8
		answerKey.add(3);	//9
		answerKey.add(2);	//10
		answerKey.add(0);	//11
		answerKey.add(1);	//12
		answerKey.add(0);	//13
		answerKey.add(0);	//14
		answerKey.add(3);	//15
		answerKey.add(2);	//16
		answerKey.add(2);	//17
		answerKey.add(0);	//18
		answerKey.add(1);	//19
		answerKey.add(3);	//20
		answerKey.add(2);	//21
		answerKey.add(0);	//22
		answerKey.add(3);	//23
		answerKey.add(1);	//24
		answerKey.add(0);	//25
		answerKey.add(1);	//26
		answerKey.add(3);	//27
		answerKey.add(1);	//28
		answerKey.add(2);	//29
		answerKey.add(1);	//30
		answerKey.add(3);	//31
		answerKey.add(0);	//32
		answerKey.add(2);	//33
		answerKey.add(2);	//34
		answerKey.add(1);	//35
		answerKey.add(3);	//36
		answerKey.add(0);	//37
		answerKey.add(3);	//38
		answerKey.add(1);	//39
		answerKey.add(0);	//40
		answerKey.add(2);	//41
		answerKey.add(2);	//42
		answerKey.add(3);	//43
		answerKey.add(3);	//44
		answerKey.add(1);	//45
		answerKey.add(2);	//46
		answerKey.add(3);	//47
		answerKey.add(0);	//48
		answerKey.add(1);	//49
		answerKey.add(2);	//50
		answerKey.add(3);	//51
		answerKey.add(0);	//52
		answerKey.add(3);	//53
		answerKey.add(3);	//54
		answerKey.add(1);	//55
		answerKey.add(2);	//56
		answerKey.add(0);	//57
		answerKey.add(0);	//58
		answerKey.add(1);	//59
		answerKey.add(3);	//60
		answerKey.add(2);	//61
		answerKey.add(0);	//62
		answerKey.add(2);	//63
		answerKey.add(1);	//64
		answerKey.add(0);	//65
		answerKey.add(1);	//66
		answerKey.add(2);	//67
		answerKey.add(2);	//68
		answerKey.add(0);	//69
		answerKey.add(0);	//70
		answerKey.add(3);	//71
		answerKey.add(2);	//72
		answerKey.add(1);	//73
		answerKey.add(1);	//74
	
		takenNumbers.add(80); // just add trash number above 75 so takenNumbers is not null when used.
		
	}
	
	/**
	 * A getter method for a random question based on the questionType, questionCategory, and questionNumber.
	 * @param questionType The type of question (1 for theoretical and 2 for analytical).
	 * @param questionCategory The category of question for the analytical questions.
	 * @param questionNumber The number of the topic chosen.
	 * @return A random questions based on the 3 parameters.
	 */
	public ImageView getQuestion(int questionType, int questionCategory, int questionNumber) {
		
		boolean isTaken = true;
		
		if(questionType == 1) {
			while(isTaken) {
				if(questionNumber == 1) {
					random = (int)Math.floor(Math.random() * 5);		//Introduction to Programming Paradigms
				}else if(questionNumber == 2) {
					random = (int)Math.floor(Math.random() * (5) + 5);	//Procedural Programming
				}else if(questionNumber == 3) {
					random = (int)Math.floor(Math.random() * (5) + 10);	//Functional Programming
				}else if(questionNumber == 4) {
					random = (int)Math.floor(Math.random() * (5) + 15);	//Object-oriented Programming 
				}else if(questionNumber == 5) {
					random = (int)Math.floor(Math.random() * (5) + 20);	//Event-driven Programming
				}else if(questionNumber == 6) {
					random = (int)Math.floor(Math.random() * (5) + 25);	//Imperative vs Declarative Programming
				}else {
					random = (int)Math.floor(Math.random() * (5) + 30);	//Design Patterns
				}
				
				for(int num : takenNumbers) {
					if(num == random) {
						isTaken = true;
						break;
					}
					isTaken = false;
				}
			}
		}else {
			
			//random  = 47;
			//*
			while(isTaken) {
				if(questionNumber == 1 || questionNumber == 2) {
					if(questionCategory == 1) {
						random = (int)Math.floor(Math.random() * 5  + 35);		//C 	Output choices
					}else if(questionCategory == 2) {
						random = (int)Math.floor(Math.random() * 4  + 40);		//C 	Code snippet choices
					}else {
						random = (int)Math.floor(Math.random() * 4  + 44);		//C 	Missing code snippet choices
					}
				}else if(questionNumber == 3 || questionNumber == 4) {
					if(questionCategory == 1) {
						random = (int)Math.floor(Math.random() * 4  + 48);		//Java 	Output choices
					}else if(questionCategory == 2) {
						random = (int)Math.floor(Math.random() * 5  + 52);		//Java 	Code snippet choices
					}else {
						random = (int)Math.floor(Math.random() * 4  + 57);		//Java	Missing code snippet choices
					}
				}else if(questionNumber == 5 || questionNumber == 6) {
					if(questionCategory == 1) {
						random = (int)Math.floor(Math.random() * 2  + 61);		//JavaScript Output choices
					}else if(questionCategory == 2) {
						random = (int)Math.floor(Math.random() * 3  + 63);		//JavaScript Code snippet choices
					}else {
						random = (int)Math.floor(Math.random() * 3  + 66);		//JavaScript Missing code snippet choices
					}
				}else {
					if(questionCategory == 1) {
						random = (int)Math.floor(Math.random() * 2  + 69);		//Python Output choices
					}else if(questionCategory == 2) {
						random = (int)Math.floor(Math.random() * 2  + 71);		//Python Code snippet choices
					}else {
						random = (int)Math.floor(Math.random() * 2  + 73);		//Python Missing code snippet choices
					}
				}
				
				for(int num : takenNumbers) {
					if(num == random) {
						isTaken = true;
						break;
					}
					isTaken = false;
				}
			}
			//*/
		}
	
		takenNumbers.add(random);
		
		return questions.get(random);
	}
	
	/**
	 * Gives the choices of the current theoretical question.
	 * @param index The index of the choice.
	 * @return The choice of the current theoretical questions based on the index.
	 */
	public Background getTheoreticalChoices(int index){
		
		//System.out.println(random + "  --  " + answerKey.get(random));
		return questionsChoices.get((random * 4) + index);	
	}
	
	/**
	 * Gives the correct form of the correct choice of the current theoretical question.
	 * @param index The index of the correct choice.
	 * @return The correct form of the correct choice of the current theoretical questions based on the index.
	 */
	public Background getTheoreticalChoicesReveal(int index) {
		//System.out.println(random + "  --  " + answerKey.get(random));
		return questionsChoicesReveal.get((random * 4) + index);	
	}
	
	/**
	 * Gives the choices of the current analytical question.
	 * @param index The index of the choice.
	 * @return The choice of the current analytical questions based on the index.
	 */
	public ImageView getAnalyticalChoices(int index){
		
		System.out.println(random + "  --  " + answerKey.get(random));
		return analyticalQuestionsChoices.get(((random * 4) - 140) + index);	
	}
	
	
	/**
	 * A getter method for the output questions in the 3rd category of analytical question.
	 * @return The output Image.
	 */
	public ImageView getAnalyticalOutput() {
		
		if(random == 44) {
			return analyticalOutput.get(0);
		}else if(random == 45) {
			return analyticalOutput.get(1);
		}else if(random == 46) {
			return analyticalOutput.get(2);
		}else if(random == 47) {
			return analyticalOutput.get(3);
		}else if(random == 57) {
			return analyticalOutput.get(4);
		}else if(random == 58) {
			return analyticalOutput.get(5);
		}else if(random == 59) {
			return analyticalOutput.get(6);
		}else if(random == 60) {
			return analyticalOutput.get(7);
		}else if(random == 66) {
			return analyticalOutput.get(8);
		}else if(random == 67) {
			return analyticalOutput.get(9);
		}else if(random == 68) {
			return analyticalOutput.get(10);
		}else if(random == 73) {
			return analyticalOutput.get(11);
		}else {
			return analyticalOutput.get(12);
		}

	}
	
	/**
	 * A getter method for the answer of the current question.
	 * @return the index of the correct choice of the current question.
	 */
	public int getAnswer() {

		return answerKey.get(random);
	}

}
