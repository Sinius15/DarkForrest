package solver.wordseeker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MenuBar extends Main{

	void StartupScherm(){
		l.Menubar(0);
		l.Menu("File", 0);
			l.Menuitem("Open", 0);
		l.Menu("Help", 0);
			l.Menuitem("About", 1);
			l.Menuitem("Exit", 1);
			
		l.menubar[0].setBackground(menubarColor);
		l.menubar[0].setForeground(textColor);
		l.menubar[0].setBorder(emptyBorder);
		l.menu[0].setForeground(textColor);
		l.menu[0].setBorder(emptyBorder);
		l.menu[1].setForeground(textColor);
		l.menu[1].setBorder(emptyBorder);
		
		l.menuitem[0].setBackground(menubarColor);
		l.menuitem[0].setForeground(textColor);
		l.menuitem[0].setBorder(emptyBorder);
		
		l.menuitem[1].setBackground(menubarColor);
		l.menuitem[1].setForeground(textColor);
		l.menuitem[1].setBorder(emptyBorder);
		
		l.menuitem[2].setBackground(menubarColor);
		l.menuitem[2].setForeground(textColor);
		l.menuitem[2].setBorder(emptyBorder);
		
		l.menuitem[0].addActionListener(new ActionListener() {@Override		//open file
			public void actionPerformed(ActionEvent e) {  
			path = drawer.DrawGUI5();
			if(path != ""){
				file.open(path, 2);
				letterBreedte = Integer.parseInt(InportFile[2][1]);
				letterHoogte = Integer.parseInt(InportFile[2][2]);
						
				if(letterBreedte > 22 || letterHoogte > 22){function.Message("Stop", "Maximale hoogte en breedte is 22");}
				else if(letterBreedte < 3 && letterHoogte < 3){function.Message("Stop", "sorry, minimale hoogte en breedte is 3");}
				else{
					l.frame[0].dispose();
					drawer.DrawGUI3(letterHoogte, letterBreedte);
					teller1 = 1;
					while(teller1 <= letterAantal){
							l.textfield[teller1].setText(InportFile[2][teller1+2]);
							teller1++;
					}
				}
			}
		}});
		l.menuitem[1].addActionListener(action.About());
		
		l.menuitem[2].addActionListener(action.Exit());
		
	}
	
	void MainScherm(){
		l.menubarTeller = 0;
		l.menuTeller = 0;
		l.menuitemTeller = 0;
		l.checkboxmenuitemTeller = 0;
		
		l.Menubar(1);
		l.Menu("File", 0);
			l.Menuitem("Reset alle velden",0);   //0
			l.Menuitem("Vul alle velde in", 0);	//1
			l.Menuitem("Save woordzoeker", 0);	//2
		l.Menu("Instellingen",0);	
			l.CheckBoxMenuItem("Zoek horizontaal", zoekHorizontaal, 1);
			l.CheckBoxMenuItem("Zoek Verticaal", zoekVerticaal, 1);
			l.CheckBoxMenuItem("Zoek Diagonaal", zoekDiagonaal, 1);
			l.RadioButtonMenuItem("Vergelijk met wordenboek(DEV.)", false, 1);	//0
			l.RadioButtonMenuItem("Vegelijk met eigen woord", true, 1);		//1
		l.Menu("Help",0);
			l.Menuitem("About",2);		//3
			l.Menuitem("Exit",2);			//4
		l.Buttongroup();
			
		l.menubar[0].setBackground(menubarColor);
		l.menubar[0].setForeground(textColor);
		l.menubar[0].setBorder(emptyBorder);
		l.menu[0].setForeground(textColor);
		l.menu[0].setBorder(emptyBorder);
		l.menu[1].setForeground(textColor);
		l.menu[1].setBorder(emptyBorder);
		l.menu[2].setForeground(textColor);
		l.menu[2].setBorder(emptyBorder);
		l.menuitem[0].setBackground(menubarColor);
		l.menuitem[0].setForeground(textColor);
		l.menuitem[0].setBorder(emptyBorder);
		l.menuitem[1].setBackground(menubarColor);
		l.menuitem[1].setForeground(textColor);
		l.menuitem[1].setBorder(emptyBorder);
		l.menuitem[2].setBackground(menubarColor);
		l.menuitem[2].setForeground(textColor);
		l.menuitem[2].setBorder(emptyBorder);
		l.menuitem[3].setBackground(menubarColor);
		l.menuitem[3].setForeground(textColor);
		l.menuitem[3].setBorder(emptyBorder);
		l.menuitem[4].setBackground(menubarColor);
		l.menuitem[4].setForeground(textColor);
		l.menuitem[4].setBorder(emptyBorder);
		l.checkboxmenuitem[0].setBackground(menubarColor);
		l.checkboxmenuitem[0].setForeground(textColor);
		l.checkboxmenuitem[0].setBorder(emptyBorder);
		l.checkboxmenuitem[1].setBackground(menubarColor);
		l.checkboxmenuitem[1].setForeground(textColor);
		l.checkboxmenuitem[1].setBorder(emptyBorder);	
		l.checkboxmenuitem[2].setBackground(menubarColor);
		l.checkboxmenuitem[2].setForeground(textColor);
		l.checkboxmenuitem[2].setBorder(emptyBorder);
		
		l.radiobuttonmenuitem[0].setBackground(menubarColor);
		l.radiobuttonmenuitem[0].setForeground(textColor);
		l.radiobuttonmenuitem[0].setBorder(emptyBorder);
		l.radiobuttonmenuitem[1].setBackground(menubarColor);
		l.radiobuttonmenuitem[1].setForeground(textColor);
		l.radiobuttonmenuitem[1].setBorder(emptyBorder);
		

		l.buttongroup[0].add(l.radiobuttonmenuitem[0]);
		l.buttongroup[0].add(l.radiobuttonmenuitem[1]);
			
		l.menuitem[0].addActionListener(action.LeegAlleVelden());				//clear alle velden
		
		l.menuitem[1].addActionListener(action.VulAlleVelden());				//vul alle velden
		
		l.menuitem[3].addActionListener(action.About());						//about

		l.menuitem[4].addActionListener(action.Exit());						//exit
		
		l.menuitem[2].addActionListener(new ActionListener() {@Override		//save file
			public void actionPerformed(ActionEvent e) {  
			path = drawer.DrawGUI6();
			System.out.println(path);
			System.out.println("DrawGUI6 is done now");
			if(path == null){
				System.out.println("het is null");
			}
			else{
				      File fileOut = new File(path + "/" + fileOutString + ".woordzoeker" );
				      System.out.println(fileOut);
				      file.CreateFile(fileOut);
				      file.WriteSafeFile(fileOut);
			}
			
		}});
	}
}
