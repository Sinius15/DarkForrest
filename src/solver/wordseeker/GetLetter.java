package solver.wordseeker;

public class GetLetter extends WordseekerSolver{

	String Up(int Xcoord, int Ycoord){
		if(Ycoord-1 >= 1){
			welkeCoordsHebIkNetBekeken[Xcoord][Ycoord-1] = true;
			return letterVeld[Xcoord][(Ycoord-1)].getText();
		}
		else{
			return "_";
		}
	}
	
	String Down(int Xcoord, int Ycoord){
		if(Ycoord+1 <= letterHoogte){
			welkeCoordsHebIkNetBekeken[Xcoord][Ycoord+1] = true;
			return letterVeld[Xcoord][Ycoord+1].getText();
		}
		else{
			return "_";
		}
	}
	
	String Right(int Xcoord, int Ycoord){
		if(Xcoord+1 <= letterBreedte){
			welkeCoordsHebIkNetBekeken[Xcoord+1][Ycoord] = true;
			return letterVeld[Xcoord+1][Ycoord].getText();
		}
		else{
			return "_";
		}
	}
	
	String Left(int Xcoord, int Ycoord){
		if(Xcoord-1 >= 1){
			welkeCoordsHebIkNetBekeken[Xcoord-1][Ycoord] = true;
			return letterVeld[Xcoord-1][Ycoord].getText();
		}
		else{
			return "_";
		}
	}

	String LeftUp(int Xcoord, int Ycoord){
		if(Xcoord-1 >= 1 && Ycoord-1 >= 1){
			welkeCoordsHebIkNetBekeken[Xcoord-1][Ycoord-1] = true;
			return letterVeld[Xcoord-1][Ycoord-1].getText();
		}
		else{
			return "_";
		}
	}
	
	String RightUp(int Xcoord, int Ycoord){
		if(Xcoord+1 <= letterBreedte && Ycoord-1 >= 1){
			welkeCoordsHebIkNetBekeken[Xcoord+1][Ycoord-1] = true;
			return letterVeld[Xcoord+1][Ycoord-1].getText();
		}
		else{
			return "_";
		}
	}
	
	String LeftDown(int Xcoord, int Ycoord){
		if(Xcoord-1 >= 1 && Ycoord+1 <= letterHoogte){
			welkeCoordsHebIkNetBekeken[Xcoord-1][Ycoord+1] = true;
			return letterVeld[Xcoord-1][Ycoord+1].getText();
		}
		else{
			return "_";
		}
	}
	
	String RightDown(int Xcoord, int Ycoord){
		if(Xcoord+1 <= letterBreedte && Ycoord+1 <= letterHoogte){
			welkeCoordsHebIkNetBekeken[Xcoord+1][Ycoord+1] = true;
			return letterVeld[Xcoord+1][Ycoord+1].getText();
		}
		else{
			return "_";
		}
	}
}
