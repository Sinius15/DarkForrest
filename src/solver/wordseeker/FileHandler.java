package solver.wordseeker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class FileHandler extends WordseekerSolver{

	/** 
	 * Maakt een heel leeg bestandje
	 * @param file
	 */
	void CreateFile(File file){																		
		try{
			if(file.createNewFile()){
			}
			else{
				function.Message("Sorry", "dit bestand bestaad al.");
			}
		} 
		catch(IOException ex) {System.out.println("File Not Found: "+ ex);}
	}

	/** 
	 * Opent een tekst bestandje en slaat dat op in InportFile[][] array.
	 * de naam is het eerste getal in InportFile[][] array.
	 * negeerbeer is of hij wel of niet contoroleert op ## in het begin
	 */
	public void Open(String path, int naam, boolean negeerbeer){
		if(negeerbeer){
			try{   
				scanner = new Scanner(new File(path));  
				teller1 = 1;
				while(scanner.hasNext()){
					InportFile[naam][teller1] = scanner.next();
					if(InportFile[naam][teller1].substring(0, 2) != null && !InportFile[naam][teller1].substring(0, 2).equals("##")){
					teller1++;
					}
					else{
						scanner.nextLine();
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
					teller1++;
				}
				scanner.close();
			}
			catch(Exception e){  System.out.println("could not find the file");   }
		}
	}
	
	/** 
	 * appends iets aan een text bestandje.
	 */
	void Write(File fileOut, String txt){
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
	
	/** 
	 * kopiëert een bestandje van de ene plek naar de andere.
	 * @param file orginele plek, file waar naar toe
	 */
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

