package solver.wordseeker;

public class GetLetter extends WordseekerSolver{

	String Up(int nr){
		inWelkHokjeIkBenMetGet = nr - letterBreedte;
		if(inWelkHokjeIkBenMetGet <1){
			inWelkHokjeIkBenMetGet = 0;
			teller2++;
			return "";
		}
		else{
			inWelkHokjeIkBenMetGetArray[inWelkHokjeIkBenMetGetArrayTeller] = inWelkHokjeIkBenMetGet;  inWelkHokjeIkBenMetGetArrayTeller++;
			return l.textfield[inWelkHokjeIkBenMetGet].getText();
			}
	}
	
	String Down(int nr){
		inWelkHokjeIkBenMetGet = nr + letterBreedte;
		if(inWelkHokjeIkBenMetGet >letterAantal){
			inWelkHokjeIkBenMetGet = 0;
			teller2++;
			return "";
		}
		else{
			inWelkHokjeIkBenMetGetArray[inWelkHokjeIkBenMetGetArrayTeller] = inWelkHokjeIkBenMetGet;  inWelkHokjeIkBenMetGetArrayTeller++;
			return l.textfield[inWelkHokjeIkBenMetGet].getText();
			}
	}
	
	String Right(int nr){
		inWelkHokjeIkBenMetGet = nr + 1;
		teller5 = nr%letterBreedte;
		if(teller5 == 0 || inWelkHokjeIkBenMetGet > letterAantal){
			inWelkHokjeIkBenMetGet = 0;
			teller2++;
			return "";
		}
		else{
			inWelkHokjeIkBenMetGetArray[inWelkHokjeIkBenMetGetArrayTeller] = inWelkHokjeIkBenMetGet;  inWelkHokjeIkBenMetGetArrayTeller++;
			return l.textfield[inWelkHokjeIkBenMetGet].getText();
			}
	}
	
	String Left(int nr){
		inWelkHokjeIkBenMetGet = nr - 1;
		teller5 = nr%letterBreedte;
		if(teller5 == 1 || inWelkHokjeIkBenMetGet < 1){
			inWelkHokjeIkBenMetGet = 0;
			teller2++;
			return "";
		}
		else{
			inWelkHokjeIkBenMetGetArray[inWelkHokjeIkBenMetGetArrayTeller] = inWelkHokjeIkBenMetGet;  inWelkHokjeIkBenMetGetArrayTeller++;
			return l.textfield[inWelkHokjeIkBenMetGet].getText();
			}
	}

	String LeftUp(int nr){
		inWelkHokjeIkBenMetGet = nr - letterBreedte - 1;
		teller5 = nr%letterBreedte;
		if(teller5 == 1 || inWelkHokjeIkBenMetGet < 1){
			inWelkHokjeIkBenMetGet = 0;
			teller2++;
			return "";
		}
		else{
			inWelkHokjeIkBenMetGetArray[inWelkHokjeIkBenMetGetArrayTeller] = inWelkHokjeIkBenMetGet;  inWelkHokjeIkBenMetGetArrayTeller++;
			return l.textfield[inWelkHokjeIkBenMetGet].getText();
			}
	}
	
	String RightUp(int nr){
		inWelkHokjeIkBenMetGet = nr - letterBreedte + 1;
		teller5 = nr%letterBreedte;
		if(teller5 == 0 || inWelkHokjeIkBenMetGet<1){
			inWelkHokjeIkBenMetGet = 0;
			teller2++;
			return "";
		}
		else{
			inWelkHokjeIkBenMetGetArray[inWelkHokjeIkBenMetGetArrayTeller] = inWelkHokjeIkBenMetGet;  inWelkHokjeIkBenMetGetArrayTeller++;
			return l.textfield[inWelkHokjeIkBenMetGet].getText();
			}
	}
	
	String LeftDown(int nr){
		inWelkHokjeIkBenMetGet = nr + letterBreedte -1;
		teller5 = nr%letterBreedte;
		if(teller5 == 1 || inWelkHokjeIkBenMetGet > letterAantal){
			inWelkHokjeIkBenMetGet = 0;
			teller2++;
			return "";
		}
		else{
			inWelkHokjeIkBenMetGetArray[inWelkHokjeIkBenMetGetArrayTeller] = inWelkHokjeIkBenMetGet;  inWelkHokjeIkBenMetGetArrayTeller++;
			return l.textfield[inWelkHokjeIkBenMetGet].getText();
			}
	}
	
	String RightDown(int nr){
		inWelkHokjeIkBenMetGet = nr + letterBreedte +1;
		teller5 = nr%letterBreedte;
		if(teller5 == 0 || inWelkHokjeIkBenMetGet > letterAantal){
			inWelkHokjeIkBenMetGet = 0;
			teller2++;
			return "";
		}
		else{
			inWelkHokjeIkBenMetGetArray[inWelkHokjeIkBenMetGetArrayTeller] = inWelkHokjeIkBenMetGet;  inWelkHokjeIkBenMetGetArrayTeller++;
			return l.textfield[inWelkHokjeIkBenMetGet].getText();
			}
	}

	
}
