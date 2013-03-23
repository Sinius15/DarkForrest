package solver.wordseeker;

import java.util.Random;

import javax.swing.JOptionPane;

public class MiscFunction extends Main{

	void ResetAllFiedls(int TotalFieldNr){
		inWelkHokjeIkBen = 1;
		while(inWelkHokjeIkBen <= TotalFieldNr){
			l.textfield[inWelkHokjeIkBen].setText("");
			inWelkHokjeIkBen++;
		}
	}
	
	void FillAllFields(int TotalFieldNr){
		inWelkHokjeIkBen = 1;
		while(inWelkHokjeIkBen <= TotalFieldNr){
			random = new Random();
			randomChar = (char)(random.nextInt(26) + 'a');
			l.textfield[inWelkHokjeIkBen].setText(String.valueOf(randomChar));
			inWelkHokjeIkBen++;
		}
	}
	
	void ClearColor(int TotalFieldNr){
		inWelkHokjeIkBen = 1;
		while(inWelkHokjeIkBen <= TotalFieldNr){
			l.textfield[inWelkHokjeIkBen].setBackground(textfieldColor);
			inWelkHokjeIkBen++;
		}
	}

	void Message(String titel, String text){
		JOptionPane.showMessageDialog(null, text, titel, JOptionPane.PLAIN_MESSAGE);
	}
	

}
