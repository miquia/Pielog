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

public class SnippetBuildJPanel extends JPanel {

	private static final long serialVersionUID = -8645864623062943449L;
	
	public SnippetBuildJPanel(String title, String body, String time){
		this.setBackground(SystemColor.activeCaption);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		Box horizontalBox = Box.createHorizontalBox();
		this.add(horizontalBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBackground(Color.white);
		panel_1.setMaximumSize(new Dimension(32767, 20));
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		horizontalBox.add(panel_1);
		
		JLabel lblNewLabel = new JLabel(title);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBackground(Color.white);
		panel.setMaximumSize(new Dimension(32767, 20));
		FlowLayout flowLayout_1 = (FlowLayout) panel.getLayout();
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(0);
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		horizontalBox.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel(time);
		panel.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea(body);
		this.add(textArea);
		textArea.setBorder(null);
		textArea.setEditable(false);
		textArea.setBackground(new Color(255,255,255,0));
		textArea.setLineWrap(true);
		
	}

}
