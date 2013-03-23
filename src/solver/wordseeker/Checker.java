package solver.wordseeker;

public class Checker extends WordseekerSolver{

	boolean CheckIfValidAlleHokjes(){
		teller1 = 1;
		teller3 = 0;
		gezochtWoord = l.textfield[(letterAantal+1)].getText();
		while(teller1 < (letterAantal+1)){
			gezochtWoord = l.textfield[teller1].getText();
			teller2 = gezochtWoord.length();

			if(gezochtWoord.isEmpty() == true){
				function.Message("STOP", "Je hebt de woordzoeker niet goed ingevuld! Overal moet 1 letter staan!");
				return false;
			}
			else if(gezochtWoord.matches(patternLetter) == false){
				function.Message("STOP", "Je hebt de woordzoeker niet goed ingevuld! Overal moet 1 letter staan!");
				return false;
			}
			else if(teller2 != 1){
				function.Message("STOP", "Je hebt de woordzoeker niet goed ingevuld! Overal moet 1 letter staan!");
				return false;
			}
			else if(gezochtWoord.matches(patternLetter) == false){
				function.Message("STOP", "Je hebt de woordzoeker niet goed ingevuld! Overal moet 1 letter staan!");
				return false;
			}
			else{}
			teller1++;
		}
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
	
	boolean Controleer(String vergelijk1, String vergelijk2){
		if(vergelijk1.equals(vergelijk2)){
			return true;
		}
		else{
			return false;
		}
	}
}
