import java.io.File;
import java.util.ArrayList;

import javafx.scene.media.AudioClip;

/**
 * The class that handles the music of the game.
 * @see Main
 */
public class Music {

	boolean isMusicOn = true;
	boolean isAudioOn = true;
	
	AudioClip gameplayBG;			//Background music
	AudioClip mainMenuBG;
	
	AudioClip letterReceived;		//Intro effects
	AudioClip letterAcceptance;
	AudioClip thunder;
	AudioClip mumble;
	AudioClip enter;
	AudioClip play;
	
	
	AudioClip click;				//Gameplay
	AudioClip correct;	
	AudioClip wrong;	
	
	AudioClip graceBubble;			//Saving grace
	AudioClip classmateSelected;
	AudioClip extraChance;
	AudioClip loadingSearch;
	
	
	AudioClip success;				//Result
	AudioClip fail;

	/**
	 * This constructor initializes the audio clips.
	 */
	public Music() {
		
		ArrayList<String> songs = new ArrayList<String>();
		
		songs.add("music/gameplayBG.mp3");								//0
		songs.add("music/mainMenuBG.mp3");								//1
		songs.add("music/receivedEmailEffect.mp3");						//2
		songs.add("music/LetterAcceptanceEffect.mp3");					//3
		songs.add("music/thunderEffect.mp3");							//4
		songs.add("music/mumbleEffect.mp3");							//5
		songs.add("music/EnterEffect.mp3");								//6
		songs.add("music/PlayEffect.mp3");								//7
		songs.add("music/ClickEffect.mp3");								//8
		songs.add("music/correct.wav");									//9
		songs.add("music/wrong.wav");									//10
		songs.add("music/bubble.mp3");									//11
		songs.add("music/ClassmateSelectedEffect.mp3");					//12
		songs.add("music/ExtraChanceEffect.mp3");						//13
		songs.add("music/LoadingSearchEffect.mp3");						//14
		songs.add("music/CongratulationsEffect.mp3");					//15
		songs.add("music/PlayerFailedEffect.mp3");						//16
		

		gameplayBG = new AudioClip(new File(songs.get(0)).toURI().toString());	
		mainMenuBG = new AudioClip(new File(songs.get(1)).toURI().toString());	
		
		gameplayBG.setVolume(.1);
		gameplayBG.setCycleCount(20);
		mainMenuBG.setVolume(.1);
		mainMenuBG.setCycleCount(20);
		
		
		letterReceived = new AudioClip(new File(songs.get(2)).toURI().toString());
		letterAcceptance = new AudioClip(new File(songs.get(3)).toURI().toString());
		thunder = new AudioClip(new File(songs.get(4)).toURI().toString());
		mumble = new AudioClip(new File(songs.get(5)).toURI().toString());	
		enter = new AudioClip(new File(songs.get(6)).toURI().toString());
		play = new AudioClip(new File(songs.get(7)).toURI().toString());
		
		click = new AudioClip(new File(songs.get(8)).toURI().toString());
		correct = new AudioClip(new File(songs.get(9)).toURI().toString());
		wrong = new AudioClip(new File(songs.get(10)).toURI().toString());
		
		graceBubble = new AudioClip(new File(songs.get(11)).toURI().toString());
		classmateSelected = new AudioClip(new File(songs.get(12)).toURI().toString());
		extraChance = new AudioClip(new File(songs.get(13)).toURI().toString());
		loadingSearch = new AudioClip(new File(songs.get(14)).toURI().toString());
		
		success = new AudioClip(new File(songs.get(15)).toURI().toString());
		fail = new AudioClip(new File(songs.get(16)).toURI().toString());
		
		
	}

	/**
	 * plays the gameplay background music.
	 */
	public void playGameplayBG() {
		if(isMusicOn) {
			gameplayBG.play();
		}
	}
	
	/**
	 * Stop playing the gameplay background music.
	 */
	public void stopGameplayBG() {
		gameplayBG.stop();
	}
	
	/**
	 * plays the main menu background music.
	 */
	public void playMainMenuBG() {
		if(isMusicOn) {
			mainMenuBG.play();
		}
	}
	
	/**
	 * Stop playing the main menu background music.
	 */
	public void stopMainMenuBG() {
		mainMenuBG.stop();
	}
	
	/**
	 * plays the letter received sound effect.
	 */
	public void playLetterReceived() {
		letterReceived.play();
	}
	
	/**
	 * Stop playing the letter received sound effect.
	 */
	public void stopLetterReceived() {
		letterReceived.stop();
	}
	
	/**
	 * plays the letter acceptance sound effect.
	 */
	public void playLetterAcceptance() {
		letterAcceptance.play();
	}
	
