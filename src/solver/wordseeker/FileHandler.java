package solver.wordseeker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler extends Main{

	void openSafe(String path, int naam){
		try{   
			scanner = new Scanner(new File(path));  
			teller1 = 1;
			while(scanner.hasNext()){
				InportFile[naam][teller1] = scanner.next();
				if(InportFile[naam][teller1].substring(0, 2) != null && !InportFile[naam][teller1].substring(0, 2).equals("##")){
				System.out.println("bestand geopend: " + path+"       opgeslagen in: InportFile["+naam+"]["+teller1+"]       opgeslagen text: "+InportFile[naam][teller1]);
				teller1++;
				}
				else{
					scanner.nextLine();
					System.out.println("een lijn overgeslagen");
				}
			}
		scanner.close();
		}
		catch(Exception e){  System.out.println("could not find the file");   }
	}
	
	void open(String path, int naam){
		try{   
			scanner = new Scanner(new File(path));  
			teller1 = 1;
			while(scanner.hasNext()){
				InportFile[naam][teller1] = scanner.next();
				System.out.println("bestand geopend: " + path+"       opgeslagen in: InportFile["+naam+"]["+teller1+"]       opgeslagen text: "+InportFile[naam][teller1]);
				teller1++;
			}
			scanner.close();
		}
		catch(Exception e){  System.out.println("could not find the file");   }
	}
	
	void CreateFile(File file){
		try{
			if(file.createNewFile()){
				System.out.println("File is created!");	
			}
			else{
				System.out.println("File already exists!!");
			}
		} 
		catch(IOException e1) {
			e1.printStackTrace();
		}
	}
	
	void WriteSafeFile(File file){
		try{   scanner = new Scanner(file);  }
		catch(Exception e){  System.out.println("could not find the file");   }
		
		 try {
		        BufferedWriter out = new BufferedWriter(new FileWriter(file));
		        out.write(letterBreedte + System.getProperty( "line.separator" ));
		        out.write(letterHoogte + System.getProperty( "line.separator" ));
		        teller1= 1;
		        while(teller1<=letterAantal){
		        	out.write(l.textfield[teller1].getText() + System.getProperty( "line.separator" ));
		        	teller1++;
		        }
		        out.close();
		 } 
		 catch (IOException e) {
		 }
		
		scanner.close();
		
	}

	void OpenConfig(String path, int naam){
		try{   
			scanner = new Scanner(new File(path));  
			teller1 = 1;
			while(scanner.hasNextLine()){
				InportFile[naam][teller1] = scanner.nextLine();
				System.out.println("bestand geopend: " + path+"       opgeslagen in: InportFile["+naam+"]["+teller1+"]       opgeslagen text: "+InportFile[naam][teller1]);
				teller1++;
				}
			}
		catch(Exception e){  System.out.println("could not find the file");   }
		scanner.close();
	}
			
	void WriteConfigFile(File file){
		try{   scanner = new Scanner(file);  }
		catch(Exception e){  System.out.println("could not find the file while in the WriteToFile Fucntion");   }

		try {
				out = new BufferedWriter(new FileWriter(file));
				teller1 = 1;
				while(InportFile[3][teller1] != null){
					out.write(InportFile[3][teller1]);
					out.write(System.getProperty( "line.separator" ));
					System.out.println("Now Writeing :" + InportFile[3][teller1]);
					teller1++;
				}
	
				out.close();
		 } 
		 catch (IOException e) {
			 System.out.println("could not write to the file");
		 }
		
		scanner.close();
	}
}
