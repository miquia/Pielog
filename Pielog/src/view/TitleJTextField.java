package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class TitleJTextField extends JTextField implements FocusListener {

	private static final long serialVersionUID = 271738011383509102L;

	public TitleJTextField(){
		this.setAlignmentX(Component.LEFT_ALIGNMENT);
		this.setText(" Article Title");
		this.setForeground(Color.GRAY);
		this.setColumns(20);
	}

	@Override
	public void focusGained(FocusEvent e) {
		if (this.getText().equals(" Article Title") || this.getText().equals(" No Title Yet... ")) { 				
			this.setText("");
			this.setForeground(Color.black);
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		if (this.getText().equals("")) { 				
			this.setText(" No Title Yet... ");
			this.setForeground(Color.GRAY);
		}
	}	
}
