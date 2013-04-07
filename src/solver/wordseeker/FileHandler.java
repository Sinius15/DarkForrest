package solver.wordseeker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class FileHandler extends WordseekerSolver{

	void CreateFile(File file){																		//maakt een leeg bestandje
		try{
			if(file.createNewFile()){
				System.out.println("File is created!");	
			}
			else{
				System.out.println("File already exists!!");
				function.Message("Sorry", "dit bestand bestaad al.");
			}
		} 
		catch(IOException ex) {System.out.println("File Not Found: "+ ex);}
	}
	
	void WriteConfigFile(File file){																// vult de net aangemaakte config file
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

	public void Open(String path, int naam, boolean negeerbeer){
		if(negeerbeer){
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
		else if(!negeerbeer){
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
	}

	void Write(File fileOut, String txt){															//appends iets aan een bestandje
		try {
			scanner = new Scanner(fileOut);
			try {
				BufferedWriter out = new BufferedWriter(new FileWriter(fileOut, true));
				out.append(txt + System.getProperty("line.separator"));
				out.close();
			
			} catch (IOException ex) {System.out.println("IO EXCEPTION: "+ex);}
		scanner.close();
		} catch (FileNotFoundException ex) {System.out.println("File Not Found: "+ ex);}
	}

	boolean Copy(File from, File to){
		try {
			Files.copy( from.toPath(), to.toPath() );
			return true;
		} catch (IOException e) {
			System.out.println(e);
			return false;

		}
	}
}

