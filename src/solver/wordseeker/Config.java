package solver.wordseeker;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;

public class Config extends WordseekerSolver{
	
	boolean Init(){
		try{
		System.out.println(configPath.getAbsolutePath());
		file.Open(configPath.getAbsolutePath(), 0, true);
	
		backgroundColor = new Color(Integer.parseInt(InportFile[0][1]),Integer.parseInt(InportFile[0][2]),Integer.parseInt(InportFile[0][3]));
		buttonColor = new Color(Integer.parseInt(InportFile[0][4]),Integer.parseInt(InportFile[0][5]),Integer.parseInt(InportFile[0][6]));
		textfieldColor = new Color(Integer.parseInt(InportFile[0][7]),Integer.parseInt(InportFile[0][8]),Integer.parseInt(InportFile[0][9]));
		
		output1Color = new Color(Integer.parseInt(InportFile[0][10]),Integer.parseInt(InportFile[0][11]),Integer.parseInt(InportFile[0][12]));
		output2Color = new Color(Integer.parseInt(InportFile[0][13]),Integer.parseInt(InportFile[0][14]),Integer.parseInt(InportFile[0][15]));
		menubarColor = new Color(Integer.parseInt(InportFile[0][16]),Integer.parseInt(InportFile[0][17]),Integer.parseInt(InportFile[0][18]));
		textColor = new Color(Integer.parseInt(InportFile[0][19]),Integer.parseInt(InportFile[0][20]),Integer.parseInt(InportFile[0][21]));
		
		zoekHorizontaal = Boolean.parseBoolean(InportFile[0][22]);
		zoekVerticaal = Boolean.parseBoolean(InportFile[0][23]);
		zoekDiagonaal = Boolean.parseBoolean(InportFile[0][24]);
		
		laadWoordenboek = Boolean.parseBoolean(InportFile[0][25]);
		
		font1 = new Font("verdana", Font.BOLD, 25);
		font2 = new Font("verdana", Font.BOLD, 15);
		
		emptyBorder = BorderFactory.createEmptyBorder();
		return true;
		}
		catch(Exception e){
			System.out.println("Could not find the config file!");
			textfieldColor = Color.white;
			output1Color = Color.red;
			output2Color = Color.orange;
			laadWoordenboek = false;
			return false;
		}
	}
	

}
