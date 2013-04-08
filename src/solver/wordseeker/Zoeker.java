package solver.wordseeker;

public class Zoeker extends WordseekerSolver{

	
	public void ZoekWoord(String woordDatJeZoekt, int WelkeKantOp){
		welkeKantOp = WelkeKantOp;
		
		teller1 = 1;
		teller2 = 1;
		teller3 = 1;
		lengteWoordDatJeZoekt = woordDatJeZoekt.length();
		
		function.ClearColor();
		function.Reset_WelkeCoordsHebIkNetBekeken();
		teller1 = 1;
		while(teller1 <= letterBreedte){
			teller2 = 1;
			while(teller2 <= letterHoogte){
					function.Reset_WelkeCoordsHebIkNetBekeken();
					teVergelijkenWoord = letterVeld[teller1][teller2].getText();
					teller1X = teller1;
					teller1Y = teller2;	
						while(teVergelijkenWoord.length() < lengteWoordDatJeZoekt){
							switch(welkeKantOp){
								case 1: if(l.checkboxmenuitem[1].getState()){ teVergelijkenWoord = teVergelijkenWoord + get.Up(teller1X, teller1Y); 			teller1Y--;}else{teVergelijkenWoord = "Je hoeft niet verticaal te vergelijken, dus dan maak ik er maar een oneindig lange zin van.";}; 
									break;
								case 2: if(l.checkboxmenuitem[2].getState()){ teVergelijkenWoord = teVergelijkenWoord + get.RightUp(teller1X, teller1Y); 		teller1X++;teller1Y--;}else{teVergelijkenWoord = "Je hoeft niet schuin te vergelijken, dus dan maak ik er maar een oneindig lange zin van.";}; 
									break;
								case 3: if(l.checkboxmenuitem[0].getState()){ teVergelijkenWoord = teVergelijkenWoord + get.Right(teller1X, teller1Y); 			teller1X++;}else{teVergelijkenWoord = "Je hoeft niet horizontaal te vergelijken, dus dan maak ik er maar een oneindig lange zin van.";}; 
									break;
								case 4: if(l.checkboxmenuitem[2].getState()){ teVergelijkenWoord = teVergelijkenWoord + get.RightDown(teller1X, teller1Y); 		teller1X++;teller1Y++;}else{teVergelijkenWoord = "Je hoeft niet schuin te vergelijken, dus dan maak ik er maar een oneindig lange zin van.";}; 
									break;
								case 5: if(l.checkboxmenuitem[1].getState()){ teVergelijkenWoord = teVergelijkenWoord + get.Down(teller1X, teller1Y); 			teller1Y++;}else{teVergelijkenWoord = "Je hoeft niet verticaal te vergelijken, dus dan maak ik er maar een oneindig lange zin van.";}; 
									break;
								case 6: if(l.checkboxmenuitem[2].getState()){ teVergelijkenWoord = teVergelijkenWoord + get.LeftDown(teller1X, teller1Y); 		teller1X--;teller1Y++;}else{teVergelijkenWoord = "Je hoeft niet schuin te vergelijken, dus dan maak ik er maar een oneindig lange zin van.";}; 
									break;
								case 7: if(l.checkboxmenuitem[0].getState()){ teVergelijkenWoord = teVergelijkenWoord + get.Left(teller1X, teller1Y); 			teller1X--;}else{teVergelijkenWoord = "Je hoeft niet horizontaal te vergelijken, dus dan maak ik er maar een oneindig lange zin van.";}; 
									break;
								case 8: if(l.checkboxmenuitem[2].getState()){ teVergelijkenWoord = teVergelijkenWoord + get.LeftUp(teller1X, teller1Y); 		teller1X--;teller1Y--;}else{teVergelijkenWoord = "Je hoeft niet schuin te vergelijken, dus dan maak ik er maar een oneindig lange zin van.";}; 
									break;
								default: break;
							}
						
						System.out.println("coords: " + teller2 + "," + teller1 + "   welkekantop: "+welkeKantOp + "    met woord: " + teVergelijkenWoord);
						zoeker.vergelijkEnKleur(woordDatJeZoekt);
				}
			teller2++;
			}
		teller1++;
		}
	}
	
	
	public void Zoek(String woordDatJeZoekt){
		teller8 = 1;
		while(teller8 <= 8){
			threadZoeker.Start(woordDatJeZoekt, teller8);
			teller8++;
		}
	}
	
	
	
	
	
	
	
	
	

