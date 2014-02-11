package view;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import java.awt.Font;

public class SnippetJPanel extends JPanel {

	private static final long serialVersionUID = 2369647289651271374L;
	private JLabel titleLabel;
	
	public SnippetJPanel(String title, String body, String time){
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setAlignmentY(Component.TOP_ALIGNMENT);
		setAlignmentX(Component.LEFT_ALIGNMENT);
		FlowLayout flowLayout = (FlowLayout) getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		flowLayout.setAlignment(FlowLayout.LEFT);
		setBackground(SystemColor.window);
		
		titleLabel = new JLabel(title);
		titleLabel.setFont(new Font("Lucida Handwriting", Font.PLAIN, 9));
		add(titleLabel);
		
	}

	public Dimension getSize() {
		return getSize();
	}
	public void setSize(Dimension size) {
		setSize(size);
	}
	public String getTitleLabelText() {
		return titleLabel.getText();
	}
	public void setTitleLabelText(String text) {
		titleLabel.setText(text);
	}
}
