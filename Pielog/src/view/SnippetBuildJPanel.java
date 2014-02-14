package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.SystemColor;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.UIManager;

public class SnippetBuildJPanel extends JPanel {

	private static final long serialVersionUID = -8645864623062943449L;
	
	public SnippetBuildJPanel(String title, String body, String time){
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		Box horizontalBox = Box.createHorizontalBox();
		this.add(horizontalBox);
		
		JPanel titlePanel = new JPanel();
		titlePanel.setOpaque(false);
		FlowLayout fl_titlePanel = (FlowLayout) titlePanel.getLayout();
		fl_titlePanel.setAlignment(FlowLayout.LEFT);
		fl_titlePanel.setVgap(0);
		fl_titlePanel.setHgap(0);
		horizontalBox.add(titlePanel);
		
		JLabel lblNewLabel = new JLabel(title);
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 11));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		titlePanel.add(lblNewLabel);
		
		JPanel datePanel = new JPanel();
		datePanel.setOpaque(false);
		FlowLayout fl_datePanel = (FlowLayout) datePanel.getLayout();
		fl_datePanel.setVgap(0);
		fl_datePanel.setHgap(0);
		fl_datePanel.setAlignment(FlowLayout.RIGHT);
		horizontalBox.add(datePanel);
		
		JLabel lblNewLabel_1 = new JLabel("10/09/2014");
		lblNewLabel_1.setFont(new Font("Arial Narrow", Font.BOLD, 11));
		lblNewLabel_1.setForeground(Color.GRAY);
		datePanel.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea(body);
		textArea.setFont(new Font("Arial", Font.PLAIN, 11));
		textArea.setForeground(Color.DARK_GRAY);
		this.add(textArea);
		textArea.setBorder(null);
		textArea.setEditable(false);
		textArea.setBackground(new Color(255,255,255,0));
		textArea.setLineWrap(true);
		
	}

}
