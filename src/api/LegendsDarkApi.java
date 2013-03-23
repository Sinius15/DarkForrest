package api;

import java.awt.*;
import javax.swing.*;

public class LegendsDarkApi
{
	public JFrame[] frame = new JFrame[100];
	public JPanel[] panel = new JPanel[100];
	public GridBagConstraints[] gridBag = new GridBagConstraints[100];
	public JButton[] button = new JButton[100];
	public JTextField[] textfield = new JTextField[100];
	public JCheckBox[] checkbox = new JCheckBox[100];
	public JRadioButton[] radiobutton = new JRadioButton[100];
	public ButtonGroup[] buttongroup = new ButtonGroup[100];
	public JPasswordField[] passwordfield = new JPasswordField[100];
	public JProgressBar[] progressbar = new JProgressBar[100];
	public JTextArea[] textarea = new JTextArea[100];
	public JLabel[] label = new JLabel[100];
	public JMenuBar[] menubar = new JMenuBar[100];
	public JMenu[] menu = new JMenu[100];
	public JMenuItem[] menuitem = new JMenuItem[100];
	public JCheckBoxMenuItem[] checkboxmenuitem = new JCheckBoxMenuItem[100];
	public int frameTeller = 0;
	public int labelTeller = 0;
	public int buttonTeller = 0;
	public int gridbagTeller = -1;
	public int panelTeller = 0;
	public int textfieldTeller = 0;
	public int checkboxTeller = 0;
	public int radiobuttonTeller = 0;
	public int buttongroupTeller = 0;
	public int passwordfieldTeller = 0;
	public int progressbarTeller = 0;
	public int textareaTeller = 0;
	public int menubarTeller = 0;
	public int menuTeller = 0;
	public int menuitemTeller = 0;
	public int checkboxmenuitemTeller = 0;
	
	public int frameMax = 100;
	public int labelMax = 100;
	public int buttonMax = 100;
	public int gridbagMax = 100;
	public int textfieldMax = 100;
	public int checkboxMax = 100;
	public int radiobuttonMax = 100;
	public int buttongroupMax = 100;
	public int passwordfieldMax = 100;
	public int progressbarMax = 100;
	public int textareaMax = 100;
	public int menubarMax = 100;
	public int menuMax = 100;
	public int menuitemMax = 100;
	public int checkboxmenuitemMax = 100;
	
	public void Init(){
		frame = new JFrame[frameMax];
		panel = new JPanel[100];
		gridBag = new GridBagConstraints[gridbagMax];
		button = new JButton[buttonMax];
		textfield = new JTextField[textfieldMax];
		checkbox = new JCheckBox[checkboxMax];
		radiobutton = new JRadioButton[radiobuttonMax];
		buttongroup = new ButtonGroup[buttongroupMax];
		passwordfield = new JPasswordField[passwordfieldMax];
		progressbar = new JProgressBar[progressbarMax];
		textarea = new JTextArea[textareaMax];
		label = new JLabel[labelMax];
		menubar = new JMenuBar[menubarMax];
		menu = new JMenu[menuMax];
		menuitem = new JMenuItem[menuitemMax];
		checkboxmenuitem = new JCheckBoxMenuItem[checkboxmenuitemMax];
	}
	
	public void Say(String txt)
	{
		System.out.println("thissDarkApi debug info: " + txt);
	}
	
	public void Frame(int hoogte, int breedte, String name)
    {
		this.frame[this.frameTeller] = new JFrame(name);
		this.frame[this.frameTeller].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame[this.frameTeller].setVisible(true);
        this.frame[this.frameTeller].setSize(breedte, hoogte);
        this.frame[this.frameTeller].setLocationRelativeTo(null);
        this.frame[this.frameTeller].revalidate();
        this.Say("frame[" + this.frameTeller + "] gemaakt. naam: "+name);
        this.frameTeller++;
        this.Panel();
        this.gridbagTeller++;
    }	
	
    public void Panel()
	{
    	this.panel[this.panelTeller] = new JPanel(new GridBagLayout());
    	this.frame[this.frameTeller-1].add(this.panel[this.panelTeller]);
    	this.frame[this.frameTeller-1].revalidate();
		this.Say("Panel[" + this.panelTeller + "] gemaakt.");
		this.panelTeller++;
	}
	
