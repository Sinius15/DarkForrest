package api.LegendsDarkApi_New;

import java.awt.GridBagConstraints;

import javax.swing.ButtonGroup;

public class LButtonGroup {

	private ButtonGroup comp;
	private GridBagConstraints plc;
	
	public LButtonGroup() {
		comp = new ButtonGroup();
	}
	
	public ButtonGroup get() {
		return comp;
	}
	
	public GridBagConstraints getPlc(){
		return plc;
	}
	
	public void add(LRadioButton b){
		comp.add(b.get());
	}
}
