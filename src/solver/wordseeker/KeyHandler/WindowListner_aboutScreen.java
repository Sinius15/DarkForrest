package solver.wordseeker.KeyHandler;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import solver.wordseeker.WordseekerSolver;

public class WindowListner_aboutScreen extends WordseekerSolver implements WindowListener {

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		aboutIsOpen = false;
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {	
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowOpened(WindowEvent e) {	
	}

}
