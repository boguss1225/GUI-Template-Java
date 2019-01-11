package tpl.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

import tpl.view.menubar.MenuBarSection;
import tpl.view.middle.MiddlePanel;

public class MainFrame extends JFrame{
	private Image frameIcon;
	public MenuBarSection MenuBar;
	public MiddlePanel middlePanel;
	public MainFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*set title*/
		this.setTitle("GUI-Template Program");
		
		/*set size*/
		setSize(500,500);
		
		/*set location*/
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int) (screen.getWidth() / 2 - getWidth() / 2);
		int ypos = (int) (screen.getHeight() / 2 - getHeight() / 2);
		setLocation(xpos, ypos);
		
		/*set icon of this frame*/
		frameIcon = Toolkit.getDefaultToolkit().getImage("src/tpl/icon/MainFrameicon.png");
	 	this.setIconImage(frameIcon);
	 	
	 	/*set Menubar*/
	 	MenuBar = new MenuBarSection(this);
	 	this.setJMenuBar(MenuBar);
	 	
	 	/*set Contents Pane*/
	 	this.getContentPane().setLayout(new BorderLayout());
	 	middlePanel = new MiddlePanel(this);
	 	this.getContentPane().add(BorderLayout.CENTER, middlePanel);
	 	setVisible(true);
	}
}
