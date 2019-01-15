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
