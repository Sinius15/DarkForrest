package solver.wordseeker.Threading;

import solver.wordseeker.WordseekerSolver;

public class Thread_Main extends WordseekerSolver implements Runnable{
	

	
	public void Start(){
		System.out.println("Now Starting Main Thread!!");
		mainThread = new Thread();

		this.run();
	}

	@Override
	public void run() {

	}

	
	
	
	
}
