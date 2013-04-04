package solver.wordseeker;

import java.awt.*;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.border.Border;
import solver.wordseeker.KeyHandler.*;
import api.LegendsDarkApi;

public class WordseekerSolver {

	public static Font font = new Font("verdana", Font.BOLD, 25);	//het lettertype van alle dingen enzo
	public static int letterHoogte = 0;									//hoeveel letters er in de hoogte zijn
	public static int letterBreedte = 0;								//hoeveel letters er in de breedte zijn
	public static int letterAantal = 0;									//hoeveel letters er zijn     is dus letterbreedte * letterhoogte
	public static int frameHoogte = 0;									//de hoogte van het 2de frame    wordt aangepast aan input van gebruiker
	public static int frameBreedte = 0;									//de hoogte van het 1de frame	 wordt aangepast aan input van gebruiker
	public static int teller1;											
	public static int teller2;												
	public static int teller3 = 1;											
	public static int teller4;		
	public static int teller5;		
	public static int teller6;		
	public static int teller7;			
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
	public static Scanner scanner;										//gewoon een scanner voor inlezen fan files

	public static Zoeker zoeker = new Zoeker();							//deze alinia is voor het objectgeorienteerd programmeren, objecten
	public static GetLetter get = new GetLetter();						
	public static Checker checker = new Checker();					
	public static MiscFunction function = new MiscFunction();				
	public static GuiDrawer drawer = new GuiDrawer();					
	public static FileHandler file = new FileHandler();					
	public static MenuBar bar = new MenuBar();							
	public static Action action = new Action();
	public static Config config = new Config();
	public static LegendsDarkApi l = new LegendsDarkApi();
	public static KeyHandler_ScreenOne keyHandler1 = new KeyHandler_ScreenOne();
	public static KeyHandler_ScreenTwo keyHandler2 = new KeyHandler_ScreenTwo();
	public static SavingSystem savingSystem = new SavingSystem();
	
	public static JFileChooser filechooser;								//deze alinea is voor het filechooser gebeuren.
	public static javax.swing.filechooser.FileFilter filefilter ;
	public static String fileOutString;
	public static File fileOut;
	
	public static Color backgroundColor;								//alles in deze allinea is voor de config file
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
	public static JTextField[][] letterVeld = new JTextField[22][22];		//horizontaal en verticaal
	public static JScrollPane scrollPane;

	
	public static void main(String[] args) {
		l.frameMax = 10;
		l.labelMax = 10;
		l.buttonMax = 10;
		l.gridbagMax = 100;
		l.textfieldMax = 10;
		l.checkboxMax = 10;
		l.radiobuttonMax = 10;
		l.buttongroupMax = 10;
		l.passwordfieldMax = 10;
		l.progressbarMax = 10;
		l.textareaMax = 10;
		l.menubarMax = 10;
		l.menuMax = 10;
		l.menuitemMax = 10;
		l.checkboxmenuitemMax = 10;
		l.radiobuttonmenuitemMax = 10;
		
		l.textfieldTeller = 1;
		l.Init();
		
		if(config.Init() == false){
			config.Make();
			config.Init();
		}
		
		if(laadWoordenboek){
			file.Open("rec/woordenboek.txt", 1, true);
		}
		
		drawer.DrawGUI1();
		drawer.DrawGUI2();
		file.Open("res/woordenboek.txt", 1, true);

		l.button[0].addActionListener(action.Start());

	}
}
