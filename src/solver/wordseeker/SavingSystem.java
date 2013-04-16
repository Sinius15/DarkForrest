package solver.wordseeker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SavingSystem extends WordseekerSolver{
	
	public ActionListener OpenWordseeker() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  //Om een woordzoeker te openen
		path = drawer.GetOpenPath();
		
		if(path != ""){
			file.Open(path, 2, false);
			letterBreedte = Integer.parseInt(InportFile[2][1]);
			letterHoogte = Integer.parseInt(InportFile[2][2]);
			letterAantal = letterBreedte * letterHoogte;
					
			if(letterBreedte > 22 || letterHoogte > 22){function.Message("Stop", "Maximale hoogte en breedte is 22");}
			else if(letterBreedte < 3 && letterHoogte < 3){function.Message("Stop", "sorry, minimale hoogte en breedte is 3");}
			else{
				
				startupScreen.get().dispose();
				drawer.DrawGUI3(letterHoogte, letterBreedte);
				teller1 = 1;	//hoogte
				teller2 = 1;	//breedte
				teller3 = 3;
				while(teller1 <= letterBreedte){
					teller2 = 1;
					while(teller2<= letterHoogte){
						letterVeld[teller1][teller2].setText(InportFile[2][teller3]);
						teller2++;
						teller3++;
					}
					teller1++;
				}
			}
		}

	}};}
	
	public ActionListener SaveWordseeker() {return new ActionListener() {@Override public void actionPerformed(ActionEvent e) {  //om een woordzoeker op te slaan
		path = drawer.GetSafePath();
		if(path == null){}
		else{
			      File fileOut = new File(path + ".woordzoeker" );
			      System.out.println(fileOut);
			      file.CreateFile(fileOut);
			      
			      file.Write(fileOut, String.valueOf(letterBreedte));
			      file.Write(fileOut, String.valueOf(letterHoogte));
			      
			      teller1 = 1;
			      while(teller1 <= letterBreedte){
			    	  teller2 = 1;
			    	  while(teller2 <= letterHoogte){
			    		  file.Write(fileOut, letterVeld[teller1][teller2].getText());
			    		  teller2++;
			    	  }
			      teller1++;
			      }
		}
	}};}
	
}
