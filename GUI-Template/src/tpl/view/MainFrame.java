/*
 * This file is part of Java GUI Template
 *
 * Copyright (C) 2019  H.M. YOON, D.U. OH, S.H. CHAE.
 *
 * Java GUI Template is free software: you can redistribute it and/or modify
 * it under the terms of the GNU GPL General Public License as published by
 * the Free Software Foundation, either version 1 of the License, or
 * any later version.
 *
 * Java GUI Template is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE, See the
 * GNU GPL General Public License for more details.
 * it would be glad to be notified any further modification to copyrighters .
 *
 * You should have received a copy of the GNU GPL General Public License
 * along with Java GUI Template.  If not, see <http://www.gnu.org/licenses/>.
 */

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
