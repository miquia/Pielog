package view;

import javax.swing.JTextPane;
import javax.swing.UIManager;

public class MainJTextPane extends JTextPane {
	
	private static final long serialVersionUID = 3592305699573759925L;

	public MainJTextPane() {
		setBorder(UIManager.getBorder("CheckBox.border"));
	}

	
}
