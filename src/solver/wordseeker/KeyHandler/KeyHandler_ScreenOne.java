package solver.wordseeker.KeyHandler;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import solver.wordseeker.WordseekerSolver;

public class KeyHandler_ScreenOne extends WordseekerSolver implements KeyListener {

		@Override
		public void keyPressed(KeyEvent key) {
			if(key.getKeyCode() == KeyEvent.VK_ENTER){
				startupButton.get().doClick();
			}	
		}

		@Override
		public void keyReleased(KeyEvent key) {	
		}

		@Override
		public void keyTyped(KeyEvent key) {
		}
	

}