  	public void Gridbag(int Xcoord, int Ycoord, int width, int height, int frameNumber)
	{
  		this.gridBag[this.gridbagTeller] = new GridBagConstraints();
  		this.gridBag[this.gridbagTeller].insets = new Insets(1, 1, 1, 1);
  		this.gridBag[this.gridbagTeller].gridx = Xcoord;
  		this.gridBag[this.gridbagTeller].gridy = Ycoord;
  		this.gridBag[this.gridbagTeller].gridheight = height;
  		this.gridBag[this.gridbagTeller].gridwidth = width;
  		this.gridBag[this.gridbagTeller].anchor = GridBagConstraints.NORTHWEST;
  		this.frame[frameNumber].revalidate();
		
	} 
  	
	public void Button(int hoogte, int breedte,int gridhoogte, int gridbreedte, int Xcoord, int Ycoord, String naam, int frameNumber)
	{	
		this.button[this.buttonTeller] = new JButton(naam);
		this.button[this.buttonTeller].setPreferredSize(new Dimension(breedte, hoogte));
		this.Gridbag(Xcoord, Ycoord, gridbreedte, gridhoogte, frameNumber);
		this.panel[frameNumber].add(this.button[this.buttonTeller], this.gridBag[this.gridbagTeller]);	
		this.frame[frameNumber].revalidate();
		this.Say("button[" + this.buttonTeller + "] gemaakt. naam: "+naam);
		this.buttonTeller ++;
	}
  	
	public void Textfield(int hoogte, int breedte, int gridhoogte, int gridbreedte, int Xcoord, int Ycoord, String txt, int frameNumber)
	{
		this.textfield[this.textfieldTeller] = new JTextField(txt);
		this.textfield[this.textfieldTeller].setVisible(true);
		this.textfield[this.textfieldTeller].setPreferredSize(new Dimension(breedte, hoogte));
		this.Gridbag(Xcoord, Ycoord, gridbreedte, gridhoogte, frameNumber);
		this.panel[frameNumber].add(this.textfield[this.textfieldTeller], this.gridBag[this.gridbagTeller]);
		this.frame[frameNumber].revalidate();
		this.Say("textfield[" + this.textfieldTeller + "] gemaakt. text: "+txt);
		this.textfieldTeller++;
	}
	
	public void TextArea(int hoogte, int breedte, int gridhoogte, int gridbreedte, int Xcoord, int Ycoord, String txt, int frameNumber)
	{
		this.textarea[this.textareaTeller] = new JTextArea(txt);
		this.textarea[this.textareaTeller].setVisible(true);
		this.textarea[this.textareaTeller].setPreferredSize(new Dimension(breedte, hoogte));
		this.Gridbag(Xcoord, Ycoord, gridbreedte, gridhoogte, frameNumber);
		this.panel[frameNumber].add(this.textarea[this.textareaTeller], this.gridBag[this.gridbagTeller]);
		this.frame[frameNumber].revalidate();
		this.Say("textarea[" + this.textareaTeller + "] gemaakt. text: "+txt);
		this.textareaTeller++;
	}
	
	public void Checkbox(int Xcoord, int Ycoord, String txt, boolean check, int frameNumber)
	{
		this.checkbox[this.checkboxTeller] = new JCheckBox(txt, check);
		this.checkbox[this.checkboxTeller].setVisible(true);
		this.Gridbag(Xcoord, Ycoord, 1, 1, frameNumber);
		this.panel[frameNumber].add(this.checkbox[this.checkboxTeller], this.gridBag[this.gridbagTeller]);
		this.frame[frameNumber].revalidate();
		this.Say("checkbox[" + this.checkboxTeller + "] gemaakt. text: "+ txt);
		this.checkboxTeller++;
	}

	public void Radiobutton(int Xcoord, int Ycoord, String txt, boolean check, int frameNumber)
	{
		this.radiobutton[this.radiobuttonTeller] = new JRadioButton(txt, check);
		this.radiobutton[this.radiobuttonTeller].setVisible(true);
		this.Gridbag(Xcoord, Ycoord, 1, 1, frameNumber);
		this.panel[frameNumber].add(this.radiobutton[this.radiobuttonTeller], this.gridBag[this.gridbagTeller]);
		this.frame[frameNumber].revalidate();
		this.Say("radiobutton[" + this.radiobuttonTeller + "] gemaakt. text: "+ txt);
		this.radiobuttonTeller++;
	}
	
