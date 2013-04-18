package solver.wordseeker;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import solver.wordseeker.KeyHandler.WindowListner_aboutScreen;
import api.LButton;
import api.LFrame;
import api.LTextArea;
import api.LTextField;

public class GuiDrawer extends WordseekerSolver {
	/*
	 * in deze class file staan alle functies die frames maken en invullen
	 * menu bars staan in de class MenuBar
	 */
	void startupScreen(){		//maakt het eerste startup schermpje
		
		label1.setSize(200, 20);
		label1.setPlace(0, 0);
		label1.setText("De breede van mijn woordzoeker: ");
		label1.setForground(textColor);
		inputWidth.setPlace(1, 0);
		inputWidth.setSize(25, 20);
		inputWidth.setBackground(textfieldColor);
		inputWidth.setForground(textColor);
		inputWidth.get().setBorder(emptyBorder);
		label2.setSize(200, 20);
		label2.setPlace(0, 1);
		label2.setText("De hoogte van mijn woordzoeker: ");
		label2.setForground(textColor);
		inputHeight.setPlace(1, 1);
		inputHeight.setSize(25, 20);
		inputHeight.setBackground(textfieldColor);
		inputHeight.setForground(textColor);
		inputHeight.get().setBorder(emptyBorder);
		startupButton.setBackground(buttonColor);
		startupButton.setForground(textColor);
		startupButton.setText("Maak!");
		startupButton.get().setBorder(emptyBorder);
		startupButton.setSize(227, 20);
		startupButton.setPlace(0,2);
		startupButton.setGridSize(2, 1);
		startupButton.get().addActionListener(action.Start());
		
		startupScreen = new LFrame();
		startupScreen.setVisable(false);
		startupScreen.setBackground(backgroundColor);
		startupScreen.add(label1);
		startupScreen.add(inputWidth);
		startupScreen.add(label2);
		startupScreen.add(inputHeight);
		startupScreen.add(startupButton);
		
		startupScreen.setTitel("Wordseeker Solver");
		bar.StartupScherm();
		startupScreen.get().setResizable(false);
		startupScreen.revalidate();
		startupScreen.get().pack();
		startupScreen.setVisable(true);
		startupScreen.getPanel().addKeyListener(keyHandler1);
		inputWidth.get().addKeyListener(keyHandler1);
		inputHeight.get().addKeyListener(keyHandler1);
		
		inputWidth.get().requestFocus();
	}
	
