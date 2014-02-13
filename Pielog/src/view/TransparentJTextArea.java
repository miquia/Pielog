package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JTextArea;

public class TransparentJTextArea extends JTextArea {

	private static final long serialVersionUID = -4096246474385120220L;
	
	public TransparentJTextArea(String body){
		setOpaque(false);
		setText(body);
	}

	 @Override
     protected void paintComponent(Graphics g) {
         g.setColor(new Color(255, 255, 255, 128));
         Insets insets = getInsets();
         int x = insets.left;
         int y = insets.top;
         int width = getWidth() - (insets.left + insets.right);
         int height = getHeight() - (insets.top + insets.bottom);
         g.fillRect(x, y, width, height);
         super.paintComponent(g);
     }
}
