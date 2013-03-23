package solver.wordseeker;

import java.awt.Dimension;
import javax.swing.JTextField;
import api.LegendsDarkApi;

public class WordseekerSolver {

	public static LegendsDarkApi l = new LegendsDarkApi();
	public static JTextField[][] letterVeld = new JTextField[22][22];		//horizontaal en verticaal
	public static int teller1;
	public static int teller2;
	
	public static void main(String[] args) {
		l.Init();
		l.Frame(500, 500, "test");
		
		teller1 = 1;

		while(teller1 < 7){
		teller2 = 1;
			while(teller2<7){
				
				letterVeld[teller1][teller2] = new JTextField("hey");
				
				letterVeld[teller1][teller2].setPreferredSize(new Dimension(15, 15));
				l.Gridbag(teller1, teller2, 1, 1, 0);
				l.panel[0].add(letterVeld[teller1][teller2], l.gridBag[l.gridbagTeller]);
				l.frame[0].revalidate();
				teller2++;

			}
		teller1++;
		}

	}

}
