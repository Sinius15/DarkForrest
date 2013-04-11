package solver.wordseeker.Threading;
import solver.wordseeker.WordseekerSolver;
public class Thread_Zoeker extends WordseekerSolver implements Runnable{
	

	
	public void Start(String woordDatJeZoekt, int Kant){
		new Thread(this);
		this.run();
	}

	@Override
	public void run() {
		
	}

	
}