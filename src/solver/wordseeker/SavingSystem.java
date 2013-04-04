package solver.wordseeker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SavingSystem extends WordseekerSolver{
	
	public ActionListener OpenWordseeker() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  //is de eerste knop in het begin
		path = drawer.DrawGUI5();
		
		if(path != ""){
			file.Open(path, 2, false);
			letterBreedte = Integer.parseInt(InportFile[2][1]);
			letterHoogte = Integer.parseInt(InportFile[2][2]);
			letterAantal = letterBreedte * letterHoogte;
					
			if(letterBreedte > 22 || letterHoogte > 22){function.Message("Stop", "Maximale hoogte en breedte is 22");}
			else if(letterBreedte < 3 && letterHoogte < 3){function.Message("Stop", "sorry, minimale hoogte en breedte is 3");}
			else{
				
				l.frame[0].dispose();
				drawer.DrawGUI3(letterHoogte, letterBreedte);
				teller1 = 1;	//hoogte
				teller2 = 1;	//breedte
				teller3 = 3;
				while(teller1 <= letterHoogte){
					teller2 = 1;
					while(teller2<= letterBreedte){
						letterVeld[teller1][teller2].setText(InportFile[2][teller3]);
						teller2++;
						teller3++;
					}
					teller1++;
				}
			}
		}

	}};}
	
	public ActionListener SaveWordseeker() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  //is de eerste knop in het begin
		path = drawer.DrawGUI6();
		if(path == null){
		}
		else{
			      File fileOut = new File(path + "/" + fileOutString + ".woordzoeker" );
			      file.CreateFile(fileOut);
			      
			      file.Write(fileOut, String.valueOf(letterBreedte));
			      file.Write(fileOut, String.valueOf(letterHoogte));
			      
			      teller1 = 1;
			      while(teller1 <= letterHoogte){
			    	  teller2 = 1;
			    	  while(teller2 <= letterBreedte){
			    		  file.Write(fileOut, letterVeld[teller1][teller2].getText());
			    		  System.out.println("I JUST WROTE : " + letterVeld[teller1][teller2].getText());
			    		  teller2++;
			    	  }
			      teller1++;
			      }
		}
	}};}
	
}