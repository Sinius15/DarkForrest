package solver.wordseeker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class GuiDrawer extends WordseekerSolver {
	/*
	 * in deze class file staan alle functies die frames maken en invullen
	 * menu bars staan in de class MenuBar
	 */
	void DrawGUI1(){		//maakt het eerste startup schermpje
		l.Frame(150,200,"Grootte?");
		l.Label(20, 200, 1, 1, 0, 1, "De breedte van mijn woordzoeker:", 0);
		l.Textfield(20, 30, 1, 1, 1, 1, "", 0);
		l.Label(20,200, 1, 1, 0, 2, "De hoogte van mijn woordzoeker:", 0);
		l.Textfield(20, 30, 1, 1, 1, 2, "", 0);
		l.Button(20, 232, 1, 2, 0, 3, "Maak!", 0);
		
		l.panel[0].setBackground(backgroundColor);
		l.button[0].setBackground(buttonColor);
		l.button[0].setForeground(textColor);
		l.button[0].setBorder(emptyBorder);
		l.textfield[1].setForeground(textColor);
		l.textfield[2].setForeground(textColor);
		
		l.textfield[1].setBackground(textfieldColor);
		l.textfield[2].setBackground(textfieldColor);
		
		l.textfield[1].setBorder(emptyBorder);
		l.textfield[2].setBorder(emptyBorder);
		
		l.label[0].setForeground(textColor);
		l.label[1].setForeground(textColor);
		
		bar.StartupScherm();
		l.frame[0].setResizable(false);
		l.frame[0].pack();
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
		frameHoogte = letterHoogte * 50 + (letterHoogte *10) + 600;
		frameBreedte = letterBreedte * 50 + (letterBreedte *10) + 400;
		letterAantal = letterHoogte * letterBreedte;
		l.frame[1].setVisible(true);
		l.frame[1].setSize(frameBreedte, frameHoogte);
		
		teller1 = 0;
		while(teller1 < letterHoogte){
			teller2 = 0;
			while(teller2 < letterBreedte){
				l.Textfield(50, 50, 1, 1, teller2, teller1, "", 1);
				
				
				
				
				
				
				
				
				l.textfield[teller3].setFont(font);
				l.textfield[teller3].setBackground(textfieldColor);
				l.textfield[teller3].setBorder(emptyBorder);
				l.textfield[teller3].setForeground(textColor);
				teller3++;
				teller2++;
			}
			teller1++;
		}
		l.Label(20, (50*letterBreedte + 2*letterBreedte -2), 1, letterBreedte, 0, (teller1), "Dit woord zoek ik:", 1);
		l.Textfield(50, (50*letterBreedte + 2*letterBreedte -2), 1, letterBreedte, 0, (teller1+1), "", 1);
		l.Button(50, (50*letterBreedte + 2*letterBreedte -2), 1, letterBreedte, 0, (teller1+2), "Zoek woord!", 1);
		l.button[1].setBackground(buttonColor);
		l.button[1].setBorder(emptyBorder);
		l.button[1].setForeground(textColor);
		
		
		l.label[1].setForeground(textColor);
		l.textfield[teller3].setBackground(textfieldColor);
		l.textfield[teller3].setBorder(emptyBorder);
		l.textfield[teller3].setForeground(textColor);
		bar.MainScherm();

		l.button[1].addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {
				if(checker.CheckIfValidAlleHokjes() == true){
					if(l.radiobuttonmenuitem[0].isSelected()){
						function.ClearColor(letterAantal);
						zoeker.zoekAlleWoorden();
					}
					else{
						function.ClearColor(letterAantal);
						zoeker.ZoekWoord(l.textfield[(letterAantal+1)].getText());
					}
					
				}else{}
		}});
		
		l.frame[1].revalidate();
        l.frame[1].setResizable(false);
        l.frame[1].pack();
        l.frame[1].setLocationRelativeTo(null);
        
	}

	void DrawGUI4(){		//maakt het About schermpje
		System.out.println("=====================");
		l.frameTeller = 2;
		l.panelTeller = 2;
		l.labelTeller = 3;
		l.Frame(120, 250, "About");
		l.frame[2].setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		l.Label(5, 180, 1, 1, 1, 0, "", 2);
		l.Label(10, 180, 1, 1, 1, 1, "WordSeeker Solver", 2);
		l.Label(5, 180, 1, 1, 1, 2, "", 2);
		l.Label(10, 180, 1, 1, 1, 3, "Versie 1.0", 2);
		l.Label(5, 180, 1, 1, 1, 4, "", 2);
		l.Label(20, 180, 1, 1, 1, 5, "Made By MrNapolion", 2);

		l.frame[2].pack();
		System.out.println("=====================");
		teller1= 3;
		while(teller1 < 9){
			l.label[teller1].setForeground(textColor);
			System.out.println("Color set");
			teller1++;
		}
		l.panel[2].setBackground(backgroundColor);
		
		
		
	}
	
	String DrawGUI5(){		//maakt het fileChooser schermpje,  voor het openen
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
	
	String DrawGUI6(){		//maakt het fileChooser schermpje,  voor het Opslaan
		if(!checker.CheckIfValidAlleHokjes()){return null;}
		else{
			fileOutString = JOptionPane.showInputDialog(null, "Naam van de woordzoeker:", "Bestandsnaam", JOptionPane.PLAIN_MESSAGE);
			if(fileOutString != null){fileOut = new File(fileOutString);}else{}
			if(fileOutString == null){return null;}
			else if(fileOutString.isEmpty() || !fileOutString.matches(patternLetter)){function.Message("Stop", "je moet 1 woord invullen!"); return null;}
			else{
				filechooser = new JFileChooser();
				filechooser.setFileSelectionMode(JFileChooser.SAVE_DIALOG);
				filechooser.setFileFilter(filefilter);
				filechooser.setApproveButtonToolTipText("Save");
				returnErrorNR = filechooser.showOpenDialog(null);
				if(returnErrorNR == 0){
					return filechooser.getSelectedFile().getAbsolutePath();
				}
				else{return null;}
			}	
		}
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
}
