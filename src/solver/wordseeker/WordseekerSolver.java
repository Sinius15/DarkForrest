package solver.wordseeker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.RenderingHints.Key;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.filechooser.FileFilter;
import api.LegendsDarkApi;

public class WordseekerSolver {

	public static JTextField[][] letterVeld = new JTextField[22][22];		//horizontaal en verticaal

	public static Font font = new Font("verdana", Font.BOLD, 25);	//het lettertype van alle dingen enzo
	public static int letterHoogte = 0;									//hoeveel letters er in de hoogte zijn
	public static int letterBreedte = 0;								//hoeveel letters er in de breedte zijn
	public static int letterAantal = 0;									//hoeveel letters er zijn     is dus letterbreedte * letterhoogte
	public static int frameHoogte = 0;									//de hoogte van het 2de frame    wordt aangepast aan input van gebruiker
	public static int frameBreedte = 0;									//de hoogte van het 1de frame	 wordt aangepast aan input van gebruiker
	public static int teller1;											//	  \/
	public static int teller2;											//    \/
	public static int teller3 = 1;										//een tijdelijke int onthouder voor loops enzo
	public static int teller5;											//hele tijdelijke functie, kan je altijd overschijven
	public static int gezochtWoordVlakNR;								//welk arraynummer het zoekvlak zit
	public static int lengteGezochtWoordTeller1;						//hoevaak hij een get ding moet doen om een teVergelijkenWoord te maken
	public static int lengteGezochtWoordTeller2;						// voor het inkleuren van de hokjes, hoeveel hij dan moet kleuren.
	public static int inWelkHokjeIkBen;									// als loop nummer voor de zoeker om te kijken in welk hokje hij is om te controleren
	public static int inWelkHokjeIkBenMetGet;							//inwelkhokje ik ben met getfuncties,  is nodig om meerdere keren een getfunctie boven op elkaar te doen
	public static int inWelkHokjeIkBenMetGetArray[] = new int[100];     //slaat op welke hokjes zijn gebruikt om het te vergelijken woord te maken.
	public static int inWelkHokjeIkBenMetGetArrayTeller;				//om te kijken wel getal te gebruiken in "inWelkHokjeIkBenMetGetArray[]"
	public static int lengteGezochtWoord;								//lengte van het woord wat gezocht moet worden
	public static int welkeKantOp;										//welke kan hij aan het zoeken is.  kan 1-9 zijn,   1 is omhoog, 2 rechtsboven, 3rechts enzovoort
	public static int returnErrorNR;									//geeft aan of het ophalen van de file gelukt is  0=ja  1=nee		//----------KAN DIT GEEN BOOLEAN WORDEN< TODO
	public static char randomChar;										//gebruikt om een random char te maken, in combinatie met int random
	public static Random random;										//random functie
	public static File configPath = new File(System.getProperty("user.dir") + "\\Config.ini");
	public static Key key;
	JScrollPane scrollPane;
	
	public static Scanner scanner;										//gewoon een scanner voor inlezen fan files
	public static String patternLetter = "[a-zA-Z]*";					//letter pattern   	voor h3t testen of iets een letter is
	public static String patternNumber = "[0-9]*";						//cijfer pattern	voor h3t testen of iets een cijfer is
	public static String teVergelijkenWoord;							//het woord dat vergeleken gaat worden met gezochtWoord
	public static String gezochtWoord;									//het woord dat gezocht wordt
	public static String InportFile[][] = new String[500][100000];		//worden bestanden in opgeslagen, het eerste cijfer is de naam, het 2de is het hoeveelheids cijfer,  naam0 = config; naam1=woordenboek, naam2 = openWoordzoeker   
	public static String path;											//wordt gebruikt als Pad naar bestanden
	
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
	
	public static JFileChooser filechooser;								//deze alinea is voor het filechooser gebeuren.
	public static FileFilter filefilter ;
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
	public static BufferedWriter out;
	
	public static void main(String[] args) {
		l.Init();
		l.Frame(500, 500, "test");
		
		teller1 = 1;

		while(teller1 < 7){
		teller2 = 1;
			while(teller2<7){
				
				letterVeld[teller1][teller2] = new JTextField("hey");
				
				letterVeld[teller1][teller2].setPreferredSize(new Dimension(15, 15));
				l.Gridbag(teller1, teller2, 1, 1, 0);
				l.panel[0].add(letterVeld[teller1][teller2], l.gridBag[l.gridbagTeller]);
				l.frame[0].revalidate();
				teller2++;

			}
		teller1++;
		}

	}

}