	void ZoekWoord2(String woordDatJeZoekt){
		teller1 = 1;
		teller2 = 1;
		teller3 = 1;
		lengteWoordDatJeZoekt = woordDatJeZoekt.length();
		
		function.ClearColor();
		function.Reset_WelkeCoordsHebIkNetBekeken();
		
		teller1 = 1;
		while(teller1 <= letterBreedte){
			teller2 = 1;
			while(teller2 <= letterHoogte){
				welkeKantOp = 1;
				while(welkeKantOp <= 8){
					function.Reset_WelkeCoordsHebIkNetBekeken();
					teVergelijkenWoord = letterVeld[teller1][teller2].getText();
					
					teller1X = teller1;
					teller1Y = teller2;	
						while(teVergelijkenWoord.length() < lengteWoordDatJeZoekt){
							switch(welkeKantOp){
								case 1: if(l.checkboxmenuitem[1].getState()){ teVergelijkenWoord = teVergelijkenWoord + get.Up(teller1X, teller1Y); 			teller1Y--;}else{teVergelijkenWoord = "Je hoeft niet verticaal te vergelijken, dus dan maak ik er maar een oneindig lange zin van.";}; 
									break;
								case 2: if(l.checkboxmenuitem[2].getState()){ teVergelijkenWoord = teVergelijkenWoord + get.RightUp(teller1X, teller1Y); 		teller1X++;teller1Y--;}else{teVergelijkenWoord = "Je hoeft niet schuin te vergelijken, dus dan maak ik er maar een oneindig lange zin van.";}; 
									break;
								case 3: if(l.checkboxmenuitem[0].getState()){ teVergelijkenWoord = teVergelijkenWoord + get.Right(teller1X, teller1Y); 			teller1X++;}else{teVergelijkenWoord = "Je hoeft niet horizontaal te vergelijken, dus dan maak ik er maar een oneindig lange zin van.";}; 
									break;
								case 4: if(l.checkboxmenuitem[2].getState()){ teVergelijkenWoord = teVergelijkenWoord + get.RightDown(teller1X, teller1Y); 		teller1X++;teller1Y++;}else{teVergelijkenWoord = "Je hoeft niet schuin te vergelijken, dus dan maak ik er maar een oneindig lange zin van.";}; 
									break;
								case 5: if(l.checkboxmenuitem[1].getState()){ teVergelijkenWoord = teVergelijkenWoord + get.Down(teller1X, teller1Y); 			teller1Y++;}else{teVergelijkenWoord = "Je hoeft niet verticaal te vergelijken, dus dan maak ik er maar een oneindig lange zin van.";}; 
									break;
								case 6: if(l.checkboxmenuitem[2].getState()){ teVergelijkenWoord = teVergelijkenWoord + get.LeftDown(teller1X, teller1Y); 		teller1X--;teller1Y++;}else{teVergelijkenWoord = "Je hoeft niet schuin te vergelijken, dus dan maak ik er maar een oneindig lange zin van.";}; 
									break;
								case 7: if(l.checkboxmenuitem[0].getState()){ teVergelijkenWoord = teVergelijkenWoord + get.Left(teller1X, teller1Y); 			teller1X--;}else{teVergelijkenWoord = "Je hoeft niet horizontaal te vergelijken, dus dan maak ik er maar een oneindig lange zin van.";}; 
									break;
								case 8: if(l.checkboxmenuitem[2].getState()){ teVergelijkenWoord = teVergelijkenWoord + get.LeftUp(teller1X, teller1Y); 		teller1X--;teller1Y--;}else{teVergelijkenWoord = "Je hoeft niet schuin te vergelijken, dus dan maak ik er maar een oneindig lange zin van.";}; 
									break;
								default: break;
							}
						}
						System.out.println("coords: " + teller2 + "," + teller1 + "   welkekantop: "+welkeKantOp + "    met woord: " + teVergelijkenWoord);
						zoeker.vergelijkEnKleur(woordDatJeZoekt);
				welkeKantOp++;
				}
			teller2++;
			}
		teller1++;
		}
	}
	
	
	

	
	private boolean vergelijkEnKleur(String woordDatJeZoekt) {
		if(teVergelijkenWoord.equals(woordDatJeZoekt)){
			letterVeld[teller1][teller2].setBackground(output1Color);
			teller4 = 1;
			while(teller4 <= letterBreedte){
				teller5 = 1;
				while(teller5 <= letterHoogte){
					if(welkeCoordsHebIkNetBekeken[teller4][teller5]){
						letterVeld[teller4][teller5].setBackground(output2Color);
					}

				teller5++;
				}
			teller4++;
			}
			return true;
		}
		else{
			return false;
		}
		
	}
}
