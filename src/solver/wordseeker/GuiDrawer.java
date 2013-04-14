package solver.wordseeker;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import api.LegendsDarkApi_New.*;

public class GuiDrawer extends WordseekerSolver {
	/*
	 * in deze class file staan alle functies die frames maken en invullen
	 * menu bars staan in de class MenuBar
	 */
	void DrawGUI1(){		//maakt het eerste startup schermpje
		
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
		startupScreen.get().setResizable(false);
		startupScreen.revalidate();
		startupScreen.get().pack();
		startupScreen.setVisable(true);
	}
	
	void DrawGUI2(){		//maakt een klein onzichtbaar scherm tijdens opstarten voor het later maken van GUI3
		l.frameTeller = 1;
		l.panelTeller = 1;
		l.Frame(1,1,"WordSeeker Solver");
		l.frame[1].setVisible(false);
		l.panel[1].setBackground(backgroundColor);
	}
	
	void DrawGUI3(int letterHoogte, int letterBreedte){		//maakt het 2de scherm met alle hokjes
		l.textfieldTeller = 1;
		l.labelTeller = 1;
		l.frameTeller = 1;
		l.buttonTeller = 1;
		frameHoogte = letterHoogte * 50 + (letterHoogte *10) + 600;
		frameBreedte = letterBreedte * 50 + (letterBreedte *10) + 400;
		letterAantal = letterHoogte * letterBreedte;
		l.frame[1].setVisible(true);
		l.frame[1].setSize(frameBreedte, frameHoogte);
		bar.MainScherm();
		
		teller1 = 1;
		while(teller1 <= letterHoogte){
			teller2 = 1;
			while(teller2 <= letterBreedte){
				letterVeld[teller1][teller2] = new JTextField("");
				letterVeld[teller1][teller2].setVisible(true);
				letterVeld[teller1][teller2].setPreferredSize(new Dimension(50, 50));
				l.Gridbag(teller1, teller2, 1, 1, 1);
				l.panel[1].add(letterVeld[teller1][teller2], l.gridBag[l.gridbagTeller]);
				letterVeld[teller1][teller2].setFont(font);
				letterVeld[teller1][teller2].setBackground(textfieldColor);
				letterVeld[teller1][teller2].setBorder(emptyBorder);
				letterVeld[teller1][teller2].setForeground(textColor);
				letterVeld[teller1][teller2].addKeyListener(keyHandler2);
				teller3++;
				teller2++;
				l.frame[1].revalidate();
			}
			teller1++;
		}
		l.Label(20, (50*letterBreedte + 2*letterBreedte -2), 1, letterBreedte+1, 0, (teller1), "Dit woord zoek ik:", 1);
		l.Textfield(50, (50*letterBreedte + 2*letterBreedte -2), 1, letterBreedte+1, 0, (teller1+1), "", 1);
		l.Button(50, (50*letterBreedte + 2*letterBreedte -2), 1, letterBreedte+1, 0, (teller1+2), "Zoek woord!", 1);
		
		l.button[1].setBackground(buttonColor);
		l.button[1].setBorder(emptyBorder);
		l.button[1].setForeground(textColor);
		
		
		l.label[1].setForeground(textColor);
		l.textfield[1].setBackground(textfieldColor);
		l.textfield[1].setBorder(emptyBorder);
		l.textfield[1].setForeground(textColor);
		l.textfield[1].addKeyListener(keyHandler2);		

		l.button[1].addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {
				if(checker.CheckIfValidAlleHokjes() == true){
					if(l.radiobuttonmenuitem[0].isSelected()){
						function.ClearColor();
						//zoeker.zoekAlleWoorden();
						function.Message("Sorry", "Dit deel is nog onder consturctie.");
					}
					else{
						function.ClearColor();
						zoeker.ZoekWoord(l.textfield[1].getText());
					}
					
				}else{}
		}});
		
		l.frame[1].revalidate();
        l.frame[1].setResizable(false);
        l.frame[1].setLocationRelativeTo(null);
        l.frame[1].pack();
        
        letterVeld[1][1].requestFocus();
	}

	void About(){		//maakt het About schermpje
		System.out.println("=====================");
		l.frameTeller = 2;
		l.panelTeller = 2;
		l.labelTeller = 3;
		l.Frame(120, 250, "About");
		l.frame[2].setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		l.Label(5, 180, 1, 1, 1, 0, "", 2);
		l.Label(10, 180, 1, 1, 1, 1, "WordSeeker Solver", 2);
		l.Label(5, 180, 1, 1, 1, 2, "", 2);
		l.Label(10, 180, 1, 1, 1, 3, "Versie 2.0", 2);
		l.Label(5, 180, 1, 1, 1, 4, "", 2);
		l.Label(20, 180, 1, 1, 1, 5, "Made By MrNapolion", 2);

		l.frame[2].pack();
		System.out.println("=====================");
		teller1= 3;
		while(teller1 < 9){
			l.label[teller1].setForeground(textColor);
			teller1++;
		}
		l.panel[2].setBackground(backgroundColor);
	}
	
	String GetOpenPath(){		//maakt het fileChooser schermpje,  voor het openen
		filechooser = new JFileChooser();
		filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		filechooser.setFileFilter(filefilter);
		filechooser.setApproveButtonToolTipText("Open");
		returnErrorNR = filechooser.showOpenDialog(null);
		if(returnErrorNR == 0){
			return filechooser.getSelectedFile().getAbsolutePath();
		}
		else{return "";}
	}
	
	String GetSafePath(){
		if(!checker.CheckIfValidAlleHokjes()){
			return null;
		}
		
		filechooser = new JFileChooser();
		filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		filechooser.setFileFilter(filefilter);
		filechooser.setDialogType(JFileChooser.SAVE_DIALOG);
		returnErrorNR = filechooser.showSaveDialog(null);
		if(returnErrorNR == 0){
			return fileOutString = filechooser.getSelectedFile().getAbsolutePath();
		}
		return null;
	}
	
	void Outputscherm(){
		l.frameTeller = 10;
		l.panelTeller = 10;
		l.labelTeller = 10;
		l.textareaTeller = 10;
		
		l.Frame(500, 300, "Gevonden Woorden");
		l.Label(400, 250, 1, 1, 1, 1, "Dit zijn de gevonden woorden:", 10);
		l.TextArea(480, 250, 1, 1, 1, 2, "", 10);
		
		l.frame[10].setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		scrollPane = new JScrollPane(l.textarea[10]); 
		
		l.textarea[10].add(scrollPane);
		l.textarea[10].setEditable(false);
	}
	
	void OutputschermAdd(String txt){
		l.textarea[10].setText(l.textarea[10].getText() + " \n " + txt);
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
	  } 
	  catch (IOException ex) {
		System.out.println(ex);
	  }
	  	System.exit(0);
	}
}
