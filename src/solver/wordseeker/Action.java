package solver.wordseeker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URISyntaxException;

	/**
	 * hier staan alle actionlistners die vaker gebruikt worden of die wat lang zijn.
	 */
public class Action extends WordseekerSolver{

	/** 
	 * Sluit het hele programma.
	 */
	public ActionListener Exit() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  	//exit hele programma
		System.exit(0);  
	}};}

	/** 
	 * Maakt het about schermpje, als het schermpje al open staat, doet hij niks.
	 */
	public ActionListener About() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  //maak het "About" schermpje
		if(!aboutIsOpen){
			draw.About();
		}
	}};}
	
	/** 
	 * Vult alle lege velden met random letters
	 */
	public ActionListener VulAlleVelden() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  //vult alle velden
		function.ClearColor();
		function.FillAllFields(letterAantal);
	}};}

	/** 
	 * Maakt alle velden leeg en reset de kleur.
	 */
	public ActionListener LeegAlleVelden() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  //maakt alle velden leeg
		function.ClearColor();
		function.ResetAllFiedls();
	}};}
	
	/** 
	 * Start het grote main scherm
	 */
	public ActionListener Start() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  //is de eerste knop in het begin
		if(checker.CheckIfValidStartScreen() == true){
			letterBreedte = Integer.parseInt(inputWidth.getText());
			letterHoogte = Integer.parseInt(inputHeight.getText());
			System.out.println("de hoogte is: " + letterHoogte);
			System.out.println("de Breedte is: "+ letterBreedte);
			startupScreen.get().dispose();
			draw.MainScreen(letterHoogte, letterBreedte);
		}
	}};}
	
	/** 
	 * Restart het programma, zorgt dus dat je terug naar het begin scherm gaat.
	 */
	public ActionListener GoBack() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  //is de eerste knop in het begin
		try {
			draw.Restart();
		} catch (URISyntaxException e1) {
			e1.printStackTrace();
		}
	}};}
	
	/** 
	 * Sluit het about schermpje.
	 * <h6>Kan niet via aboutscreen.dispose() omdat je dan hem niet opniew kan openen.</h6>
	 */
	public ActionListener CloseAbout() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  //is de eerste knop in het begin
		aboutScreen.get().dispose();
		aboutIsOpen = false;
	}};}
}
