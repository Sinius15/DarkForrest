package solver.wordseeker;

import api.*;

public class MenuBar extends WordseekerSolver{

	void StartupScherm(){
		
		startupScreenMenu1 = new LMenu("File");
			startupScreenItem1 = new LMenuItem("Open");
		startupScreenMenu2 = new LMenu("Help");
			startupScreenItem2 = new LMenuItem("About");
			startupScreenItem3 = new LMenuItem("Exit");
			
		startupScreenBar.get().setBackground(menubarColor);
		startupScreenBar.get().setForeground(textColor);
		startupScreenBar.get().setBorder(emptyBorder);
		startupScreenMenu1.get().setForeground(textColor);
		startupScreenMenu1.get().setBorder(emptyBorder);
		startupScreenMenu2.get().setForeground(textColor);
		startupScreenMenu2.get().setBorder(emptyBorder);
		startupScreenItem1.get().setBackground(menubarColor);
		startupScreenItem1.get().setForeground(textColor);
		startupScreenItem1.get().setBorder(emptyBorder);
		startupScreenItem2.get().setBackground(menubarColor);
		startupScreenItem2.get().setForeground(textColor);
		startupScreenItem2.get().setBorder(emptyBorder);
		startupScreenItem3.get().setBackground(menubarColor);
		startupScreenItem3.get().setForeground(textColor);
		startupScreenItem3.get().setBorder(emptyBorder);
		
		startupScreenItem1.get().addActionListener(savingSystem.OpenWordseeker());
		startupScreenItem2.get().addActionListener(action.About());
		startupScreenItem3.get().addActionListener(action.Exit());
		
		startupScreen.addJMenuBar(startupScreenBar);
		startupScreenBar.addMenu(startupScreenMenu1);
		startupScreenBar.addMenu(startupScreenMenu2);
		startupScreenMenu1.addMenuItem(startupScreenItem1);
		startupScreenMenu2.addMenuItem(startupScreenItem2);
		startupScreenMenu2.addMenuItem(startupScreenItem3);
	}
	
	void MainScherm(){
		
		mainScreenMenu1 = new LMenu("File");
			mainScreenItem1 = new LMenuItem("Reset alle velden");
			mainScreenItem2 = new LMenuItem("Vul alle velden in");
			mainScreenItem3 = new LMenuItem("Save woordzoeker");
			mainScreenItem4 = new LMenuItem("Ga terug naar het begin scherm");
		mainScreenMenu2 = new LMenu("Instellingen");
			mainScreenCheckItem1 = new LCheckBoxMenuItem("Zoek horizontaal");
			mainScreenCheckItem2 = new LCheckBoxMenuItem("Zoek Verticaal");
			mainScreenCheckItem3 = new LCheckBoxMenuItem("Zoek Diagonaal");
			mainScreenRadioItem1 = new LRadioButtonMenuItem("Vergelijk met woordenboek");
			mainScreenRadioItem2 = new LRadioButtonMenuItem("Vergelijk met eigen woord");
		mainScreenMenu3 = new LMenu("Help");
			mainScreenItem5 = new LMenuItem("About");
			mainScreenItem6 = new LMenuItem("Exit");
		
		buttongroup = new LButtonGroup();
		buttongroup.add(mainScreenRadioItem1);
		buttongroup.add(mainScreenRadioItem2);
		
		mainScreen.addJMenuBar(mainScreenBar);
		mainScreenBar.addMenu(mainScreenMenu1);
			mainScreenMenu1.addMenuItem(mainScreenItem1);
			mainScreenMenu1.addMenuItem(mainScreenItem2);
			mainScreenMenu1.addMenuItem(mainScreenItem3);
			mainScreenMenu1.addMenuItem(mainScreenItem4);
		mainScreenBar.addMenu(mainScreenMenu2);
			mainScreenMenu2.addMenuItem(mainScreenCheckItem1);
			mainScreenMenu2.addMenuItem(mainScreenCheckItem2);
			mainScreenMenu2.addMenuItem(mainScreenCheckItem3);
			mainScreenMenu2.addMenuItem(mainScreenRadioItem1);
			mainScreenMenu2.addMenuItem(mainScreenRadioItem2);
		mainScreenBar.addMenu(mainScreenMenu3);
			mainScreenMenu3.addMenuItem(mainScreenItem5);
			mainScreenMenu3.addMenuItem(mainScreenItem6);
		
		mainScreenCheckItem1.setState(zoekHorizontaal);
		mainScreenCheckItem2.setState(zoekVerticaal);
		mainScreenCheckItem3.setState(zoekDiagonaal);
		mainScreenRadioItem2.setState(true);
		
		mainScreenBar.setBackground(menubarColor);
		mainScreenItem1.setBackground(menubarColor);
		mainScreenItem2.setBackground(menubarColor);
		mainScreenItem3.setBackground(menubarColor);
		mainScreenItem4.setBackground(menubarColor);
		mainScreenItem5.setBackground(menubarColor);
		mainScreenItem6.setBackground(menubarColor);
		mainScreenCheckItem1.setBackground(menubarColor);
		mainScreenCheckItem2.setBackground(menubarColor);
		mainScreenCheckItem3.setBackground(menubarColor);
		mainScreenRadioItem1.setBackground(menubarColor);
		mainScreenRadioItem2.setBackground(menubarColor);
		
		mainScreenBar.get().setForeground(textColor);
		mainScreenMenu1.get().setForeground(textColor);
		mainScreenMenu2.get().setForeground(textColor);
		mainScreenMenu3.get().setForeground(textColor);
		mainScreenItem1.get().setForeground(textColor);
		mainScreenItem2.get().setForeground(textColor);
		mainScreenItem3.get().setForeground(textColor);
		mainScreenItem4.get().setForeground(textColor);
		mainScreenItem5.get().setForeground(textColor);
		mainScreenItem6.get().setForeground(textColor);
		mainScreenCheckItem1.get().setForeground(textColor);
		mainScreenCheckItem2.get().setForeground(textColor);
		mainScreenCheckItem3.get().setForeground(textColor);
		mainScreenRadioItem1.get().setForeground(textColor);
		mainScreenRadioItem2.get().setForeground(textColor);
		
		mainScreenBar.get().setBorder(emptyBorder);
		mainScreenItem1.get().setBorder(emptyBorder);
		mainScreenItem2.get().setBorder(emptyBorder);
		mainScreenItem3.get().setBorder(emptyBorder);
		mainScreenItem4.get().setBorder(emptyBorder);
		mainScreenItem5.get().setBorder(emptyBorder);
		mainScreenItem6.get().setBorder(emptyBorder);
		mainScreenCheckItem1.get().setBorder(emptyBorder);
		mainScreenCheckItem2.get().setBorder(emptyBorder);
		mainScreenCheckItem3.get().setBorder(emptyBorder);
		mainScreenRadioItem1.get().setBorder(emptyBorder);
		mainScreenRadioItem2.get().setBorder(emptyBorder);
			
		mainScreenItem1.get().addActionListener(action.LeegAlleVelden());				//clear alle velden
		
		mainScreenItem2.get().addActionListener(action.VulAlleVelden());				//vul alle velden
		
		mainScreenItem5.get().addActionListener(action.About());						//about

		mainScreenItem6.get().addActionListener(action.Exit());						//exit
		
		mainScreenItem4.get().addActionListener(action.GoBack());					//ga terug
		
		mainScreenItem3.get().addActionListener(savingSystem.SaveWordseeker());				//save woordzoeker

	}
}
