package tpl.view.middle;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import tpl.view.MainFrame;

public class MiddlePanel extends JPanel{
	private BufferedImage myPicture;
	public MiddlePanel(MainFrame f){
		try {
			myPicture = ImageIO.read(new File("src/tpl/icon/tplInitImage.png"));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			this.add(picLabel);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
