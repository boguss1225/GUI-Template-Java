/*
 * This file is part of Java GUI Template
 *
 * Copyright (C) 2019  H.M. YOON, D.U. OH, S.H. CHAE.
 *
 * Java GUI Template is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 1 of the License, or
 * any later version.
 *
 * Java GUI Template is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE, See the
 * GNU General Public License for more details.
 * it would be glad to be notified any further modification to copyrighters .
 *
 * You should have received a copy of the GNU General Public License
 * along with Java GUI Template.  If not, see <http://www.gnu.org/licenses/>.
 */

package tpl.view.menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import tpl.view.MainFrame;

public class MenuBarSection extends JMenuBar{
	public MenuBarSection(MainFrame f){
		/*Menu_bar*/
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu setting = new JMenu("Setting");
		JMenu help = new JMenu("Help");
		/*File Menu*/
		JMenuItem newfile = new JMenuItem("New");
		newfile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		JMenuItem open = new JMenuItem("Open");
		open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		JMenuItem save = new JMenuItem("Save");
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		JMenuItem saveAs = new JMenuItem("Save As..");
		JMenuItem exit = new JMenuItem("Close");
		
		JMenuItem edit_1 = new JMenuItem("edit_1");
		JMenuItem edit_2 = new JMenuItem("edit_2");
		JMenuItem edit_3 = new JMenuItem("edit_3");
		
		JMenuItem settingt = new JMenuItem("Setting");
		JMenuItem helpwords = new JMenuItem("Help");
		JMenuItem about = new JMenuItem("About");
		JMenuItem Testing = new JMenuItem("Testing");
		file.add(newfile);
		file.add(open);
		file.add(save);
		file.add(saveAs);
		file.addSeparator();
		file.add(exit);
		edit.add(edit_1);
		edit.add(edit_2);
		edit.add(edit_3);
		setting.add(settingt);
		help.add(helpwords);
		help.add(about);
		file.addSeparator();
		help.add(Testing);
		/*<Menu_SetUp>*/
		this.add(file);
		this.add(edit);
		this.add(setting);
		this.add(help);
		
		/*<MenuItem_Action>*/
		/*new
		class newfileEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				try {
					new newfileDialog(f);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}}	
		newfile.addActionListener(new newfileEventHandler());
		/*open*/
		class openEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				try {
					new openDialog(f);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}}	
		open.addActionListener(new openEventHandler());
		/*save*/
		class saveEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				try {
					new saveDialog(f);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}}	
		save.addActionListener(new saveEventHandler());
		/*saveAs*/
		class saveAsEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				try {
					new saveAsDialog(f);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}}	
		saveAs.addActionListener(new saveAsEventHandler());
		/*exit*/
		class exitEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				new exitDialog(f);
			}}	
		exit.addActionListener(new exitEventHandler());
		/*theme menu item*/
		class settingtEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				//new ThemeDialog(f);
			}}
		settingt.addActionListener(new settingtEventHandler());
		/*help*/
		class helpEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				new HelpDialog(f);
			}}
		helpwords.addActionListener(new helpEventHandler());
		/*about*/
		class aboutEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				new AboutDialog(f);
			}}	
		about.addActionListener(new aboutEventHandler());
		/*testing*/
		class TestingEventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				/*something want to test*/

			}}	
		Testing.addActionListener(new TestingEventHandler());
		setVisible(true);
		
	}
}
