package solver.wordseeker;

public class Checker extends WordseekerSolver{

	boolean CheckIfValidAlleHokjes(){
		teller1 = 1;
		while(teller1 < letterHoogte){
			teller2 = 1;
			while(teller2 < letterBreedte){
				gezochtWoord = letterVeld[teller1][teller2].getText();
				teller3 = gezochtWoord.length();
				if(gezochtWoord.isEmpty() == true){
					function.Message("STOP", "Je hebt de woordzoeker niet goed ingevuld! Overal moet 1 letter staan!1");
					return false;
				}
				else if(gezochtWoord.matches(patternLetter) == false){
					function.Message("STOP", "Je hebt de woordzoeker niet goed ingevuld! Overal moet 1 letter staan!2");
					return false;
				}
				else if(teller3 != 1){
					function.Message("STOP", "Je hebt de woordzoeker niet goed ingevuld! Overal moet 1 letter staan!3");
					return false;
				}
				else if(gezochtWoord.matches(patternLetter) == false){
					function.Message("STOP", "Je hebt de woordzoeker niet goed ingevuld! Overal moet 1 letter staan!4");
					return false;
				}
				else{}
				teller2++;
			}
			teller1++;
		}
		System.out.println("Klaar met controlere!");
		return true;
		
	}

	boolean CheckIfValidStartScreen(){
		if(l.textfield[1].getText().length() == 0 || l.textfield[2].getText().length() == 0){
			function.Message("Stop", "je moet 2 cijfers invullen van 3 tot en met 22.");
			return false;
		}
		else if(!l.textfield[1].getText().matches(patternNumber) || !l.textfield[2].getText().matches(patternNumber)){
			function.Message("Stop", "je moet 2 cijfers invullen van 3 tot en met 22.");
			return false;
		}
		else if(Integer.parseInt(l.textfield[1].getText()) > 22 || Integer.parseInt(l.textfield[2].getText()) > 22 || Integer.parseInt(l.textfield[1].getText()) <3 || Integer.parseInt(l.textfield[2].getText()) < 3){
			function.Message("Stop", "je moet 2 cijfers invullen van 3 tot en met 22.");
			return false;
		}
		
		else{return true;}
	}
	
}
