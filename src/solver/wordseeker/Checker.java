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
		if(inputHeight.getText().length() == 0 || inputWidth.getText().length() == 0){
			function.Message("Stop", "je moet 2 cijfers invullen van 3 tot en met 22.");
			return false;
		}
		else if(!inputHeight.getText().matches(patternNumber) || !inputWidth.getText().matches(patternNumber)){
			function.Message("Stop", "je moet 2 cijfers invullen van 3 tot en met 22.");
			return false;
		}
		else if(Integer.parseInt(inputHeight.getText()) > 22 || Integer.parseInt(inputWidth.getText()) > 22 || Integer.parseInt(inputHeight.getText()) <3 || Integer.parseInt(inputWidth.getText()) < 3){
			function.Message("Stop", "je moet 2 cijfers invullen van 3 tot en met 22.");
			return false;
		}
		
		else{return true;}
	}
	
}