	public void Buttongroup()
	{
		this.buttongroup[this.buttongroupTeller] = new ButtonGroup();
		this.Say("buttongroup[" + this.buttongroupTeller + "] gemaakt.");
		this.buttongroupTeller++;
	}
	
	public void Passwordfield(int hoogte, int breedte, int gridhoogte, int gridbreedte, int Xcoord, int Ycoord, String txt, int frameNumber)
	{
		this.passwordfield[this.passwordfieldTeller] = new JPasswordField(txt);
		this.passwordfield[this.passwordfieldTeller].setVisible(true);
		this.passwordfield[this.passwordfieldTeller].setPreferredSize(new Dimension(breedte, hoogte));
		this.Gridbag(Xcoord, Ycoord, gridbreedte, gridhoogte, frameNumber);
		this.panel[frameNumber].add(this.passwordfield[this.passwordfieldTeller], this.gridBag[this.gridbagTeller]);
		this.frame[frameNumber].revalidate();
		this.Say("passwordfield[" + this.passwordfieldTeller + "] gemaakt. text: "+txt);
		this.passwordfieldTeller++;
	}
	
	public void Progressbar(int hoogte, int breedte, int gridhoogte, int gridbreedte, int Xcoord, int Ycoord, int frameNumber)
	{
		this.progressbar[this.progressbarTeller] = new JProgressBar(0, 100);
		this.progressbar[this.progressbarTeller].setPreferredSize(new Dimension(breedte, hoogte));
		this.Gridbag(Xcoord, Ycoord, gridbreedte, gridhoogte, frameNumber);
		this.panel[frameNumber].add(this.progressbar[this.progressbarTeller], this.gridBag[this.gridbagTeller]);
		this.frame[frameNumber].revalidate();
		this.Say("progressbar[" + this.progressbarTeller + "] gemaakt.");
		this.progressbarTeller++;
	}
	
	public void setProgressbar(int barNumber, int howFar)
	{
		this.progressbar[barNumber].setValue(howFar);
	}
	
	public void Label(int hoogte, int breedte, int gridhoogte, int gridbreedte, int Xcoord, int Ycoord, String txt, int frameNumber)
	{
		this.label[this.labelTeller] = new JLabel(txt);
		this.label[this.labelTeller].setVisible(true);
		this.label[this.labelTeller].setPreferredSize(new Dimension(breedte, hoogte));
		this.Gridbag(Xcoord, Ycoord, gridbreedte, gridhoogte, frameNumber);
		this.panel[frameNumber].add(this.label[this.labelTeller], this.gridBag[this.gridbagTeller]);
		this.frame[frameNumber].revalidate();
		this.Say("label[" + this.labelTeller + "] gemaakt. text: "+txt);
		this.labelTeller++;
	}
	
	public void Menubar(int frameNumber){
		this.menubar[this.menubarTeller] = new JMenuBar();
		this.frame[frameNumber].setJMenuBar(this.menubar[this.menubarTeller]);
		this.menubarTeller++;
	}
	
	public void Menu(String txt, int MenubarNR){
		this.menu[this.menuTeller] = new JMenu(txt);
		this.menubar[MenubarNR].add(this.menu[this.menuTeller]);
		this.menuTeller++;
	}
	
	public void Menuitem(String txt, int menuNr){
		this.menuitem[this.menuitemTeller] = new JMenuItem(txt);
		this.menu[menuNr].add(this.menuitem[this.menuitemTeller]);
		this.menuitemTeller++;
	}
	
	public void CheckBoxMenuItem(String txt,boolean check ,int menuNr){
		this.checkboxmenuitem[this.checkboxmenuitemTeller] = new JCheckBoxMenuItem(txt, check);
		this.menu[menuNr].add(this.checkboxmenuitem[this.checkboxmenuitemTeller]);
		this.checkboxmenuitemTeller++;
	}
	
	public void Sleep(int time){		//time in 0.1 sec
		time = time * 100;
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

