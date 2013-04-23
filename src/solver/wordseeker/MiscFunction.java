package solver.wordseeker;

import java.util.Random;
import javax.swing.JOptionPane;

public class MiscFunction extends WordseekerSolver{

	void ResetAllFiedls(){
		teller1 = 1;
		while(teller1 <= letterBreedte){
			teller2 = 1;
			while(teller2 <= letterHoogte){
				letterVeld[teller1][teller2].setText("");
				teller2++;
			}
			teller1++;
		}
	}
	
	void FillAllFields(int TotalFieldNr){		//werkt weer
		teller1 = 1;
		while(teller1 <= letterBreedte){
			teller2 = 1;
			while(teller2 <= letterHoogte){
				if(letterVeld[teller1][teller2].getText().isEmpty()){
					random = new Random();
					randomChar = (char)(random.nextInt(26) + 'a');
					letterVeld[teller1][teller2].setText(String.valueOf(randomChar));
				}
				teller2++;
			}
			teller1++;
		}
	}
		
	void ClearColor(){			//werkt weer
		teller1 = 1;
		while(teller1 <= letterBreedte){		
			teller2 = 1;
			while(teller2 <= letterHoogte){
				letterVeld[teller1][teller2].setBackground(textfieldColor);
				teller2++;
			}
			teller1++;
		}
	}

	public void Message(String titel, String text){
		JOptionPane.showMessageDialog(null, text, titel, JOptionPane.PLAIN_MESSAGE);
	}

	void Reset_WelkeCoordsHebIkNetBekeken() {
		teller6 = 1;
		while(teller6<=letterBreedte){
			teller7 = 1;
			while(teller7<=letterHoogte){
				welkeCoordsHebIkNetBekeken[teller6][teller7] = false;
				teller7++;
			}
			teller6++;
		}		
	}

	
}
