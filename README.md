# CS-University
CS-University is a game variant of "Are You Smarter than a 5th Grader?". The game can be downloaded with the link below.

**Download Link:** https://drive.google.com/drive/folders/1ZL5GNWa0ogSdRSu06qdI0Dt1I2N72-Ps?usp=sharing

There are 2 folders in the drive 
If you don't have a JRE on your computer you need to download the Executable Game folder, otherwise, you can download the source code folder. 
<br><br>
# 1. Executable Game Folder instructions

## Running Executable Jar in Command Prompt:

  1. In your directory where the executable jar is located, type "cmd" in the address bar and press ENTER to open the command prompt directed to the folder.
  
  2. Then, type the following command in the cmd to run the jar file.
  
    java --module-path "javaFX\lib" --add-modules javafx.controls,javafx.fxml,javafx.media  -jar CSUniversity.jar
  
  _Note: CSUniversity.jar is the file name of the jar file._

## Running the app using the stand alone exe file:

  1. Double-click on the CSUniversity.exe application.

<br><br>
# 2. Source Code Folder instructions

## Compiling/Execution of Source code in command prompt:

  1. Navigate to the Group5_SourceCode, type "cmd" in the address bar and press ENTER to open the command prompt directed to the folder.
  
  2. Then, type the following command in the cmd to compile the source code. 
  
    javac --module-path "javaFX\lib" --add-modules javafx.controls,javafx.fxml,javafx.media src/*.java -d 
   
  3. Next, type the following command in the cmd to run the program.

    java --module-path "javaFX\lib" --add-modules javafx.controls,javafx.fxml,javafx.media -cp classes Main
