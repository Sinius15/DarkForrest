package solver.wordseeker;

public class MenuBar extends WordseekerSolver{

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
		
		l.menuitem[0].addActionListener(savingSystem.OpenWordseeker());
		
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
			l.Menuitem("Ga terug naar begin scherm", 0);	//3
		l.Menu("Instellingen",0);	
			l.CheckBoxMenuItem("Zoek horizontaal", zoekHorizontaal, 1);
			l.CheckBoxMenuItem("Zoek Verticaal", zoekVerticaal, 1);
			l.CheckBoxMenuItem("Zoek Diagonaal", zoekDiagonaal, 1);
			l.RadioButtonMenuItem("Vergelijk met wordenboek(DEV.)", false, 1);	//0
			l.RadioButtonMenuItem("Vegelijk met eigen woord", true, 1);		//1
		l.Menu("Help",0);
			l.Menuitem("About",2);		//4
			l.Menuitem("Exit",2);			//5
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
		l.menuitem[5].setBackground(menubarColor);
		l.menuitem[5].setForeground(textColor);
		l.menuitem[5].setBorder(emptyBorder);
		
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
		
		l.menuitem[4].addActionListener(action.About());						//about

		l.menuitem[5].addActionListener(action.Exit());						//exit
		
		l.menuitem[3].addActionListener(action.GoBack());
		
		l.menuitem[2].addActionListener(savingSystem.SaveWordseeker());

	}
}
