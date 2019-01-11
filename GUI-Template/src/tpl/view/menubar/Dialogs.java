package tpl.view.menubar;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import tpl.model.Model;
import tpl.view.AdjustDialog;

public class Dialogs {
	
}

class openDialog{
	public openDialog(JFrame f) throws IOException{
			/*create open dialog*/
		 	FileDialog Dia = new FileDialog(f,"Open File",FileDialog.LOAD);
		 	Dia.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					Dia.dispose();
				}
			});
		 	
		 	/*set initial file*/
		 	Dia.setFile("*.*");
		 	Dia.setVisible(true);
		 	
		 	/*get path(directory and file name)*/
		 	String DirName = Dia.getDirectory();
		 	String FileName = Dia.getFile();
		 	String pathName = DirName + FileName;
		}
}

class saveDialog{
	public saveDialog(JFrame f) throws IOException{
			//if save for the first time{
			if(Model.FilePath == null){
				/*create save dialog*/
			 	FileDialog Dia = new FileDialog(f,"Save",FileDialog.SAVE);
			 	Dia.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent e){
						Dia.dispose();
					}
				});
			 	
			 	/*set initial file*/
			 	Dia.setFile("*.*");
			 	Dia.setVisible(true);
			 	
			 	/*get path(directory and file name)*/
			 	String DirName = Dia.getDirectory();
			 	String FileName = Dia.getFile();
			 	String pathName = DirName + FileName;
			 	Model.FilePath = pathName;
			 	//make new save file on the pathName
			 	
			 	//set static path of this file

			 //if once saved already
			}else{
				//save at Model.FilePath
			}
	}
}

class saveAsDialog{
	public saveAsDialog(JFrame f) throws IOException{
			/*create save dialog*/
		 	FileDialog Dia = new FileDialog(f,"Save As...",FileDialog.SAVE);
		 	Dia.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					Dia.dispose();
				}
			});
		 	
		 	/*set initial file*/
		 	Dia.setFile("*.*");
		 	Dia.setVisible(true);
		 	
		 	/*get path(directory and file name)*/
		 	String DirName = Dia.getDirectory();
		 	String FileName = Dia.getFile();
		 	String pathName = DirName + FileName;
		 	
		 	//make new save file on the pathName
		 	
			//set static path of this file
		 	Model.FilePath = pathName;
	}
}

class exitDialog{
	public exitDialog(JFrame f){
		/*create new dialog*/
	 	Dialog Dia = new Dialog(f,"exit",true);
	 	Dia.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				Dia.dispose();
			}
		});
	 	/*set size of dialog*/
	 	Dia.setSize(300, 100);
	 	
	 	/*set location*/
	 	new AdjustDialog(f,Dia);
	 	
	 	/*set layout*/
	 	Dia.setLayout(new BorderLayout());
	 	
	 	/*announcement */
	 	JLabel l1 = new JLabel("Will you EXIT this program?");
	 	l1.setHorizontalAlignment(l1.CENTER);
		/*set button1*/
		JButton b1 = new JButton("OK");
		class b1EventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				System.exit(0);
			}}
		b1.addActionListener(new b1EventHandler());
	 	
		/*set button1*/
		JButton b2 = new JButton("cancel");
		class b2EventHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ae){
				Dia.dispose();
			}}
		b2.addActionListener(new b2EventHandler());
		
		/*add components*/
		JPanel buttonPane = new JPanel(new GridLayout(1,2));
		buttonPane.add(b1);
		buttonPane.add(b2);
		Dia.add(l1, BorderLayout.CENTER);
		Dia.add(buttonPane, BorderLayout.SOUTH);
		Dia.setVisible(true);
	}
	
}

class HelpDialog{
	public  HelpDialog(JFrame f){
			/*create new dialog*/
		 	Dialog HelpDia = new Dialog(f,"Help Dialog",true);
		 	HelpDia.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					HelpDia.dispose();
				}
			});
		 	/*set size of dialog*/
		 	HelpDia.setSize(440, 200);
		 	
		 	/*set location*/
		 	new AdjustDialog(f,HelpDia);
		 	
		 	/*set layout*/
		 	HelpDia.setLayout(new BorderLayout());
		 	
			/*add help statements here :) */
		 	String detailstring = 
		 	"GUI Template for everyone"
		 	+ "\nThis JAVA GUI template is for the basic construction of GUI."
		 	+ "\nAll the components are based on Jswing components."
		 	+ "\nThis Program can be easily edited in code level"
		 	+ "\nOnly basic functions are implemeted for the scalability"
		 	+ "\nAny application will be welcomed with this JAVA GUI Template!"
		 	+ "\nEnjoy your Creation!"
		 	+ "\n";
		 	
		 	/*set text area*/
		 	JEditorPane txt1 = new JEditorPane();
		 	txt1.setText(detailstring);
		 	txt1.setEditable(false);
		 	JScrollPane t1 = new JScrollPane(txt1);
			t1.getVerticalScrollBar().setValue(0);
			
			/*set button*/
			JButton b1 = new JButton("OK");
			class b1EventHandler implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent ae){
					HelpDia.dispose();
				}}
			b1.addActionListener(new b1EventHandler());
			
			/*add components*/
			HelpDia.add(t1, BorderLayout.CENTER);
			HelpDia.add(b1, BorderLayout.SOUTH);
			HelpDia.setVisible(true);
	 }
	
}

class AboutDialog{
	public AboutDialog(JFrame f){
			/*create new dialog*/
		 	Dialog AboutDia = new Dialog(f,"About",true);
		 	AboutDia.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					AboutDia.dispose();
				}
			});
		 	
			/*set size of dialog*/
		 	AboutDia.setSize(440, 200);
		 	
			/*set location*/
		 	new AdjustDialog(f,AboutDia);
		 	
			/*set layout*/
		 	AboutDia.setLayout(new BorderLayout());
		 	
			/*add About statements here :) */
		 	String detailstring = 
		 	"GUI Template for everyone"
		 	+ "\n(c) Copyright HM Yoon and others 2019. All rights reserved."
		 	+ "\nall the properties of this program follow GNU lisence."
		 	+ "\ncontact details"
		 	+ "\nHM Yoon jcjc7890@gmail.com"
		 	+ "\n"
		 	+ "\n"
		 	+ "\n";
		 	
		 	/*set text area*/
		 	JEditorPane txt1 = new JEditorPane();
		 	txt1.setEditable(false);
		 	txt1.setText(detailstring);
			JScrollPane t1 = new JScrollPane(txt1);
			t1.getVerticalScrollBar().setValue(0);
			
			/*set button*/
			JButton b1 = new JButton("OK");
			class b1EventHandler implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent ae){
					AboutDia.dispose();
				}}
			b1.addActionListener(new b1EventHandler());
			
			/*add components*/
			AboutDia.add(t1, BorderLayout.CENTER);
			AboutDia.add(b1, BorderLayout.SOUTH);
			AboutDia.setVisible(true);
	 }
}