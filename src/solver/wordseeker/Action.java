package solver.wordseeker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URISyntaxException;

public class Action extends WordseekerSolver{
	/*
	 * het klopt dat deze class file overbodig is, maar ik vind het handig als de code overzichtelijk blijft,
	 * zo staan hier wat actionlistners die in de weg stonden of die vaker gebruikt worden.
	 */
	
	public ActionListener Exit() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  	//exit hele programma
		System.exit(0);  
	}};}

	public ActionListener About() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  //maak het "About" schermpje
		drawer.About();
	}};}
	
	public ActionListener VulAlleVelden() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  //vult alle velden
		function.ClearColor();
		function.FillAllFields(letterAantal);
	}};}

	public ActionListener LeegAlleVelden() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  //maakt alle velden leeg
		function.ClearColor();
		function.ResetAllFiedls();
	}};}
	
	public ActionListener Start() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  //is de eerste knop in het begin
		if(checker.CheckIfValidStartScreen() == true){
			letterBreedte = Integer.parseInt(inputWidth.getText());
			letterHoogte = Integer.parseInt(inputHeight.getText());
			startupScreen.get().dispose();
			drawer.DrawGUI3(letterHoogte, letterBreedte);
		}
	}};}
	
	public ActionListener GoBack() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  //is de eerste knop in het begin
		try {
			drawer.Restart();
		} catch (URISyntaxException e1) {
			e1.printStackTrace();
		}

	}};}
}
