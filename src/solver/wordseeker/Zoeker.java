package solver.wordseeker;

public class Zoeker extends WordseekerSolver{
	
	
	Boolean ZoekWoord(String woordDatJeZoekt){

		
		
		teller2 = 1;
		inWelkHokjeIkBen = 1;
		gezochtWoord = woordDatJeZoekt;
		lengteGezochtWoord = gezochtWoord.length();
		lengteGezochtWoordTeller1 = 1;
		
		if(l.checkboxmenuitem[0].getState() == false && l.checkboxmenuitem[1].getState() == false && l.checkboxmenuitem[2].getState() == false){
			function.Message("Stop", "Je moet bij instellingen minstens één hokje hebben aangevinkt!");
			return false;
		}
else{
	while(letterVeldYcoord<=letterHoogte){
		while(letterVeldXcoord<=letterBreedte){
			welkeKantOp = 1;
				while(welkeKantOp <= 8){
					while(lengteGezochtWoord > lengteGezochtWoordTeller1){   //maakt het teVergelijkenWoord
						if(welkeKantOp == 1 && l.checkboxmenuitem[1].getState()){   
							teVergelijkenWoord = teVergelijkenWoord + get.Up(inWelkHokjeIkBenMetGet);
						}
						else if(welkeKantOp == 2 && l.checkboxmenuitem[2].getState()){  
							teVergelijkenWoord = teVergelijkenWoord + get.RightUp(inWelkHokjeIkBenMetGet);
						}
						else if(welkeKantOp == 3 && l.checkboxmenuitem[0].getState()){
							teVergelijkenWoord = teVergelijkenWoord + get.Right(inWelkHokjeIkBenMetGet);
						}
						else if(welkeKantOp == 4 && l.checkboxmenuitem[2].getState()){
							teVergelijkenWoord = teVergelijkenWoord + get.RightDown(inWelkHokjeIkBenMetGet);
						}
						else if(welkeKantOp == 5 && l.checkboxmenuitem[1].getState()){
							teVergelijkenWoord = teVergelijkenWoord + get.Down(inWelkHokjeIkBenMetGet);
						}
						else if(welkeKantOp == 6 && l.checkboxmenuitem[2].getState()){
							teVergelijkenWoord = teVergelijkenWoord + get.LeftDown(inWelkHokjeIkBenMetGet);
						}
						else if(welkeKantOp == 7 && l.checkboxmenuitem[0].getState()){
							teVergelijkenWoord = teVergelijkenWoord + get.Left(inWelkHokjeIkBenMetGet);
						}
						else if(welkeKantOp == 8 && l.checkboxmenuitem[2].getState()){
							teVergelijkenWoord = teVergelijkenWoord + get.LeftUp(inWelkHokjeIkBenMetGet);
						}
						else{}
						lengteGezochtWoordTeller1++;
					}
					
					if(checker.Controleer(teVergelijkenWoord, gezochtWoord) == true){
						l.textfield[inWelkHokjeIkBen].setBackground(output1Color);
						lengteGezochtWoordTeller2 = 2;
						while(lengteGezochtWoord > (lengteGezochtWoordTeller2-1)){
							l.textfield[inWelkHokjeIkBenMetGetArray[lengteGezochtWoordTeller2]].setBackground(output2Color);
							lengteGezochtWoordTeller2++;
						}
					return true;
					}
					else{}
					welkeKantOp++;
				}
			letterVeldXcoord++;
		}
		letterVeldYcoord++;	
	}
	return false;
}
		
		
		
		
		
		
}
		
	
	
	void zoekAlleWoorden(){
		drawer.Outputscherm();
		teller1 = 1;
		while(teller1<=11319){
			if(this.ZoekWoord(InportFile[1][teller1]) && InportFile[1][teller1].length()>2){
				drawer.OutputschermAdd(InportFile[1][teller1]);
			}
			//System.out.println(teller1 + "  nu dit woord vergeleken:  " + InportFile[1][teller1]);
			teller1++;
		}
	}
}
