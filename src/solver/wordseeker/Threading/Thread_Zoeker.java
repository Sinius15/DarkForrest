package solver.wordseeker.Threading;
import solver.wordseeker.WordseekerSolver;
public class Thread_Zoeker extends WordseekerSolver implements Runnable{
	
	private int kant;
	private String WoordDatJeZoekt;
	
	public void Start(String woordDatJeZoekt, int Kant){
		kant = Kant;
		WoordDatJeZoekt = woordDatJeZoekt;
		new Thread(this);
		this.run();
	}

	@Override
	public void run() {
		zoeker.ZoekWoord(WoordDatJeZoekt, kant);
	}

	
}