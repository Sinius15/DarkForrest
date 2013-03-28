package solver.wordseeker;

public class GetLetter extends WordseekerSolver{

	String Up(int Xcoord, int Ycoord){
		if(Ycoord-1 >= 1){
			return letterVeld[Xcoord][Ycoord-1].getText();
		}
		else{
			return "";
		}
	}
	
	String Down(int Xcoord, int Ycoord){
		if(Ycoord+1 >= letterHoogte){
			return letterVeld[Xcoord][Ycoord+1].getText();
		}
		else{
			return "";
		}
	}
	
	String Right(int Xcoord, int Ycoord){
		if(Xcoord+1 <= letterBreedte){
			return letterVeld[Xcoord+1][Ycoord].getText();
		}
		else{
			return "";
		}
	}
	
	String Left(int Xcoord, int Ycoord){
		if(Xcoord-1 >= 1){
			return letterVeld[Xcoord-1][Ycoord].getText();
		}
		else{
			return "";
		}
	}

	String LeftUp(int Xcoord, int Ycoord){
		if(Xcoord-1 > 0 && Ycoord+1 > 0){
			return letterVeld[Xcoord-1][Ycoord+1].getText();
		}
		else{
			return "";
		}
	}
	
	String RightUp(int Xcoord, int Ycoord){
		if(Xcoord+1 <= letterBreedte && Ycoord+1 <= letterHoogte){
			return letterVeld[Xcoord+1][Ycoord+1].getText();
		}
		else{
			return "";
		}
	}
	
	String LeftDown(int Xcoord, int Ycoord){
		if(Xcoord-1 >= 1 && Ycoord-1 <= letterHoogte){
			return letterVeld[Xcoord-1][Ycoord-1].getText();
		}
		else{
			return "";
		}
	}
	
	String RightDown(int Xcoord, int Ycoord){
		if(Xcoord+1 <= letterBreedte && Ycoord-1 >= 1){
			return letterVeld[Xcoord+1][Ycoord-1].getText();
		}
		else{
			return "";
		}
	}
}
