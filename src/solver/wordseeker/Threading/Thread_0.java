package solver.wordseeker.Threading;

import solver.wordseeker.WordseekerSolver;

public class Thread_0 extends WordseekerSolver implements Runnable{
	
	public void Start(){
		new Thread(this);
		this.run();
	}

	@Override
	public void run() {
		mainProgram();
	}

	public synchronized void WaitForAction(int time){
		try {
			this.wait(time);
		} catch (InterruptedException e) {}
	}
}