	/**
	 * Stop playing the letter acceptance sound effect.
	 */
	public void stopLetterAcceptance() {
		letterAcceptance.stop();
	}
	
	/**
	 * plays the thunder sound effect.
	 */
	public void playThunder() {
		thunder.play();
	}
	
	/**
	 * Stop playing the thunder sound effect.
	 */
	public void stopThunder() {
		thunder.stop();
	}

	/**
	 * plays the mumble sound effect.
	 */
	public void playMumble() {
		mumble.play();
	}
	
	/**
	 * Stop playing the mumble sound effect.
	 */
	public void stopMumble() {
		mumble.stop();
	}

	/**
	 * plays the Enter sound effect.
	 */
	public void playEnter() {
		enter.play();
	}
	
	/**
	 * Stop playing the Enter sound effect.
	 */
	public void stopEnter() {
		enter.stop();
	}
	
	/**
	 * plays the Play sound effect.
	 */
	public void playPlay() {
		play.play();
	}
	
	/**
	 * Stop playing the Play sound effect.
	 */
	public void stopPlay() {
		play.stop();
	}
	
	/**
	 * plays the Click sound effect.
	 */
	public void playClick() {
		if(isAudioOn) {
			click.play();
		}
	}
	
	/**
	 * Stop playing the Click sound effect.
	 */
	public void stopClick() {
		click.stop();
	}
	
	/**
	 * plays the correct sound effect.
	 */
	public void playCorrect() {
		if(isAudioOn) {
			correct.play();
		}
	}
	
	/**
	 * Stop playing the correct sound effect.
	 */
	public void stopCorrect() {
		correct.stop();
	}
	
	/**
	 * plays the wrong sound effect.
	 */
	public void playWrong() {
		if(isAudioOn) {
			wrong.play();
		}
	}
	
	/**
	 * Stop playing the wrong sound effect.
	 */
	public void stopWrong() {
		wrong.stop();
	}
	
	/**
	 * plays the graceBubble sound effect.
	 */
	public void playGraceBubble() {
		if(isAudioOn) {
			graceBubble.play();
		}
	}
	
	/**
	 * Stop playing the graceBubble sound effect.
	 */
	public void stopGraceBubble() {
		graceBubble.stop();
	}
	
	/**
	 * plays the classmate selected sound effect.
	 */
	public void playClassmateSelected() {
		if(isAudioOn) {
			classmateSelected.play();
		}
	}
	
	/**
	 * Stop playing the classmate selected sound effect.
	 */
	public void stopClassmateSelected() {
		classmateSelected.stop();
	}

	/**
	 * plays the Extra Chance sound effect.
	 */
	public void playExtraChance() {
		if(isAudioOn) {
			extraChance.play();
		}
	}
	
	/**
	 * Stop playing the Extra Chance sound effect.
	 */
	public void stopExtraChance() {
		extraChance.stop();
	}

	/**
	 * plays the loading search sound effect.
	 */
	public void playLoadingSearch() {
		if(isAudioOn) {
			loadingSearch.play();
		}
	}
	
	/**
	 * Stop playing the loading search sound effect.
	 */
	public void stopLoadingSearch() {
		loadingSearch.stop();
	}
	
	/**
	 * plays the success sound effect.
	 */
	public void playSuccess() {
		if(isMusicOn) {
			success.play();
		}
	}
	
	/**
	 * Stop playing the success sound effect.
	 */
	public void stopSuccess() {
		success.stop();
	}
	
	/**
	 * plays the fail sound effect.
	 */
	public void playFail() {
		if(isMusicOn) {
			fail.play();
		}
	}
	
	/**
	 * Stop playing the fail sound effect.
	 */
	public void stopFail() {
		fail.stop();
	}

	/**
	 * Toggles the music off if the music is on.
	 * Toggles the music on if the music is off.
	 */
	public void toggleMusic() {
		if(isMusicOn) {
			isMusicOn = false;
		}else {
			isMusicOn = true;
		}
	}
	
	/**
	 * Toggles the audio off if the music is on.
	 * Toggles the audio on if the music is off.
	 */
	public void toggleAudio() {
		if(isAudioOn) {
			isAudioOn = false;
		}else {
			isAudioOn = true;
		}
	}
	
	/**
	 * A getter method for the current state of music.
	 * @return isMusicOn
	 */
	public Boolean getMusic() {
		return isMusicOn;
	}
	
	/**
	 * A getter method for the current state of audio.
	 * @return isAudioOn
	 */
	public Boolean getAudio() {
		return isAudioOn;
	}
	
}
