package solver.wordseeker;

import java.awt.*;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import solver.wordseeker.KeyHandler.*;
import solver.wordseeker.Threading.*;
import api.*;

public class WordseekerSolver {

	public static Font font = new Font("verdana", Font.BOLD, 25);		//het lettertype van alle dingen enzo
	public static int letterHoogte = 0;									//hoeveel letters er in de hoogte zijn
	public static int letterBreedte = 0;								//hoeveel letters er in de breedte zijn
	public static int letterAantal = 0;									//hoeveel letters er zijn     is dus letterbreedte * letterhoogte
	public static int frameHoogte = 0;									//de hoogte van het 2de frame    wordt aangepast aan input van gebruiker
	public static int frameBreedte = 0;									//de hoogte van het 1de frame	 wordt aangepast aan input van gebruiker
	public static int teller1 = 1, teller2 = 1, teller3 = 1, teller4 = 1, teller5 = 1, teller6 = 1, teller7 = 1, teller8 = 1;
	public static int teller1X;
	public static int teller1Y;	
	public static int lengteGezochtWoord;								//lengte van het woord wat gezocht moet worden
	public static int welkeKantOp;										//welke kan hij aan het zoeken is.  kan 1-9 zijn,   1 is omhoog, 2 rechtsboven, 3rechts enzovoort
	public static int returnErrorNR;									//geeft aan of het ophalen van de file gelukt is  0=ja  1=nee	dit kan geen boolean worden
	public static int lengteWoordDatJeZoekt;
	
	public static String patternLetter = "[a-zA-Z]*";					//letter pattern   	voor h3t testen of iets een letter is
	public static String patternNumber = "[0-9]*";						//cijfer pattern	voor h3t testen of iets een cijfer is
	public static String teVergelijkenWoord;							//het woord dat vergeleken gaat worden met gezochtWoord
	public static String gezochtWoord;									//het woord dat gezocht wordt(wordt alleen gebruikt int checker)
	public static String InportFile[][] = new String[10][100000];		//worden bestanden in opgeslagen, het eerste cijfer is de naam, het 2de is het hoeveelheids cijfer,  naam0 = config; naam1=woordenboek, naam2 = openWoordzoeker   
	public static String path;											//wordt gebruikt als Pad naar bestanden

	public static char randomChar;										//gebruikt om een random char te maken, in combinatie met int random
	public static Random random;										//random functie
	public static File configPath = new File(System.getProperty("user.dir") + "\\Config.ini");
	public static boolean welkeCoordsHebIkNetBekeken[][] = new boolean[22][22];
	public static Scanner scanner;										//gewoon een scanner voor inlezen van files

	//deze alinia is voor het objectgeorienteerd programmeren, objecten
	public static Zoeker zoeker = new Zoeker();
	public static GetLetter get = new GetLetter();
	public static Checker checker = new Checker();
	public static MiscFunction function = new MiscFunction();
	public static GuiDrawer draw = new GuiDrawer();
	public static FileHandler file = new FileHandler();
	public static MenuBar bar = new MenuBar();
	public static Action action = new Action();
	public static Config config = new Config();
	public static KeyHandler_ScreenOne keyHandler1 = new KeyHandler_ScreenOne();
	public static KeyHandler_ScreenTwo keyHandler2 = new KeyHandler_ScreenTwo();
	public static SavingSystem savingSystem = new SavingSystem();
	public static Thread_0 thread0 = new Thread_0();								//de main thread die alles doet behalve als het door iets anders wordt gedaan XD
	public static Thread_1 thread1 = new Thread_1();								//zorgt voor het laden van het woordenboek. opstarten hoeft niet te wachten op woordenboek dus sneller :D
	public static Thread_Zoeker threadZoeker = new Thread_Zoeker();					//zorgt voor het zoek gebeuren, moet 8 keer aangeroepen worden
	
	public static JFileChooser filechooser;											//deze alinea is voor het filechooser gebeuren.
	public static FileNameExtensionFilter filefilter = new FileNameExtensionFilter("wordseeker files", "woordzoeker") ;
	public static String fileOutString;
	public static File fileOut;

	public static Color backgroundColor;											//alles in deze allinea is voor de config file
	public static Color textfieldColor;
	public static Color buttonColor;
	public static Color output1Color;
	public static Color output2Color;
	public static Color menubarColor;
	public static Color textColor;
	public static Border emptyBorder;
	public static Font font1;
	public static Font font2;
	public static boolean zoekHorizontaal = true;
	public static boolean zoekVerticaal = true;
	public static boolean zoekDiagonaal = true;
	public static boolean laadWoordenboek = true;
	public static BufferedWriter out;

	/*hieronder alles voor GUI layout*/
	public static LFrame startupScreen;							  ///////////////
	public static LButton startupButton = new LButton();			//
	public static LTextField inputHeight = new LTextField();		//	
	public static LTextField inputWidth = new LTextField();			//	
	public static LLabel label1 = new LLabel();						//
	public static LLabel label2 = new LLabel();					  	//	dit is allemaal voor 
	public static LMenuBar startupScreenBar = new LMenuBar();		//	het eerste schermpje
	public static LMenu startupScreenMenu1;							//
	public static LMenu startupScreenMenu2;							//
	public static LMenuItem startupScreenItem1;						//
	public static LMenuItem startupScreenItem2;						//
	public static LMenuItem startupScreenItem3;					  ////////////////////
	
	public static LFrame mainScreen;								//////////////////////////
	public static LTextField[][] letterVeld = new LTextField[22][22];//	letterVeld[horizontaal][verticaal]
	public static LButton seekButton = new LButton();				//
	public static LTextField inputWord = new LTextField();			//
	public static LLabel label3 = new LLabel();						//
	public static LMenuBar mainScreenBar = new LMenuBar();		  	//
	public static LMenu mainScreenMenu1;							//
	public static LMenu mainScreenMenu2;							//	dit is allemaal voor
	public static LMenu mainScreenMenu3;							//	het grote MainScreen
	public static LMenuItem mainScreenItem1;						//
	public static LMenuItem mainScreenItem2;						//
	public static LMenuItem mainScreenItem3;						//
	public static LMenuItem mainScreenItem4;						//
	public static LMenuItem mainScreenItem5;						//
	public static LMenuItem mainScreenItem6;						//
	public static LRadioButtonMenuItem mainScreenRadioItem1;		//
	public static LRadioButtonMenuItem mainScreenRadioItem2;		//
	public static LCheckBoxMenuItem mainScreenCheckItem1;			//
	public static LCheckBoxMenuItem mainScreenCheckItem2;			//
	public static LCheckBoxMenuItem mainScreenCheckItem3;			//
	public static LButtonGroup buttongroup;						  ///////////////////////
	
	public static LFrame aboutScreen;
	public static LTextArea aboutText;
	public static LButton aboutStop;
	public static boolean aboutIsOpen = false;
	
	public static void main(String[] args){
		thread0.Start();
		thread1.Start();
	}

	public static void mainProgram() {
		if(config.Init() == false){
			file.Copy(new File("res/Config.ini"), configPath);
			config.Init();
		}
		
		draw.startupScreen();
	}

}
