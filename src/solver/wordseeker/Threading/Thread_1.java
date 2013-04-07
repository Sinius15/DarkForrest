package solver.wordseeker.Threading;

import solver.wordseeker.WordseekerSolver;

public class Thread_1 extends WordseekerSolver implements Runnable{
	
	private boolean sleeping = false;
	
	public void Start(){
		new Thread(this);
		this.run();
	}

	@Override
	public void run() {
		laadWoordenBook();
		WaitForAction(0);
	}
	
	public synchronized void WaitForAction(int time){
		sleeping = true;
		while(sleeping){
				try {
					this.wait(time);
				} catch (InterruptedException e) {}
			sleeping = false;
		}
	}
	
	private void laadWoordenBook(){
		if(laadWoordenboek){
			file.Open("rec/woordenboek.txt", 1, true);
		}
	}

	
}