	void MainScreen(int letterHoogte, int letterBreedte){		//maakt het 2de scherm met alle hokjes
		frameHoogte = letterHoogte * 50 + (letterHoogte *10) + 600;
		frameBreedte = letterBreedte * 50 + (letterBreedte *10) + 400;
		letterAantal = letterHoogte * letterBreedte;
		
		mainScreen = new LFrame();
		mainScreen.setVisable(false);
		mainScreen.setTitel("Wordseeker Solver");
		mainScreen.setSize(frameBreedte, frameHoogte);
		mainScreen.setBackground(backgroundColor);
		
		bar.MainScherm();
		
		teller1 = 1;
		while(teller1 <= letterBreedte){
			teller2 = 1;
			while(teller2 <= letterHoogte){
				letterVeld[teller1][teller2] = new LTextField();
				letterVeld[teller1][teller2].setSize(50,50);
				letterVeld[teller1][teller2].setPlace(teller1, teller2);
				mainScreen.add(letterVeld[teller1][teller2]);
				letterVeld[teller1][teller2].get().setFont(font);
				letterVeld[teller1][teller2].setBackground(textfieldColor);
				letterVeld[teller1][teller2].get().setBorder(emptyBorder);
				letterVeld[teller1][teller2].get().setForeground(textColor);
				letterVeld[teller1][teller2].get().addKeyListener(keyHandler2);
				teller3++;
				teller2++;
			}
			teller1++;
		}
		System.out.println(letterBreedte+1);
		label3.setPlace(0, letterHoogte+1);
		label3.setGridSize(letterBreedte+1, 1);
		label3.setSize(52*letterBreedte-2, 20);
		label3.setText("Dit woord zoek ik");
		label3.setForground(textColor);
		mainScreen.add(label3);
		
		inputWord.setPlace(0, letterHoogte+2);
		inputWord.setGridSize(letterBreedte+1, 1);
		inputWord.setSize(52*letterBreedte-2, 50);
		inputWord.setBackground(textfieldColor);
		inputWord.get().setBorder(emptyBorder);
		inputWord.get().setForeground(textColor);
		inputWord.get().addKeyListener(keyHandler2);
		mainScreen.add(inputWord);

		seekButton.setPlace(0, letterHoogte+3);
		seekButton.setGridSize(letterBreedte+1, 1);
		seekButton.setSize(52*letterBreedte-2, 50);
		seekButton.setText("Zoek!");
		seekButton.setBackground(buttonColor);
		seekButton.get().setBorder(emptyBorder);
		seekButton.get().setForeground(textColor);
		mainScreen.add(seekButton);
		
		
		
		seekButton.get().addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {
				if(checker.CheckIfValidAlleHokjes() == true){
					if(mainScreenRadioItem1.get().isSelected()){
						function.ClearColor();
						//zoeker.zoekAlleWoorden();
						function.Message("Sorry", "Dit deel is nog onder consturctie.");
					}
					else{
						function.ClearColor();
						zoeker.ZoekWoord(inputWord.getText());
					}
				}else{}
		}});
		
		mainScreen.revalidate();
		mainScreen.get().setResizable(false);
		mainScreen.get().setLocationRelativeTo(null);
		mainScreen.get().pack();
		mainScreen.setVisable(true);
        letterVeld[1][1].get().requestFocus();
        
        if(letterBreedte > 15 || letterHoogte > 15){
        	function.Message("", "Het kan zijn dat de woordzoeker niet goed wordt weergegeven, omdat u een te groote woordzoeker wil maken." + System.lineSeparator() + 
        						"Dit probleem is op dit moment nog niet oplosbaar, maar in een latere update kan dit probleem verholpen worden."+ System.lineSeparator() + 
        						"Sorry voor het ongemak.");
        }
	}
	
	void About(){		//maakt het About schermpje
		aboutIsOpen = true;
		aboutScreen = new LFrame();
		aboutScreen.setTitel("About");
		aboutScreen.get().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		aboutScreen.get().addWindowListener(new WindowListner_aboutScreen());
		aboutScreen.setBackground(backgroundColor);
		aboutScreen.get().setResizable(false);
		aboutScreen.setSize(500, 200);
		
		aboutText = new LTextArea();
		aboutText.setBackground(backgroundColor);
		aboutText.setForground(textColor);
		aboutText.setSize(aboutScreen.get().getWidth(), aboutScreen.get().getHeight());
		aboutText.get().setEditable(false);
		aboutText.setPlace(0,0);
		aboutText.getPlc().insets =  new Insets(5, 5, 0, 5);
		aboutText.setText("WordSeeker Solver v2.0");
		aboutText.addString("");
		aboutText.addString("WordSeeker Solver is freeware, feel free to use and distribute the program as long as");
		aboutText.addString("credit is given to the original makers and current owners.");
		aboutText.addString("");
		aboutText.addString("WordSeeker Solver is open source and is hosted on github:");
		aboutText.addString("https://github.com/TheBlackCrafter/DarkForrest_Beta_V2.0");
		aboutText.addString("Leave comments/suggestions on the github page shown above.");
		aboutText.addString("");
		aboutText.addString("Made by: Sijmen Huizenga");

		aboutStop = new LButton();
		aboutStop.setText("Ok");
		aboutStop.setBackground(buttonColor);
		aboutStop.setForground(textColor);
		aboutStop.get().setBorder(emptyBorder);
		aboutStop.setPlace(0, 1);
		aboutStop.getPlc().anchor = GridBagConstraints.SOUTHEAST;
		aboutStop.getPlc().insets =  new Insets(12, 5, 8, 8);
		aboutStop.setSize(125, 25);
		aboutStop.get().addActionListener(action.CloseAbout());
		
		aboutScreen.add(aboutStop);
		aboutScreen.add(aboutText);
		aboutScreen.get().pack();
	}
	
	String GetOpenPath(){		//maakt het fileChooser schermpje,  voor het openen
		filechooser = new JFileChooser();
		filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		filechooser.setFileFilter(filefilter);
		filechooser.setAcceptAllFileFilterUsed(false);
		filechooser.setApproveButtonToolTipText("Open");
		returnErrorNR = filechooser.showOpenDialog(null);
		if(returnErrorNR == 0){
			return filechooser.getSelectedFile().getAbsolutePath();
		}
		else{return "";}
	}
	
	String GetSafePath(){	//maakt het fileChooser schermpje voor het opslaan
		if(!checker.CheckIfValidAlleHokjes()){
			return null;
		}
		filechooser = new JFileChooser();
		filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		filechooser.setFileFilter(filefilter);
		filechooser.setAcceptAllFileFilterUsed(false);
		filechooser.setDialogType(JFileChooser.SAVE_DIALOG);
		returnErrorNR = filechooser.showSaveDialog(null);
		if(returnErrorNR == 0){
			return fileOutString = filechooser.getSelectedFile().getAbsolutePath();
		}
		return null;
	}
	
	void Restart() throws URISyntaxException		//deze functie is de enigge funcie die ik niet zelf heb geschreven, deze is ook onbegrijpelijk XD
	{
	  final String javaBin = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
	  final File currentJar = new File(WordseekerSolver.class.getProtectionDomain().getCodeSource().getLocation().toURI());

	  if(!currentJar.getName().endsWith(".jar")){
		  System.out.println("I am not a .jar    sorry!");
		  return;
	  }

	  final ArrayList<String> command = new ArrayList<String>();
	  command.add(javaBin);
	  command.add("-jar");
	  command.add(currentJar.getPath());

	  final ProcessBuilder builder = new ProcessBuilder(command);
	  try {
		builder.start();
	  }catch (IOException ex) {
		System.out.println(ex);
	  }
	  	System.exit(0);
	}
}
