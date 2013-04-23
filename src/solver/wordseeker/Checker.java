package solver.wordseeker;

	/** 
	 * Zitten de functies in die dingen checken.
	 */
public class Checker extends WordseekerSolver{
	
	/** 
	 * Kijkt of alle hokjes goed zijn ingevult met één letter.
	 * @return of alles goed is ingevult
	 */
	boolean CheckIfValidAlleHokjes(){
		teller1 = 1;
		while(teller1 < letterBreedte){
			teller2 = 1;
			while(teller2 < letterHoogte){
				gezochtWoord = letterVeld[teller1][teller2].getText();
				teller3 = gezochtWoord.length();
				if(gezochtWoord.isEmpty() == true){
					function.Message("STOP", "Je hebt de woordzoeker niet goed ingevuld! Overal moet 1 letter staan!");
					return false;
				}
				else if(gezochtWoord.matches(patternLetter) == false){
					function.Message("STOP", "Je hebt de woordzoeker niet goed ingevuld! Overal moet 1 letter staan!");
					return false;
				}
				else if(teller3 != 1){
					function.Message("STOP", "Je hebt de woordzoeker niet goed ingevuld! Overal moet 1 letter staan!");
					return false;
				}
				else if(gezochtWoord.matches(patternLetter) == false){
					function.Message("STOP", "Je hebt de woordzoeker niet goed ingevuld! Overal moet 1 letter staan!");
					return false;
				}
				else{}
				teller2++;
			}
			teller1++;
		}
		return true;
		
	}

	/** 
	 * Kijkt of het beginscherm goed is ingevult.
	 * @return of alles goed is ingevult
	 */
	boolean CheckIfValidStartScreen(){
		if(inputHeight.getText().length() == 0 || inputWidth.getText().length() == 0){
			function.Message("Stop", "Je moet twee cijfers invullen van drie tot en met twintig.");
			return false;
		}
		else if(!inputHeight.getText().matches(patternNumber) || !inputWidth.getText().matches(patternNumber)){
			function.Message("Stop", "Je moet twee cijfers invullen van drie tot en met twintig.");
			return false;
		}
		else if(Integer.parseInt(inputHeight.getText()) > 20 || Integer.parseInt(inputWidth.getText()) > 20 || Integer.parseInt(inputHeight.getText()) <3 || Integer.parseInt(inputWidth.getText()) < 3){
			function.Message("Stop", "Je moet twee cijfers invullen van drie tot en met twintig.");
			return false;
		}
		else{return true;}
	}
	
}
