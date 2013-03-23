package solver.wordseeker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action extends Main{
	/*
	 * het klopt dat deze class file overbodig is, maar ik vind het handig als de code overzichtelijk blijft,
	 * zo staan hier wat actionlistners die in de weg stonden of die vaker gebruikt worden.
	 */
	
	public ActionListener Exit() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  	//exit hele programma
		System.exit(0);  
	}};}

	public ActionListener About() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  //maak het "About" schermpje
		drawer.DrawGUI4();
	}};}
	
	public ActionListener VulAlleVelden() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  //vult alle velden
		function.ClearColor(letterAantal);
		function.FillAllFields(letterAantal);
	}};}

	public ActionListener LeegAlleVelden() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  //maakt alle velden leeg
		function.ClearColor(letterAantal);
		function.ResetAllFiedls(letterAantal);
	}};}

}
