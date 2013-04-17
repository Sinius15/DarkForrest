package solver.wordseeker.KeyHandler;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import solver.wordseeker.WordseekerSolver;

public class KeyHandler_ScreenTwo extends WordseekerSolver implements KeyListener {

		@Override
		public void keyPressed(KeyEvent key) {
			
			switch(key.getKeyCode()){
			case KeyEvent.VK_ENTER: 		seekButton.get().doClick();
				break;
			case KeyEvent.VK_BACK_SPACE: 	if(key.isShiftDown() || key.isAltDown()){inputWord.setText("");}
				break;
			
			
			
			}	
		}

		@Override
		public void keyReleased(KeyEvent key) {	
		}

		@Override
		public void keyTyped(KeyEvent key) {
		}
}
